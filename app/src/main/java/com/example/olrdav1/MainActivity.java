package com.example.olrdav1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    TextView phone;
    CardView dev;
    CardView seera;
    CardView tekinika;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dev = this.findViewById(R.id.dev);
        seera = this.findViewById(R.id.seera);
        tekinika = this.findViewById(R.id.tekinika);

        tv =this.findViewById(R.id.tv);

        tv.setSelected(true);
        tekinika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent t = new Intent(MainActivity.this,Doc1.class);
                startActivity(t);
            }
        });
        seera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(MainActivity.this,MainActivity.class);
                startActivity(s);
            }
        });
        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(MainActivity.this, MainActivity.class);
                startActivity(n);
            }
        });
    }
}