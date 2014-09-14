package com.exercise.AndroidAnimTranslate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AndroidAnimTranslateActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btnStartGame = (Button)findViewById(R.id.btnStartGame);
        final ImageView floatingImage = (ImageView)findViewById(R.id.imageView1);
        final Animation animationFalling = AnimationUtils.loadAnimation(this, R.anim.falling);
        
        btnStartGame.setOnClickListener(new Button.OnClickListener(){
		    @Override
		    public void onClick(View arg0) {
		    // TODO Auto-generated method stub
		    	floatingImage.startAnimation(animationFalling);
		    }
        });
        
        for (int i = 0; i < 10; i++) {
        	floatingImage.startAnimation(animationFalling);
		}
    }
}