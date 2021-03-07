package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityCodingChallengeBinding
import com.example.databinding.databinding.ActivityMainBinding

class CodingChallengeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCodingChallengeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_coding_challenge)
        binding.progressBar.visibility = View.GONE

        binding.controlButton.setOnClickListener {
            startOrStopProgressBar()
        }
    }

    private fun startOrStopProgressBar(){
        binding.apply {
            //GONE = 실행 안되고 있음, VISIBLE = 실행 되고 있음
            if(progressBar.visibility == View.GONE){
                progressBar.visibility = View.VISIBLE
                controlButton.text = "Stop"
            }else{
                progressBar.visibility = View.GONE
                controlButton.text = "Start"
            }
        }
    }
}