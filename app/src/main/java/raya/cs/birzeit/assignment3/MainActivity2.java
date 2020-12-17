package raya.cs.birzeit.assignment3;

import android.content.Intent;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        int id = (int)intent.getExtras().get("movie_id");

        Movies movies = Movies.movies[id];



        TextView type= findViewById(R.id.edtType);
        TextView name= findViewById(R.id.edtName);
        TextView desc= findViewById(R.id.edtDesc);
        TextView year= findViewById(R.id.edtYear);



        name.setText(movies.getName());
        type.setText(movies.getType());
        desc.setText(movies.getDescription());
        year.setText(String.valueOf(movies.getYear()));

    }
}



