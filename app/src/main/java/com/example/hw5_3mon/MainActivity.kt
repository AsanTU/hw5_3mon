package com.example.hw5_3mon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw5_3mon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickPlus()
    }

    private fun clickPlus() {
        binding.tvRes.text = count.toString()
        binding.btnRes.text = "+1"
        binding.btnRes.setOnClickListener {
            if (count == 10) {
                clickMinus()
            } else {
                count++
                binding.tvRes.text = count.toString()
            }
        }
    }

    private fun clickMinus() {
        binding.tvRes.text = count.toString()
        binding.btnRes.text = "-1"
        binding.btnRes.setOnClickListener {
            if (count > 0) {
                count--
                binding.tvRes.text = count.toString()
            } else if (count == 0){
                navigateToSec()
            }
        }
    }

    private fun navigateToSec(){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("resalt", count)
        startActivity(intent)
    }
}