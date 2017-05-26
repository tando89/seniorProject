package com.tando.mba01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Settings extends AppCompatActivity {
    ListView iconLv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        iconLv = (ListView) findViewById(R.id.iconListView);

        customizedSettings adapter = new customizedSettings(Settings.this);

        iconLv.setAdapter(adapter);
    }
}
