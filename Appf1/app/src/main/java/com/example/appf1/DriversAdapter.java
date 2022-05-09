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
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DriversAdapter extends RecyclerView.Adapter<DriversAdapter.ViewHolder> {

    private List<Drivers> dataDrivers;
    private final LayoutInflater layoutInflater;
    private final Context context;


    public DriversAdapter(List<Drivers> itemList, Context context){
        this.dataDrivers = itemList;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.drivers, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(dataDrivers.get(position));
        // <--- Necesario para expandir (inicio) --->
        Drivers element = dataDrivers.get(position);
        boolean isVisible = element.visibility;
        holder.linearLayoutc.setVisibility(isVisible ? View.VISIBLE : View.GONE);
        holder.driverImage.setVisibility(isVisible ? View.VISIBLE : View.GONE);
        holder.flagImage.setVisibility(isVisible ? View.VISIBLE : View.GONE);
        // <---- Necesario para expandir (fin) ---->
    }

    @Override
    public int getItemCount() {
        return dataDrivers.size();
    }

    public void setItems(List<Drivers> items) {
        dataDrivers = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoteamImage, flagImage, numberImage, driverImage, helmetImage;
        TextView positionseason, name, surname, team, pointsseason,
                country, podium, points, gpe, wc,hrf, hgp, dob, pob;

        // <--- Necesario para expandir (inicio) --->
        LinearLayout linearLayoutp, linearLayoutc;
        // <---- Necesario para expandir (fin) ---->

        CardView cardView;

        ViewHolder(View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.cardviewListDrivers);

            positionseason = itemView.findViewById(R.id.positionseasonTextView);
            name = itemView.findViewById(R.id.nameTextView);
            surname = itemView.findViewById(R.id.surnameTextView);
            team = itemView.findViewById(R.id.teamTextView);
            pointsseason = itemView.findViewById(R.id.pointsseasonTextView);

            logoteamImage = itemView.findViewById(R.id.logoteamImageView);
            flagImage = itemView.findViewById(R.id.flagImageView);
            numberImage = itemView.findViewById(R.id.numberImageView);
            driverImage = itemView.findViewById(R.id.driverImageView);
            helmetImage = itemView.findViewById(R.id.helmetImageView);

            country = itemView.findViewById(R.id.countryresTextView);
            podium = itemView.findViewById(R.id.podiumresTextView);
            points = itemView.findViewById(R.id.pointsresTextView);
            gpe = itemView.findViewById(R.id.gperesTextView);
            wc = itemView.findViewById(R.id.wcresTextView);
            hrf = itemView.findViewById(R.id.hrfresTextView);
            hgp = itemView.findViewById(R.id.hgpresTextView);
            dob = itemView.findViewById(R.id.dobresTextView);
            pob = itemView.findViewById(R.id.pobresTextView);

            // <--- Necesario para expandir (inicio) --->
            linearLayoutp = itemView.findViewById(R.id.linearLayoutparent);
            linearLayoutc = itemView.findViewById(R.id.linearLayoutchild);

            linearLayoutp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Drivers drivers = dataDrivers.get(getBindingAdapterPosition());
                    drivers.setVisibility(!drivers.isVisibility());
                    notifyItemChanged(getBindingAdapterPosition());
                }
            });
            // <---- Necesario para expandir (fin) ---->

        }

        void bindData(final Drivers item) {
            positionseason.setText(item.getPositionseason());
            name.setText(item.getName());
            surname.setText(item.getSurname());
            surname.setTextColor(Color.parseColor(item.getColor()));
            team.setText(item.getTeam());
            pointsseason.setText(item.getPointsseason());

            logoteamImage.setImageResource(item.getImageLogoteam());
            flagImage.setImageResource(item.getImageFlag());
            numberImage.setImageResource(item.getImageNumber());
            driverImage.setImageResource(item.getImageDriver());
            helmetImage.setImageResource(item.getImageHelmet());

            country.setText(item.getCountry());
            podium.setText(item.getPodium());
            points.setText(item.getPoints());
            gpe.setText(item.getGpe());
            wc.setText(item.getWc());
            hrf.setText(item.getHrf());
            hgp.setText(item.getHgp());
            dob.setText(item.getDob());
            pob.setText(item.getPob());

            linearLayoutc.setBackgroundColor(Color.parseColor(item.getColor()));

        }

    }


}
