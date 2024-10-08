package X;

import android.animation.Animator;

public final class W43 implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C265924Wv A01;
    public final /* synthetic */ C19471WaJ A02;
    public final /* synthetic */ C310236ae A03;

    public final void onAnimationRepeat(Animator animator) {
    }

    public W43(C265924Wv r1, C19471WaJ waJ, C310236ae r3, int i) {
        this.A03 = r3;
        this.A00 = i;
        this.A02 = waJ;
        this.A01 = r1;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.A00 != this.A02.A00()) {
            this.A01.A00();
        }
        this.A03.A0F.EHd();
        animator.removeListener(this);
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.A00 != this.A02.A00()) {
            this.A01.A00();
        }
        this.A03.A0F.EHd();
        animator.removeListener(this);
    }

    public final void onAnimationStart(Animator animator) {
        this.A03.A0F.EHY("tapped");
    }
}
