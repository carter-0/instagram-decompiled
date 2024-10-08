package X;

import android.animation.Animator;
import android.view.View;

public final class I7Z implements Animator.AnimatorListener {
    public final /* synthetic */ C317026mb A00;
    public final /* synthetic */ JOR A01;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public I7Z(C317026mb r1, JOR jor) {
        this.A00 = r1;
        this.A01 = jor;
    }

    public final void onAnimationEnd(Animator animator) {
        C317026mb r0 = this.A00;
        JOR jor = this.A01;
        View view = r0.A01;
        view.setVisibility(8);
        view.setAlpha(1.0f);
        jor.Cv9();
    }
}
