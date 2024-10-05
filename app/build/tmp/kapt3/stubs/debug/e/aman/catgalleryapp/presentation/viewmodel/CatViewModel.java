package e.aman.catgalleryapp.presentation.viewmodel;

/**
 * author: Aman Srivastava
 * Created on: 04/10/2024
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Le/aman/catgalleryapp/presentation/viewmodel/CatViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Le/aman/catgalleryapp/domain/usecase/GetAllCatUseCase;", "(Le/aman/catgalleryapp/domain/usecase/GetAllCatUseCase;)V", "_catState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Le/aman/catgalleryapp/presentation/state/CatState;", "catState", "Lkotlinx/coroutines/flow/StateFlow;", "getCatState", "()Lkotlinx/coroutines/flow/StateFlow;", "getAllCats", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class CatViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final e.aman.catgalleryapp.domain.usecase.GetAllCatUseCase useCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<e.aman.catgalleryapp.presentation.state.CatState> _catState = null;
    
    @javax.inject.Inject
    public CatViewModel(@org.jetbrains.annotations.NotNull
    e.aman.catgalleryapp.domain.usecase.GetAllCatUseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<e.aman.catgalleryapp.presentation.state.CatState> getCatState() {
        return null;
    }
    
    private final void getAllCats() {
    }
}