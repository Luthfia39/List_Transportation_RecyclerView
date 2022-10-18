package com.example.listoftransportationrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class typesTransportation extends RecyclerView.Adapter<typesTransportation.ViewHolder> {
    ArrayList<Transportation> arrayType;
    LayoutInflater inflater_types;

    public typesTransportation(Context context, ArrayList<Transportation> types) {
        this.arrayType = types;
        this.inflater_types = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public typesTransportation.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View types_view = inflater_types.inflate(R.layout.item_of_list, parent, false);
        return new ViewHolder(types_view);
    }

    @Override
    public void onBindViewHolder(@NonNull typesTransportation.ViewHolder holder, int position) {
        Transportation type = arrayType.get(position);
        holder.type.setText(type.type);
        holder.desc.setText(type.desc);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent list_vehicles = new Intent(holder.itemView.getContext(), detail.class);
                list_vehicles.putExtra("type", type.type);
                list_vehicles.putExtra("desc", type.desc);
                list_vehicles.putExtra("link", type.link);
                holder.itemView.getContext().startActivity(list_vehicles);
            }
        });
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView type, desc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            type = itemView.findViewById(R.id.type_trans);
            desc = itemView.findViewById(R.id.desc_type);
        }
    }

    @Override
    public int getItemCount() {
        return arrayType.size();
    }
}
