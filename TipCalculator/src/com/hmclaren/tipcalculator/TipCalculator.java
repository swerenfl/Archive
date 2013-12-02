package com.hmclaren.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class TipCalculator extends Activity
{
	
	private static final String TOTAL_BILL = "TOTAL_BILL";
	private static final String CURRENT_TIP = "CURRENT_TIP";
	private static final String BILL_WITHOUT_TIP = "BILL_WITHOUT_TIP";
	
	private double billBeforeTip;
	private double tipAmount;
	private double finalBill;
	private SeekBar tipSeekBar;
	
	EditText billBeforeTipET;
	EditText tipAmountET;
	EditText finalBillET;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
		
		if(savedInstanceState == null)
		{
			billBeforeTip = 0.0;
			tipAmount = .15;
			finalBill = 0.0;
		}
		else
		{
			billBeforeTip = savedInstanceState.getDouble(BILL_WITHOUT_TIP);
			tipAmount = savedInstanceState.getDouble(CURRENT_TIP);
			finalBill = savedInstanceState.getDouble(TOTAL_BILL);
		}
		
		billBeforeTipET = (EditText) findViewById(R.id.billEditText);
		tipAmountET = (EditText) findViewById(R.id.tipEditText);
		finalBillET = (EditText) findViewById(R.id.finalBillEditText);
		
		tipSeekBar = (SeekBar) findViewById(R.id.changeTipSeekBar);
		
		tipSeekBar.setOnSeekBarChangeListener(tipSeekBarListener);
		
		billBeforeTipET.addTextChangedListener(billBeforeTipListener);
	}
	
	private TextWatcher billBeforeTipListener = new TextWatcher()
	{

		@Override
		public void afterTextChanged(Editable arg0)
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
				int arg3)
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTextChanged(CharSequence arg0, int arg1, int arg2,
				int arg3)
		{
			try
			{
				billBeforeTip = Double.parseDouble(arg0.toString());
			}
			catch (NumberFormatException e)
			{
				billBeforeTip = 0.0;
			}
			
			updateTipAndFinalBill();
			
		}
		
	};
	
	private void updateTipAndFinalBill()
	{
		double tipAmount = Double.parseDouble(tipAmountET.getText().toString());
		double finalBill = billBeforeTip + (billBeforeTip * tipAmount);
		finalBillET.setText(String.format("%.02f", finalBill));
	}
	
	protected void onSaveInstanceState(Bundle outState)
	{
		super.onSaveInstanceState(outState);
		outState.putDouble(TOTAL_BILL, finalBill);
		outState.putDouble(CURRENT_TIP, tipAmount);
		outState.putDouble(BILL_WITHOUT_TIP, billBeforeTip);
	}
	
	private OnSeekBarChangeListener tipSeekBarListener = new OnSeekBarChangeListener()
	{

		@Override
		public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2)
		{
			tipAmount = (tipSeekBar.getProgress()) * .01;
			
			tipAmountET.setText(String.format("%.02f", tipAmount));
			
			updateTipAndFinalBill();
			
		}

		@Override
		public void onStartTrackingTouch(SeekBar arg0)
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStopTrackingTouch(SeekBar arg0)
		{
			// TODO Auto-generated method stub
			
		}
		
	};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tip_calculator, menu);
		return true;
	}
}
