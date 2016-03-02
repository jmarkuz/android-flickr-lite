package com.kuziv.android.myflickrlite.models;

import com.kuziv.android.myflickrlite.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kuziv on 2/27/2016.
 */
public class ImageModel {

    private int id;
    private String image;


    public ImageModel(int imageId,
                      String image) {
        this.id = imageId;
        this.image = image;
    }

    public List<ImageModel> getImageList() {
        return imageList;
    }

    public static List<ImageModel> imageList = new ArrayList<>();

    public static List<ImageModel> initImageList(List imageList) {

        List<ImageModel> list = imageList;

        list.add(new ImageModel(R.drawable.image1, "1"));
        list.add(new ImageModel(R.drawable.image2, "2"));
        list.add(new ImageModel(R.drawable.image3, "3"));

        return imageList;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
