package com.hxd.hoxuandieu.listviewnangcao2609;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.List;

/**
 * Created by hxd on 10/24/2016.
 */

public class MonanAdapter extends BaseAdapter {
    private Context context;//man hình
    private int layout;
    private List<MonAn> monAnList;


    public MonanAdapter(Context context, int layout, List<MonAn> monAnList) {
        this.context = context;
        this.layout = layout;
        this.monAnList = monAnList;
    }

    @Override
    //Trả về số dòng ListView
    public int getCount() {
        return monAnList.size();
    }

    @Override
    public Object getItem(int position) {
        return monAnList.get(position);
    }//chưa sử dụng

    @Override
    public long getItemId(int position) {
        return position;
    }//chưa sử dụng
    public class ViewHolder{
        TextView txtTen,txtGia,txtMota;
        ImageView imgHinh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //kiểm tra ánh xạ giúp tối ưu bộ nhớ, các lần đăng nhập sau xử lý nhanh hơn.

        View rowview = convertView;
        ViewHolder holder = new ViewHolder();
        if(rowview == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);//lay man hình
            rowview = inflater.inflate(layout,null);
           holder.txtTen = (TextView) rowview.findViewById(R.id.textViewTenmonan);
            holder.txtGia = (TextView) rowview.findViewById(R.id.textViewGia);
            holder. txtMota = (TextView) rowview.findViewById(R.id.textViewMota);
            holder.imgHinh = (ImageView) rowview.findViewById(R.id.imageView);
            rowview.setTag(holder);//biet holder có ánh xạ hay ko
        }else {
            holder = (ViewHolder) rowview.getTag();
        }
        //dang 1 rut gon
        //convertView = inflater.inflate(layout,parent,false);//dang 2
        //ánh xạ


        MonAn monAn = monAnList.get(position);

        holder.txtTen.setText(monAn.Ten);
        //ddinh dạng số
        DecimalFormat dinhdangso = new DecimalFormat("###,###,###");
        holder.txtGia.setText("Giá:"+ dinhdangso.format(monAn.Gia)+ "Đ");

        holder.txtMota.setText(monAn.Mota);
        holder.imgHinh.setImageResource(monAn.Hinh);

        //Animation animation = AnimationUtils.loadAnimation(context, R.anim.anim_listview_alpha);
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.amin_listview_scale);
        rowview.startAnimation(animation);

        return rowview;
    }


//chưa kiểm tra có ánh xạ chưa
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);//lay man hình
//        convertView = inflater.inflate(layout,null);//dang 1 rut gon
//        //convertView = inflater.inflate(layout,parent,false);//dang 2
//        //ánh xạ
//        TextView txtTen = (TextView) convertView.findViewById(R.id.textViewTenmonan);
//        TextView txtGia = (TextView) convertView.findViewById(R.id.textViewGia);
//        TextView txtMota = (TextView) convertView.findViewById(R.id.textViewMota);
//        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imageView);
//
//        MonAn monAn = monAnList.get(position);
//
//        txtTen.setText(monAn.Ten);
//        //ddinh dạng số
//        DecimalFormat dinhdangso = new DecimalFormat("###,###,###");
//        txtGia.setText("Giá:"+ dinhdangso.format(monAn.Gia)+ "Đ");
//
//        txtMota.setText(monAn.Mota);
//        imgHinh.setImageResource(monAn.Hinh);
//
//        return convertView;
//    }

}
