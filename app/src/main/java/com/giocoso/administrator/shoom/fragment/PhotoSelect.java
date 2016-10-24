package com.giocoso.administrator.shoom.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.giocoso.administrator.shoom.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhotoSelect extends Fragment {

    ImageButton home_button;

    public PhotoSelect() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_photo_select, container, false);

        home_button = (ImageButton)view.findViewById(R.id.move_frament_button2);

        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               getActivity().finish();
            }
        });

        return view;
    }

}
