package com.neumeng.mddemo;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SnackbarActivity extends AppCompatActivity {
    LinearLayout parentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);
        parentView = (LinearLayout) findViewById(R.id.activity_snackbar);
    }

    public void showSanckbarSimple(View v) {
        Snackbar.make(parentView, R.string.snackbar_text, Snackbar.LENGTH_LONG)
                .setAction(R.string.snackbar_action, view -> {
                })
                .show(); // Don’t forget to show!
    }

    public void showSanckbarConfig(View v) {
        Snackbar.make(parentView, R.string.snackbar_text, Snackbar.LENGTH_LONG)
                .setAction(R.string.snackbar_action, view -> {
                })  // action text on the right side
                .setActionTextColor(getResources().getColor(R.color.green))//设置action文本的颜色
                .setDuration(3000)//设置显示时长
                .show();
    }

    public void showSanckbarBackground(View v) {
        Snackbar snackbar = Snackbar.make(parentView, R.string.snackbar_text, Snackbar.LENGTH_LONG)
                .setAction(R.string.snackbar_action, view -> {
                });
        snackbar.getView().setBackgroundColor(getResources().getColor(R.color.green));
        snackbar.show(); // Don’t forget to show!
    }
    public void showInfo(View view) {
        Snackbar snackbar = Snackbar.make(parentView, R.string.snackbar_text, Snackbar.LENGTH_SHORT);
        ColoredSnackbar.info(snackbar).show();
    }

    public void showSanckbarWaring(View view) {
        Snackbar snackbar = Snackbar.make(parentView, R.string.snackbar_text, Snackbar.LENGTH_SHORT);
        ColoredSnackbar.warning(snackbar).show();
    }

    public void showSanckbarAlert(View view) {
        Snackbar snackbar = Snackbar.make(parentView, R.string.snackbar_text, Snackbar.LENGTH_SHORT);
        ColoredSnackbar.alert(snackbar).show();
    }

    public void showSanckbarConfirm(View view) {
        Snackbar snackbar = Snackbar.make(parentView, R.string.snackbar_text, Snackbar.LENGTH_SHORT);
        ColoredSnackbar.confirm(snackbar).show();
    }

}
