package e.aman.catgalleryapp.domain.repository;

/**
 * author: Aman Srivastava
 * Created on: 04/10/2024
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&\u00a8\u0006\u0007"}, d2 = {"Le/aman/catgalleryapp/domain/repository/CatRepository;", "", "getAllCats", "Lkotlinx/coroutines/flow/Flow;", "Le/aman/catgalleryapp/core/common/Resource;", "", "Le/aman/catgalleryapp/domain/model/Cat;", "app_debug"})
public abstract interface CatRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<e.aman.catgalleryapp.core.common.Resource<java.util.List<e.aman.catgalleryapp.domain.model.Cat>>> getAllCats();
}