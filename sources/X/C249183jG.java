package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.3jG  reason: invalid class name and case insensitive filesystem */
public final class C249183jG extends AnimatorListenerAdapter {
    public final /* synthetic */ 2Wa A00;
    public final /* synthetic */ 2Wa A01;

    public C249183jG(2Wa r1, 2Wa r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A01.A01(false);
        this.A00.A01(true);
    }
}
