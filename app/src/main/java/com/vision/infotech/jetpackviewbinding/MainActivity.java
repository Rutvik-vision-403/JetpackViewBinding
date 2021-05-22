package com.vision.infotech.jetpackviewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.vision.infotech.jetpackviewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainActivityBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mainActivityBinding.getRoot();
        setContentView(view);

        setViewData();
    }

    private void setViewData(){
        mainActivityBinding.imageView2.setImageDrawable(getResources().getDrawable(R.drawable.download));
        mainActivityBinding.editTextTextEmailAddress3.setText("https://visioninfotech.net/");
    }

}