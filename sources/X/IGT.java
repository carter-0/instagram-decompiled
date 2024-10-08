package X;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public final class IGT implements AnonymousClass5RD {
    public final JLN A00;

    public static C268084cj A00(List list) {
        List list2 = (List) 00k.A0O(list, 2);
        if (list2 != null) {
            return (C268084cj) 00k.A0J(list2);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof IGT) && 0qQ.A0K(this.A00, ((IGT) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final int CmW(C268014cc r17, List list, int i) {
        JLN jln = this.A00;
        C268014cc r6 = r17;
        ArrayList A002 = C56170Htz.A00(r6);
        C56849IEw iEw = (C56849IEw) jln;
        C56155Hti hti = iEw.A07;
        List list2 = (List) 00k.A0O(A002, 1);
        C268084cj r3 = null;
        if (list2 != null) {
            r3 = (C268084cj) 00k.A0J(list2);
        }
        int i2 = i;
        hti.A00(r3, A00(A002), C51971G9r.A0L(i2));
        0sn r8 = (List) 00k.A0J(A002);
        if (r8 == null) {
            r8 = 0sn.A00;
        }
        int EJS = r6.EJS(iEw.A01);
        int EJS2 = r6.EJS(iEw.A00);
        int i3 = iEw.A03;
        return C51965G9l.A04(I5T.A00(hti, r8, iEw.A0A, iEw.A09, i2, EJS, EJS2, iEw.A02, i3));
    }

    public final int CmZ(C268014cc r13, List list, int i) {
        JLN jln = this.A00;
        ArrayList A002 = C56170Htz.A00(r13);
        C56849IEw iEw = (C56849IEw) jln;
        C56155Hti hti = iEw.A07;
        List list2 = (List) 00k.A0O(A002, 1);
        C268084cj r3 = null;
        if (list2 != null) {
            r3 = (C268084cj) 00k.A0J(list2);
        }
        hti.A00(r3, A00(A002), AnonymousClass5SF.A04(0, Integer.MAX_VALUE, 0, i));
        0sn r9 = (List) 00k.A0J(A002);
        if (r9 == null) {
            r9 = 0sn.A00;
        }
        int EJS = r13.EJS(iEw.A01);
        0sK r10 = iEw.A08;
        int i2 = iEw.A02;
        C291605ha r0 = I5T.A01;
        int size = r9.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < size) {
            int A06 = C51975G9x.A06(r9.get(i3), Integer.valueOf(i3), r10, i) + EJS;
            int i7 = i3 + 1;
            if (i7 - i5 == i2 || i7 == r9.size()) {
                i4 = Math.max(i4, (i6 + A06) - EJS);
                i5 = i3;
                i6 = 0;
            } else {
                i6 += A06;
            }
            i3 = i7;
        }
        return i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x022f A[SYNTHETIC, Splitter:B:52:0x022f] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0275 A[LOOP:1: B:64:0x0273->B:65:0x0275, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0287 A[LOOP:2: B:67:0x0285->B:68:0x0287, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0291 A[LOOP:3: B:70:0x028f->B:71:0x0291, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x029d A[LOOP:4: B:73:0x029b->B:74:0x029d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x020b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C289145d6 Cnx(X.C268004cb r55, java.util.List r56, long r57) {
        /*
            r54 = this;
            r0 = r54
            X.JLN r2 = r0.A00
            r14 = r55
            java.util.ArrayList r1 = X.C56170Htz.A00(r14)
            X.IEw r2 = (X.C56849IEw) r2
            int r0 = r2.A03
            r19 = r0
            if (r0 == 0) goto L_0x003a
            int r9 = r2.A02
            if (r9 == 0) goto L_0x003a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x003a
            int r11 = androidx.compose.ui.unit.Constraints.A00(r57)
            if (r11 == 0) goto L_0x003a
            java.lang.Object r13 = X.00k.A0I(r1)
            java.util.List r13 = (java.util.List) r13
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x003d
            X.Iyu r2 = X.C58869Iyu.A00
        L_0x0030:
            r1 = 0
            X.0sm r0 = X.0Yt.A0E()
            X.5d6 r0 = r14.Cfi(r0, r2, r1, r1)
            return r0
        L_0x003a:
            X.Iyt r2 = X.C58868Iyt.A00
            goto L_0x0030
        L_0x003d:
            r0 = 1
            java.lang.Object r0 = X.00k.A0O(r1, r0)
            java.util.List r0 = (java.util.List) r0
            r12 = 0
            if (r0 == 0) goto L_0x0269
            java.lang.Object r15 = X.00k.A0J(r0)
            X.4ci r15 = (X.C268074ci) r15
        L_0x004d:
            r0 = 2
            java.lang.Object r0 = X.00k.A0O(r1, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x005c
            java.lang.Object r12 = X.00k.A0J(r0)
            X.4ci r12 = (X.C268074ci) r12
        L_0x005c:
            X.Hti r5 = r2.A07
            r13.size()
            int r10 = androidx.compose.ui.unit.Constraints.A03(r57)
            int r8 = androidx.compose.ui.unit.Constraints.A01(r57)
            int r7 = androidx.compose.ui.unit.Constraints.A02(r57)
            long r16 = X.AnonymousClass5SF.A04(r10, r8, r7, r11)
            r4 = 0
            int r1 = androidx.compose.ui.unit.Constraints.A01(r16)
            int r0 = androidx.compose.ui.unit.Constraints.A00(r16)
            long r0 = X.AnonymousClass5SF.A04(r4, r1, r4, r0)
            long r0 = X.C51974G9v.A02(r0)
            if (r15 == 0) goto L_0x0090
            r6 = 21
            X.J6U r3 = new X.J6U
            r3.<init>(r6, r2, r5)
            X.I5T.A01(r15, r3, r0)
            r5.A01 = r15
        L_0x0090:
            if (r12 == 0) goto L_0x009e
            r6 = 22
            X.J6U r3 = new X.J6U
            r3.<init>(r6, r2, r5)
            X.I5T.A01(r12, r3, r0)
            r5.A00 = r12
        L_0x009e:
            java.util.Iterator r33 = r13.iterator()
            float r1 = r2.A01
            float r3 = r2.A00
            long r51 = X.AnonymousClass5SF.A04(r10, r8, r7, r11)
            X.5ha r0 = X.I5T.A01
            r7 = 16
            X.5d6[] r6 = new X.C289145d6[r7]
            X.5Pl r32 = new X.5Pl
            r0 = r32
            r0.<init>(r6)
            int r31 = androidx.compose.ui.unit.Constraints.A01(r51)
            int r10 = androidx.compose.ui.unit.Constraints.A03(r51)
            r53 = r10
            int r15 = androidx.compose.ui.unit.Constraints.A00(r51)
            X.0yC r0 = X.AnonymousClass01P.A00
            r6 = 6
            X.0yC r30 = new X.0yC
            r0 = r30
            r0.<init>(r6)
            java.util.ArrayList r29 = X.AnonymousClass7TE.A1C()
            float r0 = r14.F06(r1)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r6 = (float) r0
            int r0 = (int) r6
            r28 = r0
            float r0 = r14.F06(r3)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r3 = (float) r0
            int r0 = (int) r3
            r27 = r0
            r0 = r31
            long r0 = X.AnonymousClass5SF.A04(r4, r0, r4, r15)
            r26 = 0
            int r25 = androidx.compose.ui.unit.Constraints.A01(r0)
            int r24 = androidx.compose.ui.unit.Constraints.A02(r0)
            int r3 = androidx.compose.ui.unit.Constraints.A00(r0)
            r1 = r25
            r0 = r24
            long r0 = X.AnonymousClass5SF.A04(r4, r1, r0, r3)
            long r22 = X.C51974G9v.A02(r0)
            X.0rm r13 = X.C51965G9l.A11()
            r44 = 0
            boolean r0 = r33.hasNext()
            if (r0 != 0) goto L_0x023a
            r3 = 0
        L_0x011a:
            r6 = 0
            r16 = 0
            r18 = 0
        L_0x011f:
            X.0yG r8 = new X.0yG
            r8.<init>(r7)
            X.0yG r21 = new X.0yG
            r0 = r21
            r0.<init>(r7)
            X.Hqv r34 = new X.Hqv
            r45 = r34
            r46 = r5
            r47 = r9
            r48 = r19
            r49 = r28
            r50 = r27
            r45.<init>(r46, r47, r48, r49, r50, r51)
            boolean r42 = r33.hasNext()
            r0 = r31
            long r40 = X.01J.A00(r0, r15)
            r5 = 0
            r35 = r6
            r36 = r4
            r37 = r4
            r38 = r4
            r39 = r4
            r43 = r4
            X.HzZ r0 = r34.A00(r35, r36, r37, r38, r39, r40, r42, r43)
            r9 = r15
            r17 = 0
            r45 = 0
            r1 = 0
            r7 = 0
            r6 = 0
            r20 = r31
        L_0x0161:
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x026c
            if (r3 == 0) goto L_0x026c
            X.0qQ.A0A(r16)
            int r11 = r16.intValue()
            X.0qQ.A0A(r18)
            int r0 = r18.intValue()
            int r7 = r7 + r11
            int r6 = java.lang.Math.max(r6, r0)
            int r20 = r20 - r11
            int r19 = r1 + 1
            r0 = r29
            r0.add(r3)
            java.lang.Object r3 = r13.A00
            r0 = r30
            r0.A08(r1, r3)
            int r43 = r19 - r17
            boolean r0 = r33.hasNext()
            if (r0 != 0) goto L_0x022f
            r3 = 0
        L_0x0193:
            r0 = r26
            r13.A00 = r0
            if (r3 == 0) goto L_0x022a
            r0 = 27
            X.J6G r11 = X.J6G.A00(r13, r0)
            r0 = r22
            long r11 = X.I5T.A01(r3, r11, r0)
            X.01J r0 = new X.01J
            r0.<init>(r11)
            long r11 = r0.A00
            int r1 = X.C51965G9l.A04(r11)
            int r1 = r1 + r28
            java.lang.Integer r16 = java.lang.Integer.valueOf(r1)
            int r1 = X.C51968G9o.A02(r11)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r1)
        L_0x01be:
            boolean r49 = r33.hasNext()
            r1 = r20
            long r47 = X.01J.A00(r1, r9)
            if (r0 != 0) goto L_0x0212
            r0 = 0
        L_0x01cb:
            r42 = r0
            r46 = r6
            r50 = r4
            r41 = r34
            X.HzZ r0 = r41.A00(r42, r43, r44, r45, r46, r47, r49, r50)
            boolean r1 = r0.A01
            if (r1 == 0) goto L_0x020b
            int r7 = java.lang.Math.max(r10, r7)
            r1 = r31
            int r10 = java.lang.Math.min(r7, r1)
            int r45 = r45 + r6
            r1 = r21
            r1.A02(r6)
            int r9 = r15 - r45
            int r9 = r9 - r27
            r17 = r19
            r1 = r19
            r8.A02(r1)
            if (r16 == 0) goto L_0x020f
            int r1 = r16.intValue()
            int r1 = r1 - r28
            java.lang.Integer r16 = java.lang.Integer.valueOf(r1)
        L_0x0203:
            int r44 = r44 + 1
            int r45 = r45 + r27
            r20 = r31
            r6 = 0
            r7 = 0
        L_0x020b:
            r1 = r19
            goto L_0x0161
        L_0x020f:
            r16 = 0
            goto L_0x0203
        L_0x0212:
            X.0qQ.A0A(r16)
            int r1 = r16.intValue()
            X.0qQ.A0A(r18)
            int r0 = r18.intValue()
            long r11 = X.01J.A00(r1, r0)
            X.01J r0 = new X.01J
            r0.<init>(r11)
            goto L_0x01cb
        L_0x022a:
            r16 = 0
            r18 = 0
            goto L_0x01be
        L_0x022f:
            java.lang.Object r3 = r33.next()     // Catch:{ IndexOutOfBoundsException -> 0x0237 }
            X.4ci r3 = (X.C268074ci) r3     // Catch:{ IndexOutOfBoundsException -> 0x0237 }
            goto L_0x0193
        L_0x0237:
            r3 = 0
            goto L_0x0193
        L_0x023a:
            java.lang.Object r3 = r33.next()     // Catch:{ IndexOutOfBoundsException -> 0x0241 }
            X.4ci r3 = (X.C268074ci) r3     // Catch:{ IndexOutOfBoundsException -> 0x0241 }
            goto L_0x0242
        L_0x0241:
            r3 = 0
        L_0x0242:
            if (r3 == 0) goto L_0x011a
            r0 = 28
            X.J6G r6 = X.J6G.A00(r13, r0)
            r0 = r22
            long r0 = X.I5T.A01(r3, r6, r0)
            X.01J r6 = new X.01J
            r6.<init>(r0)
            long r0 = r6.A00
            int r8 = X.C51965G9l.A04(r0)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r8)
            int r0 = X.C51968G9o.A02(r0)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)
            goto L_0x011f
        L_0x0269:
            r15 = r12
            goto L_0x004d
        L_0x026c:
            int r3 = r29.size()
            X.4cY[] r6 = new X.C267974cY[r3]
            r1 = 0
        L_0x0273:
            if (r1 >= r3) goto L_0x0280
            r0 = r30
            java.lang.Object r0 = r0.A03(r1)
            r6[r1] = r0
            int r1 = r1 + 1
            goto L_0x0273
        L_0x0280:
            int r3 = r8.A00
            int[] r1 = new int[r3]
            r0 = 0
        L_0x0285:
            if (r0 >= r3) goto L_0x028c
            r1[r0] = r4
            int r0 = r0 + 1
            goto L_0x0285
        L_0x028c:
            int[] r0 = new int[r3]
            r7 = 0
        L_0x028f:
            if (r7 >= r3) goto L_0x0296
            r0[r7] = r4
            int r7 = r7 + 1
            goto L_0x028f
        L_0x0296:
            int[] r7 = r8.A01
            r11 = 0
            r43 = 0
        L_0x029b:
            if (r5 >= r3) goto L_0x02d6
            r44 = r7[r5]
            r4 = r21
            int r41 = r4.A00(r5)
            r33 = r2
            r34 = r14
            r35 = r29
            r36 = r1
            r37 = r6
            r38 = r10
            r39 = r24
            r40 = r25
            r42 = r28
            r45 = r5
            X.5d6 r8 = X.C289065cx.A00(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            int r9 = r8.getWidth()
            int r4 = r8.getHeight()
            r0[r5] = r4
            int r11 = r11 + r4
            int r10 = java.lang.Math.max(r10, r9)
            r4 = r32
            r4.A09(r8)
            int r5 = r5 + 1
            r43 = r44
            goto L_0x029b
        L_0x02d6:
            r3 = r32
            int r5 = r3.A00
            if (r5 != 0) goto L_0x02de
            r10 = 0
            r11 = 0
        L_0x02de:
            X.5Zx r4 = r2.A05
            float r2 = r4.By0()
            int r3 = r14.EJS(r2)
            int r2 = r5 + -1
            int r3 = r3 * r2
            int r3 = r3 + r11
            int r2 = androidx.compose.ui.unit.Constraints.A02(r51)
            int r3 = X.C229632nm.A03(r3, r2, r15)
            r4.ACR(r14, r0, r1, r3)
            r1 = r53
            r0 = r31
            int r2 = X.C229632nm.A03(r10, r1, r0)
            r1 = 29
            r0 = r32
            X.J6G r0 = X.J6G.A00(r0, r1)
            X.5d6 r0 = X.C51969G9p.A0a(r14, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IGT.Cnx(X.4cb, java.util.List, long):X.5d6");
    }

    public final int CoP(C268014cc r17, List list, int i) {
        JLN jln = this.A00;
        C268014cc r6 = r17;
        ArrayList A002 = C56170Htz.A00(r6);
        C56849IEw iEw = (C56849IEw) jln;
        C56155Hti hti = iEw.A07;
        List list2 = (List) 00k.A0O(A002, 1);
        C268084cj r3 = null;
        if (list2 != null) {
            r3 = (C268084cj) 00k.A0J(list2);
        }
        int i2 = i;
        hti.A00(r3, A00(A002), C51971G9r.A0L(i2));
        0sn r8 = (List) 00k.A0J(A002);
        if (r8 == null) {
            r8 = 0sn.A00;
        }
        int EJS = r6.EJS(iEw.A01);
        int EJS2 = r6.EJS(iEw.A00);
        int i3 = iEw.A03;
        return C51965G9l.A04(I5T.A00(hti, r8, iEw.A0A, iEw.A09, i2, EJS, EJS2, iEw.A02, i3));
    }

    public final int CoS(C268014cc r27, List list, int i) {
        JLN jln = this.A00;
        C268014cc r6 = r27;
        ArrayList A002 = C56170Htz.A00(r6);
        C56849IEw iEw = (C56849IEw) jln;
        C56155Hti hti = iEw.A07;
        List list2 = (List) 00k.A0O(A002, 1);
        C268084cj r5 = null;
        if (list2 != null) {
            r5 = (C268084cj) 00k.A0J(list2);
        }
        int i2 = i;
        hti.A00(r5, A00(A002), AnonymousClass5SF.A04(0, Integer.MAX_VALUE, 0, i2));
        0sn r9 = (List) 00k.A0J(A002);
        if (r9 == null) {
            r9 = 0sn.A00;
        }
        int EJS = r6.EJS(iEw.A01);
        int EJS2 = r6.EJS(iEw.A00);
        int i3 = iEw.A03;
        int i4 = iEw.A02;
        0sK r18 = iEw.A0A;
        0sK r17 = iEw.A09;
        C291605ha r0 = I5T.A01;
        if (r9.isEmpty()) {
            return 0;
        }
        int size = r9.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = 0;
        }
        int size2 = r9.size();
        int[] iArr2 = new int[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            iArr2[i6] = 0;
        }
        int size3 = r9.size();
        for (int i7 = 0; i7 < size3; i7++) {
            Object obj = r9.get(i7);
            Integer valueOf = Integer.valueOf(i7);
            int A06 = C51975G9x.A06(obj, valueOf, r18, i2);
            iArr[i7] = A06;
            iArr2[i7] = C51975G9x.A06(obj, valueOf, r17, A06);
        }
        int i8 = Integer.MAX_VALUE;
        if (!(i3 == Integer.MAX_VALUE || i4 == Integer.MAX_VALUE)) {
            i8 = i4 * i3;
        }
        r9.size();
        r9.size();
        int min = Math.min(i8, r9.size());
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += iArr[i10];
        }
        int A02 = i9 + (DbT.A02(r9, 1) * EJS);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i11 = iArr2[0];
        C226422gn A003 = new 2HY(1, size2 - 1).A00();
        while (A003.hasNext()) {
            int i12 = iArr2[A003.A00()];
            if (i11 < i12) {
                i11 = i12;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i13 = iArr[0];
        C226422gn A004 = new 2HY(1, size - 1).A00();
        while (A004.hasNext()) {
            int i14 = iArr[A004.A00()];
            if (i13 < i14) {
                i13 = i14;
            }
        }
        int i15 = A02;
        while (i13 <= i15 && i11 != i2) {
            A02 = (i13 + i15) / 2;
            long A005 = I5T.A00(hti, r9, JJQ.A00(iArr, 4), JJQ.A00(iArr2, 5), A02, EJS, EJS2, i4, i3);
            i11 = C51965G9l.A04(A005);
            int A022 = C51968G9o.A02(A005);
            if (i11 > i2 || A022 < min) {
                i13 = A02 + 1;
                if (i13 > i15) {
                    return i13;
                }
            } else if (i11 >= i2) {
                return A02;
            } else {
                i15 = A02 - 1;
            }
        }
        return A02;
    }

    public IGT(JLN jln) {
        this.A00 = jln;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MultiContentMeasurePolicyImpl(measurePolicy=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
