package X;

import android.animation.Animator;

public final class AJL implements Animator.AnimatorListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ B3f A01;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public AJL(B3f b3f, float f) {
        this.A01 = b3f;
        this.A00 = f;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A01.EjE(this.A00);
    }
}
