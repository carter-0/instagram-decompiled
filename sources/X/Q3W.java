package X;

import android.animation.Animator;

public final class Q3W implements Animator.AnimatorPauseListener {
    public final /* synthetic */ C229612nk A00;
    public final /* synthetic */ String A01;

    public Q3W(C229612nk r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onAnimationPause(Animator animator) {
        C229612nk r0 = this.A00;
        if (r0 != null) {
            Q3X q3x = (Q3X) r0.A02.get(this.A01);
            if (q3x != null) {
                q3x.A01 = -1;
                q3x.A06 = false;
            }
        }
    }

    public final void onAnimationResume(Animator animator) {
        C229612nk r0 = this.A00;
        if (r0 != null) {
            Q3X q3x = (Q3X) r0.A02.get(this.A01);
            if (q3x != null) {
                q3x.A06 = true;
            }
        }
    }
}
