package com.example.a1_sakutugas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListTugasAdapter extends RecyclerView.Adapter<ListTugasAdapter.ListTugasViewHolder> {
    private ArrayList<ListTugas> listTugas;

    public ListTugasAdapter(ArrayList<ListTugas> listTugas) {
        this.listTugas = listTugas;
    }

    @NonNull
    @Override
    public ListTugasAdapter.ListTugasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list_tugas, parent, false);
        return new ListTugasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListTugasAdapter.ListTugasViewHolder holder, int position) {
        holder.tvTugas.setText(listTugas.get(position).getTugas());
        holder.tvTanggal.setText(listTugas.get(position).getTanggal());
        holder.tvKeterangan.setText(listTugas.get(position).getKeterangan());
    }

    @Override
    public int getItemCount() {
        // return listTugas.size();
        return (listTugas != null) ? listTugas.size() : 0;
    }

    public class ListTugasViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTugas, tvTanggal, tvKeterangan;

        public ListTugasViewHolder (View view) {
            super(view);

            tvTugas = view.findViewById(R.id.tvTugas);
            tvTanggal = view.findViewById(R.id.tvTanggal);
            tvKeterangan = view.findViewById(R.id.tvKeterangan);
        }
    }
}
