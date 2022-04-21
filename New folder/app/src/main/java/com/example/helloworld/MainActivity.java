package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterBtnClick(View view) {
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtSecondName = findViewById(R.id.txtSecondName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText editTxtFirstName = findViewById(R.id.edittxtFirstName);
        EditText editTxtSecondName = findViewById(R.id.edittxtSecondName);
        EditText editTxtEmail = findViewById(R.id.edittxtEmail);

        txtFirstName.setText("First Name: " + editTxtFirstName.getText().toString());
        txtSecondName.setText("Second Name: " + editTxtSecondName.getText().toString());
        txtEmail.setText(" Email: " + editTxtEmail.getText().toString());
    }
}