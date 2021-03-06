package com.example.uberclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Completable
import java.util.concurrent.TimeUnit

class SplashScreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Completable.timer(3,TimeUnit.SECONDS,AndroidSchedulers.mainThread())
                .subscribe {
                    Toast.makeText(this, "Splash Screen run done", Toast.LENGTH_SHORT).show()
                }
    }
}