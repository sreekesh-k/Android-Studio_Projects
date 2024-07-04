package com.example.contactslist;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] contacts = new String[26];
        char alf = 'a';
        for(int i = 0; i < contacts.length; i++){
            contacts[i] =  (i+1) + "." + alf;
            alf++;
        }

        ListView contactListView = findViewById(R.id.contactListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, contacts);
        contactListView.setAdapter(adapter);
    }
}
