package com.scanba.solidusandroid.components;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.scanba.solidusandroid.R;

public class CustomEditText extends LinearLayout {

    private TextView mTextView;
    private EditText mEditText;

    public CustomEditText(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomEditText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        View view = inflate(context, R.layout.custom_edit_text, this);

        mTextView = (TextView) view.findViewById(R.id.label);
        mEditText = (EditText) view.findViewById(R.id.edit_text);

    }

    public void init(String label) {
        mTextView.setText(label);
    }
}