package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class page2 : AppCompatActivity() {

    private val languages = arrayOf(
        "Hello World",      // English
        "Hola Mundo",       // Spanish
        "Bonjour le monde", // French
        "Hallo Welt",       // German
        "Ciao Mondo"        // Italian
    )
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        val textView = findViewById<TextView>(R.id.textView)
        val languageButton = findViewById<Button>(R.id.languageButton)

        languageButton.setOnClickListener {
            currentIndex = (currentIndex + 1) % languages.size
            textView.text = languages[currentIndex]
        }
    }
}