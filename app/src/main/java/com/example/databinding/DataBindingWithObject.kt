package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityDataBindingWithObjectBinding

class DataBindingWithObject : AppCompatActivity() {
    private lateinit var binding : ActivityDataBindingWithObjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding_with_object)

        binding.student = getStudent()

//        val student = getStudent()
//        binding.nameText.text = student.name
//        binding.emailText.text = student.email

    }

    private fun getStudent() :Student{
        return Student(1,"User","user@gmail.com")
    }
}