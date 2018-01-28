package com.example.mahadi.mycheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox milk,sugar,water;
    private Button show;
    private TextView resultShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milk = (CheckBox) findViewById(R.id.milk);
        sugar = (CheckBox) findViewById(R.id.sugar);
        water = (CheckBox) findViewById(R.id.water);

        show = (Button) findViewById(R.id.show);

        resultShow = (TextView) findViewById(R.id.showText);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();

                if (milk.isChecked()){

                    String value = milk.getText().toString();
                    stringBuilder.append(value + " is Ordered\n");

                }
                if (sugar.isChecked()){

                    String value = sugar.getText().toString();
                    stringBuilder.append(value + " is Ordered\n");

                }
                if (water.isChecked()){

                    String value = water.getText().toString();
                    stringBuilder.append(value + " is Ordered\n");
                }

                resultShow.setText(stringBuilder);
            }
        });
    }
}
