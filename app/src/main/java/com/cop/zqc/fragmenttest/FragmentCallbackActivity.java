package com.cop.zqc.fragmenttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentCallbackActivity extends AppCompatActivity implements View.OnClickListener {

    private View mView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.z123123);
        mView = findViewById(R.id.text1);

        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        mView.getLeft();
        mView.getX();
        mView.getY();


    }
}


//    @Override
//    public void onClick(String name)
//    {
//        BottomFragment fragment = (BottomFragment) getFragmentManager().findFragmentByTag("bottom_fragment");
//        fragment.updateText("onClick:" + name);
//
//    }


