package com.outdoor.view;


import android.animation.AnimatorSet.Builder;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.outdoor.R;
public class AboutActivity extends Activity {
	private Button about_reback_btn=null;
	private Button jiancha=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		about_reback_btn=(Button)findViewById(R.id.about_reback_btn);
		about_reback_btn.setOnClickListener(new about_reback_btnListener());
		jiancha=(Button)findViewById(R.id.jiancha);
		jiancha.setOnClickListener(new jianchaListener());
	}
	class about_reback_btnListener implements OnClickListener{
		@Override
		public void onClick(View v){
			finish();
		}
		
			
		}
	class jianchaListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			new AlertDialog.Builder(AboutActivity.this)
		      .setTitle("检查更新") 
			  .setMessage("已是最新版本") 
			  .setPositiveButton("确定", null) 
			  .show();
			
		}
		
		
		}




}
