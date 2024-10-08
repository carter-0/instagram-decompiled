package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import com.instagram.android.R;

/* renamed from: X.VBv  reason: case insensitive filesystem */
public abstract class C16943VBv {
    public static final void A00(Context context, View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.bounce_horizontal);
        loadAnimation.setInterpolator(new BounceInterpolator());
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.lift_back);
        0qQ.A07(loadAnimation2);
        loadAnimation.setAnimationListener(new C11520Sbh(2, view, loadAnimation2));
        loadAnimation2.setAnimationListener(new C11520Sbh(3, view, loadAnimation));
        view.startAnimation(loadAnimation);
    }
}
