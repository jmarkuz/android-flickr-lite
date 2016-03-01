package com.kuziv.android.myflickrlite.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.kuziv.android.myflickrlite.models.ImageModel;

/**
 * Created by kuziv on 2/26/2016.
 */
public class ImageAdapter extends ArrayAdapter<ImageModel> {

    private Context context;

    public ImageAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        return null;
    }

}
