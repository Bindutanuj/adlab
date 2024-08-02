package com.example.adlab7;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("File");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, "New");
        menu.add(0, 1, 1, "Open");
        menu.add(0, 2, 2, "Save");
        menu.add(0, 3, 3, "Save As");
        menu.add(0, 4, 4, "Print");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case 0:
                Toast.makeText(getApplicationContext(), "Open new file", Toast.LENGTH_LONG).show();
                return true;
            case 1:
                Toast.makeText(getApplicationContext(), "Open the existing file", Toast.LENGTH_LONG).show();
                return true;
            case 2:
                Toast.makeText(getApplicationContext(), "Saves the file", Toast.LENGTH_LONG).show();
                return true;
            case 3:
                Toast.makeText(getApplicationContext(), "Saves with new name", Toast.LENGTH_LONG).show();
                return true;
            case 4:
                Toast.makeText(getApplicationContext(), "Prints the file", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

app:popupTheme="@style/ThemeOverlay.AppCompat.Light"
