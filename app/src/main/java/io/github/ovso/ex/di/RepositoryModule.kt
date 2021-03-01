package io.github.ovso.ex.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import io.github.ovso.ex.DataSource

@Module
@InstallIn(ActivityComponent::class)
object RepositoryModule {

/*
    @Provides
    fun provideDataSource(@ActivityContext context: Context): DataSource {
        return DataSource(context)
    }
*/
/*
    @Provides
    fun provideDataSource(@ApplicationContext context: Context): DataSource {
        return DataSource(context)
    }
*/
}