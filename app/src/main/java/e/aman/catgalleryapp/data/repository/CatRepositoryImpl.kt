package e.aman.catgalleryapp.data.repository

import dagger.hilt.android.scopes.ViewModelScoped
import e.aman.catgalleryapp.core.common.Resource
import e.aman.catgalleryapp.data.api.ApiService
import e.aman.catgalleryapp.domain.model.Cat
import e.aman.catgalleryapp.domain.repository.CatRepository
import e.aman.catgalleryapp.core.utils.Constants.LIMIT
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

/**
 * author: Aman Srivastava
 * Created on: 04/10/2024
 * Repository Implementation.
 * */
@ViewModelScoped
class CatRepositoryImpl @Inject constructor(private val catApiService: ApiService): CatRepository {
    override fun getAllCats(): Flow<Resource<List<Cat>>>  = flow {
        emit(Resource.Loading())
        val result = catApiService.getCatList(LIMIT)
        emit(Resource.Success(result))
    }.flowOn(Dispatchers.IO)
        .catch {
            emit(Resource.Error(it.message.toString()))
        }
}