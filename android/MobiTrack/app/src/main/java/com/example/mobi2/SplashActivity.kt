package com.example.mobi2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_splash)

        val logolayout = findViewById<ImageView>(R.id.logo)
        logolayout.animate().alpha(1.0f).scaleX(1.1f).scaleY(1.1f).duration = 2000
        val isFirstRun =
            getSharedPreferences("PREFERENCES", Context.MODE_PRIVATE)
                .getBoolean("isfirstrun", true)
        logolayout.animate().alpha(1.0f).scaleX(1.1f).scaleY(1.1f).setDuration(2500)


        Handler().postDelayed({
            /* Create an Intent that will start the Menu-Activity. */
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, 3000)
//        {
//            Handler().postDelayed({
//                val i = Intent(applicationContext, MainActivity::class.java)
//                startActivity(i)
//                finish()
//                finishActivity(0)
//            }, 2600)
//        }
    }
}
