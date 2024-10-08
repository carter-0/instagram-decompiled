package X;

import android.animation.Animator;
import android.view.animation.OvershootInterpolator;

/* renamed from: X.I7g  reason: case insensitive filesystem */
public final class C56676I7g implements Animator.AnimatorListener {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public C56676I7g(int i, long j, long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A03 = obj5;
        this.A05 = obj;
        this.A04 = obj2;
        this.A07 = obj4;
        this.A06 = obj3;
        this.A02 = j;
        this.A01 = j2;
    }

    public final void onAnimationStart(Animator animator) {
        2Wa r2;
        long j;
        2Wa r3;
        0eP r0;
        int i;
        int i2 = this.A00;
        boolean A1a = AnonymousClass7TE.A1a(this.A03);
        if (i2 != 0) {
            if (A1a) {
                C53928GwY gwY = (C53928GwY) this.A07;
                ((2Wa) this.A05).A03(J6P.A00(gwY, 9));
                r3 = (2Wa) this.A04;
                OvershootInterpolator overshootInterpolator = C53928GwY.A0r;
                r0 = gwY.A08;
            }
            ((2Wa) this.A04).A01(C51967G9n.A0k());
            r2 = (2Wa) this.A06;
            j = this.A01;
            r2.A01(C51965G9l.A0e(j));
        }
        if (A1a) {
            C52646GaK gaK = (C52646GaK) this.A07;
            ((2Wa) this.A05).A03(new MP8(gaK, 3));
            r3 = (2Wa) this.A04;
            OvershootInterpolator overshootInterpolator2 = C52646GaK.A0u;
            r0 = gaK.A08;
        }
        ((2Wa) this.A04).A01(C51967G9n.A0k());
        r2 = (2Wa) this.A06;
        j = this.A01;
        r2.A01(C51965G9l.A0e(j));
        if (r0 != null) {
            Number number = (Number) r0.A01;
            if (number.intValue() != 0) {
                i = number.intValue();
                C51967G9n.A1H(r3, i);
                r2 = (2Wa) this.A06;
                j = this.A02;
                r2.A01(C51965G9l.A0e(j));
            }
        }
        i = 12;
        C51967G9n.A1H(r3, i);
        r2 = (2Wa) this.A06;
        j = this.A02;
        r2.A01(C51965G9l.A0e(j));
    }
}
