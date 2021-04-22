package ru.zanuda.myappgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import ru.zanuda.myappgit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var das: String = "qwerty" +
            ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}