package com.hmclaren.percentbasedtipcalc;

import java.text.DecimalFormat;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.*;
import android.view.inputmethod.*;
import android.widget.*;

public class MainActivity extends Activity
{
	
	private double bill_double;
	private double totalTipCal;
	private double totalBillCal;
	private double tip_double = 20;
	
	public void onRadioButtonClicked(View view) 
	{
		final TextView tip = (TextView) findViewById(R.id.tipEditText);
		final TextView totalTip = (TextView) findViewById(R.id.totalTipEditText);
		final TextView totalBill = (TextView) findViewById(R.id.totalBillPostTipEditText);
	    boolean checked = ((RadioButton) view).isChecked();
	    
	    switch(view.getId()) 
	    {
	        case R.id.fiveRadioButton:
	            if (checked)
	            	tip_double = 5;
	            	tip.setText(String.valueOf(5 + "%"));
					totalTip.setText(String.valueOf(""));
					totalBill.setText(String.valueOf(""));
	        break;
	        case R.id.tenRadioButton:
	            if (checked)
	            	tip_double = 10;
	            	tip.setText(String.valueOf(10 + "%"));
					totalTip.setText(String.valueOf(""));
					totalBill.setText(String.valueOf(""));
	        break;
	        case R.id.fifteenRadioButton:
	            if (checked)
	            	tip_double = 15;
	            	tip.setText(String.valueOf(15 + "%"));
					totalTip.setText(String.valueOf(""));
					totalBill.setText(String.valueOf(""));
	        break;
	        case R.id.twentyRadioButton:
	            if (checked)
	            	tip_double = 20;
	            	tip.setText(String.valueOf(20 + "%"));
					totalTip.setText(String.valueOf(""));
					totalBill.setText(String.valueOf(""));
	        break;
	    }
	}
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button calculateAll = (Button) findViewById(R.id.calcButton);
		final Button resetVals = (Button) findViewById(R.id.resetButton);
		final EditText bill = (EditText) findViewById(R.id.totalBillEditText);
		final TextView tip = (TextView) findViewById(R.id.tipEditText);
		final TextView totalTip = (TextView) findViewById(R.id.totalTipEditText);
		final TextView totalBill = (TextView) findViewById(R.id.totalBillPostTipEditText);
		final RadioButton twentyPer = (RadioButton) findViewById(R.id.twentyRadioButton);
		
		tip.setText(String.valueOf(20 + "%"));
		calculateAll.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v)
			{
				try
				{
					bill_double = Double.parseDouble(bill.getText().toString());
					totalTipCal = bill_double * (tip_double * .01);
					totalBillCal = bill_double + totalTipCal;
					
					if (tip_double == 5)
					{
						tip.setText(String.valueOf(5 + "%"));
					}
					else if (tip_double == 10)
					{
						tip.setText(String.valueOf(10 + "%"));
					}
					else if (tip_double == 15)
					{
						tip.setText(String.valueOf(15 + "%"));
					}
					else if (tip_double == 20)
					{
						tip.setText(String.valueOf(20 + "%"));
					}
					
					InputMethodManager inputManager = (InputMethodManager)
                            getSystemService(Context.INPUT_METHOD_SERVICE); 

					inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                               InputMethodManager.HIDE_NOT_ALWAYS);
					
					DecimalFormat df = new DecimalFormat("#.00");
					totalTip.setText(String.valueOf("$" + df.format(totalTipCal)));
					totalBill.setText(String.valueOf("$" + df.format(totalBillCal)));
				}
				catch (Exception E)
				{
					Toast toast = Toast.makeText(MainActivity.this, "Invalid Entry. Try Again.", Toast.LENGTH_SHORT);
					toast.setGravity(Gravity.CENTER, 0, 0);
					toast.show();
					tip.setText(String.valueOf(20 + "%"));
					tip_double = 20;
					twentyPer.setChecked(true);
					totalBill.setText(String.valueOf(""));
				}
			}
		});
		
		resetVals.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v)
			{
				bill.setText(String.valueOf(""));
				tip.setText(String.valueOf(20 + "%"));
				tip_double = 20;
				twentyPer.setChecked(true);
				totalTip.setText(String.valueOf(""));
				totalBill.setText(String.valueOf(""));
				bill.requestFocus();
			}
		});
		
	}
	
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
