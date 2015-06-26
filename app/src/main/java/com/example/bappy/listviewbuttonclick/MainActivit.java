package com.example.bappy.listviewbuttonclick;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivit extends ActionBarActivity {

    ListView lv;
    UserCustomAdapter userCustomAdapter;
    ArrayList<User> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.lv);
        arrayList=new ArrayList<User>();
        User user=new User("bappy","khan","an");
        User user2=new User("bappy","khan","an");
        arrayList.add(user);
        arrayList.add(user2);
        userCustomAdapter=new UserCustomAdapter(getApplicationContext(),R.layout.custom_layout, arrayList);
       // adapter=new ArrayAdapter<User>(getApplicationContext(), R.layout.custom_layout, arrayList);
        lv.setAdapter(userCustomAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
