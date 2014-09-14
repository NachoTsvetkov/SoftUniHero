package com.exercise.AndroidAnimTranslate;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class AndroidAnimTranslateActivity extends Activity {
	public static int counter = 0;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
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
//		    	for (int i = 0; i < 10; i++) {
//					//create rand 1..4
//		    		
//		    		//switch rand
//		    		//case 1 - line 1 image 1 delay 1
//		    		
//		    		//insert object
//				}
		    	
		    	final ImageView fi = new ImageView(app);
		    	fi.setImageResource(R.drawable.ic_launcher);
		    	
		    	final RelativeLayout relLayout1 = (RelativeLayout) findViewById(R.id.rlLine1);
		    	RelativeLayout relLayout2 = (RelativeLayout) findViewById(R.id.rlLine2);
		    	RelativeLayout relLayout3 = (RelativeLayout) findViewById(R.id.rlLine3);
		    	RelativeLayout relLayout4 = (RelativeLayout) findViewById(R.id.rlLine4);
		    	
		    	final RelativeLayout.LayoutParams layoutParameters = new RelativeLayout.LayoutParams(
	    			LayoutParams.WRAP_CONTENT,
	    		    LayoutParams.WRAP_CONTENT
		    	);
		    	layoutParameters.setMargins(0, -70, 0, 0);
		    	layoutParameters.addRule(RelativeLayout.ALIGN_LEFT);
		    	
		    	relLayout1.addView(fi, layoutParameters);
		    	fi.startAnimation(animationLine1);
		    	
		    	final ImageView fi2 = new ImageView(app);
		    	fi2.setImageResource(R.drawable.ic_launcher);
		    	
		    	relLayout2.addView(fi2, layoutParameters);
		    	fi2.startAnimation(animationLine2);
		    	
		    	final ImageView fi3 = new ImageView(app);
		    	fi3.setImageResource(R.drawable.ic_launcher);
		    	
		    	relLayout3.addView(fi3, layoutParameters);
		    	fi3.startAnimation(animationLine3);
		    	
		    	final Random rnd = new Random();
		    	int rnd1 = (int)(rnd.nextFloat()*1000);
		    	int rnd2 = (int)(rnd.nextFloat()*1000);
		    	int rnd3 = (int)(rnd.nextFloat()*1000);
		    	
		    	animationLine1.setStartOffset(rnd1);
		    	animationLine2.setStartOffset(rnd2);
		    	animationLine3.setStartOffset(rnd3);
		    	
<<<<<<< HEAD
		    	final Random rnd = new Random();
		    	int rnd1 = (rnd.nextInt(10000));
		    	int rnd2 = (rnd.nextInt(10000));
		    	int rnd3 = (rnd.nextInt(10000));
=======
>>>>>>> origin/master
		    	
		    	
		    	animationLine1.setAnimationListener(new Animation.AnimationListener(){
		    	    @Override
		    	    public void onAnimationStart(Animation arg0) {
		    	    }           
		    	    @Override
		    	    public void onAnimationRepeat(Animation arg0) {
		    	    }           
		    	    @Override
		    	    public void onAnimationEnd(Animation arg0) {
		    	    	if(counter < 5) {
			    	    	counter++;
					    	int rnd1 = (int)(rnd.nextFloat()*1000);
					    	animationLine1.setStartOffset(rnd1+10);
					    	fi.startAnimation(animationLine1);
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
				    	int rnd2 = (int)(rnd.nextFloat()*1000);
				    	animationLine2.setStartOffset(rnd2+10);
				    	fi2.startAnimation(animationLine2);
		    	    }
		    	});
		    	
		    	animationLine3.setAnimationListener(new Animation.AnimationListener(){
		    	    @Override
		    	    public void onAnimationStart(Animation arg0) {
		    	    }           
		    	    @Override
		    	    public void onAnimationRepeat(Animation arg0) {
		    	    }           
		    	    @Override
		    	    public void onAnimationEnd(Animation arg0) {
				    	int rnd2 = (int)(rnd.nextFloat()*1000);
				    	animationLine3.setStartOffset(rnd2+10);
				    	fi3.startAnimation(animationLine3);
		    	    }
		    	});
		    }
        });
    }
}