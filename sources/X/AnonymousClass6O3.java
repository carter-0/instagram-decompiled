package X;

import android.view.View;
import android.view.animation.AlphaAnimation;

/* renamed from: X.6O3  reason: invalid class name */
public final class AnonymousClass6O3 {
    public final long A00;
    public final View A01;
    public final AnonymousClass6O2 A02;
    public final C294975nL A03;
    public final AnonymousClass6O9 A04;
    public final Runnable A05 = new AnonymousClass6O4(this);
    public final AlphaAnimation A06;

    public final void A00() {
        View view = this.A01;
        view.clearAnimation();
        view.removeCallbacks(this.A05);
        C294975nL r4 = this.A03;
        r4.A0G();
        r4.A0U(0.9f, 1.0f, -1.0f);
        r4.A0V(0.9f, 1.0f, -1.0f);
        r4.A0E(C71392co.A03(12.0d, 10.0d));
        view.startAnimation(this.A06);
    }

    public AnonymousClass6O3(View view, AnonymousClass6O2 r5, AnonymousClass6O9 r6, long j) {
        this.A01 = view;
        this.A00 = j;
        this.A02 = r5;
        this.A04 = r6;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.A06 = alphaAnimation;
        alphaAnimation.setDuration(250);
        alphaAnimation.setStartOffset(j);
        this.A03 = C294975nL.A01(view, 0);
        alphaAnimation.setAnimationListener(new AnonymousClass6O5(this));
    }
}
