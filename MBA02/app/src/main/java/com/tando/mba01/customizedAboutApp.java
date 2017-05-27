package com.tando.mba01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by tando on 5/25/17.
 */

public class customizedAboutApp extends BaseAdapter {
    Context settingLst;

    LayoutInflater layoutSettings;

    String[] header = {"About"};

    String[] body = {"It is imperative for all new students to attend orientation. During this time faculty will review course information and the value of each concentration. Staff will lead the orientation and discuss program and university policies as well as curriculum. Students will have the opportunity to network and ask questions with regards to their academic goals."};


    //Constructor
    public customizedAboutApp(Context settingLst) {
        this.settingLst = settingLst;
        layoutSettings = (LayoutInflater) settingLst.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return header.length;
    }

    @Override
    public Object getItem(int position) {
        return header[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View settingView, ViewGroup parent) {
        settingView = layoutSettings.inflate(R.layout.customized_icon_lv, null);

        final TextView header1 = (TextView) settingView.findViewById(R.id.item1);

        final TextView body1 = (TextView) settingView.findViewById(R.id.item2);

        String header1Value = header1.getText().toString();
        String body1Value = body1.getText().toString();

        header1.setText(header1Value + header[position]);
        body1.setText(body1Value + body[position]);
        return settingView;
    }
}
