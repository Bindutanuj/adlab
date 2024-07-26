package com.example.nine;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
public class MainActivity extends AppCompatActivity {
String[] str={"Select Branch","CSE","ME"};
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
Spinner sp=(Spinner) findViewById(R.id.spinner);
ArrayAdapter<String> adp=new ArrayAdapter<>(getApplicationContext(),
android.R.layout.simple_dropdown_item_1line,str);
sp.setAdapter(adp);
sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
{
@Override
public void onItemSelected(AdapterView<?> adapterView, View v, int i,
long l) {
int index = adapterView.getSelectedItemPosition();
if(index==1) {
Intent in1=new
Intent(getApplicationContext(),MainActivity2.class);
startActivity(in1);
}
if (index==2) {
Intent ME=new
Intent(getApplicationContext(),MainActivity3.class);
startActivity(ME);
}
}
@Override
public void onNothingSelected(AdapterView<?> adapterView) {
}
});
}
}
MainActivity2:
package com.example.nine;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {
Button b1;
TextView t1;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main2);
Button b1=(Button) findViewById(R.id.back);
TextView t1=(TextView) findViewById(R.id.tview);
t1.setText("The department of Computer Science and Engineering was
established in the year 1983. It offers the 4 years (8 Semesters) B.E. course with
an intake of 180 students.");
b1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
finish();
}
});
}
}
MainActivity3
package com.example.nine;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity3 extends AppCompatActivity {
Button b1;
TextView t1;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main3);
Button b1=(Button) findViewById(R.id.back3);
TextView t1=(TextView) findViewById(R.id.tview3);
t1.setText("The department of Mechanical Engineering (NBA Accredited)
made its beginning with the establishment of the college in 1960. It offers a 4
years (8 semesters) B.E. course in Mechanical Engineering (Autonomous) with
an intake of 120 students.");
b1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
finish();
}
});
}}
