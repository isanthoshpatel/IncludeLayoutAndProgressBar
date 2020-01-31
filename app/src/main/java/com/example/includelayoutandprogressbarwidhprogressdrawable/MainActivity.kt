package com.example.includelayoutandprogressbarwidhprogressdrawable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var i = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        bt1.setOnClickListener {
            Thread(Runnable {
                   while (i <= 100) {
                       pb_horizontal.visibility = View.VISIBLE
                       pb_horizontal.setProgress(i)
                       SystemClock.sleep(400)
                       i++
                   }
                Toast.makeText(this@MainActivity,"completed",Toast.LENGTH_LONG).show()
            }).start()


        }


    }
}
