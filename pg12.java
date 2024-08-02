package com.example.twelth;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
private int ps = 0;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
EdgeToEdge.enable(this);
setContentView(R.layout.activity_main);
Button b1 = (Button)findViewById(R.id.btn);
TextView tv1 = (TextView)findViewById(R.id.tv1);
TextView tv2 = (TextView)findViewById(R.id.tv2);
ProgressBar p1 = (ProgressBar)findViewById(R.id.progressBar2);
Handler handler = new Handler();
b1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
p1.setVisibility(v.VISIBLE);
tv1.setVisibility(v.VISIBLE);
tv2.setVisibility(v.VISIBLE);
new Thread(new Runnable() {
@SuppressLint("SetTextI18n")
@Override
public void run() {
while(ps<100){
ps+=1;
handler.post(new Runnable() {
@Override
public void run() {
}
});
try {
p1.setProgress(ps);
tv1.setText(ps+"/"+p1.getMax());
Thread.sleep(10);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
tv2.setText("File Downloaded");
}
}).start();
}
});
}
}
