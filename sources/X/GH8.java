package X;

import com.instagram.common.session.UserSession;

public final class GH8 extends C251343mx {
    public final GJ5 A00;
    public final GEG A01;
    public final C267324bN A02;
    public final JTB A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final C52058GDe A07;
    public final UserSession A08;
    public final AnonymousClass4DU A09;
    public final GPZ A0A;
    public final C51987GAk A0B;
    public final C59526JMy A0C;
    public final C59527JMz A0D;
    public final C52046GCs A0E;
    public final String A0F = "trans_key_clips_cta";
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;

    /* JADX WARNING: type inference failed for: r4v6, types: [X.3mp] */
    /* JADX WARNING: type inference failed for: r19v2, types: [X.Guq] */
    /* JADX WARNING: type inference failed for: r20v5, types: [X.GOi] */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        if (X.C51969G9p.A1X(r9, r3, r0.A01(r3)) == false) goto L_0x005f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r49) {
        /*
            r48 = this;
            r10 = 0
            r11 = r49
            X.0qQ.A0B(r11, r10)
            r12 = r48
            X.4bN r9 = r12.A02
            X.1Xj r8 = r9.A02
            r2 = 0
            if (r8 == 0) goto L_0x01f7
            boolean r0 = r12.A0G
            if (r0 != 0) goto L_0x01f7
            boolean r0 = r12.A04
            r19 = r0
            if (r0 == 0) goto L_0x01ea
            X.3OA r0 = r9.A06()
            X.3y6 r1 = r0.A0E
        L_0x001f:
            X.GDe r7 = r12.A07
            X.3W1 r4 = r7.A0E
            if (r4 == 0) goto L_0x01e7
            r3 = 74
            r0 = 17
            X.J6P r0 = X.J6P.A00(r4, r0)
            X.2Wa r0 = X.C243753a2.A01(r11, r4, r0, r3, r10)
        L_0x0031:
            r18 = 1
            if (r0 == 0) goto L_0x005f
            boolean r0 = X.C51969G9p.A1V(r0)
            if (r0 != 0) goto L_0x005f
            X.1Xj r0 = r9.A02
            if (r0 == 0) goto L_0x01e4
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.ClipsTrialDict r0 = r0.AoL()
            if (r0 == 0) goto L_0x01e4
            com.instagram.api.schemas.MediaTrialStatus r3 = r0.BzK()
        L_0x004b:
            com.instagram.api.schemas.MediaTrialStatus r0 = com.instagram.api.schemas.MediaTrialStatus.ACTIVE
            if (r3 != r0) goto L_0x005f
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r3 = r12.A08
            com.instagram.user.model.User r0 = r0.A01(r3)
            boolean r0 = X.C51969G9p.A1X(r9, r3, r0)
            r17 = 1
            if (r0 != 0) goto L_0x0061
        L_0x005f:
            r17 = 0
        L_0x0061:
            com.instagram.common.session.UserSession r0 = r12.A08
            r47 = r0
            X.GEG r0 = r12.A01
            r46 = r0
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r19)
            X.GJ5 r3 = r12.A00
            boolean r0 = r12.A05
            r42 = r0
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r42)
            r21 = r46
            r22 = r1
            r24 = r3
            r20 = r47
            java.lang.Object[] r3 = new java.lang.Object[]{r20, r21, r22, r23, r24, r25}
            r0 = 21
            X.Iw1 r0 = X.C58692Iw1.A00(r1, r12, r0)
            java.lang.Object r14 = X.AnonymousClass3Zw.A00(r11, r0, r3)
            X.GHk r14 = (X.C52168GHk) r14
            X.3XV r16 = X.2WX.A02
            X.2V1 r4 = r11.A05
            boolean r13 = r14.A02
            if (r13 != 0) goto L_0x01e0
            boolean r0 = r14.A01
            if (r0 != 0) goto L_0x01e0
            java.lang.String r3 = "trans_key_full_width_footer"
        L_0x009d:
            X.3Zd r0 = X.C243533Zd.GLOBAL
            X.2WX r6 = X.C51971G9r.A0V(r4, r2, r0, r3)
            java.lang.Integer r3 = X.AnonymousClass05K.A0D
            java.lang.String r0 = "clips_full_width_footer_component"
            r5 = 4
            X.2WX r0 = X.C51971G9r.A0Y(r2, r3, r0, r5)
            X.2WX r6 = r0.A00(r6)
            r0 = 15
            X.J6P r15 = X.J6P.A00(r12, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.3at r3 = new X.3at
            r3.<init>(r0, r15, r2)
            r0 = r16
            if (r6 != r0) goto L_0x00c2
            r6 = r2
        L_0x00c2:
            X.2WX r6 = X.C51965G9l.A0X(r6, r3)
            r0 = 16
            X.J6P r3 = X.J6P.A00(r12, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            X.2WX r16 = X.C51971G9r.A0Y(r6, r0, r3, r5)
            X.2Wb r6 = X.AnonymousClass7TG.A0S(r4)
            boolean r0 = r12.A0S
            if (r0 != 0) goto L_0x0157
            boolean r0 = r14.A00
            if (r0 == 0) goto L_0x0157
            X.JMz r0 = r12.A0D
            r28 = r0
            X.JMy r0 = r12.A0C
            r27 = r0
            X.GPZ r3 = r12.A0A
            if (r3 == 0) goto L_0x01dc
            java.lang.String r0 = r3.A02
            r31 = r0
        L_0x00ee:
            X.GAk r0 = r12.A0B
            r26 = r0
            boolean r0 = r12.A0H
            r36 = r0
            boolean r0 = r12.A0I
            r37 = r0
            boolean r0 = r12.A0R
            java.lang.Boolean r30 = java.lang.Boolean.valueOf(r0)
            if (r3 == 0) goto L_0x01d9
            X.0sa r15 = r3.A03
        L_0x0104:
            X.4DU r0 = r12.A09
            r24 = r0
            X.GCs r0 = r12.A0E
            r29 = r0
            if (r3 == 0) goto L_0x01d5
            java.lang.String r5 = r3.A01
            java.lang.String r4 = r3.A00
        L_0x0112:
            boolean r0 = r12.A0J
            r38 = r0
            boolean r0 = r12.A0L
            r39 = r0
            boolean r0 = r12.A0K
            if (r0 == 0) goto L_0x01d2
            java.lang.String r3 = r12.A0F
        L_0x0120:
            boolean r0 = r12.A0M
            r40 = r0
            boolean r0 = r12.A0T
            r23 = r0
            boolean r0 = r12.A0P
            r22 = r0
            boolean r0 = r12.A0O
            r21 = r0
            boolean r0 = r12.A0N
            r20 = r0
            X.JTB r0 = r12.A03
            r25 = r0
            r32 = r5
            r33 = r4
            r34 = r3
            r35 = r15
            r41 = r23
            r43 = r22
            r44 = r21
            r45 = r20
            r20 = r46
            r21 = r9
            r22 = r7
            r23 = r47
            X.3mx r0 = X.GFL.A01(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            r6.A00(r0)
        L_0x0157:
            X.JTB r3 = r12.A03
            if (r3 == 0) goto L_0x0178
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            boolean r4 = r3.CRt(r9, r0)
            r0 = r18
            if (r4 != r0) goto L_0x0178
            X.Gt5 r4 = new X.Gt5
            r0 = r47
            r4.<init>(r7, r0, r3)
        L_0x016e:
            r6.A00(r4)
        L_0x0171:
            r0 = r16
            X.2Tl r0 = X.C243563Zg.A03(r6, r11, r0)
            return r0
        L_0x0178:
            if (r13 == 0) goto L_0x01a5
            if (r1 == 0) goto L_0x01f2
            X.GAk r0 = r12.A0B
            if (r0 == 0) goto L_0x018b
            com.instagram.common.session.UserSession r5 = r0.A03
            X.4DU r4 = r0.A06
            X.2el r0 = r0.A04
            X.GNw r2 = new X.GNw
            r2.<init>(r4, r5, r0, r8)
        L_0x018b:
            boolean r0 = r12.A0Q
            X.GOi r4 = new X.GOi
            r20 = r4
            r21 = r1
            r22 = r2
            r23 = r9
            r24 = r7
            r25 = r47
            r26 = r3
            r27 = r0
            r28 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x016e
        L_0x01a5:
            boolean r0 = r14.A01
            if (r0 != 0) goto L_0x01ab
            if (r17 == 0) goto L_0x0171
        L_0x01ab:
            X.GAk r0 = r12.A0B
            if (r0 == 0) goto L_0x01ba
            com.instagram.common.session.UserSession r4 = r0.A03
            X.4DU r1 = r0.A06
            X.2el r0 = r0.A04
            X.GNw r2 = new X.GNw
            r2.<init>(r1, r4, r0, r8)
        L_0x01ba:
            boolean r0 = r12.A0Q
            X.Guq r4 = new X.Guq
            r19 = r4
            r20 = r2
            r21 = r9
            r22 = r7
            r23 = r47
            r24 = r3
            r25 = r0
            r26 = r18
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            goto L_0x016e
        L_0x01d2:
            r3 = 0
            goto L_0x0120
        L_0x01d5:
            r5 = 0
            r4 = 0
            goto L_0x0112
        L_0x01d9:
            r15 = 0
            goto L_0x0104
        L_0x01dc:
            r31 = r2
            goto L_0x00ee
        L_0x01e0:
            java.lang.String r3 = "trans_key_full_width_footer_fade"
            goto L_0x009d
        L_0x01e4:
            r3 = r2
            goto L_0x004b
        L_0x01e7:
            r0 = r2
            goto L_0x0031
        L_0x01ea:
            X.1Xy r0 = r8.A0C
            X.3y6 r1 = r0.Ao8()
            goto L_0x001f
        L_0x01f2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01f7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GH8.A0X(X.3Y5):X.3mp");
    }

    public GH8(GJ5 gj5, GEG geg, C267324bN r5, C52058GDe gDe, UserSession userSession, AnonymousClass4DU r8, JTB jtb, GPZ gpz, C51987GAk gAk, C59526JMy jMy, C59527JMz jMz, C52046GCs gCs, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        AnonymousClass7TG.A1O(jMz, jMy);
        0qQ.A0B(gCs, 14);
        0qQ.A0B(jtb, 27);
        this.A0D = jMz;
        this.A0C = jMy;
        this.A08 = userSession;
        this.A02 = r5;
        this.A07 = gDe;
        this.A01 = geg;
        this.A00 = gj5;
        this.A0B = gAk;
        this.A0H = z;
        this.A0I = z2;
        this.A0R = z3;
        this.A0A = gpz;
        this.A09 = r8;
        this.A0E = gCs;
        this.A0J = z4;
        this.A0K = z5;
        this.A0L = z6;
        this.A04 = z7;
        this.A0Q = z8;
        this.A0M = z9;
        this.A0T = z10;
        this.A05 = z11;
        this.A0P = z12;
        this.A0O = z13;
        this.A0N = z14;
        this.A03 = jtb;
        this.A0S = z15;
        this.A06 = z16;
        this.A0G = z17;
    }
}
