package com.urvikagola.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean a,s,m,d;
     int[] stack=new int[10];
     int count=0;
    int x;
    int answer;
    TextView display;

    public void compute()
    {
        if(a)
        {   answer=0;
            for(x=0;x<count;x++)
        {
            answer+=stack[x];
        }

        }
        else
        if(s)
        {
            for(x=0;x<count;x++)
            {
                answer=stack[x]-stack[x+1];
            }

        }
        else
        if(m)
        {
            answer=1;
            for(x=0;x<count;x++)
            {
                answer*=stack[x];
            }
        }
        else
        if(d)
        {x=0;
                answer=stack[x]/stack[x+1];

        }
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button three = (Button) findViewById(R.id.three);
        Button four = (Button) findViewById(R.id.four);
        Button five = (Button) findViewById(R.id.five);
        Button six = (Button) findViewById(R.id.six);
        Button seven = (Button) findViewById(R.id.seven);
        Button eight = (Button) findViewById(R.id.eight);
        Button nine = (Button) findViewById(R.id.nine);
        Button zero = (Button) findViewById(R.id.zero);
        Button clr = (Button) findViewById(R.id.clr);
        Button del = (Button) findViewById(R.id.del);
        Button add = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);
        Button mul = (Button) findViewById(R.id.mul);
        Button div = (Button) findViewById(R.id.div);
        Button equal=(Button)findViewById(R.id.equal);

   final TextView display = (TextView) findViewById(R.id.display);
        TextView eq = (TextView) findViewById(R.id.eq);
        final TextView ans = (TextView) findViewById(R.id.ans);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(""+"1");
                    stack[count]=1;
                ++count;

        }});
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(""+"2");
                stack[count]=2;
                ++count;
            }
            });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(""+"3");
                stack[count]=3;
                ++count;
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(""+"4");
                stack[count]=4;
                ++count;
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(""+"5");
                stack[count]=5;
                ++count;
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(""+"6");
                stack[count]=6;
                ++count;
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(""+"7");
                stack[count]=7;
                ++count;
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(""+"8");
                stack[count]=8;
                ++count;
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(""+"9");
                stack[count]=9;
                ++count;
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(""+"0");
                stack[count]=0;
                ++count;
            }
        });

            add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(""+"+");
                a=true;
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(""+"-");
                s=true;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(""+"*");
                m=true;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(""+"/");
                d=true;
            }
        });
        equal.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View view)
            {
                display.append(""+"=");
                compute();
            ans.setText(""+answer);
            }
        });
        clr.setOnClickListener(new View.OnClickListener()
        {
            public void onClick( View view)
            {
                display.setText(""+"");
            }
        });
    }
}