package com.example.diary;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 이금호 on 2017-08-26.
 */

public class CustonAdapter extends ArrayAdapter<Article> {
    private Context mContext;
    private ArrayList<Article> mArticles;

    public CustonAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Article> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mArticles = (ArrayList<Article>) objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
        View row = inflater.inflate(R.layout.list_row, parent, false);

        TextView titleView = row.findViewById(R.id.titleView);
        TextView contentView = row.findViewById(R.id.contentView);

        titleView.setText(mArticles.get(position).getTitle());
        contentView.setText(mArticles.get(position).getContent());

        return  row;


    }
}
