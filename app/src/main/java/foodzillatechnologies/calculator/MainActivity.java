package foodzillatechnologies.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText edt1,edt2;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          button=findViewById(R.id.btn);
         edt1=findViewById(R.id.edt1);
         textView=findViewById(R.id.txt1);
          edt2=findViewById(R.id.edt2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(edt1.getText().toString());
                int num2=Integer.parseInt(edt2.getText().toString());
                int sum=num1+num2;
                textView.setText(String.valueOf(sum));
            }
        });
    }
}
