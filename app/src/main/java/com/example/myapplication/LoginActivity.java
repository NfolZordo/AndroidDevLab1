package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class LoginActivity extends AppCompatActivity {
    private Student student = new Student("Задорожний", "Олександир", "Васильович",
            "ПЗ-2004", "Факультет інформаційних технологій і систем",
            "121 - Інженерія програмного забезпечення", "qqqq", "1111", 3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editPassword = (EditText) findViewById(R.id.editTextTextPassword);
        String receivedPassword = editPassword.getText().toString();
        EditText editLogin = (EditText) findViewById(R.id.editTextTextPersonName2);
        String receivedLogin = editLogin.getText().toString();
        Intent intent;
        if(student.getPassword().equals(receivedPassword) && student.getLogin().equals(receivedLogin)) {
            intent = new Intent(this, PersonActivity.class);
            intent.putExtra("studentData", student);
            startActivity(intent);
        }
        else {
            TextView mistakeMessage = (TextView) findViewById(R.id.textViewMistake);
            mistakeMessage.setText("Неправельний логін або пароль");
        }
    }
}