package com.example.tugasday3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class holder extends RecyclerView.ViewHolder{
    ImageView img;
    TextView txtname, txtdesc, txtprice;
    public holder(@NonNull View itemView) {
        super(itemView);

        img = itemView.findViewById(R.id.imgsmartphone);
        txtname = itemView.findViewById(R.id.txtname);
        txtdesc = itemView.findViewById(R.id.txtdesc);
        txtprice = itemView.findViewById(R.id.txtprice);
    }
}

public class Detailactivity extends RecyclerView.Adapter<holder> {
    Context context;
    ArrayList<smartphoneactivity> Listsmartphone;

    public Detailactivity(Context context, ArrayList<smartphoneactivity> Listsmartphone) {
        this.context = context;
        this.Listsmartphone = Listsmartphone;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_smartphone,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        smartphoneactivity smartphoneactivity = Listsmartphone.get(position);
        holder.img.setImageResource(smartphoneactivity.getImage());
        holder.txtname.setText(smartphoneactivity.getNama());
        holder.txtdesc.setText(smartphoneactivity.getDescripsion());
        holder.txtprice.setText(""+smartphoneactivity.getPrice());
    }

    @Override
    public int getItemCount() {
        return Listsmartphone.size();
    }
}
