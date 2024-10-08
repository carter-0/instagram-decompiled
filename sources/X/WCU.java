package X;

import android.view.animation.Animation;

public final class WCU implements Animation.AnimationListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C18613Vv6 A01;

    public final void onAnimationRepeat(Animation animation) {
    }

    public WCU(C18613Vv6 vv6, int i) {
        this.A01 = vv6;
        this.A00 = i;
    }

    public final void onAnimationEnd(Animation animation) {
        this.A01.A03.remove(this.A00);
    }

    public final void onAnimationStart(Animation animation) {
        this.A01.A03.put(this.A00, animation);
    }
}
