package sg.edu.rp.dmsd.knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {

    Button btnColor;

    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_2, container, false);
        btnColor = view.findViewById(R.id.btnColor2);
        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int i = rand.nextInt(4);
                int color;
                if (i == 0) {
                    color = Color.RED;
                } else if (i == 1) {
                    color = Color.GREEN;
                } else if (i == 2) {
                    color = Color.GRAY;
                } else {
                    color = Color.BLUE;
                }
                view.setBackgroundColor(color);

            }
        });
        return view;
    }

}
