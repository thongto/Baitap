package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnTong;
    TextView txtTong, txtGiatri;
    EditText txtSo1, txtSo2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTong= findViewById(R.id.btnTong);
        txtTong= findViewById(R.id.txtTong);
        txtGiatri= findViewById(R.id.txtGiatri);
        txtSo1=findViewById(R.id.txtSo1);
        txtSo2=findViewById(R.id.txtSo2);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float so1,so2,tong=0;
                so1= Float.parseFloat(txtSo1.getText().toString());
                so2= Float.parseFloat(txtSo2.getText().toString());
                tong=so1+so2;
                txtGiatri.setText( tong +"");
            }
        });
    }
}
