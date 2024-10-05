package e.aman.catgalleryapp.presentation.state

import e.aman.catgalleryapp.domain.model.Cat

/**
 * author: Aman Srivastava
 * Created on: 04/10/2024
 * Handle different API State.
 * */
data class CatState (
    val cats: List<Cat>? = emptyList(),
    val errorMessage: String? = "",
    val isLoading: Boolean = false
)