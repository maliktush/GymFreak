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

public class ArmsActivity extends AppCompatActivity {
    ArrayList<arms> armsList=arms.genRandCourses(5);

    ListView lvarmsDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms);

        lvarmsDetails = (ListView) findViewById(R.id.l3);
        ArmsActivity.armsAdapter armsAdapter = new ArmsActivity.armsAdapter();
        lvarmsDetails.setAdapter(armsAdapter);
    }

    class armsAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return armsList.size();
        }

        @Override
        public arms getItem(int position) {
            return armsList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater li = getLayoutInflater();
            convertView = li.inflate(R.layout.armsdetails, parent, false);


            TextView tvName = (TextView) convertView.findViewById(R.id.tvarmsname);
            TextView tvdesc = (TextView) convertView.findViewById(R.id.tvarmsdesc);


            arms thisarms = getItem(position);

            tvName.setText(thisarms.getName());
            tvdesc.setText(thisarms.getDescription());

            return convertView;
        }

    }
}
