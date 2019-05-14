package com.tulio.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import io.flutter.facade.Flutter;

public class MainActivity extends AppCompatActivity {

    Button openFlutterViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openFlutterViewButton = findViewById(R.id.openFlutterViewButton);
        openFlutterViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFlutterViewButton.setEnabled(false);
                View flutterView = Flutter.createView(MainActivity.this, getLifecycle(), "route1");
                FrameLayout.LayoutParams frameLayoutParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                frameLayoutParams.topMargin = 200;
                addContentView(flutterView, frameLayoutParams);
            }
        });
    }
}
