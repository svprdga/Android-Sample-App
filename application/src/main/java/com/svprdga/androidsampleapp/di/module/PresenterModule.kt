package com.svprdga.androidsampleapp.di.module

import com.svprdga.androidsampleapp.di.annotation.PerUiComponent
import com.svprdga.androidsampleapp.presentation.list.IListPresenter
import com.svprdga.androidsampleapp.presentation.list.ListPresenter
import com.svprdga.androidsampleapp.util.Logger
import dagger.Module
import dagger.Provides

@Module
class PresenterModule {

    @Provides
    @PerUiComponent
    fun provideListPresenter(log: Logger) : IListPresenter {
        return ListPresenter(log)
    }
}