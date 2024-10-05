package e.aman.catgalleryapp.data.repository;

/**
 * author: Aman Srivastava
 * Created on: 04/10/2024
 * Repository Implementation.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Le/aman/catgalleryapp/data/repository/CatRepositoryImpl;", "Le/aman/catgalleryapp/domain/repository/CatRepository;", "catApiService", "Le/aman/catgalleryapp/data/api/ApiService;", "(Le/aman/catgalleryapp/data/api/ApiService;)V", "getAllCats", "Lkotlinx/coroutines/flow/Flow;", "Le/aman/catgalleryapp/core/common/Resource;", "", "Le/aman/catgalleryapp/domain/model/Cat;", "app_debug"})
@dagger.hilt.android.scopes.ViewModelScoped
public final class CatRepositoryImpl implements e.aman.catgalleryapp.domain.repository.CatRepository {
    @org.jetbrains.annotations.NotNull
    private final e.aman.catgalleryapp.data.api.ApiService catApiService = null;
    
    @javax.inject.Inject
    public CatRepositoryImpl(@org.jetbrains.annotations.NotNull
    e.aman.catgalleryapp.data.api.ApiService catApiService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<e.aman.catgalleryapp.core.common.Resource<java.util.List<e.aman.catgalleryapp.domain.model.Cat>>> getAllCats() {
        return null;
    }
}