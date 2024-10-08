package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.6O5  reason: invalid class name */
public final class AnonymousClass6O5 implements Animation.AnimationListener {
    public final /* synthetic */ AnonymousClass6O3 A00;

    public final void onAnimationRepeat(Animation animation) {
    }

    public AnonymousClass6O5(AnonymousClass6O3 r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animation animation) {
        AnonymousClass6O9 r1 = this.A00.A04;
        if (r1 != null && C55262Her.A00(r1.A01).booleanValue() && r1.A00 == 0) {
            GBU.A07 = true;
            C56658I6n.A00();
        }
    }

    public final void onAnimationStart(Animation animation) {
        AnonymousClass6O3 r5 = this.A00;
        View view = r5.A01;
        view.setVisibility(0);
        view.postDelayed(r5.A05, r5.A00);
        AnonymousClass6O2 r0 = r5.A02;
        if (r0 != null) {
            r0.A00.A12 = false;
        }
    }
}
