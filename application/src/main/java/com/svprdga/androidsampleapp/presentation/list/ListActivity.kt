package com.svprdga.androidsampleapp.presentation.list

import android.os.Bundle
import com.svprdga.androidsampleapp.R
import com.svprdga.androidsampleapp.presentation.base.BaseActivity
import javax.inject.Inject

private const val TAG = "list"

class ListActivity : BaseActivity(), IListView {

    // ************************************* INJECTED VARS ************************************* //

    @Inject
    lateinit var presenter: IListPresenter

    // *************************************** LIFECYCLE *************************************** //

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        getUiComponent(TAG)?.inject(this)

        presenter.bind(this)
    }

    override fun onStart() {
        super.onStart()
        presenter.onStartView()
    }

    override fun onStop() {
        super.onStop()
        presenter.onStopView()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.unBind()
    }

}