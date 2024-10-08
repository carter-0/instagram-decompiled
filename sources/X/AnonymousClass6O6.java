package X;

import android.animation.Animator;
import android.os.SystemClock;

/* renamed from: X.6O6  reason: invalid class name */
public final class AnonymousClass6O6 implements Animator.AnimatorListener {
    public final /* synthetic */ AnonymousClass6MY A00;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public AnonymousClass6O6(AnonymousClass6MY r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        C309426Yf r1;
        AnonymousClass6MY r7 = this.A00;
        C309426Yf r0 = r7.A02;
        if (r0 != null) {
            if (((double) (SystemClock.uptimeMillis() - r0.A0P)) > ((double) 182.A01(0Tu.A05, r7.A06, 36610022058432471L)) && (r1 = r7.A02) != null) {
                r1.A0k = true;
            }
        }
    }
}
