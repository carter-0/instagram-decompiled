package X;

import android.animation.Animator;

/* renamed from: X.524  reason: invalid class name */
public final class AnonymousClass524 implements Animator.AnimatorListener {
    public final /* synthetic */ AnonymousClass523 A00;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public AnonymousClass524(AnonymousClass523 r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = AnonymousClass05K.A0C;
    }

    public final void onAnimationStart(Animator animator) {
        this.A00.A01 = AnonymousClass05K.A01;
    }
}
