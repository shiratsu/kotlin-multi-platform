package com.jetbrains.handson.app.mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jetbrains.handson.app.mobile.createApplicationScreenMessage
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.main_text).text = createApplicationScreenMessage()
    }
}
