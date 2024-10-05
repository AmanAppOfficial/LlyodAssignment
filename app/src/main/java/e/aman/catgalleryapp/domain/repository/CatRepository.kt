package e.aman.catgalleryapp.domain.repository

import e.aman.catgalleryapp.core.common.Resource
import e.aman.catgalleryapp.domain.model.Cat
import kotlinx.coroutines.flow.Flow

/**
 * author: Aman Srivastava
 * Created on: 04/10/2024
 * */
interface CatRepository {
    fun getAllCats(): Flow<Resource<List<Cat>>>
}