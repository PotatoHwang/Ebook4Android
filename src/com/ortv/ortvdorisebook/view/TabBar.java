package com.ortv.ortvdorisebook.view;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.android.bitmapfun.R;
import com.example.android.bitmapfun.ui.ImageGridActivity;
import com.ortv.ortvdorisebook.China;
import com.ortv.ortvdorisebook.Home;
import com.ortv.ortvdorisebook.Hualien;
import com.ortv.ortvdorisebook.Seattle;
import com.ortv.ortvdorisebook.Taipei;
import com.ortv.ortvdorisebook.TimeLine;

public class TabBar extends LinearLayout {

	private Context context;
	private Button home, seattle, china, hualien, taipei, timeline, photos;
	private OnClickListener listener;

	public TabBar(Context context) {
		super(context);
		init(context);
	}

	private void init(Context context) {
		this.context = context;
		LinearLayout view = (LinearLayout) View.inflate(context, R.layout.tab_bar, null);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 65);
		addView(view, params);
		home = (Button) view.findViewById(R.id.home);
		seattle = (Button) view.findViewById(R.id.seattle);
		china = (Button) view.findViewById(R.id.china);
		hualien = (Button) view.findViewById(R.id.hualien);
		taipei = (Button) view.findViewById(R.id.taipei);
		timeline = (Button) view.findViewById(R.id.timeline);
		photos = (Button) view.findViewById(R.id.photos);
		
		listener = new ButtonClick();
		
		home.setOnClickListener(listener);
		seattle.setOnClickListener(listener);
		china.setOnClickListener(listener);
		hualien.setOnClickListener(listener);
		taipei.setOnClickListener(listener);
		timeline.setOnClickListener(listener);
		photos.setOnClickListener(listener);
	}

	private class ButtonClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			Intent i = null;
			switch (v.getId()){
			case R.id.home:
				i = new Intent(context, Home.class);
				break;
			case R.id.seattle:
				i = new Intent(context, Seattle.class);
				break;
			case R.id.china:
				i = new Intent(context, China.class);
				break;
			case R.id.hualien:
				i = new Intent(context, Hualien.class);
				break;
			case R.id.taipei:
				i = new Intent(context, Taipei.class);
				break;
			case R.id.timeline:
				i = new Intent(context, TimeLine.class);
				break;
			case R.id.photos:
				i = new Intent(context, ImageGridActivity.class);
				break;
			}
			context.startActivity(i);
		}
		
	}

}