package com.omila.rollanumber

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val RollButton=findViewById<Button>(R.id.rollButton);
        val SeekBar=findViewById<SeekBar>( R.id.seekBar1);
        val resultTextView=findViewById<TextView>(R.id.resultTextView);
        val progressSeekBar=findViewById<TextView>(R.id.progressTextView)

        RollButton.setOnClickListener {
            val rand =Random().nextInt(SeekBar.progress);
            resultTextView.text=rand.toString();
        }
        SeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                // Display the current progress of SeekBar
                var b:Int=i-1
                if(b==0 ||b==-1){
                    progressSeekBar.text = "* O *"
                }else {
                    progressSeekBar.text = "0 - $b"
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Do something

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Do something

            }
        })
    }
}
