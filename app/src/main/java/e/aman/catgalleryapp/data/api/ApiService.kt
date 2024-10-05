package e.aman.catgalleryapp.data.api

import e.aman.catgalleryapp.domain.model.Cat
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("search")
    suspend fun getCatList(@Query(value = "limit") limit: Int): List<Cat>
}