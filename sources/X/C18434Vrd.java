package X;

import android.animation.Animator;

/* renamed from: X.Vrd  reason: case insensitive filesystem */
public final class C18434Vrd {
    public C226492gu A00;
    public final UKL A01;

    public static final void A00(C18434Vrd vrd) {
        C226492gu r2 = vrd.A00;
        if (r2 != null) {
            UKL ukl = vrd.A01;
            if (ukl.A04) {
                r2.E2p();
            }
            int i = ukl.A01;
            if (i == 0) {
                r2.EFK();
            } else {
                r2.EFJ(i);
            }
            Animator.AnimatorListener animatorListener = ukl.A02;
            if (animatorListener != null) {
                r2.A8s(animatorListener);
            }
            r2.EL2(ukl.A00);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.UKL] */
    public C18434Vrd() {
        ? obj = new Object();
        obj.A03 = "";
        obj.A04 = true;
        obj.A01 = 1;
        obj.A02 = null;
        obj.A00 = 0.0f;
        this.A01 = obj;
    }
}
