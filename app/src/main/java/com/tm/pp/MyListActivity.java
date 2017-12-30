package com.tm.pp;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MyListActivity extends ListActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ListItem[] array = {
            new ListItem("1a", "1b"),
            new ListItem("Thomas", "Marz"),
            new ListItem("Wo ist das nur so?", "An der Donau, wo sonst?"),
            new ListItem("2a", "2b")
        };
        MyArrayAdapter arrayAdapter = new MyArrayAdapter(this, array);
        setListAdapter(arrayAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public class ListItem extends Object {
        public ListItem(String t1, String t2) {
            text1 = t1;
            text2 = t2;
        }
        public String text1, text2;
    }

    public class MyArrayAdapter extends ArrayAdapter {

        private final ListItem[] data;
        private final Context context;
        private TextView text1, text2;

        public MyArrayAdapter(Context context, ListItem[] items) {
            super(context, R.layout.list_item, items);
            this.context = context;
            this.data = items;
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            // create view once
            if (convertView == null) {
                LayoutInflater inflater = ((Activity) context).getLayoutInflater();
                convertView = inflater.inflate(R.layout.list_item, parent, false);
                this.text1 = convertView.findViewById(R.id.text1);
                this.text2 = convertView.findViewById(R.id.text2);
            }

            // set texts
            ListItem item = data[position];
            this.text1.setText(item.text1);
            this.text2.setText(item.text2);

            return convertView;
        }
    }
}