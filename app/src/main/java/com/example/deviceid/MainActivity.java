package com.example.deviceid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myCLick(View view) {
        String uniqueID = UUID.randomUUID().toString();
        Log.i("()()()(", uniqueID);
        String id2 = Settings.Secure.getString(this.getContentResolver(), Settings.Secure.ANDROID_ID);
        Log.i("()()()(", id2);
        Log.i("()()()(", Build.MODEL);
        Log.i("()()()(", Build.DEVICE);
    }
}

// https://www.youtube.com/watch?v=XziWvGS7pss