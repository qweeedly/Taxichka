package com.example.taxichka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    final String LOG_TAG = "myLogs";

    Button btnAdd, btnRead, btnClear;
    EditText etFirstStreet, etLastStreet, etNumberCar, etCost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstStreet =    findViewById(R.id.etFirstStreet);
        etLastStreet =   findViewById(R.id.etLastStreet);
        etNumberCar =   findViewById(R.id.etNumberCar);
        etCost =   findViewById(R.id.etCost);

    }


    public void onClick(View view) {
    }
}