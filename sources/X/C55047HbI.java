package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;

/* renamed from: X.HbI  reason: case insensitive filesystem */
public abstract class C55047HbI {
    public static final void A00(View view) {
        0qQ.A0B(view, 0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setDuration(225);
        alphaAnimation.setAnimationListener(new IE5(view, 3));
        view.startAnimation(alphaAnimation);
    }
}
