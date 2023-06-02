package com.example.recycleviev

import FirstFragment
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {








    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val recomendation = SearchFragment()
        val shorts = ShortsFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment1, firstFragment)
            commit()
        }

        val btnFragment1 = findViewById<ImageButton>(R.id.btnFragment1)
        btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment1, firstFragment)
                addToBackStack(null)
                commit()
            }
        }

        val btnFragment2 = findViewById<ImageButton>(R.id.btnFragment2)
        btnFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment1, secondFragment)
                addToBackStack(null)
                commit()
            }
        }

        val btnFragment3 = findViewById<ImageButton>(R.id.btnFragment3)
        btnFragment3.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment1, recomendation)
                addToBackStack(null)
                commit()
            }
        }

        val btnFragment4 = findViewById<ImageButton>(R.id.btnFragment5)
        btnFragment4.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment1, shorts)
                addToBackStack(null)
                commit()
            }
        }

    }
}


