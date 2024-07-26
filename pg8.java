package com.example.eight;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
EdgeToEdge.enable(this);
setContentView(R.layout.activity_main);
EditText e1 = new EditText(this);
e1.setText("Name: ");
e1.setTextSize(20);
EditText e2 = new EditText(this);
e2.setText("USN: ");
e2.setTextSize(20);
EditText e3 = new EditText(this);
e3.setText("Branch : ");
e3.setTextSize(20);
Button b1 = new Button(this);
b1.setText("Submit");
b1.setTextSize(20);
TextView t1 = new TextView(this);
t1.setText("NAME");
t1.setTextSize(25);
TextView t2 = new TextView(this);
t2.setText("USN");
t2.setTextSize(25);
TextView t3 = new TextView(this);
t3.setText("BRANCH");
t3.setTextSize(25);
LinearLayout linear = new LinearLayout(this);
linear.setOrientation(LinearLayout.VERTICAL);
linear.addView(e1);
linear.addView(e2);
linear.addView(e3);
linear.addView(b1);
linear.addView(t1);
linear.addView(t2);
linear.addView(t3);
LinearLayout.LayoutParams params=new
LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearL
ayout.LayoutParams.WRAP_CONTENT);
this.addContentView(linear,params);
b1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
String str=e1.getText().toString();
t1.setText(str);

String str1=e2.getText().toString();
t2.setText(str1);
String str2=e3.getText().toString();
t3.setText(str2);
}
});}}
