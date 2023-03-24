package com.example.uygulamatasarimiunite6;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Uygulama2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama2_activity);
        Log.v(TAG, "onCreate Çalıştırıldı");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "onStart Çalıştırıldı");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "onResume Çalıştırıldı");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "onPause Çalıştırıldı");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "onStop Çalıştırıldı");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "onDestroy Çalıştırıldı");
    }
}