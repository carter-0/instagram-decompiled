package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.GcR  reason: case insensitive filesystem */
public final class C52774GcR extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C278014w6 A01;
    public final /* synthetic */ AnonymousClass1Xp A02;
    public final /* synthetic */ C246453ed A03;

    public final void onAnimationEnd(Animator animator) {
        0qQ.A0B(animator, 0);
        super.onAnimationEnd(animator);
        this.A03.D1v(this.A01, this.A02, this.A00);
    }

    public C52774GcR(C278014w6 r1, AnonymousClass1Xp r2, C246453ed r3, int i) {
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r1;
    }
}
