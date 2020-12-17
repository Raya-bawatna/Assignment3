package raya.cs.birzeit.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //test comment
        setContentView(R.layout.activity_main);

        RecyclerView recycler = (RecyclerView)findViewById(R.id.movie_recycler);

        String[] captions = new String[Movies.movies.length];
        int[] ids = new int[Movies.movies.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Movies.movies[i].getName();
            ids[i] = Movies.movies[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
        recycler.setAdapter(adapter);


//    RecyclerView.OnItemClickListener itemClickListener = new RecyclerView.OnItemClickListener() {
//        @Override
//        public void onItemClick(AdapterView<?> parent,
//                                View view,
//                                int position,
//                                long id) {
//            Intent intent = new Intent(MainActivity.this,
//                    MainActivity2.class);
//            // id of item from movie[] if first then id=0,...
//            intent.putExtra("movie_id", (int)id);
//            startActivity(intent);
//
//        }
//    };
//        recycler.setOnItemClickListener(itemClickListener);



}
}
