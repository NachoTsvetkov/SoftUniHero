package com.exercise.AndroidAnimTranslate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class AndroidAnimTranslateActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btnStartGame = (Button)findViewById(R.id.btnStartGame);
        final Animation animationFalling = AnimationUtils.loadAnimation(this, R.anim.falling);
        final AndroidAnimTranslateActivity app = this;
        
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
		    }
        });
    }
}