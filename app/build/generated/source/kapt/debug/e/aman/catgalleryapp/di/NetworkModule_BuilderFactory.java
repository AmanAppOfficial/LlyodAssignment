// Generated by Dagger (https://dagger.dev).
package e.aman.catgalleryapp.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NetworkModule_BuilderFactory implements Factory<Retrofit> {
  @Override
  public Retrofit get() {
    return builder();
  }

  public static NetworkModule_BuilderFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit builder() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.builder());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_BuilderFactory INSTANCE = new NetworkModule_BuilderFactory();
  }
}
