package X;

import android.animation.Animator;

/* renamed from: X.LTe  reason: case insensitive filesystem */
public final class C64196LTe implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ LRE A02;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public C64196LTe(LRE lre, int i, int i2) {
        this.A00 = i;
        this.A02 = lre;
        this.A01 = i2;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.A01 == 0) {
            this.A02.A0F.getView().setVisibility(8);
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (this.A00 == 0) {
            this.A02.A0F.getView().setVisibility(0);
        }
    }
}
