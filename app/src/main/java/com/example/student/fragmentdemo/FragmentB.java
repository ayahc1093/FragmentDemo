package com.example.student.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by student on 5/31/2015.
 */
public class FragmentB extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, null, false);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        Button btnGetText = (Button)getActivity().findViewById(R.id.btnGetText);

        btnGetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView fragmentATextView = (TextView)getActivity().findViewById(R.id.fragmentATextView);
                Toast.makeText(getActivity(), fragmentATextView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
