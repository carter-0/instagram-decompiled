package X;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: X.4LZ  reason: invalid class name */
public abstract class AnonymousClass4LZ {
    public static void A00(View view, int i, boolean z, boolean z2) {
        if (view != null) {
            int visibility = view.getVisibility();
            if (z) {
                if (visibility == 0) {
                    return;
                }
            } else if (visibility != 0) {
                return;
            }
            if (!z2) {
                int i2 = 4;
                if (z) {
                    i2 = 0;
                }
                view.setVisibility(i2);
                return;
            }
            view.clearAnimation();
            float alpha = view.getAlpha();
            float f = 0.0f;
            if (z) {
                f = 1.0f;
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(alpha, f);
            alphaAnimation.setDuration((long) i);
            alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            alphaAnimation.setAnimationListener(new C265724Wa(view, z));
            view.startAnimation(alphaAnimation);
        }
    }
}
