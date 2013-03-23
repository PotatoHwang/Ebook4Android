package com.ortv.ortvdorisebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.android.bitmapfun.R;
import com.ortv.ortvdorisebook.view.TabBar;

public class Seattle extends Activity implements OnClickListener {

	private Button pdfBtn, videoBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.seattle);
		TabBar tab = new TabBar(this);
		addContentView(tab, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
		videoBtn = (Button) findViewById(R.id.seattle_video_btn);
		pdfBtn = (Button) findViewById(R.id.seattle_pdf_btn);
		videoBtn.setOnClickListener(this);
		pdfBtn.setOnClickListener(this);
	}

	public void onClick(View v) {
		Intent intent = null;
		switch (v.getId()) {
		case R.id.seattle_video_btn:
			break;
		case R.id.seattle_pdf_btn:
			intent = new Intent(this, ViewPagerActivity.class);
			intent.putExtra("PageNo", 31);
			startActivity(intent);
			break;
		}
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			Log.e("Touch", "x=" + event.getX());
			Log.e("Touch", "y" + event.getY());
			getPosition((int) event.getX(), (int) event.getY());
		}
		return super.onTouchEvent(event);
	}

	private void getPosition(int x, int y) {

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.seattle_menu, menu);
		return true;
	}

}