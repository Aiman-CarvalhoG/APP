package com.ds2.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout

const val EXTRA_MESSAGE = "com.ds2.helloworld.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View) {
        val textoDaMensagem = findViewById<EditText>(R.id.TextMessage)
        val message = EditText.text.toString(R.id.TextMessage)
    }

    // fun NomeDaFunção(parametros da função)( )
}