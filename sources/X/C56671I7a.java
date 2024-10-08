package X;

import android.animation.Animator;

/* renamed from: X.I7a  reason: case insensitive filesystem */
public final class C56671I7a implements Animator.AnimatorListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 2Wa A01;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public C56671I7a(2Wa r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final void onAnimationStart(Animator animator) {
        this.A01.A02(C51965G9l.A0e(this.A00));
    }
}
