package X;

import android.animation.Animator;

/* renamed from: X.7Ln  reason: invalid class name and case insensitive filesystem */
public final class C330127Ln implements Animator.AnimatorListener {
    public final /* synthetic */ C330107Ll A00;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public C330127Ln(C330107Ll r1) {
        this.A00 = r1;
    }

    public final void onAnimationRepeat(Animator animator) {
        C330107Ll r2 = this.A00;
        int i = r2.A04 + 1;
        r2.A04 = i;
        if (i == r2.A0A.getRepeatCount()) {
            r2.A0J.invoke();
        }
        r2.A03 = (r2.A03 + 1) % r2.A08.size();
    }
}
