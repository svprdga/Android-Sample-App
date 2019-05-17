package com.svprdga.androidsampleapp.presentation.base

/**
 * Basic presenter interface which defines presenter-related methods.
 */
interface IPresenter<T : IView> {

    /**
     * Method to bind a view to this presenter.
     * @param view View to bind.
     */
    fun bind(view: T)

    /**
     * Method which unbinds the bound view from this presenter.
     */
    fun unBind()

    /**
     * Method triggered when the view just appears.
     */
    fun onStartView()

    /**
     * Method triggered when the view just dissappears.
     */
    fun onStopView()
}
