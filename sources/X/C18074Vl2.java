package X;

/* renamed from: X.Vl2  reason: case insensitive filesystem */
public final class C18074Vl2 {
    public final C18652Vw6 A00;
    public final int[] A01;

    public final int A00(int i) {
        if (i == 0) {
            int[] iArr = this.A01;
            return iArr[iArr.length - 1];
        }
        int[] iArr2 = this.A01;
        if (i == 1) {
            int i2 = 0;
            for (int i3 : iArr2) {
                i2 ^= i3;
            }
            return i2;
        }
        int i4 = iArr2[0];
        int length = iArr2.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = this.A00.A01(i, i4) ^ iArr2[i5];
        }
        return i4;
    }

    public final C18074Vl2 A01(int i) {
        if (i == 0) {
            return this.A00.A02;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = this.A01;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = this.A00.A01(iArr[i2], i);
        }
        return new C18074Vl2(this.A00, iArr2);
    }

    public final C18074Vl2 A02(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.A00.A02;
        } else {
            int[] iArr = this.A01;
            int length = iArr.length;
            int[] iArr2 = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr2[i3] = this.A00.A01(iArr[i3], i2);
            }
            return new C18074Vl2(this.A00, iArr2);
        }
    }

    public final C18074Vl2 A03(C18074Vl2 vl2) {
        C18652Vw6 vw6 = this.A00;
        if (vw6.equals(vl2.A00)) {
            int[] iArr = this.A01;
            if (iArr[0] == 0) {
                return vl2;
            }
            int[] iArr2 = vl2.A01;
            if (iArr2[0] == 0) {
                return this;
            }
            int[] iArr3 = iArr;
            if (iArr.length <= iArr2.length) {
                iArr3 = iArr2;
                iArr2 = iArr;
            }
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int length2 = length - iArr2.length;
            System.arraycopy(iArr3, 0, iArr4, 0, length2);
            for (int i = length2; i < length; i++) {
                iArr4[i] = iArr2[i - length2] ^ iArr3[i];
            }
            return new C18074Vl2(vw6, iArr4);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final C18074Vl2 A04(C18074Vl2 vl2) {
        C18652Vw6 vw6 = this.A00;
        if (vw6.equals(vl2.A00)) {
            int[] iArr = this.A01;
            if (iArr[0] != 0) {
                int[] iArr2 = vl2.A01;
                if (iArr2[0] != 0) {
                    int length = iArr.length;
                    int length2 = iArr2.length;
                    int[] iArr3 = new int[((length + length2) - 1)];
                    for (int i = 0; i < length; i++) {
                        int i2 = iArr[i];
                        for (int i3 = 0; i3 < length2; i3++) {
                            int i4 = i + i3;
                            iArr3[i4] = iArr3[i4] ^ vw6.A01(i2, iArr2[i3]);
                        }
                    }
                    return new C18074Vl2(vw6, iArr3);
                }
            }
            return vw6.A02;
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0073 A[EDGE_INSN: B:38:0x0073->B:34:0x0073 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r7 = this;
            int[] r6 = r7.A01
            r0 = 0
            r0 = r6[r0]
            if (r0 != 0) goto L_0x000a
            java.lang.String r0 = "0"
            return r0
        L_0x000a:
            int r0 = r6.length
            int r5 = r0 + -1
            int r0 = r5 * 8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r3 = r5
        L_0x0015:
            if (r3 < 0) goto L_0x0073
            int r0 = r5 - r3
            r1 = r6[r0]
            if (r1 == 0) goto L_0x0044
            if (r1 >= 0) goto L_0x0061
            if (r3 != r5) goto L_0x005e
            java.lang.String r0 = "-"
        L_0x0023:
            r4.append(r0)
            int r1 = -r1
        L_0x0027:
            r2 = 1
            if (r3 == 0) goto L_0x002c
            if (r1 == r2) goto L_0x003d
        L_0x002c:
            X.Vw6 r0 = r7.A00
            if (r1 == 0) goto L_0x006d
            int[] r0 = r0.A04
            r1 = r0[r1]
            if (r1 != 0) goto L_0x0050
            r0 = 49
        L_0x0038:
            r4.append(r0)
        L_0x003b:
            if (r3 == 0) goto L_0x0073
        L_0x003d:
            if (r3 != r2) goto L_0x0047
            r0 = 120(0x78, float:1.68E-43)
            r4.append(r0)
        L_0x0044:
            int r3 = r3 + -1
            goto L_0x0015
        L_0x0047:
            java.lang.String r0 = "x^"
            r4.append(r0)
            r4.append(r3)
            goto L_0x0044
        L_0x0050:
            if (r1 != r2) goto L_0x0055
            r0 = 97
            goto L_0x0038
        L_0x0055:
            java.lang.String r0 = "a^"
            r4.append(r0)
            r4.append(r1)
            goto L_0x003b
        L_0x005e:
            java.lang.String r0 = " - "
            goto L_0x0023
        L_0x0061:
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0027
            java.lang.String r0 = " + "
            r4.append(r0)
            goto L_0x0027
        L_0x006d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0073:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18074Vl2.toString():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011 A[LOOP:0: B:7:0x0011->B:10:0x0017, LOOP_START, PHI: r1 
      PHI: (r1v1 int) = (r1v0 int), (r1v3 int) binds: [B:6:0x0010, B:10:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18074Vl2(X.C18652Vw6 r5, int[] r6) {
        /*
            r4 = this;
            r4.<init>()
            int r3 = r6.length
            if (r3 == 0) goto L_0x002f
            r4.A00 = r5
            r0 = 1
            if (r3 <= r0) goto L_0x002c
            r2 = 0
            r0 = r6[r2]
            if (r0 != 0) goto L_0x002c
            r1 = 1
        L_0x0011:
            r0 = r6[r1]
            if (r0 != 0) goto L_0x001a
            int r1 = r1 + 1
            if (r1 >= r3) goto L_0x001a
            goto L_0x0011
        L_0x001a:
            if (r1 != r3) goto L_0x0023
            int[] r0 = new int[]{r2}
            r4.A01 = r0
            return
        L_0x0023:
            int r3 = r3 - r1
            int[] r0 = new int[r3]
            r4.A01 = r0
            java.lang.System.arraycopy(r6, r1, r0, r2, r3)
            return
        L_0x002c:
            r4.A01 = r6
            return
        L_0x002f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18074Vl2.<init>(X.Vw6, int[]):void");
    }
}
