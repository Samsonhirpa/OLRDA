package com.example.olrdav1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class CED extends AppCompatActivity {
    private WebView ced;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_e_d);
        ced = findViewById(R.id.mvweb1);

        WebView view = new WebView(this);

        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("file:///android_asset/SOPs for Veterinary Surgery.html");
        setContentView(view);

        WebSettings webSettings = ced.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
    }
}