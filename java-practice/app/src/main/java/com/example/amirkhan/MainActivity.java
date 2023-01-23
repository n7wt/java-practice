package com.example.amirkhan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialization//
        EditText edName = findViewById(R.id.edName);
        TextView txtView = findViewById(R.id.txtView);
        Button btn = findViewById(R.id.btn);
        //End of Initialization//

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = String.valueOf(edName.getText());
                txtView.setText("Greetings "+name+"! How it's going?");
            }
        });
    }
}