package com.example.momen.smart_university.Activites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.momen.smart_university.R;

public class Note extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        setTitle("My Notes");
        Spinner subject =findViewById(R.id.spinner_subjects);
        ArrayAdapter<CharSequence>arrayAdapter=ArrayAdapter.createFromResource(this,R.array.subjects,android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        subject.setAdapter(arrayAdapter);
        Spinner spinner_year=findViewById(R.id.spinner_year);
        Spinner spinner_spec=findViewById(R.id.spinner_spec);
        ArrayAdapter<CharSequence> arrayAdapter1= ArrayAdapter.createFromResource(this,R.array.year,android.R.layout.simple_spinner_item);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_year.setAdapter(arrayAdapter1);
        ArrayAdapter<CharSequence> arrayAdapter_spec= ArrayAdapter.createFromResource(this,R.array.specialize,android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_spec.setAdapter(arrayAdapter_spec);
        Button send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Note.this, "The note was sent successfully", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
