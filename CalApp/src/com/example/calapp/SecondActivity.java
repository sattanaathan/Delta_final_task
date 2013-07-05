package com.example.calapp;



import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity implements OnClickListener {
	TextView tv,tv1,tv2,tv3,tv4,tv5;
	CheckBox ch1,ch2,ch3,ch4,ch5;
	EditText edt;
	Button btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		Bundle bundle=getIntent().getExtras();
		String str=bundle.getString("key");
		
		tv=(TextView)findViewById(R.id.textView1);
		tv.setText(str + "\tClick on crosed event to remove");
		tv1=(TextView)findViewById(R.id.textView2);
		tv1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(ch1.isChecked())
				{
					tv1.setText("");
				}
			}
		});
		tv2=(TextView)findViewById(R.id.textView3);
		tv2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(ch2.isChecked())
				{
					tv2.setText("");
				}
				
			}
		});
		tv3=(TextView)findViewById(R.id.textView4);
		tv3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(ch3.isChecked())
				{
					tv3.setText("");
				}
			}
		});
		tv4=(TextView)findViewById(R.id.textView5);
		tv4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(ch4.isChecked())
				{
					tv4.setText("");
				}
			}
		});
		tv5=(TextView)findViewById(R.id.textView6);
		tv5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(ch5.isChecked())
				{
					tv5.setText("");
				}
			}
		});
		ch1=(CheckBox)findViewById(R.id.checkBox1);
		ch1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				// TODO Auto-generated method stub
				if(ch1.isChecked())
				{
				tv1.setPaintFlags(tv1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
				}
				else
				{
				tv1.setPaintFlags( tv1.getPaintFlags() & (~ Paint.STRIKE_THRU_TEXT_FLAG));
				}
			}
		});
		ch2=(CheckBox)findViewById(R.id.checkBox2);
		ch2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				// TODO Auto-generated method stub
				if(ch2.isChecked())
				{
				tv2.setPaintFlags(tv2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
				}
				else
				{
					tv2.setPaintFlags( tv2.getPaintFlags() & (~ Paint.STRIKE_THRU_TEXT_FLAG));
				}
			}
		});
		ch3=(CheckBox)findViewById(R.id.checkBox3);
		ch3.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				// TODO Auto-generated method stub
				if(ch3.isChecked())
				{
				tv3.setPaintFlags(tv3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
				}
				else
				{
					tv3.setPaintFlags( tv3.getPaintFlags() & (~ Paint.STRIKE_THRU_TEXT_FLAG));
				}
			}
		});
		ch4=(CheckBox)findViewById(R.id.checkBox4);
		ch4.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				// TODO Auto-generated method stub
				if(ch4.isChecked())
				{
				tv4.setPaintFlags(tv4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
				}
				else
				{
					tv4.setPaintFlags( tv4.getPaintFlags() & (~ Paint.STRIKE_THRU_TEXT_FLAG));
				}
			}
		});
		ch5=(CheckBox)findViewById(R.id.checkBox5);
		ch5.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				// TODO Auto-generated method stub
				if(ch5.isChecked())
				{
				tv5.setPaintFlags(tv5.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
				}
				else
				{
					tv5.setPaintFlags( tv5.getPaintFlags() & (~ Paint.STRIKE_THRU_TEXT_FLAG));
				}
			}
		});
		edt=(EditText)findViewById(R.id.editText1);
		btn=(Button)findViewById(R.id.button1);
		btn.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(tv1.getText().equals(""))
		{
			tv1.setText(edt.getText().toString());
		}
		else if(tv2.getText().equals(""))
		{
			tv2.setText(edt.getText().toString());
		}
		else if(tv3.getText().equals(""))
		{
			tv3.setText(edt.getText().toString());
		}
		else if(tv4.getText().equals(""))
		{
			tv4.setText(edt.getText().toString());
		}
		else if(tv5.getText().equals(""))
		{
			tv5.setText(edt.getText().toString());
		}
		else
		{
			new AlertDialog.Builder(this)
		     .setIcon(R.drawable.ic_launcher)
		     .setTitle("Event is full please delete some and try again")
		     .setPositiveButton("OK", null).show();
		}
	}

}
