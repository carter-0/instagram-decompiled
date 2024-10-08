package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.GcT  reason: case insensitive filesystem */
public final class C52776GcT extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C323646xs A01;

    public C52776GcT(C323646xs r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A01.A01 = this.A00;
    }

    public final void onAnimationStart(Animator animator) {
        this.A01.A01 = this.A00;
    }
}
