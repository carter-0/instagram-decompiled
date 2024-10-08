package X;

import android.animation.Animator;

public final class FHG implements Animator.AnimatorListener {
    public final /* synthetic */ C226432go A00;

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public FHG(C226432go r1) {
        this.A00 = r1;
    }

    public final void onAnimationCancel(Animator animator) {
        this.A00.A01();
    }

    public final void onAnimationEnd(Animator animator) {
        this.A00.A01();
    }
}
