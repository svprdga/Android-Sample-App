package com.svprdga.androidsampleapp.di.component

import com.svprdga.androidsampleapp.presentation.base.BaseActivity
import com.svprdga.androidsampleapp.di.module.*

import javax.inject.Singleton

import dagger.Component

@Singleton
@Component(
    modules = [AppModule::class])
interface AppComponent {

    fun plusUiComponent(
        uiComponentModule: UiComponentModule,
        presenterModule: PresenterModule
    ): UiComponent

    fun inject(target: BaseActivity)
}
