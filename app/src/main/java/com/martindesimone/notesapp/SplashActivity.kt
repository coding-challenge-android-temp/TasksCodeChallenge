package com.martindesimone.notesapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.martindesimone.notesapp.constant.Constant
import com.martindesimone.notesapp.repository.TasksRepository

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val preferences: SharedPreferences = getSharedPreferences(packageName, Context.MODE_PRIVATE);

        if(preferences.getString("AUTH_TOKEN", "")!!.isEmpty()){
            val repository = TasksRepository(application.applicationContext);
            repository.generateAccessToken(Constant.USERNAME).observe(this, Observer {
                startTimer()
            })
        }
        else{
            startTimer()
        }
    }

    private fun startTimer(){
        val timer = object: CountDownTimer(1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                goToMain()
            }
        }
        timer.start()
    }

    private fun goToMain(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}