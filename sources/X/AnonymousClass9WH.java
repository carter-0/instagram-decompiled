package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.9WH  reason: invalid class name */
public final class AnonymousClass9WH extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass7VH A00;

    public AnonymousClass9WH(AnonymousClass7VH r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A00.A04 = false;
    }

    public final void onAnimationStart(Animator animator) {
        this.A00.A04 = true;
    }
}
