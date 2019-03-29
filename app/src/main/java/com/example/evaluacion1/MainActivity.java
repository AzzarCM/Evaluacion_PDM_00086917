package com.example.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9;
    Integer count1 =0, count2 =0, count3=0, count4=0, count5=0, count6=0, count7 =0, count8 =0, count9 =0;
    Button mSend;
    EditText mUsuario, mCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_1 = findViewById(R.id.contador1);
        tv_2 = findViewById(R.id.contador2);
        tv_3 = findViewById(R.id.contador3);
        tv_4 = findViewById(R.id.contador4);
        tv_5 = findViewById(R.id.contador5);
        tv_6 = findViewById(R.id.contador6);
        tv_7 = findViewById(R.id.contador7);
        tv_8 = findViewById(R.id.contador8);
        tv_9 = findViewById(R.id.contador9);
        mUsuario = findViewById(R.id.et_usuario);
        mCorreo = findViewById(R.id.et_correo);

        mSend = findViewById(R.id.button_send);

        mUsuario.setOnClickListener(this);
        mCorreo.setOnClickListener(this);

        tv_1.setOnClickListener(this);
        tv_2.setOnClickListener(this);
        tv_3.setOnClickListener(this);
        tv_4.setOnClickListener(this);
        tv_5.setOnClickListener(this);
        tv_6.setOnClickListener(this);
        tv_7.setOnClickListener(this);
        tv_8.setOnClickListener(this);
        tv_9.setOnClickListener(this);
        mSend.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int ViewId = v.getId();
        switch (ViewId){
            case R.id.contador1:
                count1+=1;
                tv_1.setText(count1.toString());
                break;
            case R.id.contador2:
                count2+=1;
                tv_2.setText(count2.toString());
                break;
            case R.id.contador3:
                count3+=1;
                tv_3.setText(count3.toString());
                break;
            case R.id.contador4:
                count4+=1;
                tv_4.setText(count4.toString());
                break;
            case R.id.contador5:
                count5+=1;
                tv_5.setText(count5.toString());
                break;
            case R.id.contador6:
                count6+=1;
                tv_6.setText(count6.toString());
                break;
            case R.id.contador7:
                count7+=1;
                tv_7.setText(count7.toString());
                break;
            case R.id.contador8:
                count8+=1;
                tv_8.setText(count8.toString());
                break;
            case R.id.contador9:
                count9+=1;
                tv_9.setText(count9.toString());
                break;
            case R.id.button_send:
                String sumaConts = String.valueOf((count1+count2+count3+count4+count5+count6+count7+count8+count9));

                String cont1 = tv_1.getText().toString();
                String cont2 = tv_2.getText().toString();
                String cont3 = tv_3.getText().toString();
                String cont4 = tv_4.getText().toString();
                String cont5 = tv_5.getText().toString();
                String cont6 = tv_6.getText().toString();
                String cont7 = tv_7.getText().toString();
                String cont8 = tv_8.getText().toString();
                String cont9 = tv_9.getText().toString();
                String usuario = mUsuario.getText().toString();
                String correo = mCorreo.getText().toString();
                Intent mIntent = new Intent(MainActivity.this, Factura.class);
                mIntent.putExtra("cont1", cont1);
                mIntent.putExtra("cont2", cont2);
                mIntent.putExtra("cont3", cont3);
                mIntent.putExtra("cont4", cont4);
                mIntent.putExtra("cont5", cont5);
                mIntent.putExtra("cont6", cont6);
                mIntent.putExtra("cont7", cont7);
                mIntent.putExtra("cont8", cont8);
                mIntent.putExtra("cont9", cont9);
                mIntent.putExtra("user", usuario);
                mIntent.putExtra("email", correo);
                mIntent.putExtra("total", sumaConts);
                startActivity(mIntent);


        }


    }
}
