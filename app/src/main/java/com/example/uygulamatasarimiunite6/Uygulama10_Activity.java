package com.example.uygulamatasarimiunite6;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Uygulama10_Activity extends AppCompatActivity {
    ActivityResultLauncher<Intent> galeryResultLauncher;
    ActivityResultLauncher<String> izinlerResultLauncher;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama10_activity);
        metotGaleryResultLauncher();
        metotIzinlerResultLauncher();
        imageView = findViewById(R.id.imageView);
    }

    public void galeriyeGit(View view){
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED) {
            izinlerResultLauncher.launch(Manifest.permission.READ_EXTERNAL_STORAGE);
        } else {
            Intent galeri = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            galeryResultLauncher.launch(galeri);
        }
    }

    public void metotGaleryResultLauncher(){
        galeryResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if(result.getResultCode() == RESULT_OK){
                    Intent intentSonuc = result.getData();
                    if(intentSonuc != null) {
                        Uri fotoVeri = intentSonuc.getData();
                        imageView.setImageURI(fotoVeri);
                    }
                }
            }
        });
    }

    public void metotIzinlerResultLauncher(){
        izinlerResultLauncher = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback<Boolean>() {
            public void onActivityResult(Boolean result) {
                if(result == true) {
                    Intent galeri = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    galeryResultLauncher.launch(galeri);
                } else {
                    Toast.makeText(Uygulama10_Activity.this, "İzin vermeniz gerekiyor.", Toast.LENGTH_SHORT).show();
                    izinlerResultLauncher.launch(Manifest.permission.READ_EXTERNAL_STORAGE);
                }
            }
        });
    }



}
