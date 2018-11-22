package com.zxn.shape;

import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.demonstrate.DialogUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zxn on 2018-11-22 15:57:36.
 */
public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    @BindView(R.id.tv_select)
    TextView tvSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_select)
    public void onViewClicked() {
        DialogUtil.showListDialog(this, getString(R.string.text_select_color), new String[]{"颜色一", "颜色二", "颜色三", "颜色4"}, this);
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        GradientDrawable gradientDrawable = (GradientDrawable) tvSelect.getBackground();
        switch (which) {
            case 0:
                gradientDrawable.setColor(getResources().getColor(R.color.colorAccent));
                break;
            case 1:
                gradientDrawable.setColor(getResources().getColor(R.color.c_00c085));
                break;
            case 2:
                gradientDrawable.setColor(getResources().getColor(R.color.c_ef4868));
                break;
            case 3:
                gradientDrawable.setColor(getResources().getColor(R.color.c_ff62b8eb));
                break;
        }
    }
}
