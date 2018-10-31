package com.example.assemalturifi.week2day1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeconActivity extends AppCompatActivity {
    private SeekBar seekBar1;
    private SeekBar seekBar2;
    private SeekBar seekBar3;

    private TextView textView1;
    private static int seekBarChanged=0;
    private TextView textView2;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



    }
    public void seekBars(){
        seekBar1=(SeekBar) findViewById(R.id.seekBar1);
        textView1=(TextView)findViewById(R.id.textViewAmount1);
        seekBar2=(SeekBar)findViewById(R.id.seekBar2);
        textView2=(TextView)findViewById(R.id.textViewAmount2);
        seekBar3=(SeekBar)findViewById(R.id.seekBar3);
        textView3=(TextView) findViewById(R.id.textViewAmount3);

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekBarChanged=1;
                updateTextview(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekBarChanged=2;
                updateTextview(progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekBarChanged=3;
                updateTextview(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void updateTextview(int progress){
        switch (seekBarChanged){
            case 1:
                textView1.setText(String.valueOf(progress));
            case 2:
                textView2.setText(String.valueOf(progress));
            case 3:
                textView3.setText(String.valueOf(progress));
        }
    }

}
