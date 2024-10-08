package X;

import android.view.animation.Animation;

/* renamed from: X.TtY  reason: case insensitive filesystem */
public final class C14298TtY implements Animation.AnimationListener {
    public final /* synthetic */ C14297TtX A00;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public C14298TtY(C14297TtX ttX) {
        this.A00 = ttX;
    }

    public final void onAnimationEnd(Animation animation) {
        C14297TtX ttX = this.A00;
        ttX.A02.setVisibility(8);
        ttX.A01 = true;
    }
}
