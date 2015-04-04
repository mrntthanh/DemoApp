package com.example.linhdao.demoapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import java.security.PublicKey;

/**
 * Created by Tung.Pham on 2/9/15.
 */
public class DemoHeader extends LinearLayout {

    LayoutInflater mInFlater;

    public DemoHeader(Context context){
        super(context);

        mInFlater = LayoutInflater.from(context);
        init();
    }

    public DemoHeader(Context context, AttributeSet attrs){
        super(context, attrs);
        mInFlater = LayoutInflater.from(context);
        init();
    }

    public DemoHeader(Context context, AttributeSet attrs, int defStyle){
        super (context, attrs, defStyle);
        mInFlater = LayoutInflater.from(context);
        init();
    }

    public void init(){
        mInFlater.inflate(R.layout.demoheader, this, true);
    }

}
