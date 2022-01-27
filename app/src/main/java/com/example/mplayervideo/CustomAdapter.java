package com.example.mplayervideo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    ListView listView;
    String[] items;

    public CustomAdapter(ListView listView, String[] items) {
        this.listView = listView;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
        TextView txtSong = view.findViewById(R.id.txtSong);
        txtSong.setSelected(true);
        txtSong.setText(items[position]);
        return view;
    }
}
