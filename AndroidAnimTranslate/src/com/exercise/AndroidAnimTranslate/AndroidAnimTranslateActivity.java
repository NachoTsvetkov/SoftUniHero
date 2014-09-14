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
	public static int counter = 0;
	public static int iterations = 10;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final Animation animationFalling = AnimationUtils.loadAnimation(this, R.anim.falling);
        final Animation animationLine1 = AnimationUtils.loadAnimation(this, R.anim.falling);
        final Animation animationLine2 = AnimationUtils.loadAnimation(this, R.anim.falling);
        final Animation animationLine3 = AnimationUtils.loadAnimation(this, R.anim.falling);
        final Animation animationLine4 = AnimationUtils.loadAnimation(this, R.anim.falling);
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
		    	counter = 0;
		    	
		    	RelativeLayout.LayoutParams layoutParameters = new RelativeLayout.LayoutParams(
	    			LayoutParams.WRAP_CONTENT,
	    		    LayoutParams.WRAP_CONTENT
		    	);
		    	
		    	layoutParameters.setMargins(0, -150, 0, 0);
		    	layoutParameters.addRule(RelativeLayout.ALIGN_LEFT);
		    	layoutParameters.addRule(RelativeLayout.ALIGN_LEFT);
		    	
		    	
		    	final ImageView fi = new ImageView(app);
		    	fi.setImageResource(R.drawable.ic_launcher);
		    	RelativeLayout rl = (RelativeLayout) findViewById(R.id.rlLine1);
		    	rl.addView(fi, layoutParameters);
		    	fi.startAnimation(animationFalling);
		    	
		    	final ImageView fi2 = new ImageView(app);
		    	fi2.setImageResource(R.drawable.ic_launcher);
		    	RelativeLayout rl2 = (RelativeLayout) findViewById(R.id.rlLine2);
		    	rl2.addView(fi2, layoutParameters);
		    	fi2.startAnimation(animationLine1);
		    	
		    	final ImageView fi3 = new ImageView(app);
		    	fi3.setImageResource(R.drawable.ic_launcher);
		    	RelativeLayout rl3 = (RelativeLayout) findViewById(R.id.rlLine3);
		    	rl3.addView(fi3, layoutParameters);
		    	fi3.startAnimation(animationLine1);
		    	
		    	final ImageView fi4 = new ImageView(app);
		    	fi4.setImageResource(R.drawable.ic_launcher);
		    	RelativeLayout rl4 = (RelativeLayout) findViewById(R.id.rlLine2);
		    	rl4.addView(fi4, layoutParameters);
		    	fi4.startAnimation(animationLine4);
		    	
		    	final Random rnd = new Random();
		    	int rnd1 = (int)(rnd.nextFloat()*1000);
		    	int rnd2 = (int)(rnd.nextFloat()*1000);
		    	int rnd3 = (int)(rnd.nextFloat()*1000);
		    	int rnd4 = (int)(rnd.nextFloat()*1000);
		    	
		    	animationLine1.setStartOffset(rnd1);
		    	animationLine2.setStartOffset(rnd2);
		    	animationLine3.setStartOffset(rnd3);
		    	animationLine4.setStartOffset(rnd4);
		    	
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
		    	    	if(counter < iterations) {
			    	    	counter++;
					    	int rnd1 = (int)(rnd.nextFloat()*1000);
					    	animationLine1.setStartOffset(rnd1+10);
					    	fi.startAnimation(animationLine1);
		    	    	}
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
		    	    	if(counter < iterations) {
					    	int rnd2 = (int)(rnd.nextFloat()*1000);
					    	animationLine2.setStartOffset(rnd2+10);
					    	fi2.startAnimation(animationLine2);
		    	    	}
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
		    	    	if(counter < iterations) {
					    	int rnd2 = (int)(rnd.nextFloat()*1000);
					    	animationLine3.setStartOffset(rnd2+10);
					    	fi3.startAnimation(animationLine3);
		    	    	}
		    	    }
		    	});
		    	
		    	animationLine4.setAnimationListener(new Animation.AnimationListener(){
		    	    @Override
		    	    public void onAnimationStart(Animation arg0) {
		    	    }           
		    	    @Override
		    	    public void onAnimationRepeat(Animation arg0) {
		    	    }           
		    	    @Override
		    	    public void onAnimationEnd(Animation arg0) {
		    	    	if(counter < iterations) {
					    	int rnd4 = (int)(rnd.nextFloat()*1000);
					    	animationLine4.setStartOffset(rnd4+10);
					    	fi4.startAnimation(animationLine4);
		    	    	}
		    	    }
		    	});
		    }
        });
    }
}