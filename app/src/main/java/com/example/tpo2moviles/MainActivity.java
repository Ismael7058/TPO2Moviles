package com.example.tpo2moviles;

import android.Manifest;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private UnlockScreen unlock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        unlock = new UnlockScreen();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        permmisos();
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(this.unlock, new IntentFilter(Intent.ACTION_USER_PRESENT));
    }


    @Override
    protected void onPause() {
        unregisterReceiver(unlock);
        super.onPause();
    }

    public void permmisos() {
        if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 1000);
        }
    }

}