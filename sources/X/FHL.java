package X;

import android.animation.Animator;
import android.view.View;

public final class FHL implements Animator.AnimatorListener {
    public final /* synthetic */ Animator.AnimatorListener A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C310256ag A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public FHL(Animator.AnimatorListener animatorListener, View view, C310256ag r3, boolean z, boolean z2) {
        this.A02 = r3;
        this.A01 = view;
        this.A04 = z;
        this.A03 = z2;
        this.A00 = animatorListener;
    }

    public final void onAnimationEnd(Animator animator) {
        C310256ag r2 = this.A02;
        boolean contains = r2.A07.contains(this.A01);
        if (this.A04 && this.A03 && contains) {
            r2.A02(this.A00);
        }
    }
}
