package com.example.tenth;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
EditText eToText;
EditText eSubText;
EditText eMsgText;
Button btn;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
EdgeToEdge.enable(this);
setContentView(R.layout.activity_main);
eToText=findViewById(R.id.email);
eSubText=findViewById(R.id.eSubject);
eMsgText = findViewById(R.id.eMsg);
btn = findViewById(R.id.btnMsg);
btn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
String list = eToText.getText().toString();
String[] rec=list.split(",");
String Sub = eSubText.getText().toString();
String msg = eMsgText.getText().toString();
Intent it = new Intent(Intent.ACTION_SEND);
it.putExtra(Intent.EXTRA_EMAIL,rec);
it.putExtra(Intent.EXTRA_SUBJECT,Sub);
it.putExtra(Intent.EXTRA_TEXT,msg);
it.setType("message/rtc822");
startActivity(Intent.createChooser(it,"Choose Mail App"));
}
});
}
}
