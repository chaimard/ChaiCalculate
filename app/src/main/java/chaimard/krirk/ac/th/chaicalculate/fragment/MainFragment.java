package chaimard.krirk.ac.th.chaicalculate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import chaimard.krirk.ac.th.chaicalculate.MainActivity;
import chaimard.krirk.ac.th.chaicalculate.R;

/**
 * Created by hero on 9/1/2561.
 */

public class MainFragment extends Fragment{


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create toolbar
        createToolbar();

        //        ShowName Controller
        showNameController();

//Calculate Controller
        calculateController();

    }   //main method

    private void calculateController() {
        Button button = getView().findViewById(R.id.btnCalculate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentMainFragment, new CalculateFragment())
                        .addToBackStack(null)
                        .commit();

            }
        });


    }

    private void showNameController() {
        Button button = getView().findViewById(R.id.btnShowName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = getView().findViewById(R.id.txtShowName);
                textView.setText("Chaimard");


            }
        });
    }

    private void createToolbar() {

                Toolbar toolbar = getView().findViewById(R.id.toolbarMain);

        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;

    }
}   //Main class
