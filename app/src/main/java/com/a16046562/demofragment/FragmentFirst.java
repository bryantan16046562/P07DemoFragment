package com.a16046562.demofragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFirst extends Fragment {
    Button btnaddtext;
    TextView tvfrag1;
    public FragmentFirst() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        tvfrag1 = (TextView) view.findViewById(R.id.tvFrag1);
        btnaddtext = (Button) view.findViewById(R.id.btnAddTextFrag1);
        btnaddtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = tvfrag1.getText().toString() + "\n" + "New Data";
                tvfrag1.setText(data);
            }
        });
        return view;
    }

}
