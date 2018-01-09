package chaimard.krirk.ac.th.chaicalculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import chaimard.krirk.ac.th.chaicalculate.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add fragment to activity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.contentMainFragment, new MainFragment())
                    .commit();

        }

    }   // main method



}   // main class