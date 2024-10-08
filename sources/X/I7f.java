package X;

import android.animation.Animator;

public final class I7f implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 2Wa A01;
    public final /* synthetic */ 2Wa A02;
    public final /* synthetic */ boolean A03;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public I7f(2Wa r1, 2Wa r2, int i, boolean z) {
        this.A03 = z;
        this.A02 = r1;
        this.A00 = i;
        this.A01 = r2;
    }

    public final void onAnimationStart(Animator animator) {
        if (this.A03) {
            C51967G9n.A1H(this.A02, this.A00);
            this.A01.A00();
        }
    }
}
