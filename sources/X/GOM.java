package X;

import android.animation.Animator;

public final class GOM implements Animator.AnimatorListener {
    public final /* synthetic */ GOK A00;
    public final /* synthetic */ String A01;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public GOM(GOK gok, String str) {
        this.A00 = gok;
        this.A01 = str;
    }

    public final void onAnimationEnd(Animator animator) {
        ((0sP) this.A00.A01.A01).invoke(this.A01);
    }
}
