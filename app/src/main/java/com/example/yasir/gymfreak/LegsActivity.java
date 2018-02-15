package com.example.yasir.gymfreak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class LegsActivity extends AppCompatActivity {

    ArrayList<legs> legsList=legs.genRandCourses(5);
    ListView lvlegsDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);

        lvlegsDetails = (ListView) findViewById(R.id.l5);
        LegsActivity.legsAdapter legsAdapter = new LegsActivity.legsAdapter();
        lvlegsDetails.setAdapter(legsAdapter);
    }

    class legsAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return legsList.size();
        }

        @Override
        public legs getItem(int position) {
            return legsList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater li = getLayoutInflater();
            convertView = li.inflate(R.layout.legsdetails, parent, false);


            TextView tvName = (TextView) convertView.findViewById(R.id.tvlegsname);
            TextView tvdesc = (TextView) convertView.findViewById(R.id.tvlegsdesc);


            legs thislegs = getItem(position);

            tvName.setText(thislegs.getName());
            tvdesc.setText(thislegs.getDescription());

            return convertView;
        }

    }
}
