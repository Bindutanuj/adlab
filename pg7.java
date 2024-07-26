package com.example.seven;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
public class MainActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
Toolbar toolbar = findViewById(R.id.toolbar);
setSupportActionBar(toolbar);
}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
MenuInflater inflater = new MenuInflater(this);
inflater.inflate(R.menu.menu, menu);
return true;
}
@Override
public boolean onOptionsItemSelected(@NonNull MenuItem item) {
super.onOptionsItemSelected(item);
switch (item.getItemId())
{
case 0: Toast.makeText(getApplicationContext(),"Opens a New
File",Toast.LENGTH_LONG).show();
return true;
case 1: Toast.makeText(getApplicationContext(),"Opens the existing
file",Toast.LENGTH_LONG).show();
return true;
case 2: Toast.makeText(getApplicationContext(),"saves as a existing
file",Toast.LENGTH_LONG).show();
return true;
case 3: Toast.makeText(getApplicationContext(),"Saves with the
name",Toast.LENGTH_LONG).show();
return true;
case 4: Toast.makeText(getApplicationContext(),"Prints the existing
file",Toast.LENGTH_LONG).show();
return true;
}
return false;
}
}
