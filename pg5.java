package com.example.fifth;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
RadioButton rb1,rb2,rb3,rb4,rb21, rb22, rb23;
ImageView img,img1;
Button b1;
@Override
protected void onCreate(Bundle
savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
rb1=(RadioButton) findViewById(R.id.opt1);
rb2=(RadioButton) findViewById(R.id.opt2);
rb3=(RadioButton) findViewById(R.id.opt3);
rb4=(RadioButton) findViewById(R.id.opt4);
rb21=(RadioButton) findViewById(R.id.opt21);
rb22=(RadioButton) findViewById(R.id.opt22);
rb23=(RadioButton) findViewById(R.id.opt23);
img=(ImageView)findViewById(R.id.wrong);
img1=(ImageView)findViewById(R.id.right);
b1 = (Button) findViewById(R.id.button);
b1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
int cnt = 0;
if(rb1.isChecked()){
img.setVisibility(View.VISIBLE);
img1.setVisibility(View.INVISIBLE);
}
if(rb2.isChecked()){
img.setVisibility(View.VISIBLE);
img1.setVisibility(View.INVISIBLE);
}
rb4.isChecked()){
img.setVisibility(View.VISIBLE);
img1.setVisibility(View.INVISIBLE);
}
if(rb21.isChecked()){
img.setVisibility(View.INVISIBLE);
img1.setVisibility(View.VISIBLE);
cnt = cnt + 1;
}
if(rb22.isChecked()){
img.setVisibility(View.VISIBLE);
img1.setVisibility(View.INVISIBLE);
}
if(rb23.isChecked()){
img.setVisibility(View.VISIBLE);
img1.setVisibility(View.INVISIBLE);
}
Toast.makeText(MainActivity.this, "Total"+ String.valueOf(cnt),
Toast.LENGTH_SHORT).show();
}
});}}
