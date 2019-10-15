package com.example.cancare;


import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ZoomControls;
import uk.co.senab.photoview.PhotoViewAttacher;


public class showPhotoFragment extends Fragment {

int phot[]={R.drawable.dawaly,R.drawable.flu,R.drawable.mouth,R.drawable.woll,R.drawable.ants,R.drawable.kid,R.drawable.virus,R.drawable.feavre,
        R.drawable.digesive, R.drawable.daraq,R.drawable.saraa,R.drawable.vit,R.drawable.arter,R.drawable.nose};

    public showPhotoFragment() {
        // Required empty public constructor
    }
ImageView image;
    PhotoViewAttacher photoViewAttacher;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_show_photo, container, false);
int index=getArguments().getInt("index2",0);

image=view.findViewById(R.id.IM1);
        image.setImageResource(phot[index]);
        photoViewAttacher = new PhotoViewAttacher( image );


        return view;
    }


}
