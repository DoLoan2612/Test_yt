package com.appthuoc.gyyn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<ThuocKhangSinh> arrayList;
    ThuocKhangSinhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv =(ListView) findViewById(R.id.lvThuoc);
        arrayList = new ArrayList<>();


        arrayList.add(new ThuocKhangSinh("Triaxobiotic 1000", "Công ty Cổ phần Dược phẩm Tenamyd", R.drawable.a));
        arrayList.add(new ThuocKhangSinh("Galoxcin 750mg/150ml", "Công ty cổ phần dược phẩm Trung ương Pharbaco", R.drawable.b));
        arrayList.add(new ThuocKhangSinh("Ciprofloxacin 500mg Brawn","Brawn Laboratories Ltd.", R.drawable.c));
        arrayList.add(new ThuocKhangSinh("Novofungin 400 ","Công ty TNHH Liên Doanh Stellapharm.", R.drawable.d));

        adapter=new ThuocKhangSinhAdapter(this,R.layout.khangsinh,arrayList);
        lv.setAdapter(adapter);
    }


    }
