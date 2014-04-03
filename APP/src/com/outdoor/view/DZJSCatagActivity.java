package com.outdoor.view;

import java.util.LinkedList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.outdoor.adapter.ActivityViewAdapter;
import com.outdoor.model.ActivityEntity;
import com.outdoor.R;

public class DZJSCatagActivity extends Activity{
	private ListView lvDZJS;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dazhongjianshen_catag);
		lvDZJS = (ListView)findViewById(R.id.lvDazhongjianshen);
		ActivityViewAdapter mAdapter = new ActivityViewAdapter(this, getData());
		lvDZJS.setAdapter(mAdapter);
		}
	public void itemClick(View v) {
		Intent todetailActivity = new Intent(DZJSCatagActivity.this,
				ItemDetailActivity.class);
		startActivity(todetailActivity);
		
	}
	
	private List<ActivityEntity> getData() {
		List<ActivityEntity> mList = new LinkedList<ActivityEntity>();
		mList.add(new ActivityEntity("旅游", "武大看樱花", "武汉大学", "2014-4-2 14:00"));
		mList.add(new ActivityEntity("旅游", "武大看樱花", "武汉大学", "2014-4-2 14:00"));
		mList.add(new ActivityEntity("旅游", "武大看樱花", "武汉大学", "2014-4-2 14:00"));
		mList.add(new ActivityEntity("旅游", "武大看樱花", "武汉大学", "2014-4-2 14:00"));
		mList.add(new ActivityEntity("旅游", "武大看樱花", "武汉大学", "2014-4-2 14:00"));

		return mList;
	}
	
}
