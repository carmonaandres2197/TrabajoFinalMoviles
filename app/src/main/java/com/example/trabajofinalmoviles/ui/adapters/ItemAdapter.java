package com.example.trabajofinalmoviles.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trabajofinalmoviles.R;
import com.example.trabajofinalmoviles.model.Reporte;

import java.util.ArrayList;

public class ItemAdapter extends
        RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    ArrayList<Reporte> reportes;

    public ItemAdapter(ArrayList<Reporte> reportes){
        this.reportes = reportes;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_report, parent, false);

        return new ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        holder.lblNombre.setText(reportes.get(position).getNombre());
        holder.lblUsuarioReporta.setText(reportes.get(position).getIdUsuario());
        holder.lblUbicacion.setText(reportes.get(position).getUbicacion());

        holder.lblVerVideo.setOnClickListener(v -> {
            //TODO
        });

        holder.lblVerMapa.setOnClickListener(v -> {
            //TODO
        });

        holder.linearLayout.setOnClickListener(v -> {
            if(holder.sub_item.getVisibility() == View.VISIBLE){
                holder.sub_item.setVisibility(View.GONE);
            }else{
                holder.sub_item.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public int getItemCount() {
        return reportes.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
    public void setResults(ArrayList<Reporte> reportes) {
        this.reportes = reportes;
        notifyDataSetChanged();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        public LinearLayout linearLayout;
        public LinearLayout sub_item;
        public TextView lblNombre;
        public TextView lblUsuarioReporta;
        public TextView lblUbicacion;
        public TextView lblVerVideo;
        public TextView lblVerMapa;
        public ViewHolder(View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.layout_list_reporte);
            lblNombre = itemView.findViewById(R.id.nombre);
            sub_item  = itemView.findViewById(R.id.sub_item);
            lblUsuarioReporta = itemView.findViewById(R.id.usuario);
            lblUbicacion = itemView.findViewById(R.id.ubicacion);
            lblVerVideo = itemView.findViewById(R.id.ver_video);
            lblVerMapa = itemView.findViewById(R.id.ver_mapa);

        }
    }
}
