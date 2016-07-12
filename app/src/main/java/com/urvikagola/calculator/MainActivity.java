package com.urvikagola.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
Button b_one=(Button)findViewById(R.id.one);
    Button two=(Button)findViewById(R.id.two);
    Button three=(Button)findViewById(R.id.three);
    Button four=(Button)findViewById(R.id.four);
    Button five=(Button)findViewById(R.id.five);
    Button six=(Button)findViewById(R.id.six);
    Button seven=(Button)findViewById(R.id.seven);
    Button eight=(Button)findViewById(R.id.eight);
    Button nine=(Button)findViewById(R.id.nine);
    Button zero=(Button)findViewById(R.id.zero);

    TextView t1=(TextView)findViewById(R.id.t1);
    TextView op=(TextView)findViewById(R.id.op);
    TextView t2=(TextView)findViewById(R.id.t2);
    TextView ans=(TextView)findViewById(R.id.ans);
  b_one.setOnClickListener(new View.OnClickListener()
    {
        public void onClick(View v)
        {
        t1.setText(""+1);
        }
    });
    two.setOnClickListener(new View.onClickListener()
    {
        public void onClick(View v)
        {
            t1.
        }
    })


}
