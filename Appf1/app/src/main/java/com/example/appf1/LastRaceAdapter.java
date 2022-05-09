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

public class LastRaceAdapter extends RecyclerView.Adapter<LastRaceAdapter.ViewHolder> {

    private List<LastRace> dataLastRace;
    private final LayoutInflater layoutInflater;
    private final Context context;


    public LastRaceAdapter(List<LastRace> itemList, Context context){
        this.dataLastRace = itemList;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.lastrace, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(dataLastRace.get(position));
    }

    @Override
    public int getItemCount() {
        return dataLastRace.size();
    }

    public void setItems(List<LastRace> items) {
        dataLastRace = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoteamImage;
        TextView positionseason, name, surname, team, pointsseason;
        LinearLayout linearLayoutp;

        ViewHolder(View itemView) {
            super(itemView);

            positionseason = itemView.findViewById(R.id.positionseasonlrTextView);
            name = itemView.findViewById(R.id.namelrTextView);
            surname = itemView.findViewById(R.id.surnamelrTextView);
            team = itemView.findViewById(R.id.teamlrTextView);
            pointsseason = itemView.findViewById(R.id.pointsseasonlrTextView);

            logoteamImage = itemView.findViewById(R.id.logoteamlrImageView);

            linearLayoutp = itemView.findViewById(R.id.linearlayoutlrparent);
            linearLayoutp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    notifyItemChanged(getBindingAdapterPosition());
                }
            });

        }

        void bindData(final LastRace item) {
            positionseason.setText(item.getPositionseason());
            name.setText(item.getName());
            surname.setText(item.getSurname());
            surname.setTextColor(Color.parseColor(item.getColor()));
            team.setText(item.getTeam());
            pointsseason.setText(item.getPointsseason());

            logoteamImage.setImageResource(item.getImageLogoteam());

        }

    }


}
