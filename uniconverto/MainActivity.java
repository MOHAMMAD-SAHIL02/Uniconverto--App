package com.example.uniconverto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textViews;
    private EditText Weight;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.Submit);
        textViews=findViewById(R.id.textViews);
        Weight=findViewById(R.id.Weight);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Successfully Converted .", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,"Executed",Toast.LENGTH_SHORT).show();

                String s=Weight.getText().toString();
                int kg=Integer.parseInt(s);
                double Pound=2.205 * kg;
                textViews.setText("Equivalent weight in Pound is:"+Pound );


            }
        });



















    }
}