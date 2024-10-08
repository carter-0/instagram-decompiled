package X;

import android.animation.Animator;

public final class W41 implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C265924Wv A01;
    public final /* synthetic */ C19471WaJ A02;

    public final void onAnimationCancel(Animator animator) {
        0qQ.A0B(animator, 0);
        if (this.A00 != this.A02.A00()) {
            this.A01.A00();
        }
        animator.removeListener(this);
    }

    public final void onAnimationEnd(Animator animator) {
        0qQ.A0B(animator, 0);
        if (this.A00 != this.A02.A00()) {
            this.A01.A00();
        }
        animator.removeListener(this);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public W41(C265924Wv r1, C19471WaJ waJ, int i) {
        this.A00 = i;
        this.A02 = waJ;
        this.A01 = r1;
    }
}
