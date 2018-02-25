package com.example.helmikhairullah.helmikhairullahsetiana_1202154144_modul3;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;


public class HelmiKhairullahSetiana_1202154144_Modul3 extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<Air> mAirData;
    private AirAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.merk);
        Toast.makeText(this, "Selamat Datang", Toast.LENGTH_SHORT).show();

        mRecyclerView = (RecyclerView) findViewById(R.id.kebawah);

        int gridColumn = getResources().getInteger(R.integer.grid_column_count);

        mRecyclerView.setLayoutManager(new GridLayoutManager(this, gridColumn));

        mAirData = new ArrayList<>();

        mAdapter = new AirAdapter(this, mAirData);
        mRecyclerView.setAdapter(mAdapter);

        initialiseData();

    }

    private void initialiseData(){
        String[] airListBarang = getResources().getStringArray(R.array.nama);
        String[] airInfoBarang = getResources().getStringArray(R.array.penjelasan);
        TypedArray airImageResource = getResources().obtainTypedArray(R.array.menu_images);
        mAirData.clear();

        for (int i=0; i<airListBarang.length; i++){
            mAirData.add(new Air(airListBarang[i], airInfoBarang[i], airImageResource.getResourceId(i, 0)));
        }

        airImageResource.recycle();

        mAdapter.notifyDataSetChanged();
    }

}
