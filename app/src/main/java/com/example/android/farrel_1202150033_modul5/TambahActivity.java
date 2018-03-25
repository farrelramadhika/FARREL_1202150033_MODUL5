package com.example.android.farrel_1202150033_modul5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TambahActivity extends AppCompatActivity {

    private EditText ToDo, Description, Priority;
    private Database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);

        setTitle("Add ToDo");

        ToDo = (EditText) findViewById(R.id.nameTodo);
        Description = (EditText) findViewById(R.id.etDeskripsi);
        Priority = (EditText) findViewById(R.id.etPrioritas);
        db = new Database(this);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(TambahActivity.this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }

    public void tambah(View view) {
        if (db.inputdata(new AddData(ToDo.getText().toString(), Description.getText().toString(), Priority.getText().toString()))){
            Toast.makeText(this, "To Do List Ditambahkan !", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(TambahActivity.this, MainActivity.class));
            this.finish();
        }else {
            Toast.makeText(this, "List tidak boleh kosong", Toast.LENGTH_SHORT).show();
            ToDo.setText(null);
            Description.setText(null);
            Priority.setText(null);
        }
    }

}

