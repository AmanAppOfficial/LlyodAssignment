package e.aman.catgalleryapp.data.repository

import e.aman.catgalleryapp.core.common.Resource
import e.aman.catgalleryapp.data.api.ApiService
import e.aman.catgalleryapp.domain.model.Cat
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.test.runTest
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.kotlin.doReturn

/**
 * author: Aman Srivastava
 * Created on: 04/10/2024
 * Repository Testing class.
 * */
class CatRepositoryTest {

    @Mock
    lateinit var catApiService: ApiService

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
    }

    /**
     * Function to test the empty response
     * */
    @Test
    fun testGetCatsEmptyList() = runTest {
        val emptyFlow = flowOf(Resource.Success(emptyList<Cat>()))
        doReturn(emptyFlow).`when`(catApiService).getCatList(10)
        val repo = CatRepositoryImpl(catApiService)
        val result = repo.getAllCats()
        result.onEach {
            Assert.assertEquals(0, it.data?.size)
        }
    }

    /**
     * Function to test the actual response
     * */
    @Test
    fun testGetCatsList() = runTest {
        val catList = listOf(
            Cat("1", "", 0, 0),
            Cat("2", "", 0,0)
        )
        val emptyFlow = flowOf(Resource.Success(catList))
        doReturn(emptyFlow).`when`(catApiService).getCatList(10)
        val repo = CatRepositoryImpl(catApiService)
        val result = repo.getAllCats()
        result.onEach {
            Assert.assertEquals("1", result.first().data?.get(0)?.id)
        }
    }
}