package com.example.assemalturifi.week2day1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    private TextView tvSecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvSecond = findViewById(R.id.tvSecond);

        if (getIntent().getStringExtra(Constants.KEYS.IS_PERSON).equals("true")) {

            //retrieve the value from the main intent
            String tvSecondText = getIntent().getStringExtra(Constants.KEYS.ET_MAIN);
            tvSecond.setText(tvSecondText);


            String personType = getIntent().getStringExtra(Constants.KEYS.PERSON_TYPE);
            Toast.makeText(this, personType, Toast.LENGTH_SHORT).show();

            switch (personType) {
                case "parcelable":
                    Person personParcel = getIntent().getParcelableExtra(Constants.KEYS.PERSON);
                    tvSecond.setText(personParcel.toString());
                    break;
                case "serializable":
                    Person person = (Person) getIntent().getSerializableExtra(Constants.KEYS.PERSON);
                    tvSecond.setText(person.toString());
                    break;
            }
        }



    }
}
