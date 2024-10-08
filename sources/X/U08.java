package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class U08 extends AnimatorListenerAdapter {
    public final /* synthetic */ C309346Xx A00;

    public U08(C309346Xx r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C309346Xx r0 = this.A00;
        r0.A00();
        r0.A05.A00();
    }
}
