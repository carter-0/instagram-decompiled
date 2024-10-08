package X;

import java.util.Collections;

/* renamed from: X.3CO  reason: invalid class name */
public class AnonymousClass3CO extends AnonymousClass3CP {
    public Double A00;
    public final 1PX A01;
    public final C233212vI A02;
    public final C249863kU A03;
    public final boolean A04;
    public final double A05;
    public final C233172vA A06;
    public final C238563Cj A07 = new C238563Cj(this);
    public final 1PG A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final boolean A7L(C233632w4 r4, C233042ur r5, C233072uu r6) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(r5, 1);
        0qQ.A0B(r4, 2);
        A03(r4, r5, new C238633Cq(r6));
        C238563Cj r1 = this.A07;
        0qQ.A0B(r1, 0);
        this.A0G.ENz(r1);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if (r0 == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (X.AnonymousClass1B1.A00(r7.A0E).A00(X.1B2.A0e) != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r7.A02.Ch1((java.lang.String) null, "HEADLOAD", (java.lang.String) null, "prefetch_peak_throttling", true, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r0 != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Cn8(X.AnonymousClass9J0 r8, X.C233632w4 r9, X.C238523Ce r10, java.lang.String r11, java.lang.String r12, double r13, boolean r15) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            r0 = 2
            X.0qQ.A0B(r10, r0)
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x002a
            long r0 = X.AnonymousClass1B0.A02
            com.instagram.common.session.UserSession r0 = r7.A0E
            X.1B0 r1 = X.AnonymousClass1B1.A00(r0)
            X.1B2 r0 = X.1B2.A0e
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x002a
        L_0x001c:
            X.2vI r0 = r7.A02
            java.lang.String r2 = "HEADLOAD"
            java.lang.String r4 = "prefetch_peak_throttling"
            r1 = 0
            r5 = 1
            r6 = r15
            r3 = r1
            r0.Ch1(r1, r2, r3, r4, r5, r6)
        L_0x0029:
            return
        L_0x002a:
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x0037
            X.1PG r0 = r7.A08
            boolean r0 = r0.A08()
        L_0x0034:
            if (r0 == 0) goto L_0x004a
            goto L_0x001c
        L_0x0037:
            boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x004a
            long r0 = X.AnonymousClass1B0.A02
            com.instagram.common.session.UserSession r0 = r7.A0E
            X.1B0 r1 = X.AnonymousClass1B1.A00(r0)
            X.1B2 r0 = X.1B2.A0e
            boolean r0 = r1.A00(r0)
            goto L_0x0034
        L_0x004a:
            if (r8 == 0) goto L_0x00c5
            java.lang.Object r0 = r8.A04
            java.lang.Double r0 = (java.lang.Double) r0
        L_0x0050:
            r7.A00 = r0
            X.3kU r4 = r7.A03
            java.util.LinkedList r0 = r4.A02
            boolean r6 = r0.isEmpty()
            boolean r0 = r7.A04
            r2 = 1
            r5 = r0 ^ 1
            double r0 = r7.A05
            boolean r3 = r7.A0A
            if (r3 == 0) goto L_0x00c0
            int r0 = java.lang.Double.compare(r13, r0)
            if (r0 < 0) goto L_0x0072
            boolean r0 = r4.A08()
            r4 = 1
            if (r0 != 0) goto L_0x0073
        L_0x0072:
            r4 = 0
        L_0x0073:
            r4 = r4 & r5
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A05
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0029
            X.1PX r3 = r7.A01
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x0029
            if (r6 != 0) goto L_0x0088
            if (r4 == 0) goto L_0x0029
        L_0x0088:
            java.lang.Integer r1 = r7.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0029
            java.util.List r1 = r9.A03
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r7.A04 = r0
            int r0 = r9.A02
            r7.A01 = r0
            int r1 = r9.A01
            r7.A00 = r1
            boolean r0 = r9.A00
            r7.A0C = r0
            X.2vA r0 = r7.A06
            r0.A0U = r11
            r0.A0c = r12
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x00be
            if (r4 == 0) goto L_0x00be
            if (r6 != 0) goto L_0x00be
        L_0x00b1:
            r7.A04(r10, r1, r2)
            java.lang.Integer r1 = r7.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0029
            r0 = 1
            r3.A05 = r0
            return
        L_0x00be:
            r2 = 0
            goto L_0x00b1
        L_0x00c0:
            boolean r4 = r4.A08()
            goto L_0x0073
        L_0x00c5:
            r0 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CO.Cn8(X.9J0, X.2w4, X.3Ce, java.lang.String, java.lang.String, double, boolean):void");
    }

    public final boolean D69(int i, int i2) {
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3CO(android.content.Context r31, X.AnonymousClass07i r32, com.instagram.common.session.UserSession r33, X.C233172vA r34, X.AnonymousClass3BQ r35, X.AnonymousClass3CK r36, X.1PX r37, X.C233212vI r38, X.C249863kU r39, X.C249763kK r40, java.lang.String r41) {
        /*
            r30 = this;
            X.3CQ r3 = X.AnonymousClass3CQ.A00
            X.3CR r4 = X.AnonymousClass3CR.A00
            X.3CS r5 = X.AnonymousClass3CS.A00
            X.3CT r6 = X.AnonymousClass3CT.A00
            X.3CU r7 = X.AnonymousClass3CU.A00
            X.3CW r8 = X.AnonymousClass3CW.A00
            X.3CX r9 = X.AnonymousClass3CX.A00
            X.3CY r10 = X.AnonymousClass3CY.A00
            X.3CZ r11 = X.AnonymousClass3CZ.A00
            X.3Ca r12 = X.C238483Ca.A00
            X.3Cb r2 = new X.3Cb
            r2.<init>()
            java.lang.String r0 = ""
            r13 = 0
            X.2kQ r1 = X.C227942kP.A01(r0, r13, r13)
            X.3Cd r0 = new X.3Cd
            r14 = r13
            r15 = r13
            r16 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r21 = 0
            r14 = r30
            r15 = r31
            r16 = r32
            r17 = r33
            r3 = r34
            r19 = r35
            r20 = r36
            r2 = r37
            r1 = r38
            r25 = r40
            r26 = r41
            r18 = r3
            r22 = r2
            r23 = r1
            r24 = r0
            r27 = r13
            r28 = r13
            r29 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0 = r39
            r14.A03 = r0
            r14.A01 = r2
            r14.A02 = r1
            r14.A06 = r3
            com.instagram.common.session.UserSession r2 = r14.A0E
            X.0Tu r3 = X.0Tu.A05
            r0 = 36310542579859592(0x81003f00130088, double:3.026271566097923E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r14.A0B = r0
            r0 = 36310542582939817(0x81003f004200a9, double:3.0262715680458694E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r14.A04 = r0
            r0 = 36310542583070891(0x81003f004400ab, double:3.026271568128761E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r14.A0A = r0
            r0 = 37154967513268232(0x84003f00450008, double:3.5602892942118316E-306)
            double r0 = X.182.A00(r3, r2, r0)
            r14.A05 = r0
            r0 = 36321468976276885(0x810a2f000d2595, double:3.033181463189286E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r14.A09 = r0
            r0 = 36321468976604570(0x810a2f0012259a, double:3.033181463396515E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r14.A0E = r0
            r0 = 36321468976670107(0x810a2f0013259b, double:3.033181463437961E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r14.A0C = r0
            r0 = 36315090950360042(0x81046200150bea, double:3.029147973917225E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r14.A0D = r0
            X.1PG r0 = X.1PG.A00(r2)
            X.0qQ.A07(r0)
            r14.A08 = r0
            X.3Cj r0 = new X.3Cj
            r0.<init>(r14)
            r14.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CO.<init>(android.content.Context, X.07i, com.instagram.common.session.UserSession, X.2vA, X.3BQ, X.3CK, X.1PX, X.2vI, X.3kU, X.3kK, java.lang.String):void");
    }

    public final void deactivate() {
        this.A05.set(false);
    }

    public final AnonymousClass4LO A05(boolean z) {
        AnonymousClass4LO A052 = super.A05(z);
        A052.A0I = true;
        A052.A0H = true;
        A052.A0J = true;
        A052.A0C = Collections.emptyMap();
        A052.A0G = this.A0B;
        A052.A07 = this.A00;
        return A052;
    }
}
