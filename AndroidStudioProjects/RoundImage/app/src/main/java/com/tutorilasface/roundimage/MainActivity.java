package com.tutorilasface.roundimage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import com.tutorialsface.roundimage.R;

public class MainActivity extends Activity {

	ImageView imageView1, imageView2;
	RoundImage roundedImage, roundedImage1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imageView1 = (ImageView) findViewById(R.id.imageView1);
		Bitmap bm = BitmapFactory.decodeResource(getResources(),R.drawable.image);
		roundedImage = new RoundImage(bm);
		imageView1.setImageDrawable(roundedImage);
	}
}
