package com.example.acalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n1 : Button = findViewById(R.id.n1)
        val n2 : Button = findViewById(R.id.n2)
        val n3  : Button = findViewById(R.id.n3)
        val n4  : Button = findViewById(R.id.n4)
        val n5 : Button = findViewById(R.id.n5)
        val n6 : Button = findViewById(R.id.n6)
        val n7 : Button = findViewById(R.id.n7)
        val n8 : Button = findViewById(R.id.n8)
        val n9 : Button = findViewById(R.id.n9)
        val n0 : Button = findViewById(R.id.n0)
        val plus : Button = findViewById(R.id.plus)
        val sub : Button = findViewById(R.id.sub)
        val text_equal: Button = findViewById(R.id.text_equal)

        val et_show : EditText = findViewById(R.id.et_show)
        val et_blind : EditText = findViewById(R.id.et_blind)

        var new = 0
        var old = 0

        n1.setOnClickListener{
            new = new+1
            et_show.setText(new.toString())
        }
        n2.setOnClickListener{
            new = new+2
            et_show.setText(new.toString())
        }
        n3.setOnClickListener{
            new = new+3
            et_show.setText(new.toString())
        }
        n4.setOnClickListener{
            new = new+4
            et_show.setText(new.toString())
        }
        n5.setOnClickListener{
            new = new+5
            et_show.setText(new.toString())
        }
        n6.setOnClickListener{
            new = new+6
            et_show.setText(new.toString())
        }
        n7.setOnClickListener{
            new = new+7
            et_show.setText(new.toString())
        }
        n8.setOnClickListener{
            new = new+8
            et_show.setText(new.toString())
        }
        n9.setOnClickListener{
            new = new+9
            et_show.setText(new.toString())
        }
        n0.setOnClickListener{
            new = new+0
            et_show.setText(new.toString())
        }
        sub.setOnClickListener{
            new = 0
            old = 0
            et_show.setText(new.toString())
        }
        plus.setOnClickListener{
            et_show.append(" + ")
            old += new
            new=0
        }
        text_equal.setOnClickListener{
            old=(old+new)
            et_blind.setText(old.toString())
        }



    }




}