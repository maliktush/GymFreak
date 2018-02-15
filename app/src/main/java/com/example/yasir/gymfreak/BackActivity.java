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

public class BackActivity extends AppCompatActivity {

    ArrayList<back> backList=back.genRandCourses(5);
    ListView lvbackDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        lvbackDetails = (ListView) findViewById(R.id.l2);
        backAdapter backAdapter = new backAdapter();
        lvbackDetails.setAdapter(backAdapter);
    }

    class backAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return backList.size();
        }

        @Override
        public back getItem(int position) {
            return backList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater li = getLayoutInflater();
            convertView = li.inflate(R.layout.backdetails, parent, false);


            TextView tvName = (TextView) convertView.findViewById(R.id.tvbackname);
            TextView tvdesc = (TextView) convertView.findViewById(R.id.tvbackdesc);


            back thisback = getItem(position);

            tvName.setText(thisback.getName());
            tvdesc.setText(thisback.getDescription());

            return convertView;
        }

    }
}
