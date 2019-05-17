package com.svprdga.androidsampleapp.presentation.list

import com.svprdga.androidsampleapp.di.annotation.PerUiComponent
import com.svprdga.androidsampleapp.presentation.base.BasePresenter
import com.svprdga.androidsampleapp.util.Logger

@PerUiComponent
class ListPresenter(log: Logger) : BasePresenter(log), IListPresenter {

    // ****************************************** VARS ***************************************** //

    private var view: IListView? = null

    // ************************************* PUBLIC METHODS ************************************ //

    override fun bind(view: IListView) {
        this.view = view
    }

    override fun unBind() {
        view = null
    }

    override fun onStartView() {
        log.debug("Start view")
    }

    override fun onStopView() {
        log.debug("Stop view")
    }

}