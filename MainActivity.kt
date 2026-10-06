package com.blitz.app

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(8, 22, 48))
        }

        val title = TextView(this).apply {
            text = "BlitZ"
            textSize = 38f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "License Key"
            textSize = 18f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 20, 0, 12)
        }

        val key = EditText(this).apply {
            hint = "Enter demo key"
            setSingleLine(true)
            setTextColor(Color.WHITE)
            setHintTextColor(Color.GRAY)
        }

        val enter = Button(this).apply {
            text = "ENTER"
            setOnClickListener {
                val valid = key.text.toString() == "BLITZ-DEMO-2026" ||
                        key.text.toString() == "BLITZ-PRO-2026"
                subtitle.text = if (valid) "Key accepted ✓" else "Invalid demo key"
            }
        }

        val freeKey = Button(this).apply {
            text = "GET FREE KEY"
            setOnClickListener {
                key.setText("BLITZ-DEMO-2026")
                subtitle.text = "Demo key generated"
            }
        }

        root.addView(title)
        root.addView(subtitle)
        root.addView(key, LinearLayout.LayoutParams(-1, -2))
        root.addView(enter)
        root.addView(freeKey)

        setContentView(root)
    }
}