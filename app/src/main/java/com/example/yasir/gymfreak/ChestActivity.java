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

public class ChestActivity extends AppCompatActivity {
    ArrayList<chest> chestList=chest.genRandCourses(5);
    ListView lvchestDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

        lvchestDetails = (ListView) findViewById(R.id.l1);
        chestAdapter chestAdapter = new chestAdapter();
        lvchestDetails.setAdapter(chestAdapter);
    }

    class chestAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return chestList.size();
        }

        @Override
        public chest getItem(int position) {
            return chestList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater li = getLayoutInflater();
            convertView = li.inflate(R.layout.chestdetails, parent, false);


            TextView tvName = (TextView) convertView.findViewById(R.id.tvname);
            TextView tvdesc = (TextView) convertView.findViewById(R.id.tvdesc);


            chest thischest = getItem(position);

            tvName.setText(thischest.getName());
            tvdesc.setText(thischest.getDescription());

            return convertView;
        }

        }
}
