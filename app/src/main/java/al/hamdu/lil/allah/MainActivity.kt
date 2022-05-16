package al.hamdu.lil.allah

import al.hamdu.lil.allah.databinding.ActivityMainBinding
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        activityMainBinding.button.setOnClickListener {
            applicationContext.startForegroundService(Intent(this, ZekrService()::class.java))
        }
    }}