package io.github.ovso.ex.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import io.github.ovso.ex.DataSource

@Module
@InstallIn(ActivityComponent::class)
object RepositoryModule {

    @Provides
    fun provideDataSource(context: Context): DataSource {
        return DataSource(context)
    }
}