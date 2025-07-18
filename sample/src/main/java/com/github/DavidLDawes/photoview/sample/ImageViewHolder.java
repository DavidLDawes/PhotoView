package com.github.DavidLDawes.photoview.sample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.github.DavidLDawes.sample.R;

/**
 * Image in recyclerview
 */
public class ImageViewHolder extends RecyclerView.ViewHolder {

    public static ImageViewHolder inflate(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(com.github.DavidLDawes.sample.R.layout.item_image, parent, false);
        return new ImageViewHolder(view);
    }

    public TextView mTextTitle;

    public ImageViewHolder(View view) {
        super(view);
        mTextTitle = view.findViewById(R.id.title);
    }

    private void bind(String title) {
        mTextTitle.setText(title);
    }
}
