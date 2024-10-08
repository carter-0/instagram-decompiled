package X;

import android.animation.Animator;

public final class AJD implements Animator.AnimatorListener {
    public final /* synthetic */ AnonymousClass8CV A00;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public AJD(AnonymousClass8CV r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        C252063oV r2 = this.A00.A04;
        r2.getView().setVisibility(8);
        r2.getView().setAlpha(1.0f);
    }
}
