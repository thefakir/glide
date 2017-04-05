package com.example.fidelbarcaya.glide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    private ImageView fotoImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fotoImageView = (ImageView)findViewById(R.id.fotoImageView);
        String url = "http://www.eduniversal-ranking.com/static/default/images/flag_500/Bolivia.png";
        Glide.with(this).
                load(url).
                crossFade().
                centerCrop().
                diskCacheStrategy(DiskCacheStrategy.ALL).
                thumbnail(0.5f).
                into(fotoImageView);
    }
}
