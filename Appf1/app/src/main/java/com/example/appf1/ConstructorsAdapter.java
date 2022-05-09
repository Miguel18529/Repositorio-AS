package com.example.appf1;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ConstructorsAdapter extends RecyclerView.Adapter<ConstructorsAdapter.ViewHolder> {

    private List<Constructors> dataTeams;
    private final LayoutInflater layoutInflater;
    private final Context context;

    public ConstructorsAdapter(List<Constructors> itemList, Context context){
        this.dataTeams = itemList;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.constructors, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(dataTeams.get(position));
        // <--- Necesario para expandir (inicio) --->
        Constructors element = dataTeams.get(position);
        boolean isVisible = element.visibility;
        holder.linearLayoutc.setVisibility(isVisible ? View.VISIBLE : View.GONE);
        // <---- Necesario para expandir (fin) ---->
    }

    @Override
    public int getItemCount() {
        return dataTeams.size();
    }

    public void setItems(List<Constructors> items) {
        dataTeams = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView teamlogoImage, teamcarImage;
        TextView positionseasonteam, nameteam, nameteamdrivers, pointsseasonteam, ftn, base,
                teamchief, technicalchief, chassis, pu, fte, wcteam, hrfteam, pp, fl;
        // <--- Necesario para expandir (inicio) --->
        LinearLayout linearLayoutp, linearLayoutc;
        // <---- Necesario para expandir (fin) ---->

        ViewHolder(View itemView) {
            super(itemView);
            positionseasonteam = itemView.findViewById(R.id.positionseasonteamsTextView);
            nameteam = itemView.findViewById(R.id.nameteamTextView);
            nameteamdrivers = itemView.findViewById(R.id.nameteamdriversTextView);
            pointsseasonteam = itemView.findViewById(R.id.pointsseasonteamsTextView);

            teamlogoImage = itemView.findViewById(R.id.teamlogoImageView);
            teamcarImage = itemView.findViewById(R.id.teamcarImageView);

            ftn = itemView.findViewById(R.id.ftnresTextView);
            base = itemView.findViewById(R.id.baseresTextView);
            teamchief = itemView.findViewById(R.id.teamchiefresTextView);
            technicalchief = itemView.findViewById(R.id.technicalchiefresTextView);
            chassis = itemView.findViewById(R.id.chassisresTextView);
            pu = itemView.findViewById(R.id.puresTextView);
            fte = itemView.findViewById(R.id.fteresTextView);
            wcteam = itemView.findViewById(R.id.wcteamresTextView);
            hrfteam = itemView.findViewById(R.id.hrfteamresTextView);
            pp = itemView.findViewById(R.id.ppresTextView);
            fl = itemView.findViewById(R.id.flresTextView);

            // <--- Necesario para expandir (inicio) --->
            linearLayoutp = itemView.findViewById(R.id.linearLayoutteamsparent);
            linearLayoutc = itemView.findViewById(R.id.linearLayoutteamschild);

            linearLayoutp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Constructors teams = dataTeams.get(getBindingAdapterPosition());
                    teams.setVisibility(!teams.isVisibility());
                    notifyItemChanged(getBindingAdapterPosition());
                }
            });
            // <---- Necesario para expandir (fin) ---->

        }

        void bindData(final Constructors item) {
            positionseasonteam.setText(item.getPositionseasonteam());
            nameteam.setText(item.getNameteam());
            nameteam.setTextColor(Color.parseColor(item.getColorteam()));
            nameteamdrivers.setText(item.getNameteamdrivers());
            pointsseasonteam.setText(item.getPointsseasonteam());

            teamcarImage.setImageResource(item.getImageCar());
            teamlogoImage.setImageResource(item.getImageTeamLogo());

            ftn.setText(item.getFtn());
            base.setText(item.getBase());
            teamchief.setText(item.getTeamchief());
            technicalchief.setText(item.getTechnicalchief());
            chassis.setText(item.getChassis());
            pu.setText(item.getPu());
            fte.setText(item.getFte());
            wcteam.setText(item.getWcteam());
            hrfteam.setText(item.getHrfteam());
            pp.setText(item.getPp());
            fl.setText(item.getFl());

            linearLayoutc.setBackgroundColor(Color.parseColor(item.getColorteam()));

        }

    }

}
