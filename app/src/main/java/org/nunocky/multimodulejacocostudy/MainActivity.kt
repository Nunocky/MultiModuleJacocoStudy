package org.nunocky.multimodulejacocostudy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.nunocky.libx.LibX
import org.nunocky.liby.LibY
import org.nunocky.libz.LibZ

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LibX.hello()
        LibY.hello()
        LibZ.hello()
    }
}