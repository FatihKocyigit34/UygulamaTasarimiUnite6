package com.example.uygulamatasarimiunite6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uygulama10_Activity extends AppCompatActivity {
    ActivityResultLauncher<Intent> galeryResultLauncher;
    ActivityResultLauncher<String> izinlerResultLauncher;
    ImageView img1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        img1 = findViewById(R.id.imageView);
    }
    public void imgclick(View view)
    {

    }

    

}
