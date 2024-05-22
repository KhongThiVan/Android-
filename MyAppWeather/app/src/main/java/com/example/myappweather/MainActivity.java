package com.example.myappweather;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText edtSearch;
    Button btnSearch,btnChangeActivity;
    TextView Name,Country,Temp,Status,Humidity,Cloud,Windy,Day;
    ImageView imgIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
    }

    protected void Anhxa(){
        edtSearch = (EditText) findViewById(R.id.edittextSearch);
        btnSearch = (Button) findViewById(R.id.buttonSearch);
        btnChangeActivity = (Button) findViewById(R.id.buttonChangeActivity);
        Name = findViewById(R.id.textviewName);
        Country = findViewById(R.id.textviewCountry);
        Temp = findViewById(R.id.textviewTemp);
        Status = findViewById(R.id.textviewStatus);
        Humidity = findViewById(R.id.textviewHumidity);
        Cloud = findViewById(R.id.textviewCloud);
        Windy = findViewById(R.id.textviewWindy);
        Day = findViewById(R.id.textviewDay);
        imgIcon = findViewById(R.id.imageIcon);

    }
}