package com.intellisoft.myapplication.landing_page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.intellisoft.myapplication.R
import com.intellisoft.myapplication.auth.SignUp1
import com.intellisoft.myapplication.chat.Chat
import com.intellisoft.myapplication.helper_class.FormatterClassHelper

class Splash : AppCompatActivity() {

    private val formatterClassHelper = FormatterClassHelper()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Start the main activity after a delay
        Handler().postDelayed({

            val intent = Intent(this, Chat::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
            finish()

//            val isLoggedIn = formatterClassHelper
//                .retrieveSharedPreference(
//                    this, "isLoggedIn")
//
//            if (isLoggedIn != null){
//                if (isLoggedIn == "true"){
//                    val intent = Intent(this, MainActivity::class.java)
//                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
//                    startActivity(intent)
//                    finish()
//                }else{
//                    startActivity(Intent(this,
//                        SignUp1::class.java))
//                    finish()
//                }
//            }else{
//                startActivity(Intent(this,
//                    SignUp1::class.java))
//                finish()
//            }

        }, 2000)

    }
}