package com.example.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var _binding:ActivityMainBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        setText()
    }

    fun increment(v:View){
        mainViewModel.increment()
        setText()
    }

    private fun setText() {
        _binding.txtCounter.text = mainViewModel.count.toString()
    }
}