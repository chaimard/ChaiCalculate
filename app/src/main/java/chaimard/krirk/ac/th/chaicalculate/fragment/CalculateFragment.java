package chaimard.krirk.ac.th.chaicalculate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import chaimard.krirk.ac.th.chaicalculate.MainActivity;
import chaimard.krirk.ac.th.chaicalculate.R;

/**
 * Created by hero on 9/1/2561.
 */
// พิมพ์ extends Fragment แล้วให้เอา เคอร์เซอร์ วางภายใน กด alt+Insert  เลือก Override method  แลือก onCreateView

public class CalculateFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create toolbar
        createToolbar();


    }   //Main Method

    private void createToolbar() {

        android.support.v7.widget.Toolbar toolbar = getView().findViewById(R.id.toolbarCalculate);

        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

        ((MainActivity) getActivity()).getSupportActionBar()
                .setTitle("Calculate");

        ((MainActivity) getActivity()).getSupportActionBar()
                .setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar()
                .setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate, container, false);



        //return super.onCreateView(inflater, container, savedInstanceState);

        return view;
    }
}   // Main Class
