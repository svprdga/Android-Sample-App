package com.svprdga.androidsampleapp.presentation.base

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.svprdga.androidsampleapp.di.component.AppComponent
import com.svprdga.androidsampleapp.di.component.UiComponent
import com.svprdga.androidsampleapp.di.module.PresenterModule
import com.svprdga.androidsampleapp.di.module.UiComponentModule
import com.svprdga.androidsampleapp.presentation.application.CoreApp

abstract class BaseActivity : AppCompatActivity() {

    // ****************************************** VARS ***************************************** //

    val coreApp: CoreApp
        get() = application as CoreApp
    val appComponent: AppComponent?
        get() = coreApp.appComponent

    protected var uiComponent: UiComponent? = coreApp.uiComponent

    // *************************************** LIFECYCLE *************************************** //

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent?.inject(this)
    }

    public override fun onDestroy() {
        super.onDestroy()
        releaseUiComponent()
    }

    // *********************************** PROTECTED METHODS *********************************** //

    // Dependency injection.

    /**
     * Method that provides the activity component.
     *
     * @param tag Tag used to log.
     * @return UiComponent instance.
     */
    protected fun getUiComponent(tag: String): UiComponent? {
        if (uiComponent == null) {
            uiComponent = appComponent?.plusUiComponent(
                UiComponentModule(this, tag),
                PresenterModule()
            )
        }
        return uiComponent
    }

    // ************************************ PRIVATE METHODS ************************************ //

    /**
     * Method that releases [UiComponent]. Always use this method in the end of the life
     * of the object whose has created an [UiComponent].
     */
    private fun releaseUiComponent() {
        uiComponent = null
    }


}