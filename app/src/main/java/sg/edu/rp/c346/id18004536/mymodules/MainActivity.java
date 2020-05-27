package sg.edu.rp.c346.id18004536.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346pass;
    TextView tvC300pass;
    TextView tvC322pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346pass = findViewById(R.id.tvC346);
        tvC300pass = findViewById(R.id.tvC300);
        tvC322pass = findViewById(R.id.tvC322);

        tvC346pass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                String C346text = "Module code: C346 \n \n Module Name: Android Programming \n \n Academic year: 2020 \n \n Semester: 1 \n \n Module Credit: 4 \n \n Venue: W66M";
                intent.putExtra("Value",C346text);
                startActivity(intent);
            }
        });

        tvC300pass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                String C300text = "Module code: C300 \n \n Module Name: FYP project \n \n Academic year: 2020 \n \n Semester: 1 \n \n Module Credit: 4 \n \n Venue: W66W";
                intent.putExtra("Value",C300text);
                startActivity(intent);
            }
        });

        tvC322pass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                String C322text = "Module code: C322 \n \n Module Name: Data Center and Cloud Management \n \n Academic year: 2020 \n \n Semester: 1 \n \n Module Credit: 4 \n \n Venue: W66E";
                intent.putExtra("Value",C322text);
                startActivity(intent);
            }
        });

    }
}
