package com.turgunboyevjurabek.mipult

import SensorActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.KeyEvent
import com.turgunboyevjurabek.mipult.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when (keyCode) {
            KeyEvent.KEYCODE_DPAD_UP -> {
                binding.up.setOnClickListener {

                }
                return true
            }
            KeyEvent.KEYCODE_DPAD_DOWN -> {
                // Boshqa tugma bosilganda bajariladigan amallar
                binding.up.setOnClickListener {
                    Vibrator.VIBRATION_EFFECT_SUPPORT_YES
                }
                return true
            }
            KeyEvent.KEYCODE_DPAD_LEFT -> {
                // Boshqa tugma bosilganda bajariladigan amallar
                return true
            }
            KeyEvent.KEYCODE_DPAD_RIGHT -> {
                // Boshqa tugma bosilganda bajariladigan amallar
                return true
            }
        }
        return super.onKeyDown(keyCode, event)
    }
}