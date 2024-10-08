package X;

import java.util.List;

/* renamed from: X.5T5  reason: invalid class name */
public final class AnonymousClass5T5 extends AnonymousClass5T4 {
    public C304926Ft A00;
    public C268064ch A01;
    public boolean A02 = true;
    public boolean A03 = true;
    public boolean A04;
    public final 01c A05 = new 01c(2);
    public final C267794cD A06;
    public final C7214Pzi A07 = new C7214Pzi();

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013f, code lost:
        if (r1 == 1) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.01c r42, X.GPV r43, X.C268064ch r44, boolean r45) {
        /*
            r41 = this;
            r4 = r41
            r40 = r42
            r39 = r43
            r38 = r44
            r19 = r45
            r3 = r39
            r2 = r19
            r1 = r40
            r0 = r38
            boolean r18 = super.A04(r1, r3, r0, r2)
            X.4cD r7 = r4.A06
            boolean r0 = r7.A08
            r3 = 1
            if (r0 == 0) goto L_0x024f
            r6 = 16
            r5 = 0
        L_0x0020:
            boolean r0 = r7 instanceof X.AnonymousClass5VD
            if (r0 == 0) goto L_0x010c
            X.4cg r0 = X.AnonymousClass5WH.A04(r7, r6)
            r4.A01 = r0
        L_0x002a:
            X.4cD r7 = X.AnonymousClass5WH.A00(r5)
        L_0x002e:
            r9 = 0
            if (r7 != 0) goto L_0x0020
            int r17 = r40.A00()
        L_0x0035:
            r0 = r17
            if (r9 >= r0) goto L_0x0143
            r0 = r40
            long r13 = r0.A02(r9)
            java.lang.Object r2 = r0.A04(r9)
            X.GPU r2 = (X.GPU) r2
            X.Pzi r8 = r4.A07
            int r7 = r8.A00
            r1 = 0
        L_0x004a:
            if (r1 >= r7) goto L_0x0108
            long[] r0 = r8.A01
            r5 = r0[r1]
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x00b0
            long r0 = r2.A07
            long r5 = r2.A06
            r27 = r5
            boolean r5 = X.C289295dM.A09(r0)
            if (r5 == 0) goto L_0x0108
            boolean r5 = X.C289295dM.A09(r27)
            if (r5 == 0) goto L_0x0108
            java.util.List r11 = r2.A02
            if (r11 != 0) goto L_0x006c
            X.0sn r11 = X.0sn.A00
        L_0x006c:
            int r5 = r11.size()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r5)
            int r16 = r11.size()
            r10 = 0
        L_0x007a:
            r5 = r16
            if (r10 >= r5) goto L_0x00b3
            java.lang.Object r12 = r11.get(r10)
            X.GQT r12 = (X.GQT) r12
            long r5 = r12.A01
            boolean r7 = X.C289295dM.A09(r5)
            if (r7 == 0) goto L_0x00ad
            long r7 = r12.A02
            r25 = r7
            X.4ch r7 = r4.A01
            X.0qQ.A0A(r7)
            r8 = r7
            r7 = r38
            long r23 = r8.CgW(r7, r5)
            long r5 = r12.A00
            r7 = r5
            X.GQT r5 = new X.GQT
            r20 = r5
            r21 = r25
            r25 = r7
            r20.<init>(r21, r23, r25)
            r15.add(r5)
        L_0x00ad:
            int r10 = r10 + 1
            goto L_0x007a
        L_0x00b0:
            int r1 = r1 + 1
            goto L_0x004a
        L_0x00b3:
            X.01c r8 = r4.A05
            X.4ch r6 = r4.A01
            X.0qQ.A0A(r6)
            r5 = r38
            long r31 = r6.CgW(r5, r0)
            X.4ch r6 = r4.A01
            X.0qQ.A0A(r6)
            r0 = r27
            long r27 = r6.CgW(r5, r0)
            long r0 = r2.A05
            r25 = r0
            long r0 = r2.A0A
            r29 = r0
            boolean r0 = r2.A0B
            r35 = r0
            long r10 = r2.A08
            boolean r0 = r2.A0C
            r36 = r0
            int r0 = r2.A04
            r16 = r0
            long r6 = r2.A09
            float r0 = r2.A03
            r12 = r0
            long r0 = r2.A00
            r37 = 0
            X.GPU r5 = new X.GPU
            r20 = r5
            r21 = r12
            r22 = r16
            r23 = r25
            r25 = r29
            r29 = r10
            r33 = r6
            r20.<init>(r21, r22, r23, r25, r27, r29, r31, r33, r35, r36, r37)
            r5.A02 = r15
            r5.A00 = r0
            X.Hk2 r0 = r2.A01
            r5.A01 = r0
            r8.A09(r13, r5)
        L_0x0108:
            int r9 = r9 + 1
            goto L_0x0035
        L_0x010c:
            int r0 = r7.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x002a
            boolean r0 = r7 instanceof X.C267944cV
            if (r0 == 0) goto L_0x002a
            r0 = r7
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r2 = r0.A00
            r1 = 0
        L_0x011c:
            if (r2 == 0) goto L_0x013f
            int r0 = r2.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0129
            int r1 = r1 + 1
            if (r1 != r3) goto L_0x012c
            r7 = r2
        L_0x0129:
            X.4cD r2 = r2.A02
            goto L_0x011c
        L_0x012c:
            if (r5 != 0) goto L_0x0135
            X.4cD[] r0 = new X.C267794cD[r6]
            X.5Pl r5 = new X.5Pl
            r5.<init>(r0)
        L_0x0135:
            if (r7 == 0) goto L_0x013b
            r5.A09(r7)
            r7 = 0
        L_0x013b:
            r5.A09(r2)
            goto L_0x0129
        L_0x013f:
            if (r1 != r3) goto L_0x002a
            goto L_0x002e
        L_0x0143:
            X.01c r8 = r4.A05
            int r0 = r8.A00()
            if (r0 != 0) goto L_0x0156
            X.Pzi r1 = r4.A07
            r0 = 0
            r1.A00 = r0
            X.5Pl r0 = r4.A00
            r0.A01()
            return r3
        L_0x0156:
            X.Pzi r11 = r4.A07
            int r10 = r11.A00
            int r10 = r10 - r3
        L_0x015b:
            r0 = -1
            if (r0 >= r10) goto L_0x0184
            long[] r0 = r11.A01
            r1 = r0[r10]
            r0 = r40
            int r0 = r0.A01(r1)
            if (r0 >= 0) goto L_0x0181
            r9 = r10
            int r7 = r11.A00
            if (r10 >= r7) goto L_0x0181
            int r6 = r7 - r3
        L_0x0171:
            if (r9 >= r6) goto L_0x017d
            long[] r5 = r11.A01
            int r2 = r9 + 1
            r0 = r5[r2]
            r5[r9] = r0
            r9 = r2
            goto L_0x0171
        L_0x017d:
            int r0 = r7 + -1
            r11.A00 = r0
        L_0x0181:
            int r10 = r10 + -1
            goto L_0x015b
        L_0x0184:
            int r0 = r8.A00()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            int r2 = r8.A00()
            r1 = 0
        L_0x0192:
            if (r1 >= r2) goto L_0x019e
            java.lang.Object r0 = r8.A04(r1)
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x0192
        L_0x019e:
            X.6Ft r5 = new X.6Ft
            r0 = r39
            r5.<init>(r0, r6)
            java.util.List r6 = r5.A03
            int r9 = r6.size()
            r8 = 0
        L_0x01ac:
            if (r8 >= r9) goto L_0x01c2
            java.lang.Object r7 = r6.get(r8)
            r0 = r7
            X.GPU r0 = (X.GPU) r0
            long r1 = r0.A05
            r0 = r39
            boolean r0 = r0.A00(r1)
            if (r0 != 0) goto L_0x01c3
            int r8 = r8 + 1
            goto L_0x01ac
        L_0x01c2:
            r7 = 0
        L_0x01c3:
            X.GPU r7 = (X.GPU) r7
            if (r7 == 0) goto L_0x01e2
            if (r45 != 0) goto L_0x022e
            r0 = 0
            r4.A02 = r0
            r1 = 0
        L_0x01cd:
            boolean r8 = r4.A04
            if (r1 == r8) goto L_0x0217
            int r2 = r5.A00
            r0 = 3
            if (r2 == r0) goto L_0x01dc
            r0 = 4
            if (r2 == r0) goto L_0x01dc
            r0 = 5
            if (r2 != r0) goto L_0x0217
        L_0x01dc:
            r0 = 5
            if (r1 == 0) goto L_0x01e0
            r0 = 4
        L_0x01e0:
            r5.A00 = r0
        L_0x01e2:
            if (r18 != 0) goto L_0x024d
            int r1 = r5.A00
            r0 = 3
            if (r1 != r0) goto L_0x024d
            X.6Ft r0 = r4.A00
            if (r0 == 0) goto L_0x024d
            java.util.List r11 = r0.A03
            int r1 = r11.size()
            int r0 = r6.size()
            if (r1 != r0) goto L_0x024d
            int r10 = r6.size()
            r9 = 0
        L_0x01fe:
            if (r9 >= r10) goto L_0x024c
            java.lang.Object r1 = r11.get(r9)
            X.GPU r1 = (X.GPU) r1
            java.lang.Object r0 = r6.get(r9)
            X.GPU r0 = (X.GPU) r0
            long r7 = r1.A06
            long r0 = r0.A06
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x024d
            int r9 = r9 + 1
            goto L_0x01fe
        L_0x0217:
            int r2 = r5.A00
            r0 = 4
            if (r2 != r0) goto L_0x0224
            if (r8 == 0) goto L_0x01e2
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x01e2
        L_0x0222:
            r0 = 3
            goto L_0x01e0
        L_0x0224:
            r0 = 5
            if (r2 != r0) goto L_0x01e2
            if (r1 == 0) goto L_0x01e2
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x01e2
            goto L_0x0222
        L_0x022e:
            boolean r1 = r4.A02
            if (r1 != 0) goto L_0x01cd
            boolean r0 = r7.A0B
            if (r0 != 0) goto L_0x023a
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x01cd
        L_0x023a:
            X.4ch r0 = r4.A01
            X.0qQ.A0A(r0)
            long r0 = r0.Bwh()
            boolean r0 = X.GPS.A03(r7, r0)
            r1 = r0 ^ 1
            r4.A02 = r1
            goto L_0x01cd
        L_0x024c:
            r3 = 0
        L_0x024d:
            r4.A00 = r5
        L_0x024f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5T5.A04(X.01c, X.GPV, X.4ch, boolean):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Node(pointerInputFilter=");
        sb.append(this.A06);
        sb.append(", children=");
        sb.append(this.A00);
        sb.append(", pointerIds=");
        sb.append(this.A07);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass5T5(C267794cD r3) {
        this.A06 = r3;
    }

    public final void A03(GPV gpv) {
        super.A03(gpv);
        C304926Ft r7 = this.A00;
        if (r7 != null) {
            this.A04 = this.A02;
            List list = r7.A03;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                GPU gpu = (GPU) list.get(i);
                boolean z = !gpu.A0B;
                boolean z2 = !gpv.A00(gpu.A05);
                boolean z3 = !this.A02;
                if (z && (z2 || z3)) {
                    this.A07.A01(gpu.A05);
                }
            }
            this.A02 = false;
            boolean z4 = false;
            if (r7.A00 == 5) {
                z4 = true;
            }
            this.A03 = z4;
        }
    }
}
