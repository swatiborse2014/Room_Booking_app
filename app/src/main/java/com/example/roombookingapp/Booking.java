package com.example.roombookingapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Booking extends AppCompatActivity {
    private Spinner starttime1, endtime1, confoHeading, roomNo;
    private Button listing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        starttime1 = (Spinner) findViewById(R.id.starttime);
        endtime1 = (Spinner) findViewById(R.id.endtime);
        roomNo = (Spinner) findViewById(R.id.roomNo);
        confoHeading = (Spinner) findViewById(R.id.conferenceTitle);
        listing = (Button) findViewById(R.id.listing);

        listing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Booking.this, "Booking done..", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Booking.this, Homepage.class);
                startActivity(intent);
            }
        });

        addConfoTitle();
        addEndTime();
    }

    public void addConfoTitle() {
        List<String> starttime = new ArrayList<String>();
        starttime.add("--Room No.--");
        starttime.add("1");
        starttime.add("2");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, starttime);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        roomNo.setAdapter(dataAdapter1);

        roomNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {
                if (position == 1) {
                    addConfoTitle1();
                    addStartTime();
                } else if (position == 2) {
                    addConfoTitle2();
                    addStartTime();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }

    public void addConfoTitle1() {
        List<String> starttime = new ArrayList<String>();
        starttime.add("--Meeting Agenda--");
        starttime.add("Writing Fast Tests Against Enterprise Rails");
        starttime.add("Overdoing it in Python");
        starttime.add("Lua for the Masses");
        starttime.add("Ruby Errors from Mismatched Gem Versions");
        starttime.add("Lunch");
        starttime.add("Ruby on Rails: Why We Should Move On ");
        starttime.add("Common Ruby Errors ");
        starttime.add("Pair Programming vs Noise ");
        starttime.add("Programming in the Boondocks of Seattle");
        starttime.add("Ruby vs. Clojure for Back-End Development ");
        starttime.add("User Interface CSS in Rails Apps ");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, starttime);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        confoHeading.setAdapter(dataAdapter1);

        confoHeading.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {
                starttime1.setSelection(position);
                endtime1.setSelection(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }

    public void addConfoTitle2() {
        List<String> starttime = new ArrayList<String>();
        starttime.add("--Meeting Agenda--");
        starttime.add("Communicating Over Distance ");
        starttime.add("Rails Magic ");
        starttime.add("Woah ");
        starttime.add("Sit Down and Write ");
        starttime.add("Lunch");
        starttime.add("Accounting-Driven Development ");
        starttime.add("Clojure Ate Scala (on my project) ");
        starttime.add("A World Without HackerNews ");
        starttime.add("Ruby on Rails Legacy App Maintenance ");
        starttime.add("Rails for Python Developers ");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, starttime);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        confoHeading.setAdapter(dataAdapter1);

        confoHeading.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {
                starttime1.setSelection(position);
                endtime1.setSelection(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }

    public void addStartTime() {
        List<String> starttime = new ArrayList<String>();
        starttime.add("--START TIME--");
        starttime.add("9:00AM");
        starttime.add("10:00AM");
        starttime.add("10:45AM");
        starttime.add("11:15AM");
        starttime.add("12:00PM");
        starttime.add("01:00PM");
        starttime.add("02:00PM");
        starttime.add("02.45PM");
        starttime.add("03.30PM");
        starttime.add("04.00PM");
        starttime.add("04.30PM");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, starttime);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        starttime1.setAdapter(dataAdapter1);

        starttime1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {
                confoHeading.setSelection(position);
                endtime1.setSelection(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }

    public void addEndTime() {
        List<String> endtime = new ArrayList<String>();
        endtime.add("--Time--");
        endtime.add("60min");
        endtime.add("45min");
        endtime.add("30min");
        endtime.add("45min");
        endtime.add("60min");
        endtime.add("60min");
        endtime.add("45min");
        endtime.add("45min");
        endtime.add("30min");
        endtime.add("30min");
        endtime.add("30min");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, endtime);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        endtime1.setAdapter(dataAdapter1);

        endtime1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {
                starttime1.setSelection(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
    }
}
