package com.example.practice_git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_git.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
    }
}