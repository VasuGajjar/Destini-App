package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyLine;
    Button btnTop;
    Button btnBottom;
    int index = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyLine = findViewById(R.id.storyTextView);
        btnTop = findViewById(R.id.buttonTop);
        btnBottom = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 1) {
                    storyLine.setText(R.string.T3_Story);
                    btnTop.setText(R.string.T3_Ans1);
                    btnBottom.setText(R.string.T3_Ans2);
                    index = 3;
                }
                else if (index == 2) {
                    storyLine.setText(R.string.T3_Story);
                    btnTop.setText(R.string.T3_Ans1);
                    btnBottom.setText(R.string.T3_Ans2);
                    index = 3;
                }
                else if (index == 3) {
                    storyLine.setText(R.string.T6_End);
                    btnTop.setVisibility(View.GONE);
                    btnBottom.setVisibility(View.GONE);
                    index = 6;
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 1) {
                    storyLine.setText(R.string.T2_Story);
                    btnTop.setText(R.string.T2_Ans1);
                    btnBottom.setText(R.string.T2_Ans2);
                    index = 2;
                }
                else if (index == 2) {
                    storyLine.setText(R.string.T4_End);
                    btnTop.setVisibility(View.GONE);
                    btnBottom.setVisibility(View.GONE);
                    index = 4;
                }
                else if (index == 3) {
                    storyLine.setText(R.string.T5_End);
                    btnTop.setVisibility(View.GONE);
                    btnBottom.setVisibility(View.GONE);
                    index = 5;
                }
            }
        });

    }
}
