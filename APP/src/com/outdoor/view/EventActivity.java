package com.outdoor.view;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.outdoor.R;
public class EventActivity extends ListActivity {
    /** Called when the activity is first created. */
	private Button event_reback_btn=null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event);
        event_reback_btn=(Button)findViewById(R.id.event_reback_btn);
		event_reback_btn.setOnClickListener(new event_reback_btnListener());
       
        setListAdapter(new TextImageAdapter(this));
    
    }
	class event_reback_btnListener implements OnClickListener{
		@Override
		public void onClick(View v){
			finish();
			
		}
		
			
		}
	//----------------------------跳转群聊界面---------------------------------
	public void startchat(View v) { // 小黑 对话界面
		Intent intent = new Intent(EventActivity.this, ChatActivity.class);
		startActivity(intent);
		// Toast.makeText(getApplicationContext(), "登录成功",
		// Toast.LENGTH_LONG).show();
	}
	public void toDetailActivity(View v){
		Intent toDetailActivity = new Intent(EventActivity.this, ItemDetailActivity.class);
		startActivity(toDetailActivity);
	}

    @Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
	}

    private class TextImageAdapter extends BaseAdapter{
        private Context mContext;
    	public TextImageAdapter(Context context) {
			this.mContext=context;
		}
  
		public int getCount() {
			return texts.length;
		}

		public Object getItem(int position) {
			return null;
		}

		public long getItemId(int position) {
			return 0;
		}
		
		public View getView(int position, View convertView, ViewGroup parent) {
		
			if(convertView==null){
				convertView=LayoutInflater.from(mContext).inflate(R.layout.event_item, null);
				ItemViewCache viewCache=new ItemViewCache();
				viewCache.mTextView=(TextView)convertView.findViewById(R.id.activityname);
				viewCache.mImageView=(ImageView)convertView.findViewById(R.id.leftimage);
				viewCache.mTextView1=(TextView)convertView.findViewById(R.id.activitytime);
				viewCache.mTextView2=(TextView)convertView.findViewById(R.id.activityaddress);
				convertView.setTag(viewCache);
			}
			ItemViewCache cache=(ItemViewCache)convertView.getTag();
	
			cache.mTextView.setText(texts[position]);
			cache.mTextView1.setText(texts1[position]);
			cache.mTextView2.setText(texts2[position]);
			cache.mImageView.setImageResource(images[position]);
			return convertView;
		}
    }
  
    private static class ItemViewCache{
		public TextView mTextView;
		public ImageView mImageView;
		public TextView mTextView1;
		public TextView mTextView2;
	}

    private  String[] texts=new String[]{"登珞珈山","环东湖骑行"};

    private int[] images=new int[]{R.drawable.img1,R.drawable.img2};
  
    private  String[] texts1=new String[]{"2014-04-10","2014-04-11"};
  
    private  String[] texts2=new String[]{"爬山看美女","东湖骑行"};
    
    
}
