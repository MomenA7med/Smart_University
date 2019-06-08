package com.example.momen.smart_university.Activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.momen.smart_university.R;
import com.example.momen.smart_university.firebase.Student.Students;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class Login extends AppCompatActivity {

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private ChildEventListener listener;
    private EditText editText;
    private boolean chk = false;
    private List<Students> studentsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Smart University");
        firebaseDatabase = FirebaseDatabase.getInstance();
        editText = (EditText)findViewById(R.id.id_Et);
        studentsList = new ArrayList<>();
        databaseReference = firebaseDatabase.getReference().child("Students").child("First");
        listener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Students students = dataSnapshot.getValue(Students.class);
                studentsList.add(students);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
        databaseReference.addChildEventListener(listener);

    }
    public void click(View view){

        Toast.makeText(this, String.valueOf(studentsList.size())
                , Toast.LENGTH_SHORT).show();
     for(int i =0;i<studentsList.size();i++)  {

         if(studentsList.get(i).getS_id().equals(editText.getText().toString())){
             StudentName.name = studentsList.get(i).getS_name();
             chk = true;
         }
        }
        if(chk){
            Intent intent = new Intent(Login.this,Student_Profile.class);
            startActivity(intent);
        }
        else Toast.makeText(this, "student is not exist", Toast.LENGTH_SHORT).show();
    }
}
