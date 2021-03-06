package com.example.AndroidUITest.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.AndroidUITest.R;
import com.example.AndroidUITest.models.MenuItem;

import java.util.List;

public class MenuAdapter extends ArrayAdapter<MenuItem> {
    private final List<MenuItem> values;
    private final Context context;

    public MenuAdapter (Context context, List<MenuItem> objects) {
        super(context, R.layout.hidden_menu_item, objects);
        this.values = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.hidden_menu_item, parent, false);
        TextView idView = (TextView) rowView.findViewById(R.id.text);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
        MenuItem currentItem = values.get(position);
        String name = currentItem.getName();
        idView.setText(name);
        imageView.setImageResource(R.drawable.ic_launcher);
        return rowView;
    }
}
