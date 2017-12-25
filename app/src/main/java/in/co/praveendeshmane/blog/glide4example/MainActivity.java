package in.co.praveendeshmane.blog.glide4example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MainActivity extends AppCompatActivity {
    String imgUrl = "https://api.androidhive.info/images/glide/medium/deadpool.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView);

        Glide.with(this).load(imgUrl).into(imageView);
    }
}
