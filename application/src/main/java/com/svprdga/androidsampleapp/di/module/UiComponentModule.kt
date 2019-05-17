package com.svprdga.androidsampleapp.di.module

import android.app.Activity
import com.svprdga.androidsampleapp.di.annotation.PerUiComponent
import com.svprdga.androidsampleapp.presentation.base.BaseActivity
import com.svprdga.androidsampleapp.util.Logger
import dagger.Module
import dagger.Provides

@Module
class UiComponentModule(private val baseActivity: BaseActivity?,
                        private val tag: String) {

    // ************************************* PUBLIC METHODS ************************************ //

    @Provides
    @PerUiComponent
    fun provideActivity(): Activity? {
        return baseActivity
    }

    @Provides
    @PerUiComponent
    fun provideBaseActivty(): BaseActivity? {
        return baseActivity
    }


    @Provides
    @PerUiComponent
    fun provideAndroidLogger(): Logger {
        return Logger(tag)
    }
}
