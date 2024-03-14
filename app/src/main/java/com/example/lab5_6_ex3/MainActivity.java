package com.example.lab5_6_ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    int nrMax = 0;
    ListView listView;
    ArrayAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> contacts = new ArrayList<>();
        contacts.add("0722457855");
        contacts.add("0766009943");
        contacts.add("0730497691");
        contacts.add("0733221179");
        contacts.add("0734394842");
        nrMax = 5;

        Map<String, Contact> contacte = new HashMap<String, Contact>();

        contacte.put(contacts.get(0), new Contact("Alina", contacts.get(0), "Nana"));
        contacte.put(contacts.get(1), new Contact("Catalin", contacts.get(1), "BlaBla"));
        contacte.put(contacts.get(2), new Contact("Daria", contacts.get(2), "Lala"));
        contacte.put(contacts.get(3), new Contact("Iustin", contacts.get(3), "none"));
        contacte.put(contacts.get(4), new Contact("Razvan", contacts.get(4), "none"));
        //TODO: add, edit, delete contacts.

        listView = (ListView) findViewById(R.id.listContacts);
        adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, contacts);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(), contacte.get(contactNumbers[(int)id]).toString(), Toast.LENGTH_SHORT).show();

                Intent myIntent = new Intent(MainActivity.this, ContactInfo.class);

                //myIntent.putExtra("contactInfo", contacte.get(contactNumbers[(int)id]).toString()); //Optional parameters

                myIntent.putExtra("number", Objects.requireNonNull(contacte.get(contacts.get((int) id))).number);
                myIntent.putExtra("name", Objects.requireNonNull(contacte.get(contacts.get((int) id))).name);
                myIntent.putExtra("linkedin", Objects.requireNonNull(contacte.get(contacts.get((int) id))).linkedin);

                startActivity(myIntent);
            }
        });
    }


    public void addContact(View view) {

    }

}