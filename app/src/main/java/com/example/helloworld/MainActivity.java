package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @SuppressLint("SetTextI18n")
    public void onBtnClick (View view) {
        TextView firstNameMessage = findViewById(R.id.firstNameMessage);
        EditText edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
        firstNameMessage.setText("First Name:" + edtTxtFirstName.getText().toString());

        TextView lastNameMessage = findViewById(R.id.lastNameMessage);
        EditText edtTxtLastName = findViewById(R.id.edtTxtLastName);
        lastNameMessage.setText("Last Name:" + edtTxtLastName.getText().toString());

        TextView emailMessage = findViewById(R.id.emailMessage);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);
        emailMessage.setText("Email:" + edtTxtEmail.getText().toString());
    }

}