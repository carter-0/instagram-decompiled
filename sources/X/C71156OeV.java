package X;

import android.animation.Animator;

/* renamed from: X.OeV  reason: case insensitive filesystem */
public final class C71156OeV implements Animator.AnimatorListener {
    public final C62320sa A00;
    public final /* synthetic */ PMQ A01;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public C71156OeV(PMQ pmq, C62320sa r2) {
        this.A01 = pmq;
        this.A00 = r2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A00.invoke();
    }
}
