import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
EditText e1,e2,e3,e4,e5,e6,e7,e8;
Button b1;
TextView t1;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
e1=(EditText) findViewById(R.id.ed1);
e2=(EditText) findViewById(R.id.ed2);
e3=(EditText) findViewById(R.id.ed3);
e4=(EditText) findViewById(R.id.ed4);
e5=(EditText) findViewById(R.id.ed5);
e6=(EditText) findViewById(R.id.ed6);
e7=(EditText) findViewById(R.id.ed7);
e8=(EditText) findViewById(R.id.ed7);
b1=(Button) findViewById(R.id.btn);
t1=(TextView) findViewById(R.id.result) ;
b1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
String n1,n2,n3,n4,n5,n6,n7,n8;
n1=e1.getText().toString();
n2=e2.getText().toString();
n3=e3.getText().toString();
n4=e4.getText().toString();
n5=e5.getText().toString();
n6=e6.getText().toString();
n7=e7.getText().toString();
n8=e8.getText().toString();
float cgpa=(Float.parseFloat(n1)+Float.parseFloat(n2)+
Float.parseFloat(n3)+Float.parseFloat(n4)+Float.parseFloat(n5)+Float.parseFloat(n6)+Float.parseFloat(n7)+Float.parseFloat(n8))/8;
t1.setText(String.valueOf(cgpa));
}
});
}
}
