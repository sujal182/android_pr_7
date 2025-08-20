package com.example.pr7;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView l;
    String[] name = {"Car_1", "Car_2", "Car_3", "Car_4", "Car_5","Car_6"};
    int[] imgs = {R.drawable.car_1, R.drawable.car_2, R.drawable.car_3, R.drawable.car_4, R.drawable.car_5, R.drawable.car_6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        l = (ListView) findViewById(R.id.list_view);
        CustomAdapter ca = new CustomAdapter();
        l.setAdapter(ca);
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return name.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = getLayoutInflater().inflate(R.layout.custom_layout,null);
            TextView text = v.findViewById(R.id.img_text);
            ImageView img = v.findViewById(R.id.img_view);
            text.setText(name[i]);
            img.setImageResource(imgs[i]);
            return v;
        }
    }

}