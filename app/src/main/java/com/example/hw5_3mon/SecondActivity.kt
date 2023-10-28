package com.example.hw5_3mon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw5_3mon.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getNavigate()
    }

    private fun getNavigate() {
        val res =  intent.getIntExtra("resalt", 0)
        binding.tvSec.text = res.toString()
    }
}