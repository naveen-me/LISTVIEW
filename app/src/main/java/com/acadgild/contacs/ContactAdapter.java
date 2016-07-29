package com.acadgild.contacs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Moon on 7/27/2016.
 */
public class ContactAdapter extends BaseAdapter {
    String[] mnames;
    String[] mnumbs;
    Context context;
    private static LayoutInflater inflater=null;

    public ContactAdapter(MainActivity mainActivity, String[] names, String[] numbs) {
        mnames=names;
        mnumbs=numbs;
        context=mainActivity;

        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return mnames.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    public class Holder{
        TextView nam;
        TextView num;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Holder holder = new Holder();
        View myView;
        myView = inflater.inflate(R.layout.contactview, null);
        holder.nam=(TextView) myView.findViewById(R.id.name);
        holder.num=(TextView) myView.findViewById(R.id.num);

        holder.nam.setText(mnames[i]);
        holder.num.setText(mnumbs[i]);

        return myView;

    }
}
