package com.hxd.hoxuandieu.listviewnangcao2609;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMonAn;
    ArrayList <MonAn> mangMonAn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMonAn= (ListView)findViewById(R.id.ListViewMonAn);
        mangMonAn = new ArrayList<>();
        //Add mảng
        mangMonAn.add(new MonAn("Bánh Canh",15000,"Bánh Canh Trảng Bàng",R.drawable.banhcanh));
        mangMonAn.add(new MonAn("Hủ Tiếu",15000,"Hử Tiếu Mỹ Tho",R.drawable.hutieu));
        mangMonAn.add(new MonAn("Cơm Sườn",15000,"Cơm Sườn bì chả",R.drawable.comsuon));
        mangMonAn.add(new MonAn("Cháo",15000,"Cháo Lòng",R.drawable.chao));mangMonAn.add(new MonAn("Bánh Canh",15000,"Bánh Canh Trảng Bàng",R.drawable.banhcanh));
        mangMonAn.add(new MonAn("Hủ Tiếu",15000,"Hử Tiếu Mỹ Tho",R.drawable.hutieu));
        mangMonAn.add(new MonAn("Cơm Sườn",15000,"Cơm Sườn bì chả",R.drawable.comsuon));
        mangMonAn.add(new MonAn("Cháo",15000,"Cháo Lòng",R.drawable.chao));mangMonAn.add(new MonAn("Bánh Canh",15000,"Bánh Canh Trảng Bàng",R.drawable.banhcanh));
        mangMonAn.add(new MonAn("Hủ Tiếu",15000,"Hử Tiếu Mỹ Tho",R.drawable.hutieu));
        mangMonAn.add(new MonAn("Cơm Sườn",15000,"Cơm Sườn bì chả",R.drawable.comsuon));
        mangMonAn.add(new MonAn("Cháo",15000,"Cháo Lòng",R.drawable.chao));mangMonAn.add(new MonAn("Bánh Canh",15000,"Bánh Canh Trảng Bàng",R.drawable.banhcanh));
        mangMonAn.add(new MonAn("Hủ Tiếu",15000,"Hử Tiếu Mỹ Tho",R.drawable.hutieu));
        mangMonAn.add(new MonAn("Cơm Sườn",15000,"Cơm Sườn bì chả",R.drawable.comsuon));
        mangMonAn.add(new MonAn("Cháo",15000,"Cháo Lòng",R.drawable.chao));mangMonAn.add(new MonAn("Bánh Canh",15000,"Bánh Canh Trảng Bàng",R.drawable.banhcanh));
        mangMonAn.add(new MonAn("Hủ Tiếu",15000,"Hử Tiếu Mỹ Tho",R.drawable.hutieu));
        mangMonAn.add(new MonAn("Cơm Sườn",15000,"Cơm Sườn bì chả",R.drawable.comsuon));
        mangMonAn.add(new MonAn("Cháo",15000,"Cháo Lòng",R.drawable.chao));mangMonAn.add(new MonAn("Bánh Canh",15000,"Bánh Canh Trảng Bàng",R.drawable.banhcanh));
        mangMonAn.add(new MonAn("Hủ Tiếu",15000,"Hử Tiếu Mỹ Tho",R.drawable.hutieu));
        mangMonAn.add(new MonAn("Cơm Sườn",15000,"Cơm Sườn bì chả",R.drawable.comsuon));
        mangMonAn.add(new MonAn("Cháo",15000,"Cháo Lòng",R.drawable.chao));

        MonanAdapter adapter = new MonanAdapter(MainActivity.this,R.layout.dong_mon_an,mangMonAn);
        lvMonAn.setAdapter(adapter);
    }
}
