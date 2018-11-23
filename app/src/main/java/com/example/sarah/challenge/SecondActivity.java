package com.example.sarah.challenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;



public class SecondActivity extends AppCompatActivity {
    String[] REPO = {"Repo1", "Repo2", "Repo3","Repo4","Repo5"};
    String[] DESCRIPTION = {"Description of Repo1", "Description of Repo2", "Description of Repo3", "Description of Repo4", "Description of Repo5"};
    String[] STARS = {"50", "60","10", "80", "71"};
    String[] USERNAME = {"Username1", "Username2","Username3", "Username4", "Username5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ListView listView = findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return REPO.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate( R.layout.custom_layout,null );

            TextView textView_repo_name= (TextView)convertView.findViewById(R.id.textView_repo_name);
            TextView textView_description = (TextView)convertView.findViewById(R.id.textView_description);
            TextView textView_stars = (TextView)convertView.findViewById(R.id.textView_stars);
            TextView textView_username = (TextView)convertView.findViewById(R.id.textView_username);

            textView_repo_name.setText(REPO[position]);
            textView_description.setText(DESCRIPTION[position]);
            textView_stars.setText(STARS[position]);
            textView_username.setText(USERNAME[position]);

            return convertView;
        }
    }
}

