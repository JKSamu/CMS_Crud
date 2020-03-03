package com.samu.cms_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;

import android.os.AsyncTask;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;



import android.widget.Toast;


import java.util.HashMap;

public class ADDDesignation extends AppCompatActivity implements View.OnClickListener
 {


    private Button buttonToDesignation;
    private EditText editTextDesignation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designation);

        editTextDesignation = (EditText) findViewById(R.id.editTextDesgnation);
        buttonToDesignation = (Button) findViewById(R.id.buttonAddDesignation);
        buttonToDesignation.setOnClickListener(this);


    }







    //Adding an Designation
    public void AddDesignation() {
        final String desg = editTextDesignation.getText().toString().trim();

        class AddDesignation extends AsyncTask<Void, Void, String> {
            ProgressDialog loading;


            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(ADDDesignation.this, "Adding...", "Wait...", false, false);
            }

            @Override
            protected String doInBackground(Void... voids) {
                HashMap<String, String> params = new HashMap<>();
                params.put(Config.KEY_EMP_DESG, desg);

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(Config.URL_ADD_Desg, params);
                return res;

            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(ADDDesignation.this, s, Toast.LENGTH_LONG).show();
            }
        }
        AddDesignation add = new AddDesignation();
        add.execute();


    }

    @Override
    public void onClick(View v) {
        if (v == buttonToDesignation) {
            AddDesignation();
            cleantable();

        }
    }

    public void cleantable() {

        editTextDesignation.setText(null);

    }

}