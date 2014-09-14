package com.exercise.AndroidAnimTranslate;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class AndroidAnimTranslateActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final Animation animationFalling = AnimationUtils.loadAnimation(this, R.anim.falling);
        final Animation animationLine1 = AnimationUtils.loadAnimation(this, R.anim.falling);
        final Animation animationLine2 = AnimationUtils.loadAnimation(this, R.anim.falling);
        final AndroidAnimTranslateActivity app = this;

        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.llMain);
        mainLayout.setOnClickListener(new Button.OnClickListener(){
		    @Override
		    public void onClick(View arg0) {
		    }
        });
        
        
        Button btnStartGame = (Button)findViewById(R.id.btnStartGame);
        btnStartGame.setOnClickListener(new Button.OnClickListener(){
		    @Override
		    public void onClick(View arg0) {
		    	final ImageView fi = new ImageView(app);
		    	fi.setImageResource(R.drawable.ic_launcher);
		    	
		    	RelativeLayout rl = (RelativeLayout) findViewById(R.id.rlLine1);
		    	
		    	RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
	    			LayoutParams.WRAP_CONTENT,
	    		    LayoutParams.WRAP_CONTENT
		    	);
		    	
		    	lp.addRule(RelativeLayout.ALIGN_LEFT);
		    	
		    	rl.addView(fi, lp);
		    	fi.startAnimation(animationFalling);
		    	
		    	final ImageView fi2 = new ImageView(app);
		    	fi2.setImageResource(R.drawable.ic_launcher);
		    	
		    	RelativeLayout rl2 = (RelativeLayout) findViewById(R.id.rlLine2);
		    	
		    	RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(
	    			LayoutParams.WRAP_CONTENT,
	    		    LayoutParams.WRAP_CONTENT
		    	);
		    	
		    	lp2.addRule(RelativeLayout.ALIGN_LEFT);
		    	
		    	rl2.addView(fi2, lp2);
		    	fi2.startAnimation(animationLine1);
		    	
		    	final ImageView fi3 = new ImageView(app);
		    	fi3.setImageResource(R.drawable.ic_launcher);
		    	
		    	RelativeLayout rl3 = (RelativeLayout) findViewById(R.id.rlLine3);
		    	
		    	RelativeLayout.LayoutParams lp1 = new RelativeLayout.LayoutParams(
	    			LayoutParams.WRAP_CONTENT,
	    		    LayoutParams.WRAP_CONTENT
		    	);
		    	
		    	lp1.addRule(RelativeLayout.ALIGN_LEFT);
		    	
		    	rl3.addView(fi3, lp1);
		    	fi3.startAnimation(animationLine2);
		    	
		    	final Random rnd = new Random();
		    	int rnd1 = (rnd.nextInt(10000));
		    	int rnd2 = (rnd.nextInt(10000));
		    	int rnd3 = (rnd.nextInt(10000));
		    	
		    	animationFalling.setStartOffset(rnd1+3);
		    	animationLine1.setStartOffset(rnd2+3);
		    	animationLine2.setStartOffset(rnd3+3);
		    	
		    	animationFalling.setAnimationListener(new Animation.AnimationListener(){
		    	    @Override
		    	    public void onAnimationStart(Animation arg0) {
		    	    }           
		    	    @Override
		    	    public void onAnimationRepeat(Animation arg0) {
		    	    }           
		    	    @Override
		    	    public void onAnimationEnd(Animation arg0) {
				    	int rnd1 = (int)(rnd.nextFloat()*1000);
				    	animationFalling.setStartOffset(rnd1+10);
				    	fi.startAnimation(animationFalling);
		    	    }
		    	});
		    	
		    	
		    	animationLine1.setAnimationListener(new Animation.AnimationListener(){
		    	    @Override
		    	    public void onAnimationStart(Animation arg0) {
		    	    }           
		    	    @Override
		    	    public void onAnimationRepeat(Animation arg0) {
		    	    }           
		    	    @Override
		    	    public void onAnimationEnd(Animation arg0) {
				    	int rnd2 = (int)(rnd.nextFloat()*1000);
				    	animationLine1.setStartOffset(rnd2+10);
				    	fi2.startAnimation(animationLine1);
		    	    }
		    	});
		    	
		    	animationLine2.setAnimationListener(new Animation.AnimationListener(){
		    	    @Override
		    	    public void onAnimationStart(Animation arg0) {
		    	    }           
		    	    @Override
		    	    public void onAnimationRepeat(Animation arg0) {
		    	    }           
		    	    @Override
		    	    public void onAnimationEnd(Animation arg0) {
				    	int rnd2 = (int)(rnd.nextFloat()*1000);
				    	animationLine2.setStartOffset(rnd2+10);
				    	fi3.startAnimation(animationLine2);
		    	    }
		    	});
		    }
        });
    }
}