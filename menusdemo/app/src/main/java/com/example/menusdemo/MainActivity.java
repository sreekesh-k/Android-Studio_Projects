package com.example.menusdemo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected (MenuItem item) {
        if(item.getItemId() == R.id.item1)
            Toast.makeText(MainActivity.this,"Create a New Project", Toast.LENGTH_SHORT).show();
        if(item.getItemId() == R.id.item2)
            Toast.makeText(MainActivity.this,"Open a Project", Toast.LENGTH_SHORT).show();
        if(item.getItemId() == R.id.item3)
            Toast.makeText(MainActivity.this,"Help", Toast.LENGTH_SHORT).show();
        if(item.getItemId() == R.id.gi1)
            Toast.makeText(MainActivity.this,"Group item 1", Toast.LENGTH_SHORT).show();
        if(item.getItemId() == R.id.gi2)
            Toast.makeText(MainActivity.this,"Group Item 2", Toast.LENGTH_SHORT).show();
        if(item.getItemId() == R.id.s1)
            Toast.makeText(MainActivity.this,"Sub Item 1", Toast.LENGTH_SHORT).show();
        if(item.getItemId() == R.id.s2)
            Toast.makeText(MainActivity.this,"Sub Item 2", Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }


}