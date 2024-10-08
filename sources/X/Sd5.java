package X;

import java.util.ArrayList;
import java.util.Map;

public final class Sd5 implements C71472dN {
    public C268004cb A00;
    public C268024cd A01;
    public ArrayList A02 = AnonymousClass7TE.A1C();
    public final 2d1 A03;
    public final Map A04 = AnonymousClass7TE.A1H();
    public final Map A05 = AnonymousClass7TE.A1H();
    public final Map A06 = AnonymousClass7TE.A1H();
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A00(0eO.A02, new C13347TVu((Object) this, 9));
    public final int[] A08 = new int[2];
    public final int[] A09 = new int[2];

    public final void AP5() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0152, code lost:
        if (java.lang.Integer.valueOf(r1) == null) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0162, code lost:
        if (java.lang.Integer.valueOf(r1) == null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019f, code lost:
        if (r10 != false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bb, code lost:
        if (r1 == Integer.MIN_VALUE) goto L_0x01bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cnt(X.2d3 r26, X.AnonymousClass2d8 r27) {
        /*
            r25 = this;
            r4 = 0
            r3 = 1
            r6 = r26
            java.lang.Object r2 = r6.A0m
            boolean r0 = r2 instanceof X.C268074ci
            if (r0 == 0) goto L_0x01fe
            r7 = r25
            java.util.Map r8 = r7.A05
            java.lang.Object r10 = r8.get(r2)
            java.lang.Integer[] r10 = (java.lang.Integer[]) r10
            r5 = r27
            java.lang.Integer r14 = r5.A06
            X.0qQ.A06(r14)
            int r13 = r5.A00
            int r12 = r6.A0H
            int r11 = r5.A01
            if (r10 == 0) goto L_0x01a7
            r0 = r10[r3]
            if (r0 == 0) goto L_0x01a7
            int r1 = r0.intValue()
        L_0x002b:
            int r0 = r6.A06()
            boolean r20 = X.AnonymousClass7TF.A1S(r1, r0)
            boolean r21 = r6.A0W()
            X.0eM r0 = r7.A07
            r24 = r0
            java.lang.Object r0 = r24.getValue()
            X.SOO r0 = (X.SOO) r0
            long r0 = r0.A00
            int r19 = androidx.compose.ui.unit.Constraints.A01(r0)
            int[] r15 = r7.A09
            r9 = 0
            r16 = r13
            r17 = r12
            r18 = r11
            A00(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Integer r14 = r5.A07
            X.0qQ.A06(r14)
            int r13 = r5.A05
            int r12 = r6.A0G
            int r11 = r5.A01
            if (r10 == 0) goto L_0x01a4
            r0 = r10[r4]
            if (r0 == 0) goto L_0x01a4
            int r1 = r0.intValue()
        L_0x0068:
            int r0 = r6.A07()
            boolean r22 = X.AnonymousClass7TF.A1S(r1, r0)
            boolean r23 = r6.A0X()
            java.lang.Object r0 = r24.getValue()
            X.SOO r0 = (X.SOO) r0
            long r0 = r0.A00
            int r21 = androidx.compose.ui.unit.Constraints.A00(r0)
            int[] r0 = r7.A08
            r16 = r14
            r17 = r0
            r18 = r13
            r19 = r12
            r20 = r11
            A00(r16, r17, r18, r19, r20, r21, r22, r23)
            r11 = r15[r4]
            r10 = r15[r3]
            r1 = r0[r4]
            r0 = r0[r3]
            long r0 = X.AnonymousClass5SF.A04(r11, r10, r1, r0)
            int r10 = r5.A01
            r17 = 0
            if (r10 == r3) goto L_0x00b6
            r3 = 2
            if (r10 == r3) goto L_0x00b6
            java.lang.Integer r3 = r5.A06
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            if (r3 != r10) goto L_0x00b6
            int r3 = r6.A0H
            if (r3 != 0) goto L_0x00b6
            java.lang.Integer r3 = r5.A07
            if (r3 != r10) goto L_0x00b6
            int r3 = r6.A0G
            if (r3 == 0) goto L_0x0142
        L_0x00b6:
            r13 = r2
            X.4ci r13 = (X.C268074ci) r13
            X.4cY r14 = r13.Cnz(r0)
            java.util.Map r12 = r7.A06
            r12.put(r2, r14)
            r6.A0t = r4
            int r3 = r14.A01
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            int r3 = r6.A0L
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            int r3 = r11.intValue()
            if (r3 > 0) goto L_0x00d8
            r11 = r17
        L_0x00d8:
            int r3 = r6.A0J
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            int r3 = r10.intValue()
            if (r3 > 0) goto L_0x00e6
            r10 = r17
        L_0x00e6:
            java.lang.Comparable r3 = X.C229632nm.A08(r15, r11, r10)
            int r10 = X.AnonymousClass7TE.A0M(r3)
            int r3 = r14.A00
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            int r3 = r6.A0K
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            int r3 = r11.intValue()
            if (r3 > 0) goto L_0x0102
            r11 = r17
        L_0x0102:
            int r3 = r6.A0I
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r16 = r3.intValue()
            if (r16 > 0) goto L_0x0110
            r3 = r17
        L_0x0110:
            java.lang.Comparable r3 = X.C229632nm.A08(r15, r11, r3)
            int r11 = X.AnonymousClass7TE.A0M(r3)
            int r3 = r14.A01
            if (r10 == r3) goto L_0x01a2
            int r3 = androidx.compose.ui.unit.Constraints.A02(r0)
            int r0 = androidx.compose.ui.unit.Constraints.A00(r0)
            long r0 = X.AnonymousClass5SF.A04(r10, r10, r3, r0)
            r10 = 1
        L_0x0129:
            int r3 = r14.A00
            if (r11 == r3) goto L_0x019f
            int r3 = androidx.compose.ui.unit.Constraints.A03(r0)
            int r0 = androidx.compose.ui.unit.Constraints.A01(r0)
            long r0 = X.AnonymousClass5SF.A04(r3, r0, r11, r11)
        L_0x0139:
            X.4cY r0 = r13.Cnz(r0)
            r12.put(r2, r0)
            r6.A0t = r4
        L_0x0142:
            java.util.Map r0 = r7.A06
            java.lang.Object r7 = r0.get(r2)
            X.4cY r7 = (X.C267974cY) r7
            if (r7 == 0) goto L_0x0154
            int r1 = r7.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 != 0) goto L_0x0158
        L_0x0154:
            int r1 = r6.A07()
        L_0x0158:
            r5.A04 = r1
            if (r7 == 0) goto L_0x0164
            int r1 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 != 0) goto L_0x0168
        L_0x0164:
            int r1 = r6.A06()
        L_0x0168:
            r5.A03 = r1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x01ff
            java.lang.Object r12 = r24.getValue()
            X.SOO r12 = (X.SOO) r12
            boolean r0 = r12.A05
            if (r0 == 0) goto L_0x01ac
            java.util.Set r11 = r12.A09
            r11.clear()
            java.util.List r0 = r12.A08
            java.util.Iterator r10 = r0.iterator()
        L_0x0183:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01aa
            java.lang.Object r1 = r10.next()
            java.util.HashMap r0 = r12.A03
            java.lang.Object r0 = r0.get(r1)
            X.TbV r0 = (X.C13504TbV) r0
            if (r0 == 0) goto L_0x0183
            X.2d3 r0 = r0.Aq5()
            r11.add(r0)
            goto L_0x0183
        L_0x019f:
            if (r10 == 0) goto L_0x0142
            goto L_0x0139
        L_0x01a2:
            r10 = 0
            goto L_0x0129
        L_0x01a4:
            r1 = 0
            goto L_0x0068
        L_0x01a7:
            r1 = 0
            goto L_0x002b
        L_0x01aa:
            r12.A05 = r4
        L_0x01ac:
            java.util.Set r0 = r12.A09
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x01ff
            X.5iZ r0 = X.C292185iX.A00
            int r1 = r7.AWx(r0)
            r0 = 1
            if (r1 != r3) goto L_0x01be
        L_0x01bd:
            r0 = 0
        L_0x01be:
            r5.A08 = r0
            r5.A02 = r1
            java.lang.Object r6 = r8.get(r2)
            if (r6 != 0) goto L_0x01d7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Integer[] r6 = new java.lang.Integer[]{r1, r1, r0}
            r8.put(r2, r6)
        L_0x01d7:
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r3 = r5.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r6[r4] = r0
            int r2 = r5.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 1
            r6[r0] = r1
            int r0 = r5.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2
            r6[r0] = r1
            int r0 = r5.A00
            if (r3 != r0) goto L_0x01fb
            int r0 = r5.A05
            if (r2 == r0) goto L_0x01fc
        L_0x01fb:
            r9 = 1
        L_0x01fc:
            r5.A09 = r9
        L_0x01fe:
            return
        L_0x01ff:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01bd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Sd5.Cnt(X.2d3, X.2d8):void");
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.2d8] */
    public Sd5() {
        2d3 r4 = new 2d3(0, 0);
        r4.A00 = AnonymousClass7TE.A1C();
        r4.A09 = new C71432d7(r4);
        2d9 r3 = new 2d9(r4);
        r4.A0A = r3;
        r4.A08 = null;
        r4.A0H = false;
        r4.A06 = new 2dA();
        r4.A00 = 0;
        r4.A04 = 0;
        r4.A0K = new AnonymousClass2dL[4];
        r4.A0J = new AnonymousClass2dL[4];
        r4.A01 = 257;
        r4.A0I = false;
        r4.A0G = false;
        r4.A0E = null;
        r4.A0C = null;
        r4.A0D = null;
        r4.A0B = null;
        r4.A0F = AnonymousClass7TE.A1F();
        r4.A07 = new Object();
        r4.A08 = this;
        r3.A02 = this;
        this.A03 = r4;
    }

    public static final void A00(Integer num, int[] iArr, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        boolean z3;
        int i5;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                iArr[0] = 0;
            } else if (intValue == 2) {
                if (z2 || (i3 == 1 ? i2 != 1 || z : i3 == 2)) {
                    z3 = true;
                    i5 = i;
                } else {
                    z3 = false;
                    i5 = 0;
                }
                iArr[0] = i5;
                if (!z3) {
                    i = i4;
                }
            } else if (intValue == 3) {
                iArr[0] = i4;
            } else {
                throw DbW.A0c("FIXED", AnonymousClass000.A00(396));
            }
            iArr[1] = i4;
            return;
        }
        iArr[0] = i;
        iArr[1] = i;
    }
}
