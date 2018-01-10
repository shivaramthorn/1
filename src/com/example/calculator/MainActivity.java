package com.example.calculator;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bdiv,bmul,badd,bsub,beq,bdel;
TextView View1,View2;
String add,sub,div,mul;
Float f1,F1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        b0 = (Button)findViewById(R.id.button11);
        bdot = (Button)findViewById(R.id.button10);
        bdiv = (Button)findViewById(R.id.button13);
        bmul = (Button)findViewById(R.id.button14);
        badd = (Button)findViewById(R.id.button15);
        bsub = (Button)findViewById(R.id.button16);
        beq = (Button)findViewById(R.id.button12);
        bdel = (Button)findViewById(R.id.button17);
        View1=(TextView)findViewById(R.id.textView1);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        bdot.setOnClickListener(this);
        badd.setOnClickListener(this);
        bsub.setOnClickListener(this);
        bmul.setOnClickListener(this);
        bdiv.setOnClickListener(this);
        beq.setOnClickListener(this);
        bdel.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
    		switch (v.getId()) {
    	    case R.id.button1:
    	    	View1.setText(View1.getText()+"1");
    	      break;
    	    case R.id.button2:
    	    	View1.setText(View1.getText()+"2");
    	      break;
    	    case R.id.button3:
    	    	View1.setText(View1.getText()+"3");
    	      break;
    	    case R.id.button4:
    	    	View1.setText(View1.getText()+"4");
    	      break;
    	    case R.id.button5:
    	    	View1.setText(View1.getText()+"5");
      	      break;
    	    case R.id.button6:
    	    	View1.setText(View1.getText()+"6");
      	      break;
    	    case R.id.button7:
    	    	View1.setText(View1.getText()+"7");
      	      break;
    	    case R.id.button8:
    	    	View1.setText(View1.getText()+"8");
      	      break;
    	    case R.id.button9:
    	    	View1.setText(View1.getText()+"9");
      	      break;
    	    case R.id.button10:
    	    	View1.setText(View1.getText()+".");
      	      break;
    	    case R.id.button11:
    	    	View1.setText(View1.getText()+"0");
      	      break;
    	    case R.id.button12:
    	    	f1=Float.parseFloat(View1.getText()+"");
				//f1=View1.getText().toString();
				if(add=="+"){
					View1.setText(F1+f1+"");
					add="";
				}
				if(sub=="-"){
					View1.setText(F1-f1+"");
					sub="";
				}
				if(mul=="*"){
					View1.setText(F1*f1+"");
					mul="";
				}
				if(div=="/"){
					View1.setText(F1/f1+"");
					div="";
				}
      	      break;
    	    case R.id.button13:
    	    	F1=Float.parseFloat(View1.getText()+"");
				div="/";
				View1.setText(null);
      	      break;
    	    case R.id.button14:
    	    	F1=Float.parseFloat(View1.getText()+"");
				mul="*";
				View1.setText(null);
      	      break;
    	    case R.id.button15:
    	    	F1=Float.parseFloat(View1.getText()+"");
				add="+";
				View1.setText(null);
      	      break;
    	    case R.id.button16:
    	    	F1=Float.parseFloat(View1.getText()+"");
				sub="-";
				View1.setText(null);
      	      break;
    	    case R.id.button17:
    	    	View1.setText(null);
      	      break;
    	    default:
    	      break;
    	    }
    	}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
