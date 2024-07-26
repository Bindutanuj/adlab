MainActiviy1:
package com.example.second;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
Button b1;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
b1=(Button) findViewById(R.id.solar_page);
b1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
Intent conn = new
Intent(getApplicationContext(),MainActivity2.class);
startActivity(conn);
startActivityForResult(conn,1);
}});
}
@Override
protected void onActivityResult(int requestCode, int resultCode, @Nullable
Intent data) {
super.onActivityResult(requestCode, resultCode, data);
TextView t1=(TextView)findViewById(R.id.textDisplay);
if (requestCode==1)
if (resultCode==RESULT_OK){
String res = data.getStringExtra("Planets");
t1.setText(String.valueOf(res)); }}}
MainActivity2:
package com.example.second;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity2 extends AppCompatActivity {
Button b2;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main2);
java.lang.String total="8";
b2=(Button) findViewById(R.id.back);
b2.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
Intent in=getIntent();
in.putExtra("Planets",total);
setResult(RESULT_OK,in);
finish();}
});}}
