package com.example.olrdav1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView vld;
    CardView dev;
    CardView mv;
    CardView ced;
    CardView seera;
    CardView tekinika;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seera = this.findViewById(R.id.seera);
        tekinika = this.findViewById(R.id.tekinika);
        ced =this.findViewById(R.id.ced);
        vld =this.findViewById(R.id.vld);
        dev =this.findViewById(R.id.developer);
        mv =this.findViewById(R.id.mision);


        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(MainActivity.this, Developer.class );
                startActivity(d);
            }
        });
       mv.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent l = new Intent(MainActivity.this, MV.class);
               startActivity(l);
           }
       });
        ced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(MainActivity.this, CED.class );
                startActivity(m);
            }
        });
        tekinika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent t = new Intent(MainActivity.this,VTV.class);
                startActivity(t);
            }
        });
        seera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(MainActivity.this,VS.class);
                startActivity(s);
            }
        });
        vld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(MainActivity.this, VLD.class);
                startActivity(n);
            }
        });
    }
}