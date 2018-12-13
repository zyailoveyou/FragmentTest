package com.cop.zqc.fragmenttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentCallbackActivity extends AppCompatActivity implements TopFragment.OnTopButtonClickedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_callback);
    }

    public void onClick(String name)
    {
        BottomFragment fragment = (BottomFragment) getFragmentManager().findFragmentByTag("bottom_fragment");
        fragment.updateText("onClick:" + name);

    }

}
