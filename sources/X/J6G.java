package X;

public final class J6G extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6G(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static J6G A00(Object obj, int i) {
        return new J6G(obj, i);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03b0, code lost:
        r9 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03b6, code lost:
        return java.lang.Float.valueOf(-r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x058d, code lost:
        if (r1 > 0.5f) goto L_0x058f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0598, code lost:
        if (r1 > 1.0f) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05f1, code lost:
        r0 = X.C289155d7.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05fa, code lost:
        return new X.C289005cr(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0631, code lost:
        r2.invoke(r3, java.lang.Float.valueOf(r0));
        r3.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0682, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012f, code lost:
        if (java.lang.Math.min((X.C54736HQt.A00(r1, r13) + r13.A0A) - r4.A08, (X.C54736HQt.A00(r1, r12) + r12.A0A) - r4.A07) > (-r6)) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01aa, code lost:
        if (java.lang.Math.min(r3 - X.C54736HQt.A00(r2, r13), r4.A07 - X.C54736HQt.A00(r2, r12)) > r6) goto L_0x0131;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0296 A[Catch:{ all -> 0x02b7 }, LOOP:3: B:118:0x0292->B:120:0x0296, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x07fb  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0808  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r28) {
        /*
            r27 = this;
            r5 = r27
            r3 = r28
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0010;
                case 1: goto L_0x052c;
                case 2: goto L_0x0545;
                case 3: goto L_0x0538;
                case 4: goto L_0x0538;
                case 5: goto L_0x0560;
                case 6: goto L_0x001b;
                case 7: goto L_0x05b1;
                case 8: goto L_0x05c0;
                case 9: goto L_0x05d9;
                case 10: goto L_0x05c0;
                case 11: goto L_0x05d9;
                case 12: goto L_0x0538;
                case 13: goto L_0x0538;
                case 14: goto L_0x002a;
                case 15: goto L_0x0033;
                case 16: goto L_0x0525;
                case 17: goto L_0x0525;
                case 18: goto L_0x003c;
                case 19: goto L_0x05fb;
                case 20: goto L_0x060e;
                case 21: goto L_0x0614;
                case 22: goto L_0x0623;
                case 23: goto L_0x063c;
                case 24: goto L_0x0082;
                case 25: goto L_0x064c;
                case 26: goto L_0x0525;
                case 27: goto L_0x0657;
                case 28: goto L_0x0657;
                case 29: goto L_0x065e;
                case 30: goto L_0x0009;
                case 31: goto L_0x0009;
                case 32: goto L_0x0675;
                case 33: goto L_0x0009;
                case 34: goto L_0x0009;
                case 35: goto L_0x0009;
                case 36: goto L_0x0009;
                case 37: goto L_0x0683;
                case 38: goto L_0x0683;
                case 39: goto L_0x0097;
                case 40: goto L_0x033c;
                case 41: goto L_0x0345;
                case 42: goto L_0x0351;
                case 43: goto L_0x0683;
                case 44: goto L_0x0683;
                case 45: goto L_0x0683;
                case 46: goto L_0x0377;
                case 47: goto L_0x0377;
                case 48: goto L_0x038c;
                case 49: goto L_0x0689;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r0 = "setName"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0010:
            java.lang.Object r0 = r5.A01
            boolean r0 = X.0qQ.A0K(r3, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x001b:
            java.lang.Object r0 = r5.A01
            X.I4f r0 = (X.C56606I4f) r0
            X.5Oz r0 = r0.A07
            boolean r0 = X.C51969G9p.A1U(r0, r3)
            java.lang.Boolean r2 = X.DbT.A0l(r0)
            return r2
        L_0x002a:
            java.lang.Object r1 = r5.A01
            r0 = 1
            X.GP2 r2 = new X.GP2
            r2.<init>(r1, r0)
            return r2
        L_0x0033:
            java.lang.Object r1 = r5.A01
            r0 = 2
            X.GP2 r2 = new X.GP2
            r2.<init>(r1, r0)
            return r2
        L_0x003c:
            float r6 = X.AnonymousClass7TE.A04(r3)
            java.lang.Object r4 = r5.A01
            X.IEj r4 = (X.C56838IEj) r4
            X.5dh r5 = r4.A03
            int r0 = r5.BI6()
            float r2 = (float) r0
            float r2 = r2 + r6
            float r0 = r4.A00
            float r2 = r2 + r0
            X.5dh r0 = r4.A01
            int r0 = r0.BI6()
            float r1 = (float) r0
            r0 = 0
            float r3 = X.C229632nm.A02(r2, r0, r1)
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r2 = r0 ^ 1
            int r0 = r5.BI6()
            float r0 = (float) r0
            float r3 = r3 - r0
            int r1 = java.lang.Math.round(r3)
            int r0 = r5.BI6()
            int r0 = r0 + r1
            r5.EZz(r0)
            float r0 = (float) r1
            float r0 = r3 - r0
            r4.A00 = r0
            if (r2 == 0) goto L_0x007d
            r6 = r3
        L_0x007d:
            java.lang.Float r2 = java.lang.Float.valueOf(r6)
            return r2
        L_0x0082:
            float r2 = X.AnonymousClass7TE.A04(r3)
            java.lang.Object r0 = r5.A01
            java.lang.Object r1 = X.C51966G9m.A18(r0)
            X.0sP r1 = (X.0sP) r1
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            java.lang.Object r2 = r1.invoke(r0)
            return r2
        L_0x0097:
            float r0 = X.AnonymousClass7TE.A04(r3)
            java.lang.Object r10 = r5.A01
            androidx.compose.foundation.lazy.grid.LazyGridState r10 = (androidx.compose.foundation.lazy.grid.LazyGridState) r10
            float r9 = -r0
            r22 = 0
            int r0 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ae
            X.5Oz r0 = r10.A0G
            boolean r0 = X.C51971G9r.A1W(r0)
            if (r0 == 0) goto L_0x03b0
        L_0x00ae:
            int r0 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bc
            X.5Oz r0 = r10.A0F
            boolean r0 = X.C51971G9r.A1W(r0)
            if (r0 != 0) goto L_0x00bc
            goto L_0x03b0
        L_0x00bc:
            float r1 = r10.A00
            float r0 = java.lang.Math.abs(r1)
            r8 = 1
            r21 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x032d
            float r1 = r1 + r9
            r10.A00 = r1
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0308
            X.5Oz r11 = r10.A0H
            java.lang.Object r4 = r11.getValue()
            X.IGW r4 = (X.IGW) r4
            float r7 = r10.A00
            int r6 = X.AnonymousClass1GB.A01(r7)
            boolean r0 = r4.A0E
            r5 = 0
            if (r0 != 0) goto L_0x01ad
            java.util.List r0 = r4.A0C
            r23 = r0
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x01ad
            X.Hqw r0 = r4.A0A
            if (r0 == 0) goto L_0x01ad
            int r1 = r0.A02
            int r0 = r4.A01
            int r0 = r0 - r6
            if (r0 < 0) goto L_0x01ad
            if (r0 >= r1) goto L_0x01ad
            java.lang.Object r13 = X.00k.A0I(r23)
            X.IFG r13 = (X.IFG) r13
            java.lang.Object r12 = X.00k.A0K(r23)
            X.IFG r12 = (X.IFG) r12
            boolean r0 = r13.A06
            if (r0 != 0) goto L_0x01ad
            boolean r0 = r12.A06
            if (r0 != 0) goto L_0x01ad
            if (r6 >= 0) goto L_0x0196
            X.6Gj r1 = r4.A09
            int r2 = X.C54736HQt.A00(r1, r13)
            int r0 = r13.A0A
            int r2 = r2 + r0
            int r0 = r4.A08
            int r2 = r2 - r0
            int r1 = X.C54736HQt.A00(r1, r12)
            int r0 = r12.A0A
            int r1 = r1 + r0
            int r0 = r4.A07
            int r1 = r1 - r0
            int r1 = java.lang.Math.min(r2, r1)
            int r0 = -r6
            if (r1 <= r0) goto L_0x01ad
        L_0x0131:
            int r0 = r4.A01
            int r0 = r0 - r6
            r4.A01 = r0
            int r20 = r23.size()
        L_0x013a:
            r0 = r20
            if (r5 >= r0) goto L_0x01be
            r0 = r23
            java.lang.Object r3 = r0.get(r5)
            X.IFG r3 = (X.IFG) r3
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x0193
            long r0 = r3.A05
            boolean r2 = r3.A0G
            r19 = 32
            long r11 = r0 >> r19
            int r13 = (int) r11
            if (r2 != 0) goto L_0x0156
            int r13 = r13 + r6
        L_0x0156:
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r17
            int r11 = (int) r0
            if (r2 == 0) goto L_0x0161
            int r11 = r11 + r6
        L_0x0161:
            long r0 = X.AnonymousClass5TW.A00(r13, r11)
            r3.A05 = r0
            java.util.List r0 = r3.A0F
            int r16 = r0.size()
            r12 = 0
        L_0x016e:
            r0 = r16
            if (r12 >= r0) goto L_0x0193
            X.6H4 r1 = r3.A0D
            java.lang.Object r0 = r3.A0E
            X.I4b r11 = r1.A05(r0, r12)
            if (r11 == 0) goto L_0x0190
            long r0 = r11.A02
            long r13 = r0 >> r19
            int r15 = (int) r13
            if (r2 != 0) goto L_0x0184
            int r15 = r15 + r6
        L_0x0184:
            long r0 = r0 & r17
            int r13 = (int) r0
            if (r2 == 0) goto L_0x018a
            int r13 = r13 + r6
        L_0x018a:
            long r0 = X.AnonymousClass5TW.A00(r15, r13)
            r11.A02 = r0
        L_0x0190:
            int r12 = r12 + 1
            goto L_0x016e
        L_0x0193:
            int r5 = r5 + 1
            goto L_0x013a
        L_0x0196:
            int r3 = r4.A08
            X.6Gj r2 = r4.A09
            int r0 = X.C54736HQt.A00(r2, r13)
            int r3 = r3 - r0
            int r1 = r4.A07
            int r0 = X.C54736HQt.A00(r2, r12)
            int r1 = r1 - r0
            int r0 = java.lang.Math.min(r3, r1)
            if (r0 <= r6) goto L_0x01ad
            goto L_0x0131
        L_0x01ad:
            X.5R7 r0 = r10.A01
            if (r0 == 0) goto L_0x01b4
            r0.AWL()
        L_0x01b4:
            float r0 = r10.A00
            float r7 = r7 - r0
            java.lang.Object r4 = r11.getValue()
            X.JL7 r4 = (X.JL7) r4
            goto L_0x01d6
        L_0x01be:
            float r0 = (float) r6
            r4.A00 = r0
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x01c9
            if (r6 <= 0) goto L_0x01c9
            r4.A02 = r8
        L_0x01c9:
            r10.A02(r4, r8)
            X.5Oz r1 = r10.A0J
            X.0gF r0 = X.C60340gF.A00
            r1.Epw(r0)
            float r0 = r10.A00
            float r7 = r7 - r0
        L_0x01d6:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0308
            X.JL9 r6 = r10.A08
            X.JL8 r12 = r10.A07
            X.IF8 r6 = (X.IF8) r6
            X.IGW r4 = (X.IGW) r4
            java.util.List r0 = r4.A0C
            r26 = r0
            boolean r0 = X.AnonymousClass7TE.A1b(r26)
            if (r0 == 0) goto L_0x0308
            r5 = 0
            int r0 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x025b
            r11 = 1
            java.lang.Object r0 = X.00k.A0K(r26)
            X.MW2 r0 = (X.MW2) r0
            X.6Gj r3 = r4.A09
            X.6Gj r2 = X.AnonymousClass6Gj.Vertical
            X.IFG r0 = (X.IFG) r0
            if (r3 != r2) goto L_0x0258
            int r0 = r0.A04
        L_0x0202:
            int r1 = r0 + 1
            java.lang.Object r0 = X.00k.A0K(r26)
            X.MW2 r0 = (X.MW2) r0
            X.IFG r0 = (X.IFG) r0
            int r0 = r0.A08
            int r0 = r0 + 1
        L_0x0210:
            if (r0 < 0) goto L_0x0308
            int r8 = r4.A06
            if (r0 >= r8) goto L_0x0308
            int r0 = r6.A00
            if (r1 == r0) goto L_0x02d1
            boolean r0 = r6.A01
            if (r0 == r11) goto L_0x0232
            X.5Pl r0 = r6.A02
            int r14 = r0.A00
            if (r14 <= 0) goto L_0x0232
            java.lang.Object[] r13 = r0.A02
            r8 = 0
        L_0x0227:
            r0 = r13[r8]
            X.JP9 r0 = (X.JP9) r0
            r0.cancel()
            int r8 = r8 + 1
            if (r8 < r14) goto L_0x0227
        L_0x0232:
            r6.A01 = r11
            r6.A00 = r1
            X.5Pl r0 = r6.A02
            r25 = r0
            r25.A01()
            X.IF7 r12 = (X.IF7) r12
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            androidx.compose.foundation.lazy.grid.LazyGridState r0 = r12.A00
            r20 = r0
            androidx.compose.runtime.snapshots.Snapshot r18 = X.AnonymousClass5PH.A02()
            if (r18 == 0) goto L_0x0256
            X.0sP r8 = r18.A05()
        L_0x0251:
            androidx.compose.runtime.snapshots.Snapshot r17 = X.AnonymousClass5PH.A03(r18)
            goto L_0x027d
        L_0x0256:
            r8 = 0
            goto L_0x0251
        L_0x0258:
            int r0 = r0.A00
            goto L_0x0202
        L_0x025b:
            r11 = 0
            java.lang.Object r0 = X.00k.A0I(r26)
            X.MW2 r0 = (X.MW2) r0
            X.6Gj r3 = r4.A09
            X.6Gj r2 = X.AnonymousClass6Gj.Vertical
            X.IFG r0 = (X.IFG) r0
            if (r3 != r2) goto L_0x027a
            int r0 = r0.A04
        L_0x026c:
            int r1 = r0 + -1
            java.lang.Object r0 = X.00k.A0I(r26)
            X.MW2 r0 = (X.MW2) r0
            X.IFG r0 = (X.IFG) r0
            int r0 = r0.A08
            int r0 = r0 - r8
            goto L_0x0210
        L_0x027a:
            int r0 = r0.A00
            goto L_0x026c
        L_0x027d:
            X.5Oz r0 = r0.A0H     // Catch:{ all -> 0x02b7 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x02b7 }
            X.IGW r0 = (X.IGW) r0     // Catch:{ all -> 0x02b7 }
            X.0sP r0 = r0.A0D     // Catch:{ all -> 0x02b7 }
            java.lang.Object r13 = X.C51968G9o.A0w(r1, r0)     // Catch:{ all -> 0x02b7 }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x02b7 }
            r12 = 0
            int r16 = r13.size()     // Catch:{ all -> 0x02b7 }
        L_0x0292:
            r0 = r16
            if (r12 >= r0) goto L_0x02c0
            java.lang.Object r1 = r13.get(r12)     // Catch:{ all -> 0x02b7 }
            X.0eP r1 = (X.0eP) r1     // Catch:{ all -> 0x02b7 }
            r0 = r20
            X.6H8 r0 = r0.A0E     // Catch:{ all -> 0x02b7 }
            r15 = r0
            int r14 = X.C51970G9q.A0B(r1)     // Catch:{ all -> 0x02b7 }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x02b7 }
            androidx.compose.ui.unit.Constraints r0 = (androidx.compose.ui.unit.Constraints) r0     // Catch:{ all -> 0x02b7 }
            long r0 = r0.A00     // Catch:{ all -> 0x02b7 }
            X.JP9 r1 = r15.A00(r14, r0)     // Catch:{ all -> 0x02b7 }
            r0 = r19
            r0.add(r1)     // Catch:{ all -> 0x02b7 }
            int r12 = r12 + 1
            goto L_0x0292
        L_0x02b7:
            r2 = move-exception
            r1 = r18
            r0 = r17
            X.AnonymousClass5PH.A06(r1, r0, r8)
            throw r2
        L_0x02c0:
            r1 = r18
            r0 = r17
            X.AnonymousClass5PH.A06(r1, r0, r8)
            r0 = r25
            int r8 = r0.A00
            r1 = r0
            r0 = r19
            r1.A05(r8, r0)
        L_0x02d1:
            if (r11 == 0) goto L_0x031e
            java.lang.Object r8 = X.00k.A0K(r26)
            X.MW2 r8 = (X.MW2) r8
            r0 = r8
            X.IFG r0 = (X.IFG) r0
            long r0 = r0.A0B
            if (r3 != r2) goto L_0x0319
            int r0 = X.C289005cr.A00(r0)
        L_0x02e4:
            int r2 = r4.A04
            int r1 = X.C54736HQt.A00(r3, r8)
            int r1 = r1 + r0
            int r1 = r1 + r2
            int r0 = r4.A07
            int r1 = r1 - r0
            float r0 = (float) r1
            float r7 = -r7
        L_0x02f1:
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0308
            X.5Pl r0 = r6.A02
            int r2 = r0.A00
            if (r2 <= 0) goto L_0x0308
            java.lang.Object[] r1 = r0.A02
        L_0x02fd:
            r0 = r1[r5]
            X.JP9 r0 = (X.JP9) r0
            r0.Cli()
            int r5 = r5 + 1
            if (r5 < r2) goto L_0x02fd
        L_0x0308:
            float r1 = r10.A00
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x03b1
            float r9 = r9 - r1
            r0 = r22
            r10.A00 = r0
            goto L_0x03b1
        L_0x0319:
            int r0 = X.C51965G9l.A04(r0)
            goto L_0x02e4
        L_0x031e:
            java.lang.Object r0 = X.00k.A0I(r26)
            X.MW2 r0 = (X.MW2) r0
            int r1 = r4.A08
            int r0 = X.C54736HQt.A00(r3, r0)
            int r1 = r1 - r0
            float r0 = (float) r1
            goto L_0x02f1
        L_0x032d:
            r0 = 1309(0x51d, float:1.834E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0N(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x033c:
            java.lang.Object r1 = r5.A01
            r0 = 3
            X.GP2 r2 = new X.GP2
            r2.<init>(r1, r0)
            return r2
        L_0x0345:
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r0 = r5.A01
            X.5Y2 r0 = (X.AnonymousClass5Y2) r0
            X.6Hz r2 = new X.6Hz
            r2.<init>(r0, r3)
            return r2
        L_0x0351:
            X.5Qr r3 = (X.AnonymousClass5Qr) r3
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"
            X.0qQ.A0C(r3, r0)
            androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode r3 = (androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode) r3
            X.6H8 r2 = r3.A00
            java.lang.Object r1 = r5.A01
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r0 = r1.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x036e
            r0.add(r2)
        L_0x0369:
            r1.A00 = r0
            X.GRZ r2 = X.GRZ.SkipSubtreeAndContinueTraversal
            return r2
        L_0x036e:
            X.6H8[] r0 = new X.AnonymousClass6H8[]{r2}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            goto L_0x0369
        L_0x0377:
            X.Hjz r3 = (X.C55579Hjz) r3
            int r0 = r3.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.A01
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r0 = X.29b.A00(r1, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x038c:
            float r0 = X.AnonymousClass7TE.A04(r3)
            java.lang.Object r10 = r5.A01
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r10 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) r10
            float r9 = -r0
            X.5Tp r0 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.A0M
            r8 = 0
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x03a4
            X.5Oz r0 = r10.A0F
            boolean r0 = X.C51971G9r.A1W(r0)
            if (r0 == 0) goto L_0x03b0
        L_0x03a4:
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x03b7
            X.5Oz r0 = r10.A0E
            boolean r0 = X.C51971G9r.A1W(r0)
            if (r0 != 0) goto L_0x03b7
        L_0x03b0:
            r9 = 0
        L_0x03b1:
            float r0 = -r9
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
        L_0x03b7:
            float r1 = r10.A00
            float r0 = java.lang.Math.abs(r1)
            r22 = 1
            r21 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x0516
            float r1 = r1 + r9
            r10.A00 = r1
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0507
            X.5Oz r11 = r10.A0G
            java.lang.Object r7 = r11.getValue()
            X.IGX r7 = (X.IGX) r7
            float r6 = r10.A00
            int r5 = X.AnonymousClass1GB.A01(r6)
            boolean r0 = r7.A0E
            r4 = 0
            if (r0 != 0) goto L_0x04d4
            java.util.List r0 = r7.A0D
            r23 = r0
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x04d4
            int[] r0 = r7.A0F
            int r0 = r0.length
            if (r0 == 0) goto L_0x04d4
            int[] r0 = r7.A02
            int r0 = r0.length
            if (r0 == 0) goto L_0x04d4
            int r12 = r7.A07
            int r0 = r7.A03
            int r3 = r12 - r0
            int r2 = r23.size()
            r1 = 0
        L_0x0402:
            if (r1 >= r2) goto L_0x0462
            r0 = r23
            java.lang.Object r14 = r0.get(r1)
            X.IFH r14 = (X.IFH) r14
            boolean r0 = r14.A05
            if (r0 != 0) goto L_0x04d4
            int r0 = r14.A00()
            boolean r13 = X.Dba.A1U(r0)
            int r0 = r14.A00()
            int r0 = r0 + r5
            boolean r0 = X.Dba.A1U(r0)
            if (r13 != r0) goto L_0x04d4
            int r0 = r14.A00()
            int r15 = r7.A08
            if (r0 > r15) goto L_0x0438
            if (r5 >= 0) goto L_0x045a
            int r13 = r14.A00()
            int r0 = r14.A09
            int r13 = r13 + r0
            int r13 = r13 - r15
            int r0 = -r5
            if (r13 <= r0) goto L_0x04d4
        L_0x0438:
            int r13 = r14.A00()
            int r0 = r14.A09
            int r13 = r13 + r0
            if (r13 < r3) goto L_0x044e
            if (r5 >= 0) goto L_0x0451
            int r13 = r14.A00()
            int r0 = r14.A09
            int r13 = r13 + r0
            int r13 = r13 - r12
            int r0 = -r5
            if (r13 <= r0) goto L_0x04d4
        L_0x044e:
            int r1 = r1 + 1
            goto L_0x0402
        L_0x0451:
            int r0 = r14.A00()
            int r0 = r12 - r0
            if (r0 <= r5) goto L_0x04d4
            goto L_0x044e
        L_0x045a:
            int r0 = r14.A00()
            int r15 = r15 - r0
            if (r15 <= r5) goto L_0x04d4
            goto L_0x0438
        L_0x0462:
            int[] r11 = r7.A02
            int r3 = r11.length
            int[] r2 = new int[r3]
            r1 = 0
        L_0x0468:
            if (r1 >= r3) goto L_0x0472
            r0 = r11[r1]
            int r0 = r0 - r5
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0468
        L_0x0472:
            r7.A02 = r2
            int r20 = r23.size()
        L_0x0478:
            r0 = r20
            if (r4 >= r0) goto L_0x04e8
            r0 = r23
            java.lang.Object r3 = r0.get(r4)
            X.IFH r3 = (X.IFH) r3
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x04d1
            long r0 = r3.A03
            boolean r2 = r3.A0F
            r19 = 32
            long r11 = r0 >> r19
            int r13 = (int) r11
            if (r2 != 0) goto L_0x0494
            int r13 = r13 + r5
        L_0x0494:
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r17
            int r11 = (int) r0
            if (r2 == 0) goto L_0x049f
            int r11 = r11 + r5
        L_0x049f:
            long r0 = X.AnonymousClass5TW.A00(r13, r11)
            r3.A03 = r0
            java.util.List r0 = r3.A0E
            int r16 = r0.size()
            r12 = 0
        L_0x04ac:
            r0 = r16
            if (r12 >= r0) goto L_0x04d1
            X.6H4 r1 = r3.A0C
            java.lang.Object r0 = r3.A0D
            X.I4b r11 = r1.A05(r0, r12)
            if (r11 == 0) goto L_0x04ce
            long r0 = r11.A02
            long r13 = r0 >> r19
            int r15 = (int) r13
            if (r2 != 0) goto L_0x04c2
            int r15 = r15 + r5
        L_0x04c2:
            long r0 = r0 & r17
            int r13 = (int) r0
            if (r2 == 0) goto L_0x04c8
            int r13 = r13 + r5
        L_0x04c8:
            long r0 = X.AnonymousClass5TW.A00(r15, r13)
            r11.A02 = r0
        L_0x04ce:
            int r12 = r12 + 1
            goto L_0x04ac
        L_0x04d1:
            int r4 = r4 + 1
            goto L_0x0478
        L_0x04d4:
            X.5R7 r0 = r10.A02
            if (r0 == 0) goto L_0x04db
            r0.AWL()
        L_0x04db:
            float r0 = r10.A00
            float r6 = r6 - r0
            java.lang.Object r0 = r11.getValue()
            X.IGX r0 = (X.IGX) r0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.A00(r0, r10, r6)
            goto L_0x0507
        L_0x04e8:
            float r0 = (float) r5
            r7.A00 = r0
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x04f5
            if (r5 <= 0) goto L_0x04f5
            r0 = r22
            r7.A01 = r0
        L_0x04f5:
            r0 = r22
            r10.A02(r7, r0)
            X.5Oz r1 = r10.A0I
            X.0gF r0 = X.C60340gF.A00
            r1.Epw(r0)
            float r0 = r10.A00
            float r6 = r6 - r0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.A00(r7, r10, r6)
        L_0x0507:
            float r1 = r10.A00
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x03b1
            float r9 = r9 - r1
            r10.A00 = r8
            goto L_0x03b1
        L_0x0516:
            r0 = 1309(0x51d, float:1.834E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0N(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0525:
            java.lang.String r0 = "setName"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x052c:
            java.lang.Object r0 = r5.A01
            X.IES r0 = (X.IES) r0
            X.0vr r0 = r0.A02
            long r0 = X.C51976G9y.A02(r0, r3)
            goto L_0x05f5
        L_0x0538:
            X.4cl r3 = (X.C268104cl) r3
            java.lang.Object r2 = r5.A01
            X.4cY r2 = (X.C267974cY) r2
            r1 = 0
            r0 = 0
            r3.A05(r2, r0, r1, r1)
            goto L_0x0680
        L_0x0545:
            X.4cl r3 = (X.C268104cl) r3
            java.lang.Object r6 = r5.A01
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            r4 = 0
        L_0x0550:
            if (r4 >= r5) goto L_0x0680
            java.lang.Object r2 = r6.get(r4)
            X.4cY r2 = (X.C267974cY) r2
            r1 = 0
            r0 = 0
            r3.A05(r2, r0, r1, r1)
            int r4 = r4 + 1
            goto L_0x0550
        L_0x0560:
            X.5ai r3 = (X.C287755ai) r3
            float r8 = r3.A01
            r9 = 0
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x056a
            r8 = 0
        L_0x056a:
            r7 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0572
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0572:
            float r6 = r3.A02
            r4 = -1090519040(0xffffffffbf000000, float:-0.5)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x057c
            r6 = -1090519040(0xffffffffbf000000, float:-0.5)
        L_0x057c:
            r2 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0584
            r6 = 1056964608(0x3f000000, float:0.5)
        L_0x0584:
            float r1 = r3.A03
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x05af
            r4 = r1
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x05af
        L_0x058f:
            float r1 = r3.A00
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x05ad
            r9 = r1
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x05ad
        L_0x059a:
            X.5Rc r0 = X.AnonymousClass5RX.A02
            long r1 = X.C285595Rx.A02(r0, r8, r6, r2, r7)
            java.lang.Object r0 = r5.A01
            X.5Rc r0 = (X.C285385Rc) r0
            long r0 = X.AnonymousClass5RW.A05(r0, r1)
            X.5RW r2 = X.C51965G9l.A0N(r0)
            return r2
        L_0x05ad:
            r7 = r9
            goto L_0x059a
        L_0x05af:
            r2 = r4
            goto L_0x058f
        L_0x05b1:
            X.5RU r3 = (X.AnonymousClass5RU) r3
            java.lang.Object r0 = r5.A01
            X.4gU r0 = (X.C270284gU) r0
            float r0 = X.C51971G9r.A03(r0)
            r3.EOX(r0)
            goto L_0x0680
        L_0x05c0:
            X.5cr r3 = (X.C289005cr) r3
            long r2 = r3.A00
            java.lang.Object r1 = r5.A01
            X.0sP r1 = (X.0sP) r1
            int r0 = X.C51965G9l.A04(r2)
            java.lang.Object r0 = X.C51968G9o.A0w(r0, r1)
            int r4 = X.AnonymousClass7TE.A0M(r0)
            int r0 = X.C289005cr.A00(r2)
            goto L_0x05f1
        L_0x05d9:
            X.5cr r3 = (X.C289005cr) r3
            long r2 = r3.A00
            int r4 = X.C51965G9l.A04(r2)
            java.lang.Object r1 = r5.A01
            X.0sP r1 = (X.0sP) r1
            int r0 = X.C289005cr.A00(r2)
            java.lang.Object r0 = X.C51968G9o.A0w(r0, r1)
            int r0 = X.AnonymousClass7TE.A0M(r0)
        L_0x05f1:
            long r0 = X.C289155d7.A00(r4, r0)
        L_0x05f5:
            X.5cr r2 = new X.5cr
            r2.<init>(r0)
            return r2
        L_0x05fb:
            X.5dM r3 = (X.C289295dM) r3
            long r2 = r3.A00
            java.lang.Object r0 = r5.A01
            X.I1S r0 = (X.I1S) r0
            X.GeM r1 = new X.GeM
            r1.<init>(r2)
            X.5Oz r0 = r0.A00
            r0.Epw(r1)
            goto L_0x0680
        L_0x060e:
            java.lang.Object r0 = r5.A01
            X.DbS.A1U(r0)
            goto L_0x0680
        L_0x0614:
            X.GPU r3 = (X.GPU) r3
            java.lang.Object r2 = r5.A01
            X.0sL r2 = (X.0sL) r2
            long r0 = X.GPS.A00(r3)
            float r0 = X.C289295dM.A01(r0)
            goto L_0x0631
        L_0x0623:
            X.GPU r3 = (X.GPU) r3
            java.lang.Object r2 = r5.A01
            X.0sL r2 = (X.0sL) r2
            long r0 = X.GPS.A00(r3)
            float r0 = X.C289295dM.A02(r0)
        L_0x0631:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.invoke(r3, r0)
            r3.A01()
            goto L_0x0680
        L_0x063c:
            float r1 = X.AnonymousClass7TE.A04(r3)
            java.lang.Object r0 = r5.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.0sP r0 = (X.0sP) r0
            X.C51967G9n.A1Q(r0, r1)
            goto L_0x0680
        L_0x064c:
            X.4cl r3 = (X.C268104cl) r3
            java.lang.Object r1 = r5.A01
            X.4cY r1 = (X.C267974cY) r1
            r0 = 0
            r3.A07(r1, r0, r0)
            goto L_0x0680
        L_0x0657:
            java.lang.Object r0 = r5.A01
            X.0rm r0 = (X.0rm) r0
            r0.A00 = r3
            goto L_0x0680
        L_0x065e:
            java.lang.Object r0 = r5.A01
            X.5Pl r0 = (X.C285045Pl) r0
            int r3 = r0.A00
            if (r3 <= 0) goto L_0x0680
            r2 = 0
            java.lang.Object[] r1 = r0.A02
        L_0x0669:
            r0 = r1[r2]
            X.5d6 r0 = (X.C289145d6) r0
            r0.E2n()
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x0669
            goto L_0x0680
        L_0x0675:
            X.4cl r3 = (X.C268104cl) r3
            java.lang.Object r2 = r5.A01
            X.4cY r2 = (X.C267974cY) r2
            r0 = 0
            r3.A08(r2, r0)
        L_0x0680:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0683:
            X.C51965G9l.A1U(r3)
            java.lang.Object r2 = r5.A01
            return r2
        L_0x0689:
            float r17 = X.AnonymousClass7TE.A04(r3)
            java.lang.Object r4 = r5.A01
            X.GZF r4 = (X.GZF) r4
            X.5Tp r0 = X.GZF.A0b
            int r0 = r4.A03()
            long r0 = (long) r0
            int r2 = r4.A05()
            long r2 = (long) r2
            long r0 = r0 * r2
            X.GZm r6 = r4.A0N
            X.5PZ r5 = r6.A04
            float r3 = r5.B6X()
            int r2 = r4.A05()
            float r2 = (float) r2
            float r3 = r3 * r2
            double r2 = (double) r3
            long r2 = X.AnonymousClass1GB.A02(r2)
            long r0 = r0 + r2
            float r7 = r4.A00
            float r7 = r7 + r17
            double r2 = (double) r7
            long r10 = X.AnonymousClass1GB.A02(r2)
            float r2 = (float) r10
            float r7 = r7 - r2
            r4.A00 = r7
            float r3 = java.lang.Math.abs(r17)
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0803
            long r10 = r10 + r0
            long r12 = r4.A08
            long r14 = r4.A07
            long r2 = X.C229632nm.A06(r10, r12, r14)
            r9 = 0
            r7 = 1
            int r8 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            boolean r16 = X.AnonymousClass7TF.A1P(r8)
            long r2 = r2 - r0
            float r12 = (float) r2
            r4.A01 = r12
            long r13 = java.lang.Math.abs(r2)
            r10 = 0
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x06ff
            X.5Oz r1 = r4.A0T
            r8 = 0
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            X.C51967G9n.A16(r1, r0)
            X.5Oz r1 = r4.A0S
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x06fc
            r9 = 1
        L_0x06fc:
            X.C51967G9n.A16(r1, r9)
        L_0x06ff:
            X.5Oz r0 = r4.A0C
            java.lang.Object r9 = r0.getValue()
            X.GZQ r9 = (X.GZQ) r9
            int r13 = (int) r2
            int r8 = -r13
            int r0 = r9.A05
            int r1 = r9.A06
            int r0 = r0 + r1
            boolean r1 = r9.A0G
            r10 = 0
            if (r1 != 0) goto L_0x07b4
            java.util.List r12 = r9.A0F
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L_0x07b4
            X.GaE r1 = r9.A0C
            if (r1 == 0) goto L_0x07b4
            int r1 = r9.A01
            int r1 = r1 - r8
            if (r1 < 0) goto L_0x07b4
            if (r1 >= r0) goto L_0x07b4
            float r11 = (float) r8
            float r1 = (float) r0
            float r11 = r11 / r1
            float r14 = r9.A00
            float r14 = r14 - r11
            X.GaE r1 = r9.A0B
            if (r1 == 0) goto L_0x07b4
            r1 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x07b4
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x07b4
            java.lang.Object r1 = X.00k.A0I(r12)
            X.GaE r1 = (X.C52640GaE) r1
            java.lang.Object r15 = X.00k.A0K(r12)
            X.GaE r15 = (X.C52640GaE) r15
            if (r8 >= 0) goto L_0x077a
            int r14 = r1.A01
            int r14 = r14 + r0
            int r1 = r9.A08
            int r14 = r14 - r1
            int r1 = r15.A01
            int r1 = r1 + r0
            int r0 = r9.A07
            int r1 = r1 - r0
            int r1 = java.lang.Math.min(r14, r1)
            int r0 = -r8
            if (r1 <= r0) goto L_0x07b4
        L_0x075d:
            float r0 = r9.A00
            float r0 = r0 - r11
            r9.A00 = r0
            int r0 = r9.A01
            int r0 = r0 - r8
            r9.A01 = r0
            int r5 = r12.size()
            r1 = 0
        L_0x076c:
            if (r1 >= r5) goto L_0x078b
            java.lang.Object r0 = r12.get(r1)
            X.GaE r0 = (X.C52640GaE) r0
            r0.A00(r8)
            int r1 = r1 + 1
            goto L_0x076c
        L_0x077a:
            int r14 = r9.A08
            int r0 = r1.A01
            int r14 = r14 - r0
            int r1 = r9.A07
            int r0 = r15.A01
            int r1 = r1 - r0
            int r0 = java.lang.Math.min(r14, r1)
            if (r0 <= r8) goto L_0x07b4
            goto L_0x075d
        L_0x078b:
            java.util.List r6 = r9.A0E
            int r5 = r6.size()
            r1 = 0
        L_0x0792:
            if (r1 >= r5) goto L_0x07a0
            java.lang.Object r0 = r6.get(r1)
            X.GaE r0 = (X.C52640GaE) r0
            r0.A00(r8)
            int r1 = r1 + 1
            goto L_0x0792
        L_0x07a0:
            java.util.List r5 = r9.A0D
            int r1 = r5.size()
        L_0x07a6:
            if (r10 >= r1) goto L_0x07e1
            java.lang.Object r0 = r5.get(r10)
            X.GaE r0 = (X.C52640GaE) r0
            r0.A00(r8)
            int r10 = r10 + 1
            goto L_0x07a6
        L_0x07b4:
            X.GZF r6 = r6.A03
            int r0 = r6.A05()
            if (r0 != 0) goto L_0x07d9
            r1 = 0
        L_0x07bd:
            float r0 = r5.B6X()
            float r0 = r0 + r1
            r5.EWt(r0)
            X.5Oz r0 = r4.A0W
            java.lang.Object r0 = r0.getValue()
            X.5R7 r0 = (X.AnonymousClass5R7) r0
            if (r0 == 0) goto L_0x07d2
            r0.AWL()
        L_0x07d2:
            int r0 = r4.A05
            int r0 = r0 + 1
            r4.A05 = r0
            goto L_0x07f9
        L_0x07d9:
            float r1 = (float) r13
            int r0 = r6.A05()
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x07bd
        L_0x07e1:
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x07e9
            if (r8 <= 0) goto L_0x07e9
            r9.A02 = r7
        L_0x07e9:
            r4.A08(r9, r7)
            X.5Oz r1 = r4.A0V
            X.0gF r0 = X.C60340gF.A00
            r1.Epw(r0)
            int r0 = r4.A06
            int r0 = r0 + 1
            r4.A06 = r0
        L_0x07f9:
            if (r16 == 0) goto L_0x0808
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
        L_0x07ff:
            float r17 = X.AnonymousClass7TE.A04(r0)
        L_0x0803:
            java.lang.Float r2 = java.lang.Float.valueOf(r17)
            return r2
        L_0x0808:
            java.lang.Float r0 = java.lang.Float.valueOf(r17)
            goto L_0x07ff
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J6G.invoke(java.lang.Object):java.lang.Object");
    }
}
