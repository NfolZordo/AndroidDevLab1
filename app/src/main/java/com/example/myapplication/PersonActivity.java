package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PersonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle arguments = getIntent().getExtras();
        Student student = (Student) arguments.get("studentData");
        TextView fullName = (TextView) findViewById(R.id.textViewName);
        TextView group = (TextView) findViewById(R.id.textViewGroup);
        TextView course = (TextView) findViewById(R.id.textViewCourse);
        TextView faculty = (TextView) findViewById(R.id.textViewFaculty);
        TextView special = (TextView) findViewById(R.id.textViewSpecialty);

        fullName.setText(student.getFullName());
        group.setText(student.getGroupName());
        course.setText(Integer.toString(student.getCourse()));
        faculty.setText(student.getFacultyName());
        special.setText(student.getSpecialtyName());

    }
    public void logOut(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }
}