package com.example.mobilsport;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMobilAdapter extends RecyclerView.Adapter<ListMobilAdapter.ListViewHolder> {
    private ArrayList<Mobil_Data> MobilList;

    public ListMobilAdapter(ArrayList<Mobil_Data> list) {
        this.MobilList = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mobil_list, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Mobil_Data data_mobil =MobilList.get(position);
        Glide.with(holder.itemView.getContext()).load(data_mobil.getFoto())
                .apply(new RequestOptions()).override(60, 60)
                .into(holder.fotoMobil);

        holder.namaMobil.setText(data_mobil.getNama());
        holder.mobilDesc.setText(data_mobil.getDesc());
    }

    @Override
    public int getItemCount() {
        return MobilList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView fotoMobil;
        TextView namaMobil, mobilDesc;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoMobil = itemView.findViewById(R.id.foto_mobil);
            namaMobil = itemView.findViewById(R.id.nama);
            mobilDesc = itemView.findViewById(R.id.desc);

        }
    }
}
