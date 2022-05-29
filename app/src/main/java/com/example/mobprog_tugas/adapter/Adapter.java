package com.example.mobprog_tugas.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mobprog_tugas.R;
import com.example.mobprog_tugas.data.Data;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Data> items;

    public Adapter(Activity activity, List<Data> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView tvId = (TextView) view.findViewById(R.id.tvId);
        TextView tvNama = (TextView) view.findViewById(R.id.tvNama);
        TextView tvAlamat = (TextView) view.findViewById(R.id.tvAlamat);

        if (inflater == null) {
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (view == null) {
            view = inflater.inflate(R.layout.activity_list_row, null);
        }

        Data data = items.get(i);

        tvId.setText(data.getId());
        tvNama.setText(data.getNama());
        tvAlamat.setText(data.getAlamat());

        return view;
    }
}
