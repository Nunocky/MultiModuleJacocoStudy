package org.nunocky.multimodulejacocostudy

import androidx.test.core.app.launchActivity
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Test
    fun testEvent() {
        val scenario = launchActivity<MainActivity>()

        // Now activity is in status RESUMED
    }
}