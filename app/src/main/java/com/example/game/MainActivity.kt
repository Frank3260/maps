package com.example.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



 var count=0
 var points=0
val images= arrayOf<Int>(R.drawable.boy,R.drawable.den,R.drawable.khab, R.drawable.micha,R.drawable.mosala,R.drawable.tenhag)
val questions= arrayOf<String>("Identify the legend here","name this celeb","who is this tik tok nigga","huyu bana ni G","Liverpool man","this man will take man u to great heights")
val answers= arrayOf<String>("Burna boy","khaled","kheb","michael B jordan","Mo Salah","Ten Hag")















class MainActivity : AppCompatActivity() {
































    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}