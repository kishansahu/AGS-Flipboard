package com.adobe.flipboard.fragment;

import com.adobe.flipboard.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DashboardFragment extends Fragment {

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.fragment_dashboard ,container, false);
		// TODO Auto-generated method stub
		//return super.onCreateView(inflater, container, savedInstanceState);
		return view;
	}

	@Override
	public View getView() {
		// TODO Auto-generated method stub
		return super.getView();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

}
