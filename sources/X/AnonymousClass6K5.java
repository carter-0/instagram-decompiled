package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.6K5  reason: invalid class name */
public final class AnonymousClass6K5 extends AnimatorListenerAdapter {
    public final /* synthetic */ C305946Ke A00;

    public AnonymousClass6K5(C305946Ke r1) {
        this.A00 = r1;
    }

    public final void onAnimationCancel(Animator animator) {
        C309426Yf r1 = this.A00.A00;
        if (r1 != null) {
            r1.A0t = false;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        C309426Yf r1 = this.A00.A00;
        if (r1 != null) {
            r1.A0t = true;
        }
    }
}
