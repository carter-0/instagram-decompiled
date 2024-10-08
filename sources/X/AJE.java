package X;

import android.animation.Animator;
import android.view.View;

public final class AJE implements Animator.AnimatorListener {
    public final /* synthetic */ View A00;

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public AJE(View view) {
        this.A00 = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.A00.setRotation(0.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.A00.setRotation(0.0f);
    }
}
