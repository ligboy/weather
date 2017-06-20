package org.ligboy.mweather

import android.arch.lifecycle.LifecycleRegistry
import android.arch.lifecycle.LifecycleRegistryOwner
import android.support.v7.app.AppCompatActivity

/**
 * BaseActivity.
 */
open class BaseActivity : AppCompatActivity(), LifecycleRegistryOwner {

    @Suppress("LeakingThis")
    private val lifecycleRegistry = LifecycleRegistry(this)

    override fun getLifecycle(): LifecycleRegistry {
        return lifecycleRegistry
    }

}