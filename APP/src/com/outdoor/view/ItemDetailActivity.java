package com.outdoor.view;

import com.outdoor.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * @author Stone
 * @date 2014-3-29
 * @func 活动详细介绍页面  从后台服务器获取到活动的相关信息
 */

public class ItemDetailActivity extends Activity implements OnClickListener{
	
	private final static String TAG = "ItemDetailActivity";

	private Button btnZan = null;
	private Button btnShare = null;
	private Button btnCall = null;
	private Button btnGetRes = null;
	private Button btnJoinUs = null;
	private Button btnFocusOn = null;
	
	/**页面应该获取到的数据
	 * 1. 活动的所有信息
	 * 2. 活动发起人的相关信息
	 * 3. 与活动相关的信心，赞，赞的人数，评论，相关知识库
	 */
    //模拟某一活动点赞的人数
	private int zanUserNum = 10;
	//模拟某一活动发起人电话
	private String phone = "13308647200";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_party_detail);
		Log.i(TAG, "跳转到活动详情页面");

		btnZan = (Button) findViewById(R.id.btn_zan);
		btnShare = (Button) findViewById(R.id.btn_share);
		btnCall = (Button) findViewById(R.id.btn_call);
		btnGetRes = (Button) findViewById(R.id.btn_resource);
		btnJoinUs = (Button) findViewById(R.id.btn_joinUs);
		btnFocusOn = (Button) findViewById(R.id.btn_focusOn);
		
		btnZan.setOnClickListener(this);
		btnShare.setOnClickListener(this);
		btnCall.setOnClickListener(this);
		btnGetRes.setOnClickListener(this);
		btnJoinUs.setOnClickListener(this);
		btnFocusOn.setOnClickListener(this);

	}

	/**
	 * @author Stone
	 * @date 2014-4-3
	 * @func 点击该页面中响应按钮所对应的响应事件
	 */
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		//报名参加某一个活动
		case R.id.btn_joinUs:
			btnJoinUs.setText("已报名");
			btnJoinUs.setBackgroundColor(Color.LTGRAY);
			break;
		//关注某一个活动	
		case R.id.btn_focusOn:
			btnFocusOn.setText("已关注");
			btnFocusOn.setBackgroundColor(Color.LTGRAY);
			break;
		//点赞
		case R.id.btn_zan:
			btnZan.setText(zanUserNum+"人已赞");
			break;
		//分享活动信息
		case R.id.btn_share:
			Intent toShareActivity = new Intent(ItemDetailActivity.this, ShareActivity.class);
			startActivity(toShareActivity);
			break;
		//联系活动发起人
		case R.id.btn_call:
			//拨打电话的功能
			Toast.makeText(this, "正在拨打 13308647200 ...", Toast.LENGTH_LONG).show();
			break;
		//获取活动相关知识
		case R.id.btn_resource:
			Intent toGetRes = new Intent(ItemDetailActivity.this, GetResActivity.class);
			startActivity(toGetRes);
			break;

		default:
			break;
		}
	}

}

