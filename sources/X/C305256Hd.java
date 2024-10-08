package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.6Hd  reason: invalid class name and case insensitive filesystem */
public final class C305256Hd extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C287295Zu A01;
    public final /* synthetic */ C287325Zx A02;
    public final /* synthetic */ C304836Fk A03;
    public final /* synthetic */ LazyListState A04;
    public final /* synthetic */ C287265Zr A05;
    public final /* synthetic */ C287245Zp A06;
    public final /* synthetic */ C285855Sz A07;
    public final /* synthetic */ C62320sa A08;
    public final /* synthetic */ C262224Cq A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C305256Hd(C287295Zu r2, C287325Zx r3, C304836Fk r4, LazyListState lazyListState, C287265Zr r6, C287245Zp r7, C285855Sz r8, C62320sa r9, C262224Cq r10, int i, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A04 = lazyListState;
        this.A0A = z;
        this.A03 = r4;
        this.A0B = z2;
        this.A08 = r9;
        this.A02 = r3;
        this.A01 = r2;
        this.A0C = z3;
        this.A00 = i;
        this.A09 = r10;
        this.A07 = r8;
        this.A05 = r6;
        this.A06 = r7;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v183, resolved type: X.6JK} */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x032e, code lost:
        if (java.lang.Math.abs(r15) < java.lang.Math.abs(r7)) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0457, code lost:
        r0 = (X.AnonymousClass6JM) r9.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x049a, code lost:
        if (r14 == null) goto L_0x047b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0500, code lost:
        if (r7 == null) goto L_0x0502;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0594, code lost:
        if (r7.isEmpty() == false) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07dc, code lost:
        if (r4 > r17) goto L_0x07de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r30.CWf() != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0174, code lost:
        if (r4 == null) goto L_0x0176;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0521  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x07d8  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x07fe  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x083e  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0867  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r74, java.lang.Object r75) {
        /*
            r73 = this;
            r1 = r75
            r30 = r74
            r0 = r30
            X.6Iq r0 = (X.C305586Iq) r0
            r30 = r0
            androidx.compose.ui.unit.Constraints r1 = (androidx.compose.ui.unit.Constraints) r1
            long r0 = r1.A00
            r6 = r73
            androidx.compose.foundation.lazy.LazyListState r2 = r6.A04
            r72 = r2
            X.5Oz r2 = r2.A0J
            r2.getValue()
            r2 = r72
            boolean r2 = r2.A04
            if (r2 != 0) goto L_0x0027
            boolean r2 = r30.CWf()
            r55 = 0
            if (r2 == 0) goto L_0x0029
        L_0x0027:
            r55 = 1
        L_0x0029:
            boolean r2 = r6.A0A
            r16 = r2
            if (r2 == 0) goto L_0x0123
            X.6Gj r2 = X.AnonymousClass6Gj.Vertical
        L_0x0031:
            X.AnonymousClass6J2.A00(r2, r0)
            X.6Fk r4 = r6.A03
            X.5Q8 r5 = r30.getLayoutDirection()
            if (r16 == 0) goto L_0x011b
            X.6Fj r4 = (X.C304826Fj) r4
            X.5Q8 r31 = X.AnonymousClass5Q8.Ltr
            r2 = r31
            if (r5 == r2) goto L_0x011f
            float r3 = r4.A01
        L_0x0046:
            r2 = r30
            int r9 = r2.EJS(r3)
            if (r16 == 0) goto L_0x0117
            r2 = r31
            if (r5 == r2) goto L_0x0117
            float r3 = r4.A02
        L_0x0054:
            r2 = r30
            int r7 = r2.EJS(r3)
            float r3 = r4.A03
            int r5 = r2.EJS(r3)
            float r3 = r4.A00
            int r11 = r2.EJS(r3)
            int r14 = r5 + r11
            int r13 = r9 + r7
            if (r16 == 0) goto L_0x010b
            r39 = r14
            boolean r2 = r6.A0B
            r22 = r2
            if (r2 != 0) goto L_0x0075
            r11 = r5
        L_0x0075:
            int r39 = r39 - r11
            int r3 = -r13
            int r2 = -r14
            long r23 = X.AnonymousClass5SF.A06(r0, r3, r2)
            X.0sa r2 = r6.A08
            java.lang.Object r8 = r2.invoke()
            X.6J0 r8 = (X.AnonymousClass6J0) r8
            r7 = r8
            X.6Iz r7 = (X.C305646Iz) r7
            X.6Ha r10 = r7.A00
            int r4 = androidx.compose.ui.unit.Constraints.A01(r23)
            int r3 = androidx.compose.ui.unit.Constraints.A00(r23)
            X.5dh r2 = r10.A01
            r2.EZz(r4)
            X.5dh r2 = r10.A00
            r2.EZz(r3)
            if (r16 == 0) goto L_0x0102
            X.5Zx r2 = r6.A02
            if (r2 == 0) goto L_0x08a5
            float r3 = r2.By0()
        L_0x00a6:
            r2 = r30
            int r40 = r2.EJS(r3)
            int r18 = r8.getItemCount()
            if (r16 == 0) goto L_0x00fb
            int r17 = androidx.compose.ui.unit.Constraints.A00(r0)
            int r17 = r17 - r14
        L_0x00b8:
            if (r22 == 0) goto L_0x00c0
            if (r17 > 0) goto L_0x00c0
            if (r16 == 0) goto L_0x00f8
            int r5 = r5 + r17
        L_0x00c0:
            long r68 = X.AnonymousClass5TW.A00(r9, r5)
            X.5Zr r3 = r6.A05
            X.5Zp r2 = r6.A06
            X.6J3 r5 = new X.6J3
            r56 = r5
            r57 = r8
            r58 = r72
            r59 = r30
            r60 = r3
            r61 = r2
            r62 = r18
            r63 = r40
            r64 = r11
            r65 = r39
            r66 = r23
            r70 = r16
            r71 = r22
            r56.<init>(r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r68, r70, r71)
            androidx.compose.runtime.snapshots.Snapshot r10 = X.AnonymousClass5PH.A02()
            if (r10 == 0) goto L_0x00f6
            X.0sP r9 = r10.A05()
        L_0x00f1:
            androidx.compose.runtime.snapshots.Snapshot r4 = X.AnonymousClass5PH.A03(r10)
            goto L_0x0127
        L_0x00f6:
            r9 = 0
            goto L_0x00f1
        L_0x00f8:
            int r9 = r9 + r17
            goto L_0x00c0
        L_0x00fb:
            int r17 = androidx.compose.ui.unit.Constraints.A01(r0)
            int r17 = r17 - r13
            goto L_0x00b8
        L_0x0102:
            X.5Zu r2 = r6.A01
            if (r2 == 0) goto L_0x08ad
            float r3 = r2.By0()
            goto L_0x00a6
        L_0x010b:
            r39 = r13
            boolean r2 = r6.A0B
            r22 = r2
            r11 = r7
            if (r2 != 0) goto L_0x0075
            r11 = r9
            goto L_0x0075
        L_0x0117:
            float r3 = r4.A01
            goto L_0x0054
        L_0x011b:
            X.5Q8 r31 = X.AnonymousClass5Q8.Ltr
            X.6Fj r4 = (X.C304826Fj) r4
        L_0x011f:
            float r3 = r4.A02
            goto L_0x0046
        L_0x0123:
            X.6Gj r2 = X.AnonymousClass6Gj.Horizontal
            goto L_0x0031
        L_0x0127:
            int r12 = r72.A00()     // Catch:{ all -> 0x08a0 }
            r2 = r72
            X.6Gu r2 = r2.A0A     // Catch:{ all -> 0x08a0 }
            java.lang.Object r3 = r2.A00     // Catch:{ all -> 0x08a0 }
            int r3 = X.AnonymousClass6J5.A00(r8, r3, r12)     // Catch:{ all -> 0x08a0 }
            if (r12 == r3) goto L_0x0141
            X.5dh r15 = r2.A03     // Catch:{ all -> 0x08a0 }
            r15.EZz(r3)     // Catch:{ all -> 0x08a0 }
            X.6Gv r2 = r2.A02     // Catch:{ all -> 0x08a0 }
            r2.A00(r12)     // Catch:{ all -> 0x08a0 }
        L_0x0141:
            int r2 = r72.A01()     // Catch:{ all -> 0x08a0 }
            X.AnonymousClass5PH.A06(r10, r4, r9)
            r4 = r72
            X.6HC r9 = r4.A0E
            X.6H6 r4 = r4.A0C
            java.util.List r38 = X.AnonymousClass6J6.A00(r4, r8, r9)
            boolean r4 = r30.CWf()
            if (r4 != 0) goto L_0x086a
            if (r55 == 0) goto L_0x086a
            r4 = r72
            X.5b5 r4 = r4.A01
            X.5Oz r4 = r4.A05
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r8 = r4.floatValue()
        L_0x016a:
            boolean r4 = r6.A0C
            if (r4 == 0) goto L_0x0176
            X.6Ga r4 = r7.A01
            java.util.List r4 = r4.A00
            r19 = r4
            if (r4 != 0) goto L_0x0178
        L_0x0176:
            X.0sn r19 = X.0sn.A00
        L_0x0178:
            X.5Zx r4 = r6.A02
            r37 = r4
            X.5Zu r4 = r6.A01
            r36 = r4
            r4 = r72
            X.6H4 r4 = r4.A0D
            r58 = r4
            int r4 = r6.A00
            r32 = r4
            boolean r54 = r30.CWf()
            r4 = r72
            X.6Gk r4 = r4.A02
            r35 = r4
            X.4Cq r4 = r6.A09
            r57 = r4
            r4 = r72
            X.5Oz r4 = r4.A0K
            r56 = r4
            X.5Sz r4 = r6.A07
            r47 = r4
            X.JGh r29 = new X.JGh
            r41 = r29
            r42 = r30
            r43 = r13
            r44 = r14
            r45 = r0
            r41.<init>(r42, r43, r44, r45)
            r7 = 0
            if (r11 < 0) goto L_0x0898
            if (r39 < 0) goto L_0x0890
            if (r18 > 0) goto L_0x024b
            int r48 = androidx.compose.ui.unit.Constraints.A03(r23)
            int r49 = androidx.compose.ui.unit.Constraints.A02(r23)
            java.util.ArrayList r45 = new java.util.ArrayList
            r45.<init>()
            X.6J0 r0 = r5.A01
            X.6Iz r0 = (X.C305646Iz) r0
            X.6Ix r0 = r0.A02
            r50 = 1
            r41 = r58
            r42 = r0
            r43 = r5
            r44 = r4
            r46 = r57
            r47 = r7
            r51 = r7
            r52 = r7
            r53 = r16
            r41.A07(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            if (r54 != 0) goto L_0x0201
            long r3 = r58.A04()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0201
            r0 = 32
            long r0 = r3 >> r0
            int r2 = (int) r0
            r0 = r23
            int r48 = X.AnonymousClass5SF.A03(r0, r2)
            int r2 = X.C289005cr.A00(r3)
            int r49 = X.AnonymousClass5SF.A02(r0, r2)
        L_0x0201:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r48)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r49)
            X.AyN r1 = X.C41670AyN.A00
            r0 = r29
            java.lang.Object r2 = r0.invoke(r3, r2, r1)
            X.5d6 r2 = (X.C289145d6) r2
            X.0sn r31 = X.0sn.A00
            int r4 = -r11
            int r17 = r17 + r39
            if (r16 == 0) goto L_0x0248
            X.6Gj r27 = X.AnonymousClass6Gj.Vertical
        L_0x021c:
            long r0 = r5.A00
            r28 = 0
            r33 = 0
            X.6Gk r3 = new X.6Gk
            r29 = r2
            r32 = r57
            r34 = r33
            r35 = r7
            r36 = r4
            r37 = r17
            r38 = r7
            r41 = r0
            r43 = r7
            r44 = r7
            r26 = r3
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r44)
        L_0x023d:
            boolean r2 = r30.CWf()
            r1 = 0
            r0 = r72
            r0.A06(r3, r2, r1)
            return r3
        L_0x0248:
            X.6Gj r27 = X.AnonymousClass6Gj.Horizontal
            goto L_0x021c
        L_0x024b:
            r0 = r18
            if (r3 < r0) goto L_0x0252
            int r3 = r18 + -1
            r2 = 0
        L_0x0252:
            int r15 = java.lang.Math.round(r8)
            int r2 = r2 - r15
            if (r3 != 0) goto L_0x0289
            if (r2 >= 0) goto L_0x0289
            int r10 = r15 + r2
            r2 = 0
        L_0x025e:
            X.01W r26 = new X.01W
            r26.<init>()
            int r0 = -r11
            r28 = r0
            r9 = 0
            if (r40 >= 0) goto L_0x026b
            r9 = r40
        L_0x026b:
            int r9 = r9 + r0
            int r2 = r2 + r9
            r6 = 0
        L_0x026e:
            if (r2 >= 0) goto L_0x028b
            if (r3 <= 0) goto L_0x028b
            int r3 = r3 + -1
            long r0 = r5.A00
            X.6JK r1 = r5.A00(r3, r0)
            r0 = r26
            r0.add(r7, r1)
            int r0 = r1.A06
            int r6 = java.lang.Math.max(r6, r0)
            int r0 = r1.A08
            int r2 = r2 + r0
            goto L_0x026e
        L_0x0289:
            r10 = r15
            goto L_0x025e
        L_0x028b:
            if (r2 >= r9) goto L_0x028f
            int r10 = r10 + r2
            r2 = r9
        L_0x028f:
            int r2 = r2 - r9
            int r27 = r17 + r39
            r14 = r27
            if (r14 >= r7) goto L_0x0297
            r14 = 0
        L_0x0297:
            int r4 = -r2
            r1 = r3
            r59 = 0
        L_0x029b:
            int r0 = r26.size()
            if (r7 >= r0) goto L_0x02bb
            if (r4 < r14) goto L_0x02ab
            r0 = r26
            r0.remove(r7)
            r59 = 1
            goto L_0x029b
        L_0x02ab:
            int r3 = r3 + 1
            r0 = r26
            java.lang.Object r0 = r0.get(r7)
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r0 = r0.A08
            int r4 = r4 + r0
            int r7 = r7 + 1
            goto L_0x029b
        L_0x02bb:
            r0 = r18
            if (r3 >= r0) goto L_0x02ec
            if (r4 < r14) goto L_0x02c9
            if (r4 <= 0) goto L_0x02c9
            boolean r0 = r26.isEmpty()
            if (r0 == 0) goto L_0x02ec
        L_0x02c9:
            long r12 = r5.A00
            X.6JK r7 = r5.A00(r3, r12)
            int r0 = r7.A08
            int r4 = r4 + r0
            if (r4 > r9) goto L_0x02e0
            int r12 = r18 + -1
            if (r3 == r12) goto L_0x02e0
            int r1 = r3 + 1
            int r2 = r2 - r0
            r59 = 1
        L_0x02dd:
            int r3 = r3 + 1
            goto L_0x02bb
        L_0x02e0:
            int r0 = r7.A06
            int r6 = java.lang.Math.max(r6, r0)
            r0 = r26
            r0.add(r7)
            goto L_0x02dd
        L_0x02ec:
            r0 = r17
            if (r4 >= r0) goto L_0x0310
            int r14 = r17 - r4
            int r2 = r2 - r14
            int r4 = r4 + r14
        L_0x02f4:
            if (r2 >= r11) goto L_0x0312
            if (r1 <= 0) goto L_0x0312
            int r1 = r1 + -1
            long r12 = r5.A00
            X.6JK r7 = r5.A00(r1, r12)
            r9 = 0
            r0 = r26
            r0.add(r9, r7)
            int r0 = r7.A06
            int r6 = java.lang.Math.max(r6, r0)
            int r0 = r7.A08
            int r2 = r2 + r0
            goto L_0x02f4
        L_0x0310:
            r7 = r10
            goto L_0x0319
        L_0x0312:
            int r7 = r10 + r14
            if (r2 >= 0) goto L_0x0319
            int r7 = r7 + r2
            int r4 = r4 + r2
            r2 = 0
        L_0x0319:
            int r9 = java.lang.Integer.signum(r15)
            int r0 = java.lang.Integer.signum(r7)
            if (r9 != r0) goto L_0x0330
            int r12 = java.lang.Math.abs(r15)
            int r9 = java.lang.Math.abs(r7)
            float r0 = (float) r7
            r20 = r0
            if (r12 >= r9) goto L_0x0332
        L_0x0330:
            r20 = r8
        L_0x0332:
            float r8 = r8 - r20
            r34 = 0
            if (r54 == 0) goto L_0x0388
            if (r7 <= r10) goto L_0x0388
            int r0 = (r8 > r34 ? 1 : (r8 == r34 ? 0 : -1))
            if (r0 > 0) goto L_0x0388
            int r7 = r7 - r10
            float r0 = (float) r7
            float r21 = r0 + r8
        L_0x0342:
            if (r2 < 0) goto L_0x0888
            int r0 = -r2
            r33 = r0
            java.lang.Object r25 = r26.A0O()
            r0 = r25
            X.6JK r0 = (X.AnonymousClass6JK) r0
            r25 = r0
            if (r11 > 0) goto L_0x0355
            if (r40 >= 0) goto L_0x038b
        L_0x0355:
            int r10 = r26.size()
            r9 = 0
        L_0x035a:
            if (r9 >= r10) goto L_0x038b
            r0 = r26
            java.lang.Object r0 = r0.get(r9)
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r8 = r0.A08
            if (r2 == 0) goto L_0x038b
            if (r8 > r2) goto L_0x038b
            r7 = 0
            r0 = r26
            X.0qQ.A0B(r0, r7)
            int r0 = r26.size()
            int r0 = r0 + -1
            if (r9 == r0) goto L_0x038b
            int r2 = r2 - r8
            int r9 = r9 + 1
            r0 = r26
            java.lang.Object r25 = r0.get(r9)
            r0 = r25
            X.6JK r0 = (X.AnonymousClass6JK) r0
            r25 = r0
            goto L_0x035a
        L_0x0388:
            r21 = 0
            goto L_0x0342
        L_0x038b:
            int r7 = r1 - r32
            r0 = 0
            int r7 = java.lang.Math.max(r0, r7)
            int r9 = r1 + -1
            r8 = 0
            if (r7 > r9) goto L_0x03aa
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x039c:
            long r0 = r5.A00
            X.6JK r0 = r5.A00(r9, r0)
            r8.add(r0)
            if (r9 == r7) goto L_0x03aa
            int r9 = r9 + -1
            goto L_0x039c
        L_0x03aa:
            int r0 = r38.size()
            int r1 = r0 + -1
            if (r1 < 0) goto L_0x03d6
        L_0x03b2:
            int r10 = r1 + -1
            r0 = r38
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            if (r9 >= r7) goto L_0x03d2
            if (r8 != 0) goto L_0x03c9
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x03c9:
            long r0 = r5.A00
            X.6JK r0 = r5.A00(r9, r0)
            r8.add(r0)
        L_0x03d2:
            if (r10 < 0) goto L_0x03d6
            r1 = r10
            goto L_0x03b2
        L_0x03d6:
            if (r8 != 0) goto L_0x03da
            X.0sn r8 = X.0sn.A00
        L_0x03da:
            int r7 = r8.size()
            r1 = 0
        L_0x03df:
            if (r1 >= r7) goto L_0x03f0
            java.lang.Object r0 = r8.get(r1)
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r0 = r0.A06
            int r6 = java.lang.Math.max(r6, r0)
            int r1 = r1 + 1
            goto L_0x03df
        L_0x03f0:
            java.lang.Object r0 = X.00k.A0K(r26)
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r0 = r0.A07
            int r0 = r0 + r32
            int r11 = r18 + -1
            int r1 = java.lang.Math.min(r0, r11)
            java.lang.Object r0 = X.00k.A0K(r26)
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r0 = r0.A07
            r12 = 1
            int r0 = r0 + 1
            r32 = 0
            if (r0 > r1) goto L_0x04a6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0414:
            long r9 = r5.A00
            X.6JK r9 = r5.A00(r0, r9)
            r7.add(r9)
            r9 = r0
            int r0 = r0 + 1
            if (r9 != r1) goto L_0x0414
        L_0x0422:
            r15 = 0
            if (r54 == 0) goto L_0x0527
            if (r35 == 0) goto L_0x0527
            r0 = r35
            java.util.List r9 = r0.A0D
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0527
            int r10 = r9.size()
            int r10 = r10 - r12
        L_0x0438:
            r0 = -1
            if (r0 >= r10) goto L_0x04a3
            java.lang.Object r0 = r9.get(r10)
            X.6JM r0 = (X.AnonymousClass6JM) r0
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r0 = r0.A07
            if (r0 <= r1) goto L_0x04a0
            if (r10 == 0) goto L_0x0457
            int r0 = r10 + -1
            java.lang.Object r0 = r9.get(r0)
            X.6JM r0 = (X.AnonymousClass6JM) r0
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r0 = r0.A07
            if (r0 > r1) goto L_0x04a0
        L_0x0457:
            java.lang.Object r0 = r9.get(r10)
            X.6JM r0 = (X.AnonymousClass6JM) r0
        L_0x045d:
            java.lang.Object r9 = X.00k.A0K(r9)
            X.6JM r9 = (X.AnonymousClass6JM) r9
            if (r0 == 0) goto L_0x04aa
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r10 = r0.A07
            r0 = r9
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r0 = r0.A07
            int r11 = java.lang.Math.min(r0, r11)
            if (r10 > r11) goto L_0x04aa
            if (r7 != 0) goto L_0x0488
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x047b:
            long r12 = r5.A00
            X.6JK r0 = r5.A00(r10, r12)
            r7.add(r0)
        L_0x0484:
            if (r10 == r11) goto L_0x04aa
            int r10 = r10 + 1
        L_0x0488:
            int r13 = r7.size()
            r0 = 0
        L_0x048d:
            if (r0 >= r13) goto L_0x047b
            java.lang.Object r14 = r7.get(r0)
            r12 = r14
            X.6JK r12 = (X.AnonymousClass6JK) r12
            int r12 = r12.A07
            if (r12 != r10) goto L_0x049d
            if (r14 != 0) goto L_0x0484
            goto L_0x047b
        L_0x049d:
            int r0 = r0 + 1
            goto L_0x048d
        L_0x04a0:
            int r10 = r10 + -1
            goto L_0x0438
        L_0x04a3:
            r0 = r32
            goto L_0x045d
        L_0x04a6:
            r7 = r32
            goto L_0x0422
        L_0x04aa:
            r0 = r35
            int r10 = r0.A07
            X.6JK r9 = (X.AnonymousClass6JK) r9
            int r0 = r9.A02
            int r10 = r10 - r0
            int r0 = r9.A09
            int r10 = r10 - r0
            float r11 = (float) r10
            float r11 = r11 - r20
            int r0 = (r11 > r34 ? 1 : (r11 == r34 ? 0 : -1))
            if (r0 <= 0) goto L_0x0527
            int r0 = r9.A07
            int r10 = r0 + 1
            r12 = 0
        L_0x04c2:
            r0 = r18
            if (r10 >= r0) goto L_0x0527
            float r0 = (float) r12
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0527
            if (r10 > r1) goto L_0x04e4
            int r14 = r26.size()
            r9 = 0
        L_0x04d2:
            if (r9 >= r14) goto L_0x051b
            r0 = r26
            java.lang.Object r0 = r0.get(r9)
            r13 = r0
            X.6JK r13 = (X.AnonymousClass6JK) r13
            int r13 = r13.A07
            if (r13 == r10) goto L_0x051d
            int r9 = r9 + 1
            goto L_0x04d2
        L_0x04e4:
            if (r7 == 0) goto L_0x0502
            int r14 = r7.size()
            r9 = 0
        L_0x04eb:
            if (r9 >= r14) goto L_0x04fb
            java.lang.Object r0 = r7.get(r9)
            r13 = r0
            X.6JK r13 = (X.AnonymousClass6JK) r13
            int r13 = r13.A07
            if (r13 == r10) goto L_0x04fd
            int r9 = r9 + 1
            goto L_0x04eb
        L_0x04fb:
            r0 = r32
        L_0x04fd:
            X.6JK r0 = (X.AnonymousClass6JK) r0
            goto L_0x051f
        L_0x0500:
            if (r7 != 0) goto L_0x0507
        L_0x0502:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0507:
            long r13 = r5.A00
            X.6JK r0 = r5.A00(r10, r13)
            r7.add(r0)
            int r10 = r10 + 1
            java.lang.Object r0 = X.00k.A0K(r7)
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r0 = r0.A08
            goto L_0x0525
        L_0x051b:
            r0 = r32
        L_0x051d:
            X.6JK r0 = (X.AnonymousClass6JK) r0
        L_0x051f:
            if (r0 == 0) goto L_0x0500
            int r10 = r10 + 1
            int r0 = r0.A08
        L_0x0525:
            int r12 = r12 + r0
            goto L_0x04c2
        L_0x0527:
            if (r7 == 0) goto L_0x053b
            java.lang.Object r0 = X.00k.A0K(r7)
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r0 = r0.A07
            if (r0 <= r1) goto L_0x053b
            java.lang.Object r0 = X.00k.A0K(r7)
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r1 = r0.A07
        L_0x053b:
            int r11 = r38.size()
        L_0x053f:
            if (r15 >= r11) goto L_0x0562
            r9 = r38
            java.lang.Object r0 = r9.get(r15)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= r1) goto L_0x055f
            if (r7 != 0) goto L_0x0556
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0556:
            long r9 = r5.A00
            X.6JK r0 = r5.A00(r0, r9)
            r7.add(r0)
        L_0x055f:
            int r15 = r15 + 1
            goto L_0x053f
        L_0x0562:
            if (r7 != 0) goto L_0x0566
            X.0sn r7 = X.0sn.A00
        L_0x0566:
            int r9 = r7.size()
            r1 = 0
        L_0x056b:
            if (r1 >= r9) goto L_0x057c
            java.lang.Object r0 = r7.get(r1)
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r0 = r0.A06
            int r6 = java.lang.Math.max(r6, r0)
            int r1 = r1 + 1
            goto L_0x056b
        L_0x057c:
            java.lang.Object r1 = r26.A0O()
            r0 = r25
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0596
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0596
            boolean r0 = r7.isEmpty()
            r32 = 1
            if (r0 != 0) goto L_0x0598
        L_0x0596:
            r32 = 0
        L_0x0598:
            r9 = r4
            if (r16 == 0) goto L_0x059c
            r9 = r6
        L_0x059c:
            r0 = r23
            int r15 = X.AnonymousClass5SF.A03(r0, r9)
            if (r16 == 0) goto L_0x05a5
            r6 = r4
        L_0x05a5:
            int r9 = X.AnonymousClass5SF.A02(r0, r6)
            r14 = r15
            if (r16 == 0) goto L_0x05ad
            r14 = r9
        L_0x05ad:
            r1 = r17
            int r0 = java.lang.Math.min(r14, r1)
            r1 = 0
            r10 = 0
            if (r4 >= r0) goto L_0x05c2
            r10 = 1
            if (r33 == 0) goto L_0x05c2
            java.lang.String r1 = "non-zero itemsScrollOffset"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x05c2:
            int r0 = r26.size()
            int r6 = r8.size()
            int r0 = r0 + r6
            int r6 = r7.size()
            int r0 = r0 + r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            if (r10 == 0) goto L_0x060c
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0870
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0870
            int r10 = r26.size()
            int[] r11 = new int[r10]
            r7 = 0
        L_0x05ea:
            if (r7 >= r10) goto L_0x0602
            r8 = r7
            if (r22 == 0) goto L_0x05f3
            int r0 = r10 - r7
            int r8 = r0 + -1
        L_0x05f3:
            r0 = r26
            java.lang.Object r0 = r0.get(r8)
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r0 = r0.A09
            r11[r7] = r0
            int r7 = r7 + 1
            goto L_0x05ea
        L_0x0602:
            int[] r12 = new int[r10]
            r0 = 0
        L_0x0605:
            if (r0 >= r10) goto L_0x0660
            r12[r0] = r1
            int r0 = r0 + 1
            goto L_0x0605
        L_0x060c:
            int r13 = r8.size()
            r11 = r33
            r10 = 0
        L_0x0613:
            if (r10 >= r13) goto L_0x0627
            java.lang.Object r0 = r8.get(r10)
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r12 = r0.A08
            int r11 = r11 - r12
            r0.A00(r11, r15, r9)
            r6.add(r0)
            int r10 = r10 + 1
            goto L_0x0613
        L_0x0627:
            int r11 = r26.size()
            r10 = 0
        L_0x062c:
            if (r10 >= r11) goto L_0x0645
            r0 = r26
            java.lang.Object r8 = r0.get(r10)
            X.6JK r8 = (X.AnonymousClass6JK) r8
            r0 = r33
            r8.A00(r0, r15, r9)
            r6.add(r8)
            int r0 = r8.A08
            int r33 = r33 + r0
            int r10 = r10 + 1
            goto L_0x062c
        L_0x0645:
            int r10 = r7.size()
        L_0x0649:
            if (r1 >= r10) goto L_0x0682
            java.lang.Object r8 = r7.get(r1)
            X.6JK r8 = (X.AnonymousClass6JK) r8
            r0 = r33
            r8.A00(r0, r15, r9)
            r6.add(r8)
            int r0 = r8.A08
            int r33 = r33 + r0
            int r1 = r1 + 1
            goto L_0x0649
        L_0x0660:
            if (r16 == 0) goto L_0x071a
            if (r37 == 0) goto L_0x0878
            r8 = r37
            r7 = r30
            r8.ACR(r7, r11, r12, r14)
        L_0x066b:
            int r7 = r10 + -1
            X.2HY r0 = new X.2HY
            r0.<init>(r1, r7)
            if (r22 == 0) goto L_0x0678
            X.2HZ r0 = X.C229632nm.A0A(r0)
        L_0x0678:
            int r8 = r0.A00
            int r11 = r0.A01
            int r7 = r0.A02
            if (r7 <= 0) goto L_0x06f4
            if (r8 <= r11) goto L_0x06f8
        L_0x0682:
            r0 = r20
            int r1 = (int) r0
            X.6J0 r0 = r5.A01
            X.6Iz r0 = (X.C305646Iz) r0
            X.6Ix r0 = r0.A02
            r31 = 1
            r41 = r58
            r42 = r0
            r43 = r5
            r44 = r47
            r45 = r6
            r46 = r57
            r47 = r1
            r48 = r15
            r49 = r9
            r50 = r31
            r51 = r2
            r52 = r4
            r53 = r16
            r41.A07(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            if (r54 != 0) goto L_0x072d
            long r10 = r58.A04()
            r7 = 0
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x072d
            r7 = r15
            if (r16 == 0) goto L_0x06ba
            r7 = r9
        L_0x06ba:
            r0 = 32
            long r0 = r10 >> r0
            int r8 = (int) r0
            int r8 = java.lang.Math.max(r15, r8)
            r0 = r23
            int r15 = X.AnonymousClass5SF.A03(r0, r8)
            int r0 = X.C289005cr.A00(r10)
            int r8 = java.lang.Math.max(r9, r0)
            r0 = r23
            int r9 = X.AnonymousClass5SF.A02(r0, r8)
            r10 = r15
            if (r16 == 0) goto L_0x06db
            r10 = r9
        L_0x06db:
            if (r10 == r7) goto L_0x072d
            int r8 = r6.size()
            r7 = 0
        L_0x06e2:
            if (r7 >= r8) goto L_0x072d
            java.lang.Object r1 = r6.get(r7)
            X.6JK r1 = (X.AnonymousClass6JK) r1
            r1.A00 = r10
            int r0 = r1.A05
            int r0 = r0 + r10
            r1.A01 = r0
            int r7 = r7 + 1
            goto L_0x06e2
        L_0x06f4:
            if (r7 >= 0) goto L_0x0682
            if (r11 > r8) goto L_0x0682
        L_0x06f8:
            r1 = r12[r8]
            r13 = r8
            if (r22 == 0) goto L_0x0701
            int r0 = r10 - r8
            int r13 = r0 + -1
        L_0x0701:
            r0 = r26
            java.lang.Object r0 = r0.get(r13)
            X.6JK r0 = (X.AnonymousClass6JK) r0
            if (r22 == 0) goto L_0x0710
            int r1 = r14 - r1
            int r13 = r0.A09
            int r1 = r1 - r13
        L_0x0710:
            r0.A00(r1, r15, r9)
            r6.add(r0)
            if (r8 == r11) goto L_0x0682
            int r8 = r8 + r7
            goto L_0x06f8
        L_0x071a:
            if (r36 == 0) goto L_0x0880
            r33 = r36
            r34 = r30
            r35 = r31
            r36 = r11
            r37 = r12
            r38 = r14
            r33.ACQ(r34, r35, r36, r37, r38)
            goto L_0x066b
        L_0x072d:
            boolean r0 = r19.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x07a9
            java.lang.Object r0 = X.00k.A0I(r6)
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r10 = r0.A07
            int r7 = r19.size()
            r23 = 0
            r22 = -1
            r1 = 0
            r11 = -1
            r8 = -1
        L_0x0748:
            if (r1 >= r7) goto L_0x0782
            r0 = r19
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 > r10) goto L_0x0782
            r0 = r19
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            int r1 = r1 + 1
            if (r1 < 0) goto L_0x077d
            int r0 = r19.size()
            int r0 = r0 + -1
            if (r1 > r0) goto L_0x077d
            r0 = r19
            java.lang.Object r0 = r0.get(r1)
        L_0x0776:
            java.lang.Number r0 = (java.lang.Number) r0
            int r11 = r0.intValue()
            goto L_0x0748
        L_0x077d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            goto L_0x0776
        L_0x0782:
            int r19 = r6.size()
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = -1
        L_0x078e:
            r0 = r19
            if (r1 >= r0) goto L_0x07ab
            java.lang.Object r0 = r6.get(r1)
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r14 = r0.A07
            if (r14 != r8) goto L_0x07a2
            int r10 = r0.A02
            r12 = r1
        L_0x079f:
            int r1 = r1 + 1
            goto L_0x078e
        L_0x07a2:
            int r14 = r0.A07
            if (r14 != r11) goto L_0x079f
            int r7 = r0.A02
            goto L_0x079f
        L_0x07a9:
            r0 = 0
            goto L_0x07d4
        L_0x07ab:
            r0 = r22
            if (r8 == r0) goto L_0x07a9
            long r0 = r5.A00
            X.6JK r0 = r5.A00(r8, r0)
            r1 = r31
            r0.A03 = r1
            r1 = r28
            if (r10 == r13) goto L_0x07c1
            int r1 = java.lang.Math.max(r1, r10)
        L_0x07c1:
            if (r7 == r13) goto L_0x07ca
            int r8 = r0.A09
            int r7 = r7 - r8
            int r1 = java.lang.Math.min(r1, r7)
        L_0x07ca:
            r0.A00(r1, r15, r9)
            r1 = r22
            if (r12 == r1) goto L_0x0835
            r6.set(r12, r0)
        L_0x07d4:
            r1 = r18
            if (r3 < r1) goto L_0x07de
            r58 = 0
            r1 = r17
            if (r4 <= r1) goto L_0x07e0
        L_0x07de:
            r58 = 1
        L_0x07e0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r8 = 0
            X.IxD r7 = new X.IxD
            r9 = r6
            r10 = r0
            r11 = r56
            r12 = r54
            r7.<init>(r8, r9, r10, r11, r12)
            r4 = r29
            java.lang.Object r7 = r4.invoke(r1, r3, r7)
            X.5d6 r7 = (X.C289145d6) r7
            if (r32 != 0) goto L_0x083c
            int r1 = r6.size()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r1)
            int r10 = r6.size()
            r9 = 0
        L_0x080c:
            if (r9 >= r10) goto L_0x083b
            java.lang.Object r8 = r6.get(r9)
            r4 = r8
            X.6JK r4 = (X.AnonymousClass6JK) r4
            int r3 = r4.A07
            java.lang.Object r1 = r26.A0O()
            X.6JK r1 = (X.AnonymousClass6JK) r1
            int r1 = r1.A07
            if (r3 < r1) goto L_0x082d
            int r3 = r4.A07
            java.lang.Object r1 = r26.A0Q()
            X.6JK r1 = (X.AnonymousClass6JK) r1
            int r1 = r1.A07
            if (r3 <= r1) goto L_0x082f
        L_0x082d:
            if (r4 != r0) goto L_0x0832
        L_0x082f:
            r11.add(r8)
        L_0x0832:
            int r9 = r9 + 1
            goto L_0x080c
        L_0x0835:
            r1 = r23
            r6.add(r1, r0)
            goto L_0x07d4
        L_0x083b:
            r6 = r11
        L_0x083c:
            if (r16 == 0) goto L_0x0867
            X.6Gj r42 = X.AnonymousClass6Gj.Vertical
        L_0x0840:
            long r0 = r5.A00
            X.6Gk r3 = new X.6Gk
            r41 = r3
            r43 = r25
            r44 = r7
            r45 = r30
            r46 = r6
            r47 = r57
            r48 = r20
            r49 = r21
            r50 = r2
            r51 = r28
            r52 = r27
            r53 = r18
            r54 = r39
            r55 = r40
            r56 = r0
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r58, r59)
            goto L_0x023d
        L_0x0867:
            X.6Gj r42 = X.AnonymousClass6Gj.Horizontal
            goto L_0x0840
        L_0x086a:
            r4 = r72
            float r8 = r4.A00
            goto L_0x016a
        L_0x0870:
            java.lang.String r1 = "no extra items"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0878:
            java.lang.String r1 = "null verticalArrangement when isVertical == true"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0880:
            java.lang.String r1 = "null horizontalArrangement when isVertical == false"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0888:
            java.lang.String r1 = "negative currentFirstItemScrollOffset"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0890:
            java.lang.String r1 = "invalid afterContentPadding"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0898:
            java.lang.String r1 = "invalid beforeContentPadding"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x08a0:
            r0 = move-exception
            X.AnonymousClass5PH.A06(r10, r4, r9)
            throw r0
        L_0x08a5:
            java.lang.String r1 = "null verticalArrangement when isVertical == true"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x08ad:
            java.lang.String r1 = "null horizontalAlignment when isVertical == false"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C305256Hd.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
