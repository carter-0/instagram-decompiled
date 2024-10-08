package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;

public final class I7X implements Animator.AnimatorListener {
    public final /* synthetic */ AnimatorSet A00;
    public final /* synthetic */ View A01;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public I7X(AnimatorSet animatorSet, View view) {
        this.A01 = view;
        this.A00 = animatorSet;
    }

    public final void onAnimationEnd(Animator animator) {
        AnonymousClass7TH.A0R(this.A01);
        this.A00.removeAllListeners();
    }
}
