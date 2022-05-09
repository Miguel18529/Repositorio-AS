package com.example.appf1;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        RelativeLayout relativeLayout = v.findViewById(R.id.newsmclaren);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), HomeNewsMcLaren.class);
                startActivity(intent);
            }
        });

        RelativeLayout relativeLayout2 = v.findViewById(R.id.newscrypto);
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), HomeNewsCrypto.class);
                startActivity(intent);
            }
        });

        TextView textView = v.findViewById(R.id.hyperlinkTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        // <--- ImageSlider (inicio) --->
        ImageSlider imageSlider = v.findViewById(R.id.slider);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.bestphotos1, null));
        slideModels.add(new SlideModel(R.drawable.bestphotos2, null));
        slideModels.add(new SlideModel(R.drawable.bestphotos3, null));
        slideModels.add(new SlideModel(R.drawable.bestphotos4, null));
        slideModels.add(new SlideModel(R.drawable.bestphotos5, null));
        slideModels.add(new SlideModel(R.drawable.bestphotos6, null));
        slideModels.add(new SlideModel(R.drawable.bestphotos7, null));
        imageSlider.setImageList(slideModels, null);
        // <--- ImageSlider (fin) --->

        // <--- YoutubeVideo (inicio) --->
        YouTubePlayerView youTubePlayerView = v.findViewById(R.id.ytvideorace);
        getLifecycle().addObserver(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "_yyL2qHxTSk";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });
        // <--- YoutubeVideo (fin) --->

        return v;
    }
}