package X;

import android.view.animation.Animation;

public final class LZ8 implements Animation.AnimationListener {
    public final /* synthetic */ 2MD A00;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public LZ8(2MD r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animation animation) {
        2MD.A04(this.A00);
    }
}
