package com.samu.cms_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstPage extends AppCompatActivity {
    private Button btwnMain;
   private Button btnViewALL;
    private Button btnViewEm;
    private  Button btnDesig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        btnDesig = findViewById(R.id.IdDesig);
        btnViewALL = findViewById(R.id.idviewALL);
        btnViewEm = findViewById(R.id.idViewEm);
        btwnMain = findViewById(R.id.idMainActivity);


        btnDesig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent bpost = new Intent(FirstPage.this,ADDDesignation.class);
                startActivity(bpost);

            }
        });


        //---------------------------


        btnViewEm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent bget = new Intent(FirstPage.this,ViewEmployee.class);
                startActivity(bget);

            }
        });



//--------------------------loging---
        btwnMain.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent b = new Intent(FirstPage.this, MainActivity.class);
                startActivity(b);
            }
        });










    } //smb
}


