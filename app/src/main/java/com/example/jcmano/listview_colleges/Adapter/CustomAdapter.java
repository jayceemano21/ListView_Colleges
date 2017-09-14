package com.example.jcmano.listview_colleges.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jcmano.listview_colleges.Model.College;
import com.example.jcmano.listview_colleges.R;
import java.util.List;

/**
 * Created by JCMANO on 07/09/2017.
 */

public class CustomAdapter extends BaseAdapter{
    Context c;
    List<College> colleges;
    ImageView iv_Logo;
    TextView tv_Name, tv_Year;

    @Override
    public int getCount() {
        return colleges.size();
    }

    @Override
    public Object getItem(int i) {
        return colleges.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(c, R.layout.row_layout,null);
        iv_Logo = v.findViewById(R.id.ivLogo);
        tv_Name = v.findViewById(R.id.tvCollege);
        tv_Year = v.findViewById(R.id.tvYear);

        return null;
    }

    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }

}
