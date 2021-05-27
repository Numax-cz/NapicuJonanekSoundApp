package com.napicu.napicujonaneksound;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }


    public void PlaySound(int m)
    {
        final MediaPlayer sound = MediaPlayer.create(this, m);
        sound.start();
    }

    public void onClick(View v) {
        switch (v.getId())
        {

            case R.id.button1:
                this.PlaySound(R.raw.nevim);
                break;
            case R.id.button2:
                this.PlaySound(R.raw.huste);
                break;
            case R.id.button3:
                this.PlaySound(R.raw.mma);
                break;
            case R.id.button4:
                this.PlaySound(R.raw.nema);
                break;
            case R.id.button5:
                this.PlaySound(R.raw.aaaaa);
                break;
            case R.id.button6:
                this.PlaySound(R.raw.picus);
                break;
            case R.id.button7:
                this.PlaySound(R.raw.sila);
                break;
            case R.id.button8:
                this.PlaySound(R.raw.vole);
                break;
            case R.id.button9:
                this.PlaySound(R.raw.zdrave);
                break;
            case R.id.button10:
                this.PlaySound(R.raw.plechac);
                break;


        }
    }
}