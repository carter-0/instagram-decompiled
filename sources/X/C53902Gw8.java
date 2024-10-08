package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.Gw8  reason: case insensitive filesystem */
public final class C53902Gw8 extends C251343mx {
    public final C52706GbJ A00;
    public final C56562I1q A01;
    public final HQ2 A02;
    public final String A03;
    public final 0sP A04;
    public final boolean A05;
    public final 2WX A06;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.3mp] */
    /* JADX WARNING: type inference failed for: r30v2, types: [X.GvY] */
    /* JADX WARNING: type inference failed for: r19v3, types: [X.GvL] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c9, code lost:
        if (r20 != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r0.A01.A03 == false) goto L_0x0015;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r43) {
        /*
            r42 = this;
            r8 = 0
            r12 = r43
            X.0qQ.A0B(r12, r8)
            r0 = r42
            boolean r2 = r0.A05
            r10 = 1
            if (r2 == 0) goto L_0x0015
            X.I1q r1 = r0.A01
            boolean r1 = r1.A03
            r20 = 1
            if (r1 != 0) goto L_0x0017
        L_0x0015:
            r20 = 0
        L_0x0017:
            X.I1q r3 = r0.A01
            java.lang.String r4 = r3.A00
            if (r4 != 0) goto L_0x001f
            java.lang.String r4 = r3.A01
        L_0x001f:
            X.0r1 r1 = new X.0r1
            r1.<init>()
            boolean r6 = r3.A04
            r1.A00 = r6
            X.HQ2 r13 = r0.A02
            boolean r9 = r13 instanceof X.HI9
            r7 = 0
            if (r9 == 0) goto L_0x01e8
            r5 = r13
            X.HI9 r5 = (X.HI9) r5
            if (r5 == 0) goto L_0x01e8
            X.I1t r11 = r5.A01
        L_0x0036:
            java.lang.Object[] r14 = X.C51968G9o.A1a(r4, r6)
            r6 = 35
            X.Phm r5 = new X.Phm
            r5.<init>(r1, r0, r4, r6)
            X.C243773a4.A00(r12, r5, r14)
            boolean r5 = r3.A05
            java.lang.Object[] r6 = X.C51968G9o.A1b(r5)
            r5 = 41
            X.Ivm r5 = X.C58677Ivm.A00(r0, r5)
            X.C243773a4.A00(r12, r5, r6)
            if (r9 == 0) goto L_0x01e5
            r5 = r13
            X.HI9 r5 = (X.HI9) r5
            if (r5 == 0) goto L_0x01e5
            X.HtB r5 = r5.A00
            if (r5 == 0) goto L_0x01e5
            java.util.List r5 = r5.A02
            java.lang.Integer r14 = X.C51968G9o.A0t(r5)
        L_0x0064:
            r6 = 0
            if (r9 == 0) goto L_0x0070
            r5 = r13
            X.HI9 r5 = (X.HI9) r5
            X.HtB r5 = r5.A00
            if (r5 == 0) goto L_0x0070
            java.lang.String r6 = r5.A01
        L_0x0070:
            r17 = 4
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r6 = new java.lang.Object[]{r5, r2, r14, r6}
            r5 = 48
            X.GA1 r2 = new X.GA1
            r2.<init>(r5, r0, r9)
            X.C243773a4.A00(r12, r2, r6)
            java.lang.String r2 = r0.A03
            boolean r5 = r13 instanceof X.HIE
            java.lang.Object[] r6 = X.C51968G9o.A1a(r2, r5)
            r2 = 46
            X.Ivw r2 = X.C58687Ivw.A00(r12, r0, r2)
            java.lang.Object r16 = X.AnonymousClass3Zw.A00(r12, r2, r6)
            r2 = r16
            java.lang.String r2 = (java.lang.String) r2
            r16 = r2
            X.3Zh r19 = X.C243573Zh.CENTER
            X.3XV r14 = X.2WX.A02
            r13 = 1120403456(0x42c80000, float:100.0)
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            X.2WX r6 = X.C51971G9r.A0X(r7, r15, r13, r8)
            X.J6n r2 = X.C59105J6n.A02(r0, r10)
            java.lang.Integer r10 = X.AnonymousClass05K.A0Y
            X.2WX r6 = X.C51971G9r.A0Z(r6, r10, r2, r7)
            X.2WX r2 = r0.A06
            X.2WX r18 = r6.A00(r2)
            X.2Wb r6 = X.C51972G9s.A0Q(r12)
            boolean r2 = r3.A03
            r41 = r2 ^ 1
            if (r41 != 0) goto L_0x00cb
            r2 = 1058642330(0x3f19999a, float:0.6)
            if (r20 == 0) goto L_0x00cd
        L_0x00cb:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00cd:
            X.2WX r14 = X.C52112GFg.A01(r14, r2)
            if (r20 == 0) goto L_0x0166
            if (r4 != 0) goto L_0x00d7
            java.lang.String r4 = ""
        L_0x00d7:
            boolean r28 = r0.A00()
            r2 = 26
            X.Iw3 r17 = new X.Iw3
            r1 = r17
            r1.<init>(r4, r0, r2)
            X.2WX r5 = X.C51971G9r.A0X(r7, r15, r13, r8)
            long r2 = X.C51970G9q.A0I()
            long r0 = X.C51969G9p.A0B()
            java.lang.Integer r11 = X.AnonymousClass05K.A07
            X.2WX r5 = X.AnonymousClass9JR.A00(r5, r11, r8, r2)
            java.lang.Integer r9 = X.AnonymousClass05K.A0A
            X.2WX r14 = X.AnonymousClass9JR.A00(r5, r9, r8, r0)
            r5 = 3
            X.J6v r13 = new X.J6v
            r13.<init>(r4, r5)
            X.Gxc r4 = X.HSK.A00(r6, r14, r13)
            r6.A00(r4)
            X.HNN r21 = X.HNN.A0V
            X.HNO r4 = X.HNO.A0J
            int r16 = X.I61.A00(r6, r4)
            X.HNO r4 = X.HNO.A0K
            int r14 = X.I61.A00(r6, r4)
            int r27 = X.I61.A01(r6, r9)
            r4 = r19
            X.2WX r13 = X.C51971G9r.A0Y(r7, r15, r4, r5)
            java.lang.Integer r4 = X.AnonymousClass05K.A0B
            int r4 = X.I61.A01(r6, r4)
            double r4 = (double) r4
            X.2WX r13 = X.C51973G9u.A0X(r13, r10, r4, r8)
            java.lang.Integer r4 = X.AnonymousClass05K.A0D
            long r4 = X.I61.A02(r6, r4)
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            X.2WX r10 = X.AnonymousClass9JR.A00(r13, r10, r8, r4)
            java.lang.Integer r4 = X.AnonymousClass05K.A06
            long r4 = X.I61.A02(r6, r4)
            X.9JR r4 = X.C51965G9l.A0c(r11, r8, r4)
            X.2WX r2 = X.C51973G9u.A0R(r10, r4, r8, r2)
            X.2WX r20 = X.AnonymousClass9JR.A00(r2, r9, r8, r0)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r16)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r14)
            java.lang.String r25 = "Regenerate Images"
            X.GvL r0 = new X.GvL
            r19 = r0
            r22 = r7
            r26 = r17
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x015f:
            r1 = r18
            X.2Tp r0 = X.C51967G9n.A0P(r0, r6, r12, r1)
            return r0
        L_0x0166:
            X.HNO r35 = X.HNO.A02
            X.GbJ r8 = r0.A00
            X.Gbl r34 = X.C52734Gbl.SEARCH
            X.IEI r4 = new X.IEI
            r2 = r17
            r4.<init>(r0, r2)
            r2 = 44
            X.Ivw r32 = X.C58687Ivw.A00(r11, r0, r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.JNh r7 = X.I3I.A01(r6)
            X.JSK r7 = X.I41.A00(r7)
            boolean r7 = r7.EIa(r2)
            if (r7 == 0) goto L_0x018b
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
        L_0x018b:
            if (r5 == 0) goto L_0x01dd
            X.HNN r20 = X.HNN.A0K
        L_0x018f:
            java.lang.Integer r26 = X.AnonymousClass05K.A09
            boolean r33 = r0.A00()
            boolean r3 = r3.A02
            if (r3 == 0) goto L_0x01da
            r29 = r15
        L_0x019b:
            java.lang.String r31 = "Search Images"
            X.HNO r21 = X.HNO.A0o
            X.HNO r22 = X.HNO.A0p
            java.lang.Integer r23 = X.AnonymousClass05K.A07
            java.lang.Integer r24 = X.AnonymousClass05K.A0F
            java.lang.Integer r27 = X.AnonymousClass05K.A08
            X.HIw r19 = new X.HIw
            r25 = r24
            r28 = r15
            r30 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.J5O r5 = X.J5O.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A02
            r2 = r17
            X.2WX r32 = X.C51971G9r.A0Y(r14, r3, r5, r2)
            r2 = 45
            X.Ivw r38 = X.C58687Ivw.A00(r1, r0, r2)
            r1 = 42
            X.Ivm r39 = X.C58677Ivm.A00(r0, r1)
            r40 = 3
            X.GvY r0 = new X.GvY
            r30 = r0
            r31 = r4
            r33 = r8
            r36 = r19
            r37 = r16
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x015f
        L_0x01da:
            java.lang.Integer r29 = X.AnonymousClass05K.A0N
            goto L_0x019b
        L_0x01dd:
            if (r9 == 0) goto L_0x01e2
            X.HNN r20 = X.HNN.A0V
            goto L_0x018f
        L_0x01e2:
            X.HNN r20 = X.HNN.A0L
            goto L_0x018f
        L_0x01e5:
            r14 = r7
            goto L_0x0064
        L_0x01e8:
            r11 = r7
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53902Gw8.A0X(X.3Y5):X.3mp");
    }

    private final boolean A00() {
        HI9 hi9;
        C56123HtB htB;
        HQ2 hq2 = this.A02;
        if (hq2 instanceof HI9) {
            hi9 = (HI9) hq2;
        } else {
            hi9 = null;
        }
        if (!(hi9 == null || (htB = hi9.A00) == null)) {
            List<C56556I1k> list = htB.A02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C56556I1k i1k : list) {
                    if (i1k.A02 == AnonymousClass05K.A00) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public C53902Gw8(2WX r1, C52706GbJ gbJ, C56562I1q i1q, HQ2 hq2, String str, 0sP r6, boolean z) {
        AnonymousClass7TG.A1U(hq2, i1q, gbJ);
        this.A02 = hq2;
        this.A01 = i1q;
        this.A00 = gbJ;
        this.A03 = str;
        this.A06 = r1;
        this.A04 = r6;
        this.A05 = z;
    }
}
