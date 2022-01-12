package com.example.olrdav1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Developer extends AppCompatActivity {
    TextView phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        phone = this.findViewById(R.id.textView8);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "0922222524";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + number));// Initiates the Intent
                startActivity(intent);
            }
        });
    }
}