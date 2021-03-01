package io.github.ovso.ex.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ActivityContext

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Provides
    fun provideContext(context: Application):Context = context
}