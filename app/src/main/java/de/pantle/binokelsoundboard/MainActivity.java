package de.pantle.binokelsoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view)  {
        switch (view.getId()) {
            case R.id.button1:
                mediaPlayer = MediaPlayer.create(this, R.raw.button1);
                break;
            case R.id.button2:
                mediaPlayer = MediaPlayer.create(this, R.raw.button2);
                break;
            case R.id.button3:
                mediaPlayer = MediaPlayer.create(this, R.raw.button3);
                break;
            case R.id.button4:
                mediaPlayer = MediaPlayer.create(this, R.raw.button4);
                break;
            case R.id.button5:
                mediaPlayer = MediaPlayer.create(this, R.raw.button5);
                break;
            case R.id.button6:
                mediaPlayer = MediaPlayer.create(this, R.raw.button6);
                break;
            case R.id.button7:
                mediaPlayer = MediaPlayer.create(this, R.raw.button7);
                break;
            case R.id.button8:
                mediaPlayer = MediaPlayer.create(this, R.raw.button8);
                break;
            case R.id.button9:
                mediaPlayer = MediaPlayer.create(this, R.raw.button9);
                break;
        }

        mediaPlayer.start();
    }
}
