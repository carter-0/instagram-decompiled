package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

public final class AJM implements Animator.AnimatorListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass8GB A02;
    public final /* synthetic */ Runnable A03;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public AJM(View view, AnonymousClass8GB r2, Runnable runnable, float f) {
        this.A02 = r2;
        this.A01 = view;
        this.A00 = f;
        this.A03 = runnable;
    }

    public final void onAnimationEnd(Animator animator) {
        AnonymousClass8GB r1 = this.A02;
        ObjectAnimator objectAnimator = r1.A00;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            r1.A00 = null;
        }
        Runnable runnable = this.A03;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void onAnimationStart(Animator animator) {
        View view = this.A01;
        view.setVisibility(0);
        float f = this.A00;
        if (f == -1.0f) {
            f = 0.0f;
        }
        view.setAlpha(f);
    }
}
