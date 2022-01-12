package com.example.olrdav1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MV extends AppCompatActivity {
    private WebView mvweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_v);
        mvweb = findViewById(R.id.mvweb2);
        WebView view = new WebView(this);

        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("file:///android_asset/mision.html");
        setContentView(view);

        WebSettings webSettings = mvweb.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
    }
}