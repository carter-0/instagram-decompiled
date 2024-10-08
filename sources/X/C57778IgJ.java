package X;

import android.animation.Animator;

/* renamed from: X.IgJ  reason: case insensitive filesystem */
public final class C57778IgJ implements Runnable {
    public final /* synthetic */ C243673Zt A00;

    public C57778IgJ(C243673Zt r1) {
        this.A00 = r1;
    }

    public final void run() {
        C243673Zt r0 = this.A00;
        AnonymousClass2VL.A00();
        Animator animator = (Animator) r0.A00;
        if (animator != null) {
            animator.start();
        }
    }
}
