package chaimard.krirk.ac.th.chaicalculate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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


    }   //main method

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
