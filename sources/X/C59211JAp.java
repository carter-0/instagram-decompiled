package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;

/* renamed from: X.JAp  reason: case insensitive filesystem */
public final class C59211JAp extends 0Yg implements 0sL {
    public final /* synthetic */ C287295Zu A00;
    public final /* synthetic */ C287325Zx A01;
    public final /* synthetic */ C304836Fk A02;
    public final /* synthetic */ JLA A03;
    public final /* synthetic */ LazyGridState A04;
    public final /* synthetic */ C285855Sz A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ C262224Cq A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59211JAp(C287295Zu r2, C287325Zx r3, C304836Fk r4, JLA jla, LazyGridState lazyGridState, C285855Sz r7, C62320sa r8, C262224Cq r9, boolean z, boolean z2) {
        super(2);
        this.A04 = lazyGridState;
        this.A08 = z;
        this.A02 = r4;
        this.A09 = z2;
        this.A06 = r8;
        this.A03 = jla;
        this.A01 = r3;
        this.A00 = r2;
        this.A07 = r9;
        this.A05 = r7;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v140, resolved type: X.Hqw} */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0354, code lost:
        if (java.lang.Math.abs(r26) < java.lang.Math.abs(r11)) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x060c, code lost:
        if (r3 > r4) goto L_0x060e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r65, java.lang.Object r66) {
        /*
            r64 = this;
            r1 = r66
            r22 = r65
            r0 = r22
            X.6Iq r0 = (X.C305586Iq) r0
            r22 = r0
            androidx.compose.ui.unit.Constraints r1 = (androidx.compose.ui.unit.Constraints) r1
            long r0 = r1.A00
            r18 = r0
            r3 = r64
            androidx.compose.foundation.lazy.grid.LazyGridState r0 = r3.A04
            r63 = r0
            X.5Oz r0 = r0.A0I
            r0.getValue()
            boolean r15 = r3.A08
            if (r15 == 0) goto L_0x017a
            X.6Gj r2 = X.AnonymousClass6Gj.Vertical
        L_0x0021:
            r0 = r18
            X.AnonymousClass6J2.A00(r2, r0)
            X.6Fk r4 = r3.A02
            X.5Q8 r2 = r22.getLayoutDirection()
            if (r15 == 0) goto L_0x0172
            X.6Fj r4 = (X.C304826Fj) r4
            X.5Q8 r38 = X.AnonymousClass5Q8.Ltr
            r0 = r38
            if (r2 == r0) goto L_0x0176
            float r1 = r4.A01
        L_0x0038:
            r0 = r22
            int r7 = r0.EJS(r1)
            if (r15 == 0) goto L_0x016e
            r0 = r38
            if (r2 == r0) goto L_0x016e
            float r1 = r4.A02
        L_0x0046:
            r0 = r22
            int r2 = r0.EJS(r1)
            float r1 = r4.A03
            int r6 = r0.EJS(r1)
            float r1 = r4.A00
            int r13 = r0.EJS(r1)
            int r20 = r6 + r13
            int r21 = r7 + r2
            if (r15 == 0) goto L_0x0162
            r39 = r20
            boolean r0 = r3.A09
            r37 = r0
            if (r0 != 0) goto L_0x0067
            r13 = r6
        L_0x0067:
            int r39 = r39 - r13
            r0 = r21
            int r4 = -r0
            r0 = r20
            int r2 = -r0
            r0 = r18
            long r16 = X.AnonymousClass5SF.A06(r0, r4, r2)
            X.0sa r0 = r3.A06
            java.lang.Object r5 = r0.invoke()
            X.JSi r5 = (X.C59663JSi) r5
            r0 = r5
            X.IF5 r0 = (X.IF5) r0
            X.GeT r0 = r0.A00
            X.I1v r2 = r0.A01
            X.JLA r4 = r3.A03
            X.IF9 r4 = (X.IF9) r4
            X.Hjw r8 = r4.A02
            if (r8 == 0) goto L_0x0143
            long r0 = r4.A01
            int r9 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r9 != 0) goto L_0x0143
            float r0 = r4.A00
            float r1 = r22.AwL()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0143
            X.0qQ.A0A(r8)
        L_0x009f:
            int[] r0 = r8.A01
            int r0 = r0.length
            r62 = r0
            int r1 = r2.A04
            if (r0 == r1) goto L_0x00c6
            r2.A04 = r0
            java.util.ArrayList r4 = r2.A07
            r4.clear()
            r1 = 0
            X.Hjx r0 = new X.Hjx
            r0.<init>(r1, r1)
            r4.add(r0)
            r2.A01 = r1
            r2.A02 = r1
            r2.A03 = r1
            r0 = -1
            r2.A00 = r0
            java.util.List r0 = r2.A08
            r0.clear()
        L_0x00c6:
            if (r15 == 0) goto L_0x013a
            X.5Zx r0 = r3.A01
            if (r0 == 0) goto L_0x06ca
            float r1 = r0.By0()
        L_0x00d0:
            r0 = r22
            int r40 = r0.EJS(r1)
            int r25 = r5.getItemCount()
            if (r15 == 0) goto L_0x0133
            int r4 = androidx.compose.ui.unit.Constraints.A00(r18)
            int r4 = r4 - r20
        L_0x00e2:
            if (r37 == 0) goto L_0x00e9
            if (r4 > 0) goto L_0x00e9
            if (r15 == 0) goto L_0x0131
            int r6 = r6 + r4
        L_0x00e9:
            long r48 = X.AnonymousClass5TW.A00(r7, r6)
            X.IFJ r36 = new X.IFJ
            r41 = r36
            r42 = r5
            r43 = r63
            r44 = r0
            r45 = r40
            r46 = r13
            r47 = r39
            r50 = r15
            r51 = r37
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r50, r51)
            X.Hro r7 = new X.Hro
            r26 = r7
            r27 = r36
            r28 = r8
            r29 = r2
            r30 = r25
            r31 = r40
            r32 = r15
            r26.<init>(r27, r28, r29, r30, r31, r32)
            r1 = 24
            X.J6U r23 = new X.J6U
            r0 = r23
            r0.<init>(r1, r7, r2)
            androidx.compose.runtime.snapshots.Snapshot r8 = X.AnonymousClass5PH.A02()
            if (r8 == 0) goto L_0x012f
            X.0sP r6 = r8.A05()
        L_0x012a:
            androidx.compose.runtime.snapshots.Snapshot r1 = X.AnonymousClass5PH.A03(r8)
            goto L_0x017e
        L_0x012f:
            r6 = 0
            goto L_0x012a
        L_0x0131:
            int r7 = r7 + r4
            goto L_0x00e9
        L_0x0133:
            int r4 = androidx.compose.ui.unit.Constraints.A01(r18)
            int r4 = r4 - r21
            goto L_0x00e2
        L_0x013a:
            X.5Zu r0 = r3.A00
            if (r0 == 0) goto L_0x06d5
            float r1 = r0.By0()
            goto L_0x00d0
        L_0x0143:
            r0 = r18
            r4.A01 = r0
            float r0 = r22.AwL()
            r4.A00 = r0
            X.0sL r9 = r4.A03
            androidx.compose.ui.unit.Constraints r8 = new androidx.compose.ui.unit.Constraints
            r0 = r18
            r8.<init>(r0)
            r0 = r22
            java.lang.Object r8 = r9.invoke(r0, r8)
            X.Hjw r8 = (X.C55576Hjw) r8
            r4.A02 = r8
            goto L_0x009f
        L_0x0162:
            r39 = r21
            boolean r0 = r3.A09
            r37 = r0
            r13 = r2
            if (r0 != 0) goto L_0x0067
            r13 = r7
            goto L_0x0067
        L_0x016e:
            float r1 = r4.A01
            goto L_0x0046
        L_0x0172:
            X.5Q8 r38 = X.AnonymousClass5Q8.Ltr
            X.6Fj r4 = (X.C304826Fj) r4
        L_0x0176:
            float r1 = r4.A02
            goto L_0x0038
        L_0x017a:
            X.6Gj r2 = X.AnonymousClass6Gj.Horizontal
            goto L_0x0021
        L_0x017e:
            r0 = r63
            X.I46 r9 = r0.A09     // Catch:{ all -> 0x06c5 }
            X.5dh r0 = r9.A03     // Catch:{ all -> 0x06c5 }
            int r11 = r0.BI6()     // Catch:{ all -> 0x06c5 }
            java.lang.Object r10 = r9.A00     // Catch:{ all -> 0x06c5 }
            int r10 = X.AnonymousClass6J5.A00(r5, r10, r11)     // Catch:{ all -> 0x06c5 }
            if (r11 == r10) goto L_0x0198
            r0.EZz(r10)     // Catch:{ all -> 0x06c5 }
            X.6Gv r0 = r9.A02     // Catch:{ all -> 0x06c5 }
            r0.A00(r11)     // Catch:{ all -> 0x06c5 }
        L_0x0198:
            r0 = r25
            if (r10 < r0) goto L_0x01a6
            if (r25 <= 0) goto L_0x01a6
            int r0 = r25 + -1
            int r12 = r2.A01(r0)     // Catch:{ all -> 0x06c5 }
            r2 = 0
            goto L_0x01b0
        L_0x01a6:
            int r12 = r2.A01(r10)     // Catch:{ all -> 0x06c5 }
            X.5dh r0 = r9.A04     // Catch:{ all -> 0x06c5 }
            int r2 = r0.BI6()     // Catch:{ all -> 0x06c5 }
        L_0x01b0:
            X.AnonymousClass5PH.A06(r8, r1, r6)
            r0 = r63
            X.6HC r1 = r0.A0D
            X.6H6 r0 = r0.A0B
            java.util.List r24 = X.AnonymousClass6J6.A00(r0, r5, r1)
            r0 = r63
            float r0 = r0.A00
            r27 = r0
            r0 = r63
            X.6H4 r0 = r0.A0C
            r57 = r0
            r0 = r63
            X.5Oz r0 = r0.A0J
            r61 = r0
            X.5Zx r0 = r3.A01
            r35 = r0
            X.5Zu r0 = r3.A00
            r34 = r0
            X.4Cq r0 = r3.A07
            r60 = r0
            X.5Sz r0 = r3.A05
            r48 = r0
            r8 = 0
            if (r13 < 0) goto L_0x06be
            if (r39 < 0) goto L_0x06b7
            if (r25 > 0) goto L_0x0284
            int r31 = androidx.compose.ui.unit.Constraints.A03(r16)
            int r32 = androidx.compose.ui.unit.Constraints.A02(r16)
            java.util.ArrayList r28 = X.AnonymousClass7TE.A1C()
            r0 = r36
            X.JSi r0 = r0.A01
            X.IF5 r0 = (X.IF5) r0
            X.6Ix r0 = r0.A01
            r24 = r57
            r25 = r0
            r26 = r36
            r27 = r48
            r29 = r60
            r30 = r8
            r33 = r62
            r34 = r8
            r35 = r8
            r36 = r15
            r37 = r8
            r38 = r8
            r24.A07(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            long r5 = r57.A04()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0231
            int r2 = X.C51965G9l.A04(r5)
            r0 = r16
            int r31 = X.AnonymousClass5SF.A03(r0, r2)
            int r2 = X.C289005cr.A00(r5)
            int r32 = X.AnonymousClass5SF.A02(r0, r2)
        L_0x0231:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r32)
            X.Iyv r3 = X.C58870Iyv.A00
            int r5 = r1.intValue()
            int r2 = r0.intValue()
            int r5 = r5 + r21
            r0 = r18
            int r5 = X.AnonymousClass5SF.A03(r0, r5)
            int r2 = r2 + r20
            int r1 = X.AnonymousClass5SF.A02(r0, r2)
            r0 = r22
            X.5d6 r28 = X.C51969G9p.A0a(r0, r3, r5, r1)
            X.0sn r30 = X.0sn.A00
            int r1 = -r13
            int r4 = r4 + r39
            if (r15 == 0) goto L_0x0281
            X.6Gj r26 = X.AnonymousClass6Gj.Vertical
        L_0x0260:
            r27 = 0
            r33 = 0
            X.IGW r0 = new X.IGW
            r29 = r22
            r31 = r23
            r32 = r60
            r35 = r62
            r36 = r1
            r37 = r4
            r41 = r8
            r42 = r8
            r25 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
        L_0x027b:
            r1 = r63
            r1.A02(r0, r8)
            return r0
        L_0x0281:
            X.6Gj r26 = X.AnonymousClass6Gj.Horizontal
            goto L_0x0260
        L_0x0284:
            int r11 = java.lang.Math.round(r27)
            r26 = r11
            int r2 = r2 - r11
            if (r12 != 0) goto L_0x0291
            if (r2 >= 0) goto L_0x0291
            int r11 = r11 + r2
            r2 = 0
        L_0x0291:
            X.01W r6 = new X.01W
            r6.<init>()
            int r0 = -r13
            r33 = r0
            r10 = 0
            if (r40 >= 0) goto L_0x029e
            r10 = r40
        L_0x029e:
            int r10 = r10 + r0
            int r2 = r2 + r10
        L_0x02a0:
            if (r2 >= 0) goto L_0x02b1
            if (r12 <= 0) goto L_0x02b1
            int r12 = r12 + -1
            X.Hqw r0 = r7.A01(r12)
            r6.add(r8, r0)
            int r0 = r0.A02
            int r2 = r2 + r0
            goto L_0x02a0
        L_0x02b1:
            if (r2 >= r10) goto L_0x02b5
            int r11 = r11 + r2
            r2 = r10
        L_0x02b5:
            int r2 = r2 - r10
            int r32 = r4 + r39
            r14 = r32
            if (r14 >= r8) goto L_0x02bd
            r14 = 0
        L_0x02bd:
            int r3 = -r2
            r9 = r12
            r1 = 0
            r58 = 0
        L_0x02c2:
            int r0 = r6.size()
            if (r1 >= r0) goto L_0x02de
            if (r3 < r14) goto L_0x02d0
            r6.remove(r1)
            r58 = 1
            goto L_0x02c2
        L_0x02d0:
            int r9 = r9 + 1
            java.lang.Object r0 = r6.get(r1)
            X.Hqw r0 = (X.C55990Hqw) r0
            int r0 = r0.A02
            int r3 = r3 + r0
            int r1 = r1 + 1
            goto L_0x02c2
        L_0x02de:
            r0 = r25
            if (r9 >= r0) goto L_0x0322
            if (r3 < r14) goto L_0x02ec
            if (r3 <= 0) goto L_0x02ec
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0322
        L_0x02ec:
            X.Hqw r5 = r7.A01(r9)
            X.IFG[] r0 = r5.A03
            int r0 = r0.length
            if (r0 == 0) goto L_0x0322
            int r0 = r5.A02
            int r3 = r3 + r0
            if (r3 > r10) goto L_0x030a
            X.IFG[] r1 = r5.A03
            X.0qQ.A0B(r1, r8)
            int r0 = r1.length
            if (r0 != 0) goto L_0x030e
            java.lang.String r1 = "Array is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x030a:
            r6.add(r5)
            goto L_0x031f
        L_0x030e:
            int r0 = r0 + -1
            r0 = r1[r0]
            int r1 = r0.A08
            int r0 = r25 + -1
            if (r1 == r0) goto L_0x030a
            int r12 = r9 + 1
            int r0 = r5.A02
            int r2 = r2 - r0
            r58 = 1
        L_0x031f:
            int r9 = r9 + 1
            goto L_0x02de
        L_0x0322:
            if (r3 >= r4) goto L_0x033f
            int r1 = r4 - r3
            int r2 = r2 - r1
            int r3 = r3 + r1
        L_0x0328:
            if (r2 >= r13) goto L_0x0339
            if (r12 <= 0) goto L_0x0339
            int r12 = r12 + -1
            X.Hqw r0 = r7.A01(r12)
            r6.add(r8, r0)
            int r0 = r0.A02
            int r2 = r2 + r0
            goto L_0x0328
        L_0x0339:
            int r11 = r11 + r1
            if (r2 >= 0) goto L_0x033f
            int r11 = r11 + r2
            int r3 = r3 + r2
            r2 = 0
        L_0x033f:
            int r1 = java.lang.Integer.signum(r26)
            int r0 = java.lang.Integer.signum(r11)
            if (r1 != r0) goto L_0x0356
            int r1 = java.lang.Math.abs(r26)
            int r0 = java.lang.Math.abs(r11)
            float r5 = (float) r11
            r59 = r5
            if (r1 >= r0) goto L_0x0358
        L_0x0356:
            r59 = r27
        L_0x0358:
            if (r2 < 0) goto L_0x06b0
            int r5 = -r2
            java.lang.Object r27 = r6.A0O()
            r0 = r27
            X.Hqw r0 = (X.C55990Hqw) r0
            r27 = r0
            X.IFG[] r1 = r0.A03
            X.0qQ.A0B(r1, r8)
            int r0 = r1.length
            if (r0 == 0) goto L_0x03ce
            r0 = r1[r8]
            if (r0 == 0) goto L_0x03ce
            int r0 = r0.A08
            r29 = r0
        L_0x0375:
            java.lang.Object r0 = r6.A0R()
            X.Hqw r0 = (X.C55990Hqw) r0
            if (r0 == 0) goto L_0x03cb
            X.IFG[] r1 = r0.A03
            int r0 = r1.length
            r9 = 1
            if (r0 == 0) goto L_0x03cb
            int r0 = r0 - r9
            r0 = r1[r0]
            if (r0 == 0) goto L_0x03cb
            int r0 = r0.A08
            r30 = r0
        L_0x038c:
            int r11 = r24.size()
            r28 = 0
            r31 = r28
            r9 = 0
        L_0x0395:
            if (r9 >= r11) goto L_0x03d1
            r0 = r24
            int r1 = X.C51971G9r.A0I(r0, r9)
            if (r1 < 0) goto L_0x03c8
            r0 = r29
            if (r1 >= r0) goto L_0x03c8
            X.I1v r0 = r7.A04
            int r10 = r0.A02(r1)
            long r46 = r7.A00(r8, r10)
            r0 = r36
            int r0 = r0.A00
            r42 = r1
            r43 = r8
            r44 = r10
            r45 = r0
            X.IFG r1 = r41.A00(r42, r43, r44, r45, r46)
            if (r31 != 0) goto L_0x03c3
            java.util.ArrayList r31 = X.AnonymousClass7TE.A1C()
        L_0x03c3:
            r0 = r31
            r0.add(r1)
        L_0x03c8:
            int r9 = r9 + 1
            goto L_0x0395
        L_0x03cb:
            r30 = 0
            goto L_0x038c
        L_0x03ce:
            r29 = 0
            goto L_0x0375
        L_0x03d1:
            if (r31 != 0) goto L_0x03d5
            X.0sn r31 = X.0sn.A00
        L_0x03d5:
            int r11 = r24.size()
            r9 = 0
        L_0x03da:
            if (r9 >= r11) goto L_0x0412
            r0 = r24
            int r1 = X.C51971G9r.A0I(r0, r9)
            int r0 = r30 + 1
            if (r0 > r1) goto L_0x040f
            r0 = r25
            if (r1 >= r0) goto L_0x040f
            X.I1v r0 = r7.A04
            int r10 = r0.A02(r1)
            long r46 = r7.A00(r8, r10)
            r0 = r36
            int r0 = r0.A00
            r42 = r1
            r43 = r8
            r44 = r10
            r45 = r0
            X.IFG r1 = r41.A00(r42, r43, r44, r45, r46)
            if (r28 != 0) goto L_0x040a
            java.util.ArrayList r28 = X.AnonymousClass7TE.A1C()
        L_0x040a:
            r0 = r28
            r0.add(r1)
        L_0x040f:
            int r9 = r9 + 1
            goto L_0x03da
        L_0x0412:
            if (r28 != 0) goto L_0x0416
            X.0sn r28 = X.0sn.A00
        L_0x0416:
            if (r13 > 0) goto L_0x041a
            if (r40 >= 0) goto L_0x0441
        L_0x041a:
            int r7 = r6.size()
            r1 = 0
        L_0x041f:
            if (r1 >= r7) goto L_0x0441
            java.lang.Object r0 = r6.get(r1)
            X.Hqw r0 = (X.C55990Hqw) r0
            int r9 = r0.A02
            if (r2 == 0) goto L_0x0441
            if (r9 > r2) goto L_0x0441
            int r0 = X.C51970G9q.A0A(r6)
            if (r1 == r0) goto L_0x0441
            int r2 = r2 - r9
            int r1 = r1 + 1
            java.lang.Object r27 = r6.get(r1)
            r0 = r27
            X.Hqw r0 = (X.C55990Hqw) r0
            r27 = r0
            goto L_0x041f
        L_0x0441:
            if (r15 == 0) goto L_0x046d
            int r9 = androidx.compose.ui.unit.Constraints.A01(r16)
        L_0x0447:
            r56 = r9
            if (r15 == 0) goto L_0x0466
            r0 = r16
            int r10 = X.AnonymousClass5SF.A02(r0, r3)
            r26 = r10
        L_0x0453:
            r0 = r26
            int r0 = java.lang.Math.min(r0, r4)
            r12 = 0
            if (r3 >= r0) goto L_0x0474
            r12 = 1
            if (r5 == 0) goto L_0x0474
            java.lang.String r0 = "non-zero firstLineScrollOffset"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0466:
            int r10 = androidx.compose.ui.unit.Constraints.A00(r16)
            r26 = r9
            goto L_0x0453
        L_0x046d:
            r0 = r16
            int r9 = X.AnonymousClass5SF.A03(r0, r3)
            goto L_0x0447
        L_0x0474:
            int r7 = r6.size()
            r1 = 0
            r11 = 0
        L_0x047a:
            if (r1 >= r7) goto L_0x0489
            java.lang.Object r0 = r6.get(r1)
            X.Hqw r0 = (X.C55990Hqw) r0
            X.IFG[] r0 = r0.A03
            int r0 = r0.length
            int r11 = r11 + r0
            int r1 = r1 + 1
            goto L_0x047a
        L_0x0489:
            java.util.ArrayList r7 = X.DbS.A0v(r11)
            if (r12 == 0) goto L_0x04c4
            boolean r0 = r31.isEmpty()
            if (r0 == 0) goto L_0x069b
            boolean r0 = r28.isEmpty()
            if (r0 == 0) goto L_0x069b
            int r12 = r6.size()
            int[] r13 = new int[r12]
            r1 = 0
        L_0x04a2:
            if (r1 >= r12) goto L_0x04b8
            r0 = r1
            if (r37 == 0) goto L_0x04ab
            int r0 = r12 - r1
            int r0 = r0 + -1
        L_0x04ab:
            java.lang.Object r0 = r6.get(r0)
            X.Hqw r0 = (X.C55990Hqw) r0
            int r0 = r0.A01
            r13[r1] = r0
            int r1 = r1 + 1
            goto L_0x04a2
        L_0x04b8:
            int[] r0 = new int[r12]
            r24 = r0
            r0 = 0
        L_0x04bd:
            if (r0 >= r12) goto L_0x0522
            r24[r0] = r8
            int r0 = r0 + 1
            goto L_0x04bd
        L_0x04c4:
            int r11 = X.C51966G9m.A06(r31)
            if (r11 < 0) goto L_0x04e2
            r1 = r5
        L_0x04cb:
            int r12 = r11 + -1
            r0 = r31
            java.lang.Object r11 = r0.get(r11)
            X.IFG r11 = (X.IFG) r11
            int r0 = r11.A0A
            int r1 = r1 - r0
            r11.E3D(r1, r8, r9, r10)
            r7.add(r11)
            if (r12 < 0) goto L_0x04e2
            r11 = r12
            goto L_0x04cb
        L_0x04e2:
            int r24 = r6.size()
            r12 = 0
        L_0x04e7:
            r0 = r24
            if (r12 >= r0) goto L_0x0507
            java.lang.Object r11 = r6.get(r12)
            X.Hqw r11 = (X.C55990Hqw) r11
            X.IFG[] r1 = r11.A00(r5, r9, r10)
            int r14 = r1.length
            r0 = 0
        L_0x04f7:
            if (r0 >= r14) goto L_0x0501
            r13 = r1[r0]
            r7.add(r13)
            int r0 = r0 + 1
            goto L_0x04f7
        L_0x0501:
            int r0 = r11.A02
            int r5 = r5 + r0
            int r12 = r12 + 1
            goto L_0x04e7
        L_0x0507:
            int r6 = r28.size()
            r1 = 0
        L_0x050c:
            if (r1 >= r6) goto L_0x0548
            r0 = r28
            java.lang.Object r0 = r0.get(r1)
            X.IFG r0 = (X.IFG) r0
            r0.E3D(r5, r8, r9, r10)
            r7.add(r0)
            int r0 = r0.A0A
            int r5 = r5 + r0
            int r1 = r1 + 1
            goto L_0x050c
        L_0x0522:
            if (r15 == 0) goto L_0x05f1
            if (r35 == 0) goto L_0x06a2
            r11 = r35
            r5 = r22
            r1 = r24
            r0 = r26
            r11.ACR(r5, r13, r1, r0)
        L_0x0531:
            int r1 = r12 + -1
            X.2HY r0 = new X.2HY
            r0.<init>(r8, r1)
            if (r37 == 0) goto L_0x053e
            X.2HZ r0 = X.C229632nm.A0A(r0)
        L_0x053e:
            int r11 = r0.A00
            int r14 = r0.A01
            int r13 = r0.A02
            if (r13 <= 0) goto L_0x05bd
            if (r11 <= r14) goto L_0x05c1
        L_0x0548:
            r0 = r59
            int r1 = (int) r0
            r0 = r36
            X.JSi r0 = r0.A01
            X.IF5 r0 = (X.IF5) r0
            X.6Ix r0 = r0.A01
            r41 = r57
            r42 = r0
            r43 = r36
            r44 = r48
            r45 = r7
            r46 = r60
            r47 = r1
            r48 = r9
            r49 = r10
            r50 = r62
            r51 = r2
            r52 = r3
            r53 = r15
            r54 = r8
            r55 = r8
            r41.A07(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            long r11 = r57.A04()
            r5 = 0
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0604
            if (r15 == 0) goto L_0x0582
            r56 = r10
        L_0x0582:
            int r0 = X.C51965G9l.A04(r11)
            int r5 = java.lang.Math.max(r9, r0)
            r0 = r16
            int r9 = X.AnonymousClass5SF.A03(r0, r5)
            int r0 = X.C289005cr.A00(r11)
            int r5 = java.lang.Math.max(r10, r0)
            r0 = r16
            int r10 = X.AnonymousClass5SF.A02(r0, r5)
            r11 = r9
            if (r15 == 0) goto L_0x05a2
            r11 = r10
        L_0x05a2:
            r0 = r56
            if (r11 == r0) goto L_0x0604
            int r6 = r7.size()
            r5 = 0
        L_0x05ab:
            if (r5 >= r6) goto L_0x0604
            java.lang.Object r1 = r7.get(r5)
            X.IFG r1 = (X.IFG) r1
            r1.A01 = r11
            int r0 = r1.A07
            int r0 = r0 + r11
            r1.A02 = r0
            int r5 = r5 + 1
            goto L_0x05ab
        L_0x05bd:
            if (r13 >= 0) goto L_0x0548
            if (r14 > r11) goto L_0x0548
        L_0x05c1:
            r1 = r24[r11]
            r0 = r11
            if (r37 == 0) goto L_0x05ca
            int r0 = r12 - r11
            int r0 = r0 + -1
        L_0x05ca:
            java.lang.Object r5 = r6.get(r0)
            X.Hqw r5 = (X.C55990Hqw) r5
            if (r37 == 0) goto L_0x05d7
            int r1 = r26 - r1
            int r0 = r5.A01
            int r1 = r1 - r0
        L_0x05d7:
            X.IFG[] r5 = r5.A00(r1, r9, r10)
            int r0 = r5.length
            r34 = r0
            r1 = 0
        L_0x05df:
            r0 = r34
            if (r1 >= r0) goto L_0x05eb
            r0 = r5[r1]
            r7.add(r0)
            int r1 = r1 + 1
            goto L_0x05df
        L_0x05eb:
            r0 = r11
            int r11 = r11 + r13
            if (r0 != r14) goto L_0x05c1
            goto L_0x0548
        L_0x05f1:
            if (r34 == 0) goto L_0x06a9
            r41 = r34
            r42 = r22
            r43 = r38
            r44 = r13
            r45 = r24
            r46 = r26
            r41.ACQ(r42, r43, r44, r45, r46)
            goto L_0x0531
        L_0x0604:
            int r1 = r25 + -1
            r0 = r30
            if (r0 != r1) goto L_0x060e
            r57 = 0
            if (r3 <= r4) goto L_0x0610
        L_0x060e:
            r57 = 1
        L_0x0610:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r1 = 25
            X.J6U r4 = new X.J6U
            r0 = r61
            r4.<init>(r1, r0, r7)
            int r5 = r5.intValue()
            int r3 = r3.intValue()
            int r5 = r5 + r21
            r0 = r18
            int r5 = X.AnonymousClass5SF.A03(r0, r5)
            int r3 = r3 + r20
            int r1 = X.AnonymousClass5SF.A02(r0, r3)
            r0 = r22
            X.5d6 r44 = X.C51969G9p.A0a(r0, r4, r5, r1)
            boolean r0 = r31.isEmpty()
            if (r0 == 0) goto L_0x0673
            boolean r0 = r28.isEmpty()
            if (r0 == 0) goto L_0x0673
        L_0x0649:
            if (r15 == 0) goto L_0x0670
            X.6Gj r42 = X.AnonymousClass6Gj.Vertical
        L_0x064d:
            X.IGW r0 = new X.IGW
            r41 = r0
            r43 = r27
            r45 = r22
            r46 = r7
            r47 = r23
            r48 = r60
            r49 = r59
            r50 = r2
            r51 = r62
            r52 = r33
            r53 = r32
            r54 = r25
            r55 = r39
            r56 = r40
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            goto L_0x027b
        L_0x0670:
            X.6Gj r42 = X.AnonymousClass6Gj.Horizontal
            goto L_0x064d
        L_0x0673:
            int r0 = r7.size()
            java.util.ArrayList r6 = X.DbS.A0v(r0)
            int r5 = r7.size()
            r4 = 0
        L_0x0680:
            if (r4 >= r5) goto L_0x0699
            java.lang.Object r3 = r7.get(r4)
            r0 = r3
            X.IFG r0 = (X.IFG) r0
            int r1 = r0.A08
            r0 = r29
            if (r0 > r1) goto L_0x0696
            r0 = r30
            if (r1 > r0) goto L_0x0696
            r6.add(r3)
        L_0x0696:
            int r4 = r4 + 1
            goto L_0x0680
        L_0x0699:
            r7 = r6
            goto L_0x0649
        L_0x069b:
            java.lang.String r0 = "no items"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x06a2:
            java.lang.String r0 = "null verticalArrangement"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x06a9:
            java.lang.String r0 = "null horizontalArrangement"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x06b0:
            java.lang.String r0 = "negative initial offset"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x06b7:
            java.lang.String r0 = "negative afterContentPadding"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x06be:
            java.lang.String r0 = "negative beforeContentPadding"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x06c5:
            r0 = move-exception
            X.AnonymousClass5PH.A06(r8, r1, r6)
            throw r0
        L_0x06ca:
            r0 = 3090(0xc12, float:4.33E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x06d5:
            r0 = 3089(0xc11, float:4.329E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59211JAp.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
