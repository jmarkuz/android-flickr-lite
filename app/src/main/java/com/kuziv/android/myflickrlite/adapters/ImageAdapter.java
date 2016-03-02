package com.kuziv.android.myflickrlite.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.kuziv.android.myflickrlite.R;

/**
 * Created by kuziv on 2/26/2016.
 */
public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageVH> {

    private static final int RETRIEVE_IMAGE_COUNT = 3;
    private Context con;

    public ImageAdapter(Context con) {
        this.con = con;
    }

    @Override
    public ImageVH onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_card_view, parent, false);
        ImageVH imageVH = new ImageVH(view);
        return imageVH;
    }

    @Override
    public void onBindViewHolder(ImageVH holder, int position) {
        holder.image.setImageDrawable(con.getDrawable(R.drawable.image1)); // mock checkout
    }

    @Override
    public int getItemCount() {
        return RETRIEVE_IMAGE_COUNT;
    }

    public static class ImageVH extends RecyclerView.ViewHolder {
         CardView cv;
         ImageView image;

        public ImageVH(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.image_card_view);
            image = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

}

