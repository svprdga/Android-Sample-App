package com.svprdga.androidsampleapp.di.module

import android.app.Application
import android.content.Context
import com.svprdga.androidsampleapp.presentation.application.CoreApp
import javax.inject.Singleton
import dagger.Module
import dagger.Provides

/**
 * This class provides the required dependencies for the overall application level.
 */
@Module
class AppModule(private val app: CoreApp) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context {
        return app
    }

    @Provides
    @Singleton
    fun provideApplication(): Application {
        return app
    }

    @Provides
    @Singleton
    fun provideCoreApp(): CoreApp {
        return app
    }
}
