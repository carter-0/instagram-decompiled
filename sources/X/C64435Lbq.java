package X;

import android.graphics.Paint;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: X.Lbq  reason: case insensitive filesystem */
public final class C64435Lbq implements C252203oj {
    public static final C71392co A08 = C71392co.A04(70.0d, 5.0d);
    public MXG A00;
    public MXG A01;
    public final MXG A02;
    public final Stack A03 = new Stack();
    public final 2cs A04;
    public final UserSession A05;
    public final C66439MRt A06;
    public final List A07 = AnonymousClass7TE.A1C();

    public C64435Lbq(UserSession userSession, C66439MRt mRt, MXG mxg, List list) {
        0qQ.A0B(userSession, 1);
        this.A05 = userSession;
        this.A02 = mxg;
        this.A06 = mRt;
        for (Object add : list) {
            ((AbstractCollection) this.A07).add(add);
        }
        MXG mxg2 = this.A02;
        ((AbstractCollection) this.A07).add(mxg2);
        this.A00 = mxg2;
        this.A01 = mxg2;
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A09(A08);
        A0J.A0A(this);
        A0J.A06 = true;
        this.A04 = A0J;
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r6) {
        0qQ.A0B(r6, 0);
        float f = (float) r6.A01;
        float f2 = 1.0f;
        if (f == 1.0f) {
            f2 = 0.0f;
        }
        float A022 = 0mi.A02(JTO.A03(r6), f2, f, 0.0f, 1.0f);
        A00(A022);
        this.A06.DSD(this.A00, this.A01, A022);
    }

    private final void A00(float f) {
        for (MXG mxg : this.A07) {
            if (mxg == this.A01) {
                Iterator it = mxg.Acf().iterator();
                while (it.hasNext()) {
                    View A0H = JTO.A0H(it);
                    int i = 4;
                    if (f < 1.0f) {
                        i = 0;
                    }
                    A0H.setVisibility(i);
                    A0H.setAlpha(1.0f - f);
                }
            } else if (mxg == this.A00) {
                Iterator it2 = mxg.Acf().iterator();
                while (it2.hasNext()) {
                    View A0H2 = JTO.A0H(it2);
                    A0H2.setVisibility(0);
                    A0H2.setAlpha(f);
                }
            }
        }
    }

    private final void A01(boolean z) {
        2cc A002 = C71342cb.A00(this.A05);
        A002.A0D(this.A01, (String) null, 0);
        this.A00.E0h();
        A002.A0E(C66579MXk.A00(144), this.A00);
        float f = 0.0f;
        A00(0.0f);
        2cs r4 = this.A04;
        if (((float) r4.A01) != 1.0f) {
            f = 1.0f;
        }
        double d = (double) f;
        if (z) {
            r4.A06(d);
            return;
        }
        r4.A08(d, true);
        DmC(r4);
    }

    public final void A02(MXG mxg, boolean z) {
        MXG mxg2 = this.A00;
        if (mxg != mxg2) {
            this.A01 = mxg2;
            Stack stack = this.A03;
            stack.add(mxg2);
            this.A00 = mxg;
            ((MXG) stack.peek()).close();
            A01(z);
        }
    }

    public final boolean A03() {
        boolean CII = this.A00.CII();
        if (CII || this.A00 == this.A02) {
            return CII;
        }
        Stack stack = this.A03;
        if (!stack.isEmpty()) {
            this.A00.close();
            this.A01 = this.A00;
            this.A00 = (MXG) stack.pop();
            A01(true);
        }
        return true;
    }

    public final void DmB(2cs r6) {
        for (MXG mxg : this.A07) {
            if (mxg == this.A01 || mxg == this.A00) {
                Iterator it = mxg.Acf().iterator();
                while (it.hasNext()) {
                    JTO.A0H(it).setLayerType(2, (Paint) null);
                }
            }
        }
        A00(0.0f);
    }

    public final void DmC(2cs r6) {
        for (MXG Acf : this.A07) {
            Iterator it = Acf.Acf().iterator();
            while (it.hasNext()) {
                JTO.A0H(it).setLayerType(0, (Paint) null);
            }
        }
        A00(1.0f);
        this.A00.Dfq();
        this.A01.Cw3();
    }
}
