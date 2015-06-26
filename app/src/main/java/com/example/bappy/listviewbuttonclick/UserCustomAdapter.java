package com.example.bappy.listviewbuttonclick;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Bappy on 6/26/2015.
 */
public class UserCustomAdapter extends ArrayAdapter<User> {
    Context context;
    int layoutResuorceld;
    ArrayList<User> data=new ArrayList<User>();


    public UserCustomAdapter(Context context, int layoutResuorceld, ArrayList<User> data) {
        super(context, layoutResuorceld, data);
        this.layoutResuorceld=layoutResuorceld;
        this.context=context;
        this.data=data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;

        if(v==null){
           LayoutInflater vi=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=vi.inflate(R.layout.custom_layout, null);
        }
        TextView tv=(TextView) v.findViewById(R.id.txtOne);
        tv.setText(data.get(position).getName().toString());
        Button btnOne=(Button)v.findViewById(R.id.btnOne);
        Button btnTwo=(Button)v.findViewById(R.id.btnTwo);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context.getApplicationContext(),"Save",Toast.LENGTH_LONG).show();
            }

        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context.getApplicationContext(),"Share",Toast.LENGTH_LONG).show();

            }
        });

        return v;
    }


}
