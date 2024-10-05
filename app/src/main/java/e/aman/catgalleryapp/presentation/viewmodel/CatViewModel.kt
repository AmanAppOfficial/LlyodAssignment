package e.aman.catgalleryapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import e.aman.catgalleryapp.core.common.Resource
import e.aman.catgalleryapp.domain.usecase.GetAllCatUseCase
import e.aman.catgalleryapp.presentation.state.CatState
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * author: Aman Srivastava
 * Created on: 04/10/2024
 * */
@HiltViewModel
class CatViewModel @Inject constructor(private val useCase: GetAllCatUseCase): ViewModel() {

    private val _catState = MutableStateFlow(CatState())
    val catState: StateFlow<CatState>
        get() = _catState

    init {
        getAllCats()
    }

    private fun getAllCats() {
        useCase().onEach {
            when(it) {
                is Resource.Error -> _catState.emit(CatState().copy(errorMessage = it.msg))
                is Resource.Loading -> _catState.emit(CatState().copy(isLoading = true))
                is Resource.Success -> _catState.emit(CatState().copy(cats = it.data))
            }
        }.launchIn(viewModelScope)
    }
}