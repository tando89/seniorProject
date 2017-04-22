package com.tando.mba01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class VirtualPassport extends AppCompatActivity implements AdapterView.OnItemClickListener{
    //Declare ListView
    ListView lstView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtual_passport);

        lstView = (ListView) findViewById(R.id.lstView);

        CustomizedListView adapter = new CustomizedListView(VirtualPassport.this);

        lstView.setAdapter(adapter);

        lstView.setOnItemClickListener(VirtualPassport.this);
    }
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(new Intent(this, PassportValidation.class));
    }
}
