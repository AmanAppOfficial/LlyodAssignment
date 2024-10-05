package e.aman.catgalleryapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import e.aman.catgalleryapp.core.utils.Constants
import e.aman.catgalleryapp.data.api.ApiService
import e.aman.catgalleryapp.data.repository.CatRepositoryImpl
import e.aman.catgalleryapp.domain.repository.CatRepository
import javax.inject.Singleton
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * author: Aman Srivastava
 * Created on: 04/10/2024
 * Singleton Provider for Retrofit objects.
 * */
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun builder(): Retrofit {


        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Provides
    @Singleton
    fun provideCatRepository(api: ApiService): CatRepository = CatRepositoryImpl(api)
}