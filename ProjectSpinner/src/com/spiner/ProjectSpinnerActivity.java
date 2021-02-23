package com.spiner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ProjectSpinnerActivity extends Activity {
    /** Called when the activity is first created. */
	Spinner spin_SP;
	TextView tv_Hasil;
	String[] PS = {"Sistem Informasi","Sistem Komputer","Manajemen Informatika","Teknik Komputer"};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        spin_SP = (Spinner)findViewById(R.id.spinPS);
        tv_Hasil = (TextView)findViewById(R.id.tvHasil);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, PS); 
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_SP.setAdapter (adapter);
    }
    public void KlikOK (View v){
    	tv_Hasil.setText ("Program Studi Anda Adalah " + spin_SP.getSelectedItem());
    }
}