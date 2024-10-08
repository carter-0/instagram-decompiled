package X;

import android.content.Context;

/* renamed from: X.3ct  reason: invalid class name and case insensitive filesystem */
public final class C245433ct extends 2Tg implements C251273mq {
    public static final C245443cu A07 = new Object();
    public static final C253183qL A08 = new C245463cw();
    public static final C253183qL A09 = new C245453cv();
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final C251273mq A04;
    public final 2Sd A05;
    public final String A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C245433ct(android.util.SparseArray r14, X.C251263mp r15, X.2V1 r16, X.2TG r17, java.lang.String r18, int r19, int r20, int r21, long r22) {
        /*
            r13 = this;
            r4 = r15
            java.lang.Integer r0 = r15.A0G()
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            if (r0 != r7) goto L_0x000b
            java.lang.Integer r7 = X.AnonymousClass05K.A00
        L_0x000b:
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r21
            r13.A03 = r0
            X.3qL r1 = A09
            X.3ar r0 = new X.3ar
            r0.<init>(r1, r13)
            r1 = 0
            X.3ar[] r0 = new X.C244233ar[]{r0}
            r0 = r0[r1]
            r13.A0D(r0)
            X.3qL r1 = A08
            X.3ar r0 = new X.3ar
            r0.<init>(r1, r13)
            r13.A0C(r0)
            boolean r0 = r15 instanceof X.C251253mo
            if (r0 == 0) goto L_0x0054
            r0 = r4
            X.3mo r0 = (X.C251253mo) r0
            X.2Sd r0 = r0.Bdg()
        L_0x0046:
            r13.A05 = r0
            java.lang.String r0 = r15.A0J()
            X.0qQ.A07(r0)
            r13.A06 = r0
            r13.A04 = r13
            return
        L_0x0054:
            X.2Sc r0 = X.2Sc.A00
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245433ct.<init>(android.util.SparseArray, X.3mp, X.2V1, X.2TG, java.lang.String, int, int, int, long):void");
    }

    public final void A05() {
        this.A01 = false;
        this.A02 = false;
    }

    public final void A06() {
        this.A01 = true;
    }

    public final Object ALg(Context context) {
        0qQ.A0B(context, 0);
        Object A0I = this.A03.A0I(context);
        0qQ.A07(A0I);
        return A0I;
    }

    public final 2Ue D6k(int i) {
        try {
            C251263mp r1 = this.A03;
            if (r1 instanceof C251253mo) {
                return ((C251253mo) r1).D6k(i);
            }
        } catch (Exception e) {
            2V1 r0 = this.A04;
            if (r0 != null) {
                2Vb.A03(r0, e);
            }
        }
        return null;
    }

    public final String A04() {
        return this.A06;
    }

    public final C251273mq A0I() {
        return this.A04;
    }

    public final /* synthetic */ boolean AFh() {
        return false;
    }

    public final Object Bdd() {
        return this.A03.getClass();
    }

    public final 2Sd Bdg() {
        return this.A05;
    }

    public final int E2z() {
        C251263mp r1 = this.A03;
        if (r1 instanceof C251253mo) {
            return ((C251253mo) r1).E2z();
        }
        return 3;
    }
}
