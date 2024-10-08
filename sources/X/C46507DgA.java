package X;

import android.animation.Animator;

/* renamed from: X.DgA  reason: case insensitive filesystem */
public final class C46507DgA implements Animator.AnimatorListener {
    public final /* synthetic */ C310256ag A00;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public C46507DgA(C310256ag r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        C310256ag r1 = this.A00;
        r1.A01 = null;
        r1.A01();
    }

    public final void onAnimationStart(Animator animator) {
        C293755lI.A00("countdown_sticker_confetti");
    }
}
