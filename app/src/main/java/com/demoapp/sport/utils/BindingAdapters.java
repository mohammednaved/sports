package com.demoapp.sport.utils;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.squareup.picasso.Picasso;

/***
 * Binding adapters for data binding
 */

public class BindingAdapters {
    @BindingAdapter("android:src")
    public static void loadImage(ImageView view, String url) {
        if (url != null && !url.isEmpty()) {
            Picasso.get().load(url).into(view);
        }
    }
}
