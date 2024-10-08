package X;

import android.animation.Animator;
import android.view.animation.OvershootInterpolator;
import com.instagram.android.R;

/* renamed from: X.I7h  reason: case insensitive filesystem */
public final class C56677I7h implements Animator.AnimatorListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public C56677I7h(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i2;
        this.A03 = obj6;
        this.A07 = obj4;
        this.A06 = obj2;
        this.A02 = obj7;
        this.A01 = i;
        this.A04 = obj3;
        this.A08 = obj5;
        this.A05 = obj;
    }

    public final void onAnimationEnd(Animator animator) {
        GZG gzg;
        int i = this.A00;
        boolean A1a = AnonymousClass7TE.A1a(this.A03);
        2Wa r0 = (2Wa) this.A07;
        if (i != 0) {
            if (A1a) {
                Boolean A0v = AnonymousClass7TE.A0v();
                r0.A01(A0v);
                ((2V5) this.A06).A00(C51968G9o.A0w(this.A01, (0sP) this.A02));
                ((C243673Zt) this.A04).A00(A0v);
                OvershootInterpolator overshootInterpolator = C53928GwY.A0r;
                gzg = ((C53928GwY) this.A08).A04;
            }
            C51971G9r.A1I(r0);
            ((2V5) this.A06).A00(C51968G9o.A0w(C244013aV.A02((AnonymousClass3Y5) this.A05, R.color.fds_transparent), (0sP) this.A02));
            return;
        }
        if (A1a) {
            Boolean A0v2 = AnonymousClass7TE.A0v();
            r0.A01(A0v2);
            ((2V5) this.A06).A00(C51968G9o.A0w(this.A01, (0sP) this.A02));
            ((C243673Zt) this.A04).A00(A0v2);
            OvershootInterpolator overshootInterpolator2 = C52646GaK.A0u;
            gzg = ((C52646GaK) this.A08).A04;
        }
        C51971G9r.A1I(r0);
        ((2V5) this.A06).A00(C51968G9o.A0w(C244013aV.A02((AnonymousClass3Y5) this.A05, R.color.fds_transparent), (0sP) this.A02));
        return;
        C62320sa r02 = gzg.A0B;
        if (r02 != null) {
            r02.invoke();
        }
    }
}
