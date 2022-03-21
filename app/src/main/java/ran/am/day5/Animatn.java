package ran.am.day5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Animatn extends AppCompatActivity {
    Animation animation;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animatn);
        animation= AnimationUtils.loadAnimation(this,R.anim.rote);
        imageView=findViewById(R.id.imageView2);
    }

    public void rot(View view) {
        imageView.startAnimation(animation);
    }
}