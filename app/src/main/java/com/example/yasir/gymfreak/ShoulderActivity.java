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

public class ShoulderActivity extends AppCompatActivity {

    ArrayList<shoulders> shouldersList=shoulders.genRandCourses(5);
    ListView lvshouldersDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);

        lvshouldersDetails = (ListView) findViewById(R.id.l4);
        ShoulderActivity.shouldersAdapter shouldersAdapter = new ShoulderActivity.shouldersAdapter();
        lvshouldersDetails.setAdapter(shouldersAdapter);
    }

    class shouldersAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return shouldersList.size();
        }

        @Override
        public shoulders getItem(int position) {
            return shouldersList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater li = getLayoutInflater();
            convertView = li.inflate(R.layout.shouldersdetails, parent, false);


            TextView tvName = (TextView) convertView.findViewById(R.id.tvshouldername);
            TextView tvdesc = (TextView) convertView.findViewById(R.id.tvshouldernamedesc);


            shoulders thisshoulders = getItem(position);

            tvName.setText(thisshoulders.getName());
            tvdesc.setText(thisshoulders.getDescription());

            return convertView;
        }

    }
}
