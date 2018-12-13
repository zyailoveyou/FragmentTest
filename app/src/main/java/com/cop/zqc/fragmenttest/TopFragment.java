package com.cop.zqc.fragmenttest;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TopFragment extends Fragment implements View.OnClickListener {


    public interface OnTopButtonClickedListener
    {
        public void onClick(String name);
    }


    private OnTopButtonClickedListener listener;


    @Override
    public void onAttach(Context context) {

        if(getActivity() instanceof OnTopButtonClickedListener)
        {
            listener = (OnTopButtonClickedListener)getActivity();
        }

        super.onAttach(context);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.top_fragment, null);
        view.setOnClickListener(this);
        return view;
    }



    @Override
    public void onClick(View v) {

        if(listener != null)
        {
            listener.onClick("Top Fragment Demo");
        }

    }
}
