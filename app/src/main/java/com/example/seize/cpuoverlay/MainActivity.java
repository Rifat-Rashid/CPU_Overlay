package com.example.seize.cpuoverlay;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import wei.mark.standout.StandOutWindow;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StandOutWindow.closeAll(this, FloatingWindow.class);
        StandOutWindow.show(this, FloatingWindow.class, StandOutWindow.DEFAULT_ID);
        finish();
    }
}
