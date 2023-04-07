package com.example.uygulamatasarimiunite6;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Uygulama8Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama8_activity);
    }

    public void birinciFragment(View view)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        Uygulama8_BirinciFragment birinciFragment = new Uygulama8_BirinciFragment();
        fragmentTransaction.replace(R.id.frameLayout,birinciFragment);
        fragmentTransaction.commit();
    }

    public void ikinciFragment(View view)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        Uygulama8_IkinciFragment ikinciFragment = new Uygulama8_IkinciFragment();
        fragmentTransaction.replace(R.id.frameLayout,ikinciFragment);
        fragmentTransaction.commit();
    }
}
