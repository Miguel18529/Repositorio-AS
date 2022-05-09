package com.example.appf1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CircuitsAdapter extends RecyclerView.Adapter<CircuitsAdapter.ViewHolder> {

    private List<Circuits> dataCircuits;
    private final LayoutInflater layoutInflater;
    private final Context context;

    public CircuitsAdapter(List<Circuits> itemList, Context context){
        this.dataCircuits = itemList;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.circuits, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(dataCircuits.get(position));
        // <--- Necesario para expandir (inicio) --->
        Circuits element = dataCircuits.get(position);
        boolean isVisible = element.visibility;
        holder.linearLayoutc.setVisibility(isVisible ? View.VISIBLE : View.GONE);
        // <---- Necesario para expandir (fin) ---->
    }

    @Override
    public int getItemCount() {
        return dataCircuits.size();
    }

    public void setItems(List<Circuits> items) {
        dataCircuits = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView flagcircuitImage, circuitImage;
        TextView roundcircuit, namecountry, nameevent, fgp, nof, cl, rd, lr, namecircuit;
        // <--- Necesario para expandir (inicio) --->
        LinearLayout linearLayoutp, linearLayoutc;
        // <---- Necesario para expandir (fin) ---->

        ViewHolder(View itemView) {
            super(itemView);
            roundcircuit = itemView.findViewById(R.id.roundcircuitTextView);
            namecountry = itemView.findViewById(R.id.namecountryTextView);
            nameevent = itemView.findViewById(R.id.nameeventTextView);

            namecircuit = itemView.findViewById(R.id.namecircuitTextView);
            flagcircuitImage = itemView.findViewById(R.id.flagcircuitImageView);
            circuitImage = itemView.findViewById(R.id.circuitImageView);

            fgp = itemView.findViewById(R.id.fgpresTextView);
            nof = itemView.findViewById(R.id.nofresTextView);
            cl = itemView.findViewById(R.id.clresTextView);
            rd = itemView.findViewById(R.id.rdresTextView);
            lr = itemView.findViewById(R.id.lrresTextView);

            // <--- Necesario para expandir (inicio) --->
            linearLayoutp = itemView.findViewById(R.id.linearLayoutcircuitsparent);
            linearLayoutc = itemView.findViewById(R.id.linearLayoutcircuitschild);

            linearLayoutp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Circuits teams = dataCircuits.get(getBindingAdapterPosition());
                    teams.setVisibility(!teams.isVisibility());
                    notifyItemChanged(getBindingAdapterPosition());
                }
            });
            // <---- Necesario para expandir (fin) ---->

        }

        void bindData(final Circuits item) {
            roundcircuit.setText(item.getRoundcircuit());
            namecountry.setText(item.getNamecountry());
            nameevent.setText(item.getNameevent());

            namecircuit.setText(item.getNamecircuit());
            flagcircuitImage.setImageResource(item.getImageFlagCircuit());
            circuitImage.setImageResource(item.getImageCircuit());

            fgp.setText(item.getFgp());
            nof.setText(item.getNof());
            cl.setText(item.getCl());
            rd.setText(item.getRd());
            lr.setText(item.getLr());
        }

    }

}
