package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Guv  reason: case insensitive filesystem */
public final class C53828Guv extends C251343mx {
    public final UserSession A00;
    public final C70804OLz A01;
    public final C55844HoR A02;
    public final C60314JjH A03;
    public final AnonymousClass4DU A04;
    public final C335907dj A05;
    public final C334297b2 A06;
    public final boolean A07;

    public C53828Guv(C335907dj r2, C334297b2 r3, UserSession userSession, C70804OLz oLz, C55844HoR hoR, C60314JjH jjH, AnonymousClass4DU r8, boolean z) {
        C51974G9v.A0d(1, userSession, oLz, hoR, jjH);
        AnonymousClass7TF.A1F(r8, 7, r3);
        this.A00 = userSession;
        this.A05 = r2;
        this.A07 = z;
        this.A01 = oLz;
        this.A02 = hoR;
        this.A03 = jjH;
        this.A04 = r8;
        this.A06 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r14.intValue() <= 0) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        if (r5 != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r8.A05.A0W != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r31) {
        /*
            r30 = this;
            r4 = 0
            r29 = r31
            r0 = r29
            X.0qQ.A0B(r0, r4)
            r8 = r30
            boolean r11 = r8.A07
            if (r11 == 0) goto L_0x0015
            X.7dj r0 = r8.A05
            boolean r0 = r0.A0W
            r10 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r10 = 0
        L_0x0016:
            X.3XV r1 = X.2WX.A02
            X.7dj r3 = r8.A05
            X.7b2 r0 = r8.A06
            X.2WX r7 = X.C336827fF.A00(r1, r3, r0)
            boolean r9 = r3.A0V
            r0 = 16
            if (r9 == 0) goto L_0x0027
            r0 = 0
        L_0x0027:
            long r5 = X.C51965G9l.A07(r0)
            java.lang.Integer r14 = r3.A0G
            if (r14 == 0) goto L_0x0037
            int r1 = r14.intValue()
            r0 = 10
            if (r1 > 0) goto L_0x0039
        L_0x0037:
            r0 = 12
        L_0x0039:
            long r0 = X.C51965G9l.A07(r0)
            int r2 = X.DbW.A01(r9)
            long r15 = X.C51965G9l.A07(r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            r12 = 0
            X.2WX r5 = X.AnonymousClass9JR.A00(r7, r2, r4, r5)
            X.9JR r2 = X.C51967G9n.A0V(r15)
            X.2WX r1 = X.C51974G9v.A0E(r5, r2, r4, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L_0x005b
            r0 = 1057803469(0x3f0ccccd, float:0.55)
        L_0x005b:
            X.2WX r16 = X.C52112GFg.A01(r1, r0)
            X.2Wb r2 = X.C51972G9s.A0Q(r29)
            r0 = 1120403456(0x42c80000, float:100.0)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            X.2WX r13 = X.C51971G9r.A0X(r12, r5, r0, r4)
            X.2Wb r10 = X.G9t.A0w(r2)
            long r0 = X.G9w.A04()
            X.2WX r1 = X.C51974G9v.A0M(r12, r5, r4, r0)
            r0 = 2131970052(0x7f134804, float:1.9577044E38)
            X.2WX r6 = X.C51973G9u.A0U(r1, r10, r0)
            r5 = 0
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 1
            X.2WX r6 = X.C51971G9r.A0X(r6, r1, r5, r0)
            X.7fv r1 = r3.A02
            if (r1 == 0) goto L_0x0091
            boolean r5 = r1.A0A
            r1 = 1058642330(0x3f19999a, float:0.6)
            if (r5 == 0) goto L_0x0093
        L_0x0091:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0093:
            X.2WX r6 = X.C52112GFg.A01(r6, r1)
            r5 = 29
            X.PqX r1 = new X.PqX
            r1.<init>((int) r5, (java.lang.Object) r3, (java.lang.Object) r8)
            X.2WX r18 = X.C51973G9u.A0Z(r6, r1)
            com.instagram.user.model.User r1 = r3.A0C
            com.instagram.common.typedurl.ImageUrl r20 = r1.Bh3()
            X.4DU r1 = r8.A04
            r28 = r1
            r1 = 2131099948(0x7f06012c, float:1.7812264E38)
            int r22 = X.C244013aV.A02(r10, r1)
            r24 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.3bC r1 = new X.3bC
            r25 = r4
            r26 = r0
            r27 = r4
            r19 = r28
            r21 = r12
            r23 = r4
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r10.A00(r1)
            com.instagram.common.session.UserSession r6 = r8.A00
            X.OLz r5 = r8.A01
            X.HoR r7 = r8.A02
            X.JjH r15 = r8.A03
            X.Gtx r1 = new X.Gtx
            r17 = r1
            r18 = r3
            r19 = r6
            r20 = r5
            r21 = r7
            r22 = r15
            r17.<init>(r18, r19, r20, r21, r22)
            r10.A00(r1)
            X.2Tp r1 = X.C243563Zg.A0D(r10, r2, r13)
            r2.A00(r1)
            X.2V1 r13 = r2.Aqq()
            android.content.Context r18 = X.C51965G9l.A0B(r13)
            r25 = 1
            if (r9 != 0) goto L_0x017f
            java.lang.Boolean r1 = r3.A0E
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r0)
            if (r0 == 0) goto L_0x017f
        L_0x0102:
            r19 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x0109
            r19 = 1057803469(0x3f0ccccd, float:0.55)
        L_0x0109:
            r20 = 13
            r21 = 25
            r22 = 10
            r23 = -13
            X.HA9 r8 = new X.HA9
            r17 = r8
            r24 = r4
            r26 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r11 = r8.A0A
            r0 = 40
            if (r11 == 0) goto L_0x0123
            r0 = 0
        L_0x0123:
            long r0 = X.C51965G9l.A07(r0)
            X.2WX r10 = X.C51972G9s.A0S(r12, r4, r0)
            X.2Wb r9 = X.AnonymousClass7TG.A0S(r13)
            if (r11 == 0) goto L_0x0139
            X.Gs0 r0 = new X.Gs0
            r0.<init>(r8, r7)
            r9.A00(r0)
        L_0x0139:
            X.2Wb r8 = X.G9t.A0w(r9)
            if (r14 == 0) goto L_0x014f
            int r0 = r14.intValue()
            if (r0 <= 0) goto L_0x014f
            X.GtL r1 = new X.GtL
            r0 = r28
            r1.<init>(r3, r5, r7, r0)
            r8.A00(r1)
        L_0x014f:
            X.0Tu r7 = X.0Tu.A05
            r0 = 36319407397215595(0x81084f005d1d6b, double:3.0318777122896133E-306)
            boolean r7 = X.182.A06(r7, r6, r0)
            java.lang.String r0 = r5.A0A
            boolean r1 = X.C51966G9m.A1W(r6, r0)
            X.Gw1 r0 = new X.Gw1
            r0.<init>(r3, r15, r7, r1)
            X.C51971G9r.A1D(r0, r8, r9, r10)
            java.util.List r0 = r9.A01
            X.2Tp r3 = new X.2Tp
            r5 = r3
            r6 = r12
            r7 = r12
            r8 = r12
            r9 = r12
            r10 = r0
            r11 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1 = r29
            r0 = r16
            X.2Tl r0 = X.C51967G9n.A0N(r3, r2, r1, r0)
            return r0
        L_0x017f:
            r25 = 0
            goto L_0x0102
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53828Guv.A0X(X.3Y5):X.3mp");
    }
}
