package X;

import android.view.animation.Animation;

public final class GKQ implements Animation.AnimationListener {
    public final /* synthetic */ C227232is A00;
    public final /* synthetic */ boolean A01;

    public final void onAnimationEnd(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public GKQ(C227232is r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationStart(android.view.animation.Animation r4) {
        /*
            r3 = this;
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0016
            X.2is r0 = r3.A00
            android.view.View r2 = r0.mView
            if (r2 == 0) goto L_0x0016
            android.content.Context r1 = r0.requireContext()
            r0 = 4
            float r0 = X.0nA.A04(r1, r0)
            r2.setElevation(r0)
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GKQ.onAnimationStart(android.view.animation.Animation):void");
    }
}
