package com.lehman.android;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class DetailsActivity extends FragmentActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		RssDetailsFragment fragment = new RssDetailsFragment();
		fragment.setArguments(getIntent().getExtras());
		FragmentTransaction ft = this.get.beginTransaction();
		ft.add(0, fragment, "rss_details");
	}

}
