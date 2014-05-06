package org.tasafo.mobile.palestrascoletivas;

import android.os.*;
import android.support.v7.app.*;
import android.view.*;

public class FormEventActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form_event);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.form_menu, menu);
		return true;
	}
}
