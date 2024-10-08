package X;

/* renamed from: X.GvK  reason: case insensitive filesystem */
public final class C53853GvK extends C251343mx {
    public final C52706GbJ A00;
    public final HIE A01;
    public final 0sP A02;
    public final 0sL A03;
    public final boolean A04;
    public final 2WX A05;
    public final HMY A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C53853GvK(2WX r2, C52706GbJ gbJ, HIE hie, HMY hmy, 0sP r6, 0sL r7, boolean z, boolean z2, boolean z3, boolean z4) {
        DbW.A1N(hie, 1, hmy);
        0qQ.A0B(gbJ, 9);
        this.A01 = hie;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = hmy;
        this.A04 = z4;
        this.A03 = r7;
        this.A02 = r6;
        this.A00 = gbJ;
        this.A05 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r23) {
        /*
            r22 = this;
            r7 = 0
            r8 = r23
            X.0qQ.A0B(r8, r7)
            r9 = r22
            X.HIE r11 = r9.A01
            X.JMR r0 = r11.A00
            boolean r3 = r0 instanceof X.C57568Icv
            X.HtY r2 = r11.A03
            r10 = 0
            if (r2 == 0) goto L_0x00d7
            java.lang.Integer r1 = r2.A02
        L_0x0015:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x00be
            if (r2 == 0) goto L_0x00bb
            java.lang.Integer r1 = r2.A02
        L_0x001d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x00be
            X.0sn r0 = X.0sn.A00
        L_0x0023:
            java.lang.String r6 = "emu-edit-buttons-appear-disappear"
            X.3Zd r1 = X.2Vi.A04
            X.4Ey r4 = X.C51973G9u.A0a(r1, r6)
            r3 = 150(0x96, float:2.1E-43)
            android.view.animation.LinearInterpolator r2 = new android.view.animation.LinearInterpolator
            r2.<init>()
            X.4Ex r1 = new X.4Ex
            r1.<init>(r2, r3)
            r4.A02 = r1
            X.AnonymousClass4F7.A00(r8, r4)
            X.3XV r1 = X.2WX.A02
            long r4 = X.C51970G9q.A0D()
            long r1 = X.C51969G9p.A0F()
            java.lang.Integer r3 = X.AnonymousClass05K.A08
            X.9JR r4 = X.C51965G9l.A0c(r3, r7, r4)
            X.2WX r2 = X.C51974G9v.A0F(r10, r4, r7, r1)
            X.2WX r1 = r9.A05
            X.2WX r5 = r2.A00(r1)
            X.2Wb r4 = X.C51972G9s.A0Q(r8)
            boolean r1 = r9.A07
            r16 = r1
            boolean r15 = r9.A08
            boolean r14 = r9.A09
            X.HMY r13 = r9.A06
            java.lang.Integer r1 = X.AnonymousClass05K.A0X
            long r17 = X.I61.A02(r4, r1)
            r1 = 13
            X.JG0 r12 = new X.JG0
            r12.<init>(r1, r4, r9)
            X.0sP r2 = r9.A02
            X.GwC r1 = new X.GwC
            r19 = r16
            r20 = r15
            r21 = r14
            r15 = r2
            r16 = r12
            r14 = r13
            r13 = r11
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17, r19, r20, r21)
            r4.A00(r1)
            X.HQ0 r1 = r11.A01
            boolean r1 = r1 instanceof X.C54521HHh
            if (r1 == 0) goto L_0x00b6
            r2 = 1120403456(0x42c80000, float:100.0)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.2WX r10 = X.C51971G9r.A0X(r10, r1, r2, r7)
            r1 = 4627448617123184640(0x4038000000000000, double:24.0)
            X.2WX r3 = X.C51973G9u.A0X(r10, r3, r1, r7)
            X.2V1 r2 = r4.A00
            X.3Zd r1 = X.C243533Zd.LOCAL
            X.2WX r6 = X.C51971G9r.A0V(r2, r3, r1, r6)
            X.2Wb r3 = X.AnonymousClass7TG.A0S(r2)
            r1 = 14
            X.JG0 r2 = new X.JG0
            r2.<init>(r1, r3, r9)
            X.Gvr r1 = new X.Gvr
            r1.<init>(r0, r2)
            X.C51971G9r.A1D(r1, r3, r4, r6)
        L_0x00b6:
            X.2Tl r0 = X.C243563Zg.A05(r4, r8, r5)
            return r0
        L_0x00bb:
            r1 = r10
            goto L_0x001d
        L_0x00be:
            X.HHY r2 = new X.HHY
            r2.<init>(r3)
            X.HHa r1 = new X.HHa
            r1.<init>(r3)
            X.HHZ r0 = new X.HHZ
            r0.<init>(r3)
            X.HoM[] r0 = new X.C55839HoM[]{r2, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            goto L_0x0023
        L_0x00d7:
            r1 = r10
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53853GvK.A0X(X.3Y5):X.3mp");
    }
}
