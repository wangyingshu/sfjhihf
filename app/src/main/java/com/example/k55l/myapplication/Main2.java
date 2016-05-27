package com.example.k55l.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by K55L on 2016/5/26.
 */

public class Main2 extends Activity {
    private MainActivity mainActivity = new MainActivity();
    private ArrayList<WysBean>wysBeen = mainActivity.getArrayList();
    private FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.body);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.body_intent_button);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(intosql()) {
                }
                else{
                    Snackbar.make(findViewById(R.id.body_linearLayout),"123",Snackbar.LENGTH_LONG).show();
                }

            }
        });
    }

    private boolean intosql() {
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Main2.this.finish();
    }
}
