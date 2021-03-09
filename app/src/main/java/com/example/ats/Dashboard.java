package com.example.ats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class Dashboard extends AppCompatActivity {

    Button btnWebsite, btnEdit,btnFee,btnBooks,btnNotes,btnAssignments,btnSyllabus,btnManuals,btnLabManuals,btnInterviewQuestions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

//        Website Button
        btnWebsite = (Button) findViewById(R.id.btnWebsite);

        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w = new Intent(Dashboard.this,com.example.ats.Website.class);
                startActivity(w);
            }
        });

//        Edit Details Button
        btnEdit = (Button) findViewById(R.id.btnEdit);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(Dashboard.this,com.example.ats.EditDetails.class);
                startActivity(e);
            }
        });

        //        Fee Button
        btnFee = (Button) findViewById(R.id.btnFee);

        btnFee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(Dashboard.this,com.example.ats.FeeDetails.class);
                startActivity(f);
            }
        });

        //        Books Button
        btnBooks = (Button) findViewById(R.id.btnBooks);

        btnBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bo = new Intent(Dashboard.this,com.example.ats.Books.class);
                startActivity(bo);
            }
        });

        //   Notes Button
        btnNotes = (Button) findViewById(R.id.btnNotes);

        btnNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(Dashboard.this,com.example.ats.Notes.class);
                startActivity(n);
            }
        });

        //   Assignments Button
        btnAssignments = (Button) findViewById(R.id.btnAssignments);

        btnAssignments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Dashboard.this,com.example.ats.Assignments.class);
                startActivity(a);
            }
        });

    }


}