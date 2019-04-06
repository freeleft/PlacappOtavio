package com.eesotavio.placapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.eesotavio.placapp.extensions.Value
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPegouAr.setOnClickListener {
            val nextScreenIntent = Intent(this, GameActivity::class.java)

            nextScreenIntent.putExtra("HOME", inputHome.Value())
            nextScreenIntent.putExtra("AWAY", inputVisitante.Value())
            startActivity(nextScreenIntent)
        }

    }
}
