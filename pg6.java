package com.example.sixth;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.w3c.dom.Text;
public class MainActivity extends AppCompatActivity {
CheckBox c1, c2, c3;
Button b1, b2;
TextView tv1;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
EdgeToEdge.enable(this);
setContentView(R.layout.activity_main);
c1 = (CheckBox)findViewById(R.id.cb1);
c2 = (CheckBox)findViewById(R.id.cb2);
c3 = (CheckBox)findViewById(R.id.cb3);
b1 = (Button)findViewById(R.id.bill);
b2 = (Button)findViewById(R.id.pay);
tv1 = (TextView)findViewById(R.id.amount);
b1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
int total =0;
if(c1.isChecked()){
total = total + 30;
}
if(c2.isChecked()){
total = total + 50;
}
if(c3.isChecked()){
total = total + 45;
}
tv1.setText("Total :"+String.valueOf(total));
}
});
b2.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Toast.makeText(MainActivity.this, "Redirecting to Payment",
Toast.LENGTH_SHORT).show();
}
});}}
