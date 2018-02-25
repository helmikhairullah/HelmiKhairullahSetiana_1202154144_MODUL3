package com.example.helmikhairullah.helmikhairullahsetiana_1202154144_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;

/**
 * Created by Helmi Khairullah on 25/02/2018.
 */

public class Air {
    private String title;
    private String info;
    private int image;

    static final String TITLE_KEY = "Title";
    static final String IMAGE_KEY = "Image Resource";


    public Air(String title, String info, int image) {
        this.title = title;
        this.info = info;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public String getInfo() {
        return info;
    }

    public String getTitle() {
        return title;
    }

    public static Intent starter(Context context, String title, @DrawableRes int imageResId) {
        Intent detailIntent = new Intent(context, DetailActivity.class);
        detailIntent.putExtra(TITLE_KEY, title);
        detailIntent.putExtra(IMAGE_KEY, imageResId);

        return detailIntent;
    }
}
