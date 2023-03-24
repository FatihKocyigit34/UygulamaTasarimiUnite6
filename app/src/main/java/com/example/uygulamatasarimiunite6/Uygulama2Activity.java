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
        Log.e(TAG, "onCreate Çalıştırıldı");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart Çalıştırıldı");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume Çalıştırıldı");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause Çalıştırıldı");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop Çalıştırıldı");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy Çalıştırıldı");
    }
}