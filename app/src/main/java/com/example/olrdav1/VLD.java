package com.example.olrdav1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class VLD extends AppCompatActivity {
    private WebView vldweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_l_d);
        vldweb = findViewById(R.id.mvweb2);
        WebView view = new WebView(this);

        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("file:///android_asset/SOP for Veterinary Laboratory Diagnosis.html");
        setContentView(view);

        WebSettings webSettings = vldweb.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
    }
}