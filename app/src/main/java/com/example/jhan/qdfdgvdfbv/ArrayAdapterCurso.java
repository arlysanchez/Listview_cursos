package com.example.jhan.qdfdgvdfbv;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JHAN  ARLY on 21/05/2015.
 */
public class ArrayAdapterCurso extends ArrayAdapter<Cursos> {
    ArrayList<Cursos> data;
    int id;
    Context context;
    public ArrayAdapterCurso(Context context, int resources, ArrayList<Cursos> listCurso) {
        super(context, 0, listCurso);
        this.context = context;
        this.id = resources;
        data = listCurso;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        View row = convertView;
        RecordHolder holder = null;
        // Check if an existing view is being reused, otherwise inflate the view
        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(id,parent,false);
            holder = new RecordHolder();
            holder.tvName = (TextView) row.findViewById(R.id.tvName);
            row.setTag(holder);
        }
       Cursos c = data.get(position);
        holder.tvName.setText(c.getNombre_curso());

        return row;
    }
    static class RecordHolder{
        TextView tvName;
    }
}
