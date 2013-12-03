package com.hmclaren.mpgcalculator;

import java.text.DecimalFormat;
import android.os.Bundle;
import android.app.*;
import android.view.*;
import android.widget.*;

public class MPGCalculator extends Activity
{
	private double miles_double;
	private double mpg_double;
	private double gasCost_double;
	private double finalCal;
	private double finalGal;
	
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mpg_calculator);
		
		final Button calculateAll = (Button) findViewById(R.id.calcButton);
		final Button resetVals = (Button) findViewById(R.id.resetButton);
		final EditText miles = (EditText) findViewById(R.id.milesEditText);
		final EditText mpg = (EditText) findViewById(R.id.mpgEditText);
		final EditText gasCost = (EditText) findViewById(R.id.gasCostEditText);
		final TextView totalGasCost = (TextView) findViewById(R.id.totalGasEditText);
		final TextView totalGallons = (TextView) findViewById(R.id.totalGalEditText);
	
		calculateAll.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v)
			{
				try
				{
					miles_double = Double.parseDouble(miles.getText().toString());
					mpg_double = Double.parseDouble(mpg.getText().toString());
					gasCost_double = Double.parseDouble(gasCost.getText().toString());
					finalGal = miles_double / mpg_double;
					finalCal = finalGal * gasCost_double;
					DecimalFormat df = new DecimalFormat("#.00");
					totalGasCost.setText(String.valueOf("$" + df.format(finalCal)));
					totalGallons.setText(String.valueOf(df.format(finalGal)));
				}
				catch (Exception E)
				{
					Toast toast = Toast.makeText(MPGCalculator.this, "Invalid Entry. Try Again.", Toast.LENGTH_SHORT);
					toast.setGravity(Gravity.CENTER, 0, 0);
					toast.show();
					totalGasCost.setText(String.valueOf(""));
					totalGallons.setText(String.valueOf(""));
				}
			}
		});
		
		resetVals.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v)
			{
				miles.setText(String.valueOf(""));
				mpg.setText(String.valueOf(""));
				gasCost.setText(String.valueOf(""));
				totalGasCost.setText(String.valueOf(""));
				totalGallons.setText(String.valueOf(""));
				miles.requestFocus();
			}
		});
	}
	
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.mpgcalculator, menu);
		return true;
	}
}
