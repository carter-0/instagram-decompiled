package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class U0B extends AnimatorListenerAdapter {
    public final /* synthetic */ C62320sa A00;

    public final void onAnimationStart(Animator animator) {
    }

    public U0B(C62320sa r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A00.invoke();
    }
}
