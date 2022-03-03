package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnlogin;

    //Deklarasi variabel untuk EditText
    EditText edemail,edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnlogin dengan komponen button pada layout
        btnlogin=findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan komponen button pada layout
        edemail=findViewById(R.id.edEmail);


        //Menghubungkan variabel edpassword dengan komponen button pada layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btn login
        btnlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (edemail.getText().toString().equals("freedom@mail.id") && edpassword.getText().toString().equals("1234")) {
                    Toast.makeText(MainActivity.this, "Login sukses", Toast.LENGTH_SHORT).show();
                }else if (edemail.getText().toString().equals("freedom@mail.id")) {
                    Toast.makeText(MainActivity.this, "Password salah", Toast.LENGTH_SHORT).show();
                }else if (edpassword.getText().toString().equals("1234")) {
                    Toast.makeText(MainActivity.this, "Email salah", Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(MainActivity.this, "Email dan password salah",Toast.LENGTH_SHORT).show();
            }
        });

    }

}