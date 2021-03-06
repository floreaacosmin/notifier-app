package com.floreaacosmin.app.utils;

import android.graphics.Color;

import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

public class AppShimmerHelper {

	public void setShimmerEffect(ShimmerTextView shimmerTextView) {
     	// Instantiate the Shimmer effect class		
		Shimmer shimmer = new Shimmer();

        long shimmerEffectDuration = 8000;

		// Apply the reflection color
		shimmerTextView.setReflectionColor(Color.TRANSPARENT);

		// Assign a duration to the effect
     	shimmer.setDuration(shimmerEffectDuration);
     	// Start the shimmer effect animation
     	shimmer.start(shimmerTextView);	
	}
}