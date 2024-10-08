package X;

import android.view.animation.Animation;

public final class WCT implements Animation.AnimationListener {
    public final /* synthetic */ C307146Oz A00;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public WCT(C307146Oz r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animation animation) {
        this.A00.A01.setVisibility(8);
    }
}
