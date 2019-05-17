package com.svprdga.androidsampleapp.di.component

import com.svprdga.androidsampleapp.di.annotation.PerUiComponent
import com.svprdga.androidsampleapp.di.module.PresenterModule
import com.svprdga.androidsampleapp.di.module.UiComponentModule
import com.svprdga.androidsampleapp.presentation.list.ListActivity
import dagger.Subcomponent

/**
 * Component that will live during the activity/service/fragment lifetime.
 * The [PerUiComponent] tag is a custom scoping annotation to permit objects whose lifetime
 * should conform to the activity's life in that specific component. All these methods are
 * exposed to sub-graphs.
 */
@PerUiComponent
@Subcomponent(modules = [UiComponentModule::class, PresenterModule::class])
interface UiComponent {

    fun inject(target: ListActivity)
}
