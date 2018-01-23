package chaimard.krirk.ac.th.chaicalculate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import chaimard.krirk.ac.th.chaicalculate.MainActivity;
import chaimard.krirk.ac.th.chaicalculate.R;

/**
 * Created by hero on 9/1/2561.
 */
// พิมพ์ extends Fragment แล้วให้เอา เคอร์เซอร์ วางภายใน กด alt+Insert  เลือก Override method  แลือก onCreateView

public class CalculateFragment extends Fragment implements View.OnClickListener {

    //    Explicit  ห้ามมีตัวเลขนำหน้า start with charecter
    private TextView textView;
    private Button buttonC, button1, button2, button3,
            button4, button5, button6, button7,
            button8, button9, button0, buttonDevide,
            buttonAdd, buttonMultiply, buttonMinus, buttonEqual;

    private String displayString = "";
    private double num1ADouble = 0, displayADouble;
    private String tag = "23JanV1";
    private Boolean addABoolean = false,minusABoolean = false;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create toolbar
        createToolbar();

//        Initial View
        initialView();

//        One Controller

        oneController();

        //      two Controller
        twoController();
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showDisplay("2");
//            }
//        });
// สร้างโครงสร้างด้านบนก่อน แล้วค่อยแถบคลุม เลือก ctrl+atl+M เพื่อเจนโ๕้ด void

        // three controller
        threeController();

        // four controller
        fourController();

//Number Controller
        numberController();

    }   //Main Method

    private void numberController() {
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        button7.setOnClickListener(this);
        buttonDevide.setOnClickListener(this);
        button8.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
    }

    private void fourController() {
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDisplay("4");
            }
        });
    }

    private void threeController() {
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDisplay("3");
            }
        });
    }

    private void twoController() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDisplay("2");
            }
        });
    }

    private void oneController() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Show display
                showDisplay("1");

            }
        });
    }

    private void showDisplay(String strDisplay) {
        StringBuilder stringBuilder = new StringBuilder();
        displayString = displayString + stringBuilder.append(strDisplay).toString();
        textView.setText(displayString);
    }

    private void initialView() {
        textView = getView().findViewById(R.id.txtDisplay);

        buttonC = getView().findViewById(R.id.btnC);
        buttonMinus = getView().findViewById(R.id.btnMinus);
        buttonAdd = getView().findViewById(R.id.btnAdd);
        buttonMultiply = getView().findViewById(R.id.btnMultiply);
        buttonDevide = getView().findViewById(R.id.btnDivide);
        buttonEqual = getView().findViewById(R.id.btnEqual);

        button1 = getView().findViewById(R.id.btn1);
        button2 = getView().findViewById(R.id.btn2);
        button3 = getView().findViewById(R.id.btn3);
        button4 = getView().findViewById(R.id.btn4);
        button5 = getView().findViewById(R.id.btn5);
        button6 = getView().findViewById(R.id.btn6);
        button7 = getView().findViewById(R.id.btn7);
        button8 = getView().findViewById(R.id.btn8);
        button9 = getView().findViewById(R.id.btn9);
        button0 = getView().findViewById(R.id.btn0);


    }

    private void createToolbar() {

        android.support.v7.widget.Toolbar toolbar = getView().findViewById(R.id.toolbarCalculate);

        ((MainActivity) getActivity()).setSupportActionBar(toolbar);

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

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn9:
                showDisplay("9");
                break;
            case R.id.btn8:
                showDisplay("8");
                break;
            case R.id.btn7:
                showDisplay("7");
                break;
            case R.id.btn6:
                showDisplay("6");
                break;

            case R.id.btn5:
                showDisplay("5");
                break;
            case R.id.btn4:
                showDisplay("4");
                break;
            case R.id.btn3:
                showDisplay("3");
                break;
            case R.id.btn2:
                showDisplay("2");
                break;
            case R.id.btn0:
                showDisplay("0");
                break;
            case R.id.btnC:
//                Clear Display
                clearDisplay();
//                num1ADouble = 0;
//                displayADouble = 0;
                break;

            case R.id.btnAdd:

                addABoolean = true;

                displayADouble = Double.parseDouble(displayString);

                if (num1ADouble == 0) {
                    num1ADouble = displayADouble;
                } else {
                    num1ADouble = num1ADouble + displayADouble;
                }

                Log.d(tag, "num1 ==>" + num1ADouble);

                clearDisplay();
                //showDisplay(Double.toString(num1ADouble));
                //clearDisplay();

                break;
              case R.id.btnEqual:
                //showDisplay("55550");
                displayADouble = Double.parseDouble(displayString);
                Log.d(tag, "displayAdouble" + displayADouble);

                if (addABoolean) {
                    num1ADouble = num1ADouble + displayADouble;
                    addABoolean = false;
                } else if (minusABoolean) {
                    num1ADouble = num1ADouble - displayADouble;
                    minusABoolean = false;
                }
                //showDisplay(Double.toString(num1ADouble));
                textView.setText(Double.toString(num1ADouble));
                displayString = "0";


                break;

            case R.id.btnMinus:

                minusABoolean = true;

                if (num1ADouble == 0) {
                    num1ADouble = Double.parseDouble(displayString);
                } else {
                    num1ADouble = num1ADouble - Double.parseDouble(displayString);
                }

                Log.d(tag, "num1 at btnMinus ==>" + num1ADouble);
                clearDisplay();

                break;

        } // switch
    } // on Click

    private void clearDisplay() {
        if (addABoolean) {
            textView.setText("");
            displayString = "";
            displayADouble = 0;

        } else if (minusABoolean) {
            textView.setText("");
            displayString = "";
            displayADouble = 0;

        } else {
            textView.setText("");
            displayString = "";
            displayADouble = 0;
            num1ADouble = 0;
        } // if

    } // clear Display

}   // Main Class
