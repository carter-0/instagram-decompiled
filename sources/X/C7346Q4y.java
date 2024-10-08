package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.Q4y  reason: case insensitive filesystem */
public final class C7346Q4y extends AnimatorListenerAdapter {
    public boolean A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C307896Rx A02;
    public final /* synthetic */ C277014uI A03;

    public final void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public final void onAnimationEnd(Animator animator) {
        0qQ.A0B(animator, 0);
        C308276Tl A0P = DbS.A0P();
        A0P.A03(animator, 0);
        A0P.A02(Boolean.valueOf(!this.A00));
        A0P.A03(this.A01, 2);
        C299275ur.A00(this.A02, A0P.A00(), this.A03);
        this.A00 = false;
    }

    public C7346Q4y(C307786Rm r1, C307896Rx r2, C277014uI r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }
}
