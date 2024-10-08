package X;

import java.util.HashSet;

/* renamed from: X.5RP  reason: invalid class name */
public final class AnonymousClass5RP {
    public C285045Pl A00;
    public C285045Pl A01;
    public C267794cD A02;
    public GSK A03;
    public C268054cg A04;
    public final C267794cD A05;
    public final C268834e4 A06;
    public final AnonymousClass5R6 A07;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.4cD, X.5VB] */
    public static final C267794cD A00(AnonymousClass5QQ r2, C267794cD r3) {
        C267794cD r1;
        if (r2 instanceof AnonymousClass5QP) {
            C267794cD A002 = ((AnonymousClass5QP) r2).A00();
            A002.A01 = AnonymousClass5WB.A02(A002);
            r1 = A002;
        } else {
            ? r12 = new C267794cD();
            r12.A01 = AnonymousClass5WB.A00(r2);
            r12.A00 = r2;
            r12.A02 = new HashSet();
            r1 = r12;
        }
        if (!(!r1.A08)) {
            I2E.A01("A ModifierNodeElement cannot return an already attached node from create() ");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A07 = true;
        C267794cD r0 = r3.A02;
        if (r0 != null) {
            r0.A04 = r1;
            r1.A02 = r0;
        }
        r3.A02 = r1;
        r1.A04 = r3;
        return r1;
    }

    public static final C267794cD A01(C267794cD r3) {
        if (r3.A08) {
            AnonymousClass5WB.A05(r3, -1, 2);
            r3.A0C();
            r3.A09();
        }
        C267794cD r2 = r3.A02;
        C267794cD r1 = r3.A04;
        if (r2 != null) {
            r2.A04 = r1;
            r3.A02 = null;
        }
        if (r1 != null) {
            r1.A02 = r2;
            r3.A04 = null;
        }
        0qQ.A0A(r1);
        return r1;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.Pzz, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v0, types: [X.Pzz, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ce, code lost:
        if (r2 != r3) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0114, code lost:
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0118, code lost:
        if ((r19 % 2) != 0) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011a, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        r0 = -r4;
        r18 = r0;
        r14 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0120, code lost:
        if (r14 > r4) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0124, code lost:
        if (r14 == r18) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0126, code lost:
        if (r14 == r4) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0132, code lost:
        if (r8[(r14 + 1) + r11] >= r8[(r14 - 1) + r11]) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0134, code lost:
        r3 = r8[(r14 + 1) + r11];
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013a, code lost:
        r1 = r25 - ((r23 - r2) - r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013f, code lost:
        if (r4 == 0) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0141, code lost:
        r16 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0143, code lost:
        if (r2 == r3) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0145, code lost:
        r16 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
        if (r2 <= r12) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014b, code lost:
        if (r1 <= r24) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0155, code lost:
        if (r5.A00(r2 - 1, r1 - 1) == false) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0157, code lost:
        r2 = r2 - 1;
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015c, code lost:
        r8[r14 + r11] = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0160, code lost:
        if (r17 == false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0162, code lost:
        r15 = r19 - r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0166, code lost:
        if (r15 < r18) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0168, code lost:
        if (r15 > r4) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016d, code lost:
        if (r10[r15 + r11] < r2) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x016f, code lost:
        r6[0] = r2;
        r6[1] = r1;
        r6[2] = r3;
        r6[3] = r16;
        r6[4] = 1;
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ba, code lost:
        r14 = r14 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01be, code lost:
        r3 = r8[(r14 - 1) + r11];
        r2 = r3 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C285045Pl r27, X.C285045Pl r28, X.C267794cD r29, X.AnonymousClass5RP r30, int r31, boolean r32) {
        /*
            r0 = r30
            X.GSK r5 = r0.A03
            r4 = r27
            r3 = r28
            r2 = r29
            r1 = r31
            r0 = r32
            if (r5 != 0) goto L_0x01cb
            X.GSK r5 = new X.GSK
            r6 = r4
            r7 = r3
            r8 = r2
            r9 = r30
            r10 = r1
            r11 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r9.A03 = r5
        L_0x001e:
            int r0 = r4.A00
            int r28 = r0 - r31
            int r0 = r3.A00
            int r27 = r0 - r31
            int r0 = r28 + r27
            int r0 = r0 + 1
            int r3 = r0 / 2
            int r0 = r3 * 3
            X.Pzz r7 = new X.Pzz
            r7.<init>()
            int[] r0 = new int[r0]
            r7.A01 = r0
            int r0 = r3 * 4
            X.Pzz r9 = new X.Pzz
            r9.<init>()
            int[] r0 = new int[r0]
            r9.A01 = r0
            r2 = 0
            r1 = r28
            r0 = r27
            r9.A02(r2, r1, r2, r0)
            int r0 = r3 * 2
            int r26 = r0 + 1
            r0 = r26
            int[] r10 = new int[r0]
            int[] r8 = new int[r0]
            r0 = 5
            int[] r6 = new int[r0]
        L_0x0057:
            int r0 = r9.A00
            if (r0 == 0) goto L_0x01d7
            int[] r1 = r9.A01
            int r0 = r0 + -1
            r9.A00 = r0
            r25 = r1[r0]
            int r0 = r0 + -1
            r9.A00 = r0
            r24 = r1[r0]
            int r0 = r0 + -1
            r9.A00 = r0
            r23 = r1[r0]
            int r0 = r0 + -1
            r9.A00 = r0
            r12 = r1[r0]
            int r22 = r23 - r12
            int r21 = r25 - r24
            r20 = 0
            r13 = 1
            r0 = r22
            if (r0 < r13) goto L_0x0057
            r0 = r21
            if (r0 < r13) goto L_0x0057
            int r0 = r22 + r21
            int r0 = r0 + 1
            int r0 = r0 / 2
            r29 = r0
            int r11 = r26 / 2
            int r0 = r11 + 1
            r10[r0] = r12
            r8[r0] = r23
            r4 = 0
        L_0x0095:
            r0 = r29
            if (r4 >= r0) goto L_0x0057
            int r19 = r22 - r21
            int r0 = java.lang.Math.abs(r19)
            int r0 = r0 % 2
            r18 = 0
            if (r0 != r13) goto L_0x00a7
            r18 = 1
        L_0x00a7:
            int r0 = -r4
            r17 = r0
            r14 = r0
        L_0x00ab:
            if (r14 > r4) goto L_0x0114
            r0 = r17
            if (r14 == r0) goto L_0x00bf
            if (r14 == r4) goto L_0x010c
            int r0 = r14 + 1
            int r0 = r0 + r11
            r1 = r10[r0]
            int r0 = r14 + -1
            int r0 = r0 + r11
            r0 = r10[r0]
            if (r1 <= r0) goto L_0x010c
        L_0x00bf:
            int r0 = r14 + 1
            int r0 = r0 + r11
            r3 = r10[r0]
            r2 = r3
        L_0x00c5:
            int r0 = r2 - r12
            int r1 = r24 + r0
            int r1 = r1 - r14
            if (r4 == 0) goto L_0x00d0
            int r16 = r1 + -1
            if (r2 == r3) goto L_0x00d2
        L_0x00d0:
            r16 = r1
        L_0x00d2:
            r0 = r23
            if (r2 >= r0) goto L_0x00e5
            r0 = r25
            if (r1 >= r0) goto L_0x00e5
            boolean r0 = r5.A00(r2, r1)
            if (r0 == 0) goto L_0x00e5
            int r2 = r2 + 1
            int r1 = r1 + 1
            goto L_0x00d2
        L_0x00e5:
            int r0 = r14 + r11
            r10[r0] = r2
            if (r18 == 0) goto L_0x0109
            int r15 = r19 - r14
            int r0 = r17 + 1
            if (r15 < r0) goto L_0x0109
            int r0 = r4 + -1
            if (r15 > r0) goto L_0x0109
            int r15 = r15 + r11
            r0 = r8[r15]
            if (r0 > r2) goto L_0x0109
            r6[r20] = r3
            r6[r13] = r16
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r1
            r0 = 4
            r6[r0] = r20
            r15 = 0
            goto L_0x017d
        L_0x0109:
            int r14 = r14 + 2
            goto L_0x00ab
        L_0x010c:
            int r0 = r14 + -1
            int r0 = r0 + r11
            r3 = r10[r0]
            int r2 = r3 + 1
            goto L_0x00c5
        L_0x0114:
            int r0 = r19 % 2
            r17 = 0
            if (r0 != 0) goto L_0x011c
            r17 = 1
        L_0x011c:
            int r0 = -r4
            r18 = r0
            r14 = r0
        L_0x0120:
            if (r14 > r4) goto L_0x01c7
            r0 = r18
            if (r14 == r0) goto L_0x0134
            if (r14 == r4) goto L_0x01be
            int r0 = r14 + 1
            int r0 = r0 + r11
            r1 = r8[r0]
            int r0 = r14 + -1
            int r0 = r0 + r11
            r0 = r8[r0]
            if (r1 >= r0) goto L_0x01be
        L_0x0134:
            int r0 = r14 + 1
            int r0 = r0 + r11
            r3 = r8[r0]
            r2 = r3
        L_0x013a:
            int r0 = r23 - r2
            int r0 = r0 - r14
            int r1 = r25 - r0
            if (r4 == 0) goto L_0x0145
            int r16 = r1 + 1
            if (r2 == r3) goto L_0x0147
        L_0x0145:
            r16 = r1
        L_0x0147:
            if (r2 <= r12) goto L_0x015c
            r0 = r24
            if (r1 <= r0) goto L_0x015c
            int r0 = r2 + -1
            int r15 = r1 + -1
            boolean r0 = r5.A00(r0, r15)
            if (r0 == 0) goto L_0x015c
            int r2 = r2 + -1
            int r1 = r1 + -1
            goto L_0x0147
        L_0x015c:
            int r0 = r14 + r11
            r8[r0] = r2
            if (r17 == 0) goto L_0x01ba
            int r15 = r19 - r14
            r0 = r18
            if (r15 < r0) goto L_0x01ba
            if (r15 > r4) goto L_0x01ba
            int r15 = r15 + r11
            r0 = r10[r15]
            if (r0 < r2) goto L_0x01ba
            r6[r20] = r2
            r6[r13] = r1
            r0 = 2
            r6[r0] = r3
            r0 = 3
            r6[r0] = r16
            r0 = 4
            r6[r0] = r13
            r15 = 1
        L_0x017d:
            r0 = 2
            r14 = r6[r0]
            r11 = r6[r20]
            int r14 = r14 - r11
            r4 = 3
            r3 = r6[r4]
            r2 = r6[r13]
            int r3 = r3 - r2
            int r1 = java.lang.Math.min(r14, r3)
            if (r1 <= 0) goto L_0x0197
            if (r3 == r14) goto L_0x01b6
            if (r15 == 0) goto L_0x01ae
            r0 = r11
        L_0x0194:
            r7.A01(r0, r2, r1)
        L_0x0197:
            r2 = r6[r20]
            r1 = r6[r13]
            r0 = r24
            r9.A02(r12, r2, r0, r1)
            r0 = 2
            r3 = r6[r0]
            r2 = r6[r4]
            r1 = r25
            r0 = r23
            r9.A02(r3, r0, r2, r1)
            goto L_0x0057
        L_0x01ae:
            int r0 = r11 + 1
            if (r3 <= r14) goto L_0x0194
            r0 = r11
            int r2 = r2 + 1
            goto L_0x0194
        L_0x01b6:
            r7.A01(r11, r2, r14)
            goto L_0x0197
        L_0x01ba:
            int r14 = r14 + 2
            goto L_0x0120
        L_0x01be:
            int r0 = r14 + -1
            int r0 = r0 + r11
            r3 = r8[r0]
            int r2 = r3 + -1
            goto L_0x013a
        L_0x01c7:
            int r4 = r4 + 1
            goto L_0x0095
        L_0x01cb:
            r5.A03 = r2
            r5.A00 = r1
            r5.A02 = r4
            r5.A01 = r3
            r5.A04 = r0
            goto L_0x001e
        L_0x01d7:
            int r1 = r7.A00
            int r0 = r1 % 3
            r2 = 0
            if (r0 != 0) goto L_0x02d7
            r0 = 3
            if (r1 <= r0) goto L_0x01e5
            int r1 = r1 - r0
            X.C7230Pzz.A00(r7, r2, r1)
        L_0x01e5:
            r1 = r28
            r0 = r27
            r7.A01(r1, r0, r2)
            r8 = 0
            r6 = 0
            r4 = 0
        L_0x01ef:
            int r0 = r7.A00
            if (r8 >= r0) goto L_0x02c1
            int[] r1 = r7.A01
            r9 = r1[r8]
            int r0 = r8 + 2
            r12 = r1[r0]
            int r9 = r9 - r12
            int r0 = r8 + 1
            r10 = r1[r0]
            int r10 = r10 - r12
            int r8 = r8 + 3
        L_0x0203:
            if (r6 >= r9) goto L_0x0234
            X.4cD r0 = r5.A03
            X.4cD r3 = r0.A02
            X.0qQ.A0A(r3)
            X.5RP r2 = r5.A05
            int r0 = r3.A01
            r0 = r0 & 2
            if (r0 == 0) goto L_0x022b
            X.4cg r1 = r3.A05
            X.0qQ.A0A(r1)
            X.4cg r0 = r1.A07
            X.4cg r1 = r1.A06
            X.0qQ.A0A(r1)
            if (r0 == 0) goto L_0x0224
            r0.A06 = r1
        L_0x0224:
            r1.A07 = r0
            X.4cD r0 = r5.A03
            A04(r0, r2, r1)
        L_0x022b:
            X.4cD r0 = A01(r3)
            r5.A03 = r0
            int r6 = r6 + 1
            goto L_0x0203
        L_0x0234:
            if (r4 >= r10) goto L_0x028e
            int r2 = r5.A00
            int r2 = r2 + r4
            X.4cD r1 = r5.A03
            X.5RP r11 = r5.A05
            X.5Pl r0 = r5.A01
            java.lang.Object[] r0 = r0.A02
            r0 = r0[r2]
            X.5QQ r0 = (X.AnonymousClass5QQ) r0
            X.4cD r1 = A00(r0, r1)
            r5.A03 = r1
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x028a
            X.4cD r0 = r1.A02
            X.0qQ.A0A(r0)
            X.4cg r9 = r0.A05
            X.0qQ.A0A(r9)
            X.4cD r3 = r5.A03
            X.4dO r2 = X.AnonymousClass5WH.A01(r3)
            if (r2 == 0) goto L_0x0286
            X.5R6 r0 = r11.A07
            X.5cD r1 = new X.5cD
            r1.<init>(r2, r0)
            r3.A07(r1)
            A04(r3, r11, r1)
            X.4cg r0 = r9.A07
            r1.A07 = r0
            r1.A06 = r9
            r9.A07 = r1
        L_0x0276:
            r3.A08()
            X.4cD r0 = r5.A03
            r0.A0B()
            X.4cD r0 = r5.A03
            X.AnonymousClass5WB.A03(r0)
        L_0x0283:
            int r4 = r4 + 1
            goto L_0x0234
        L_0x0286:
            r3.A07(r9)
            goto L_0x0276
        L_0x028a:
            r0 = 1
            r1.A07 = r0
            goto L_0x0283
        L_0x028e:
            int r9 = r12 + -1
            if (r12 <= 0) goto L_0x01ef
            X.4cD r0 = r5.A03
            X.4cD r0 = r0.A02
            X.0qQ.A0A(r0)
            r5.A03 = r0
            X.5Pl r0 = r5.A02
            int r3 = r5.A00
            int r1 = r3 + r6
            java.lang.Object[] r0 = r0.A02
            r2 = r0[r1]
            X.5QQ r2 = (X.AnonymousClass5QQ) r2
            X.5Pl r0 = r5.A01
            int r3 = r3 + r4
            java.lang.Object[] r0 = r0.A02
            r1 = r0[r3]
            X.5QQ r1 = (X.AnonymousClass5QQ) r1
            boolean r0 = X.0qQ.A0K(r2, r1)
            if (r0 != 0) goto L_0x02bb
            X.4cD r0 = r5.A03
            A03(r2, r1, r0)
        L_0x02bb:
            int r6 = r6 + 1
            int r4 = r4 + 1
            r12 = r9
            goto L_0x028e
        L_0x02c1:
            r0 = r30
            X.4cD r0 = r0.A05
            X.4cD r2 = r0.A04
            r1 = 0
        L_0x02c8:
            if (r2 == 0) goto L_0x02d6
            X.5VV r0 = X.AnonymousClass5VU.A00
            if (r2 == r0) goto L_0x02d6
            int r0 = r2.A01
            r1 = r1 | r0
            r2.A00 = r1
            X.4cD r2 = r2.A04
            goto L_0x02c8
        L_0x02d6:
            return
        L_0x02d7:
            java.lang.String r0 = "Array size not a multiple of 3"
            X.I2E.A01(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5RP.A02(X.5Pl, X.5Pl, X.4cD, X.5RP, int, boolean):void");
    }

    public static final void A03(AnonymousClass5QQ r1, AnonymousClass5QQ r2, C267794cD r3) {
        if ((r1 instanceof AnonymousClass5QP) && (r2 instanceof AnonymousClass5QP)) {
            AnonymousClass5VV r0 = AnonymousClass5VU.A00;
            0qQ.A0C(r3, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((AnonymousClass5QP) r2).A01(r3);
        } else if (r3 instanceof AnonymousClass5VB) {
            AnonymousClass5VB r12 = (AnonymousClass5VB) r3;
            if (r12.A08) {
                AnonymousClass5VB.A00(r12);
            }
            r12.A00 = r2;
            r12.A01 = AnonymousClass5WB.A00(r2);
            if (r12.A08) {
                AnonymousClass5VB.A01(r12, false);
            }
        } else {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        if (r3.A08) {
            AnonymousClass5WB.A04(r3);
        } else {
            r3.A09 = true;
        }
    }

    public static final void A04(C267794cD r1, AnonymousClass5RP r2, C268054cg r3) {
        C268834e4 r0;
        while (true) {
            r1 = r1.A04;
            if (r1 == null) {
                return;
            }
            if (r1 == AnonymousClass5VU.A00) {
                AnonymousClass5R6 A0B = r2.A07.A0B();
                if (A0B != null) {
                    r0 = A0B.A0W.A06;
                } else {
                    r0 = null;
                }
                r3.A07 = r0;
                r2.A04 = r3;
                return;
            } else if ((r1.A01 & 2) == 0) {
                r1.A07(r3);
            } else {
                return;
            }
        }
    }

    public final void A05() {
        for (C267794cD r1 = this.A02; r1 != null; r1 = r1.A02) {
            r1.A0B();
            if (r1.A07) {
                AnonymousClass5WB.A03(r1);
            }
            if (r1.A09) {
                AnonymousClass5WB.A04(r1);
            }
            r1.A07 = false;
            r1.A09 = false;
        }
    }

    public final void A06() {
        C268834e4 r0;
        C288625cD r1;
        C268054cg r4 = this.A06;
        C267794cD r3 = this.A05;
        while (true) {
            r3 = r3.A04;
            if (r3 == null) {
                break;
            }
            C268434dO A012 = AnonymousClass5WH.A01(r3);
            if (A012 != null) {
                C268054cg r12 = r3.A05;
                if (r12 != null) {
                    C288625cD r13 = (C288625cD) r12;
                    C268434dO r02 = r13.A01;
                    r13.A0q(A012);
                    r1 = r13;
                    if (r02 != r3) {
                        C289195dB r03 = r13.A08;
                        r1 = r13;
                        if (r03 != null) {
                            r03.invalidate();
                            r1 = r13;
                        }
                    }
                } else {
                    C288625cD r14 = new C288625cD(A012, this.A07);
                    r3.A07(r14);
                    r1 = r14;
                }
                r4.A07 = r1;
                r1.A06 = r4;
                r4 = r1;
            } else {
                r3.A07(r4);
            }
        }
        AnonymousClass5R6 A0B = this.A07.A0B();
        if (A0B != null) {
            r0 = A0B.A0W.A06;
        } else {
            r0 = null;
        }
        r4.A07 = r0;
        this.A04 = r4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        C267794cD r0 = this.A02;
        C267794cD r3 = this.A05;
        if (r0 != r3) {
            while (true) {
                if (r0 != null && r0 != r3) {
                    sb.append(String.valueOf(r0));
                    if (r0.A02 == r3) {
                        break;
                    }
                    sb.append(",");
                    r0 = r0.A02;
                } else {
                    break;
                }
            }
            String obj = sb.toString();
            0qQ.A07(obj);
            return obj;
        }
        sb.append("]");
        String obj2 = sb.toString();
        0qQ.A07(obj2);
        return obj2;
    }

    public AnonymousClass5RP(AnonymousClass5R6 r2) {
        this.A07 = r2;
        C268834e4 r0 = new C268834e4(r2);
        this.A06 = r0;
        this.A04 = r0;
        AnonymousClass5SH r02 = r0.A01;
        this.A05 = r02;
        this.A02 = r02;
    }
}
