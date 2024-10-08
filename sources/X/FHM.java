package X;

import android.animation.Animator;
import android.view.View;

public final class FHM implements Animator.AnimatorListener {
    public final /* synthetic */ Animator.AnimatorListener A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C310256ag A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public final void onAnimationRepeat(Animator animator) {
    }

    public FHM(Animator.AnimatorListener animatorListener, View view, C310256ag r3, boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = z2;
        this.A02 = r3;
        this.A00 = animatorListener;
        this.A01 = view;
    }

    public final void onAnimationCancel(Animator animator) {
        C310256ag r2 = this.A02;
        r2.A07.remove(this.A01);
        r2.A01();
    }

    public final void onAnimationEnd(Animator animator) {
        this.A02.A07.remove(this.A01);
    }

    public final void onAnimationStart(Animator animator) {
        if (this.A04 && !this.A03) {
            this.A02.A02(this.A00);
        }
    }
}
