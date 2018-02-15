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

public class CardioActivity extends AppCompatActivity {

    ArrayList<cardio> cardioList=cardio.genRandCourses(5);
    ListView lvcardioDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);

        lvcardioDetails = (ListView) findViewById(R.id.l6);
        CardioActivity.cardioAdapter cardioAdapter = new CardioActivity.cardioAdapter();
        lvcardioDetails.setAdapter(cardioAdapter);
    }

    class cardioAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return cardioList.size();
        }

        @Override
        public cardio getItem(int position) {
            return cardioList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater li = getLayoutInflater();
            convertView = li.inflate(R.layout.cardiodetails, parent, false);


            TextView tvName = (TextView) convertView.findViewById(R.id.tvcardioname);
            TextView tvdesc = (TextView) convertView.findViewById(R.id.tvcardiodesc);


            cardio thiscardio = getItem(position);

            tvName.setText(thiscardio.getName());
            tvdesc.setText(thiscardio.getDescription());

            return convertView;
        }

    }
}
