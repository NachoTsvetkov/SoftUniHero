package com.exercise.AndroidAnimTranslate;

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
		    	ImageView fi = new ImageView(app);
		    	fi.setImageResource(R.drawable.ic_launcher);
		    	
		    	RelativeLayout rl = (RelativeLayout) findViewById(R.id.rlLine1);
		    	
		    	RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
	    			LayoutParams.WRAP_CONTENT,
	    		    LayoutParams.WRAP_CONTENT
		    	);
		    	
		    	lp.addRule(RelativeLayout.ALIGN_LEFT);
		    	
		    	rl.addView(fi, lp);
		    	fi.startAnimation(animationFalling);
		    	
		    	ImageView fi2 = new ImageView(app);
		    	fi2.setImageResource(R.drawable.ic_launcher);
		    	
		    	RelativeLayout rl2 = (RelativeLayout) findViewById(R.id.rlLine2);
		    	
		    	RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(
	    			LayoutParams.WRAP_CONTENT,
	    		    LayoutParams.WRAP_CONTENT
		    	);
		    	
		    	lp2.addRule(RelativeLayout.ALIGN_LEFT);
		    	
		    	rl2.addView(fi2, lp2);
		    	fi2.startAnimation(animationFalling);

		    	ImageView fi3 = new ImageView(app);
		    	fi3.setImageResource(R.drawable.ic_launcher);
		    	
		    	RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(
	    			LayoutParams.WRAP_CONTENT,
	    		    LayoutParams.WRAP_CONTENT
		    	);
		    	
		    	lp3.addRule(RelativeLayout.ALIGN_LEFT);
		    	
		    	rl.addView(fi3, lp3);
		    	
		    	fi3.startAnimation(animationFalling);
		    	animationFalling.setStartOffset(1000);
		    }
        });
    }
}