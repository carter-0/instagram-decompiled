package X;

import android.animation.Animator;
import android.view.View;

public final class FHK implements Animator.AnimatorListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C310256ag A01;

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public FHK(View view, C310256ag r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.A01.A07.remove(this.A00);
    }

    public final void onAnimationEnd(Animator animator) {
        this.A01.A07.remove(this.A00);
    }
}
