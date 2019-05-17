package com.svprdga.androidsampleapp.presentation.application

import android.app.Application
import com.svprdga.androidsampleapp.di.component.AppComponent
import com.svprdga.androidsampleapp.di.component.DaggerAppComponent
import com.svprdga.androidsampleapp.di.component.UiComponent
import com.svprdga.androidsampleapp.di.module.AppModule

class CoreApp : Application() {

    var appComponent: AppComponent? = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()

    var uiComponent: UiComponent? = null

}
