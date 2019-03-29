package com.example.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Factura extends AppCompatActivity {

    private TextView mUser, mEmail, cont1, cont2,cont3, cont4, cont5, cont6, cont7, cont8, cont9, total;
    private Button mShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);

        Intent mIntent = getIntent();

        mUser = findViewById(R.id.tv_usuario);
        mEmail = findViewById(R.id.tv_correo);
        cont1 = findViewById(R.id.contador1);
        cont2 = findViewById(R.id.contador2);
        cont3 = findViewById(R.id.contador3);
        cont4 = findViewById(R.id.contador4);
        cont5 = findViewById(R.id.contador5);
        cont6 = findViewById(R.id.contador6);
        cont7 = findViewById(R.id.contador7);
        cont8 = findViewById(R.id.contador8);
        cont9 = findViewById(R.id.contador9);
        total = findViewById(R.id.tv_total_productos);
        mShare = findViewById(R.id.bt_share);



        if(mIntent!=null){
            mUser.setText(mIntent.getStringExtra("user"));
            mEmail.setText(mIntent.getStringExtra("email"));
            cont1.setText(mIntent.getStringExtra("cont1"));
            cont2.setText(mIntent.getStringExtra("cont2"));
            cont3.setText(mIntent.getStringExtra("cont3"));
            cont4.setText(mIntent.getStringExtra("cont4"));
            cont5.setText(mIntent.getStringExtra("cont5"));
            cont6.setText(mIntent.getStringExtra("cont6"));
            cont7.setText(mIntent.getStringExtra("cont7"));
            cont8.setText(mIntent.getStringExtra("cont8"));
            cont9.setText(mIntent.getStringExtra("cont9"));
            total.setText(mIntent.getStringExtra("total"));
        }

        mShare.setOnClickListener(v -> {
            String getCont1 = cont1.getText().toString();
            String getCont2 = cont2.getText().toString();
            String getCont3 = cont3.getText().toString();
            String getCont4 = cont4.getText().toString();
            String getCont5 = cont5.getText().toString();
            String getCont6 = cont6.getText().toString();
            String getCont7 = cont7.getText().toString();
            String getCont8 = cont8.getText().toString();
            String getCont9 = cont9.getText().toString();

            mIntent.setType("text/plain");
            mIntent.setAction(Intent.ACTION_SEND);
        });
    }
}
