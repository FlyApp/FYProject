package com.outdoor.view;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.outdoor.R;

public class info_setting extends Activity {
	private Button info_btn_back=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info_setting);
		info_btn_back=(Button)findViewById(R.id.info_btn_back);
		info_btn_back.setOnClickListener(new info_btn_backListener());
	}
	class info_btn_backListener implements OnClickListener{
		@Override
		public void onClick(View v){
			finish();
		}
		
			
		}
}
