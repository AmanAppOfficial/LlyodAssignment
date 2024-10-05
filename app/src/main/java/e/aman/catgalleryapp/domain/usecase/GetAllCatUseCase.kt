package e.aman.catgalleryapp.domain.usecase

import e.aman.catgalleryapp.domain.repository.CatRepository
import javax.inject.Inject

/**
 * author: Aman Srivastava
 * Created on: 04/10/2024
 * Use case for app.
 * */
class GetAllCatUseCase @Inject constructor(private val repository: CatRepository) {
    operator fun invoke() = repository.getAllCats()
}