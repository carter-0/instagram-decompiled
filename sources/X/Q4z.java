package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class Q4z extends AnimatorListenerAdapter {
    public final long A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Q4v A02;

    public final void onAnimationCancel(Animator animator) {
        0qQ.A0B(animator, 0);
        Q4v q4v = this.A02;
        if (q4v.A00 == 0 && animator.getStartDelay() != 0) {
            animator.setStartDelay(this.A00);
        }
        q4v.A00 = 0;
        q4v.A01 = true;
        Q4v.A00(q4v, new C66310MMt(q4v, 45));
    }

    public final void onAnimationEnd(Animator animator) {
        int i;
        0qQ.A0B(animator, 0);
        Q4v q4v = this.A02;
        if (q4v.A00 == 0 && animator.getStartDelay() != 0) {
            animator.setStartDelay(this.A00);
        }
        int i2 = q4v.A00 + 1;
        q4v.A00 = i2;
        if (q4v.A01 || ((i = this.A01) != -1 && i2 >= i)) {
            q4v.A00 = 0;
            q4v.A01 = false;
            Q4v.A00(q4v, new C66310MMt(q4v, 46));
            return;
        }
        animator.start();
    }

    public Q4z(Q4v q4v, int i) {
        this.A02 = q4v;
        this.A01 = i;
        this.A00 = q4v.A05.getStartDelay();
    }

    public final void onAnimationStart(Animator animator) {
        Q4v q4v = this.A02;
        if (q4v.A00 == 0) {
            Q4v.A00(q4v, new C66310MMt(q4v, 47));
        }
    }
}
