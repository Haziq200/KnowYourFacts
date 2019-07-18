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
public class Frag3 extends Fragment {

    Button btnColor;

    public Frag3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_3, container, false);
        btnColor = view.findViewById(R.id.btnColor3);
        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int n = rand.nextInt(4);
                int color;
                if (n == 0) {
                    color = Color.GRAY;
                } else if (n == 1) {
                    color = Color.MAGENTA;
                } else if (n == 2) {
                    color = Color.RED;
                } else {
                    color = Color.BLUE;
                }
                view.setBackgroundColor(color);
            }
        });
        return view;
    }

}
