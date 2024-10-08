package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.List;

public final class ICX implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    public ICX(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A06 = z;
        this.A04 = obj4;
        this.A05 = obj3;
        this.A01 = i;
        this.A03 = obj;
    }

    public final void onClick(View view) {
        int A052;
        int i;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        if (this.A00 != 0) {
            A052 = AnonymousClass0fD.A05(995355577);
            W27 w27 = (W27) this.A05;
            VX6 vx6 = w27.A05;
            vx6.A02.put(this.A04, (Object) null);
            W27.A02(w27, (List) this.A03, C331127Pr.A1W, this.A01 - 1, this.A06);
            i = 300383331;
        } else {
            A052 = AnonymousClass0fD.A05(-724900437);
            C278014w6 r6 = (C278014w6) this.A02;
            Integer A012 = I2I.A01(r6);
            if (A012 == null) {
                i = -240757056;
            } else {
                int intValue = A012.intValue();
                if (intValue != 2) {
                    if (intValue == 3) {
                        ((C246453ed) this.A04).DVE(r6, (AnonymousClass1Xp) this.A05, this.A01);
                    } else if (intValue != 0) {
                        if (intValue == 4) {
                            ((C246453ed) this.A04).D8I(r6, (AnonymousClass1Xp) this.A05, this.A01);
                        } else if (intValue != 1) {
                            C20561Wub A1K = AnonymousClass7TE.A1K();
                            AnonymousClass0fD.A0C(667315261, A052);
                            throw A1K;
                        }
                    }
                } else if (!this.A06) {
                    ((C246453ed) this.A04).D1v(r6, (AnonymousClass1Xp) this.A05, this.A01);
                    i = 1749474661;
                } else {
                    View view2 = (View) this.A03;
                    C52774GcR gcR = new C52774GcR(r6, (AnonymousClass1Xp) this.A05, (C246453ed) this.A04, this.A01);
                    if (!(view2 == null || (animate = view2.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(200)) == null)) {
                        duration.setListener(gcR);
                    }
                }
                i = 1372614244;
            }
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
