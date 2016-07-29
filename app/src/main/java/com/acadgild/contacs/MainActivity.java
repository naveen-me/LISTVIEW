package com.acadgild.contacs;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] names={"Naveen Kumar","Praveen Kumar","Shilpa","Harish","Tenzin","Ayush","Abhinav","Satya","Venkat","Acadgild"};
    String[] numbs={"+91 98765 43210","+91 98765 43211","+91 98765 43212","+91 98765 43213","+91 98765 43214","+91 98765 43215","+91 98765 43216","+91 98765 43217","+91 98765 43218","+91 98765 43219"};
    ListView lv;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;
        lv=(ListView) findViewById(R.id.list);
        lv.setAdapter(new ContactAdapter(this, names,numbs));

    }
}
