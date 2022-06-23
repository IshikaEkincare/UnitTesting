package com.example.unittesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ResourceComparerTest{

    private lateinit var resourceComparer: ResourceComparer
    @Before
    fun setUp(){
        resourceComparer= ResourceComparer()
    }

    @Test
    fun StringResourcesSameAsString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name, "Unit Testing")
        assertThat(result).isTrue()
    }
    @Test
    fun StringResourcesDifferentAsString_returnsFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name, "Hello")
        assertThat(result).isFalse()
    }
}