package X;

/* renamed from: X.9IC  reason: invalid class name */
public final class AnonymousClass9IC extends AnonymousClass0T0 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public AnonymousClass9IC(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = i;
        if (i != 0) {
            this.A02 = z;
            this.A05 = z2;
            this.A03 = z3;
            this.A01 = z4;
            this.A04 = z5;
            return;
        }
        this.A03 = z;
        this.A05 = z2;
        this.A02 = z3;
        this.A04 = z4;
        this.A01 = z5;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass9IC)) {
                return false;
            }
            AnonymousClass9IC r3 = (AnonymousClass9IC) obj;
            if (r3.A00 != 1 || this.A02 != r3.A02 || this.A05 != r3.A05 || this.A03 != r3.A03 || this.A01 != r3.A01) {
                return false;
            }
            z = this.A04;
            z2 = r3.A04;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof AnonymousClass9IC)) {
                return false;
            }
            AnonymousClass9IC r32 = (AnonymousClass9IC) obj;
            if (r32.A00 != 0 || this.A03 != r32.A03 || this.A05 != r32.A05 || this.A02 != r32.A02 || this.A04 != r32.A04) {
                return false;
            }
            z = this.A01;
            z2 = r32.A01;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        boolean z;
        if (this.A00 != 0) {
            int i2 = 1237;
            if (this.A02) {
                i2 = 1231;
            }
            int i3 = i2 * 31;
            int i4 = 1237;
            if (this.A05) {
                i4 = 1231;
            }
            int i5 = (i3 + i4) * 31;
            int i6 = 1237;
            if (this.A03) {
                i6 = 1231;
            }
            int i7 = (i5 + i6) * 31;
            int i8 = 1237;
            if (this.A01) {
                i8 = 1231;
            }
            i = (i7 + i8) * 31;
            z = this.A04;
        } else {
            int i9 = 1237;
            if (this.A03) {
                i9 = 1231;
            }
            int i10 = i9 * 31;
            int i11 = 1237;
            if (this.A05) {
                i11 = 1231;
            }
            int i12 = (i10 + i11) * 31;
            int i13 = 1237;
            if (this.A02) {
                i13 = 1231;
            }
            int i14 = (i12 + i13) * 31;
            int i15 = 1237;
            if (this.A04) {
                i15 = 1231;
            }
            i = (i14 + i15) * 31;
            z = this.A01;
        }
        int i16 = 1237;
        if (z) {
            i16 = 1231;
        }
        return i + i16;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9IC(int r9, int r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            r8 = this;
            r1 = r8
            r7 = r15
            r6 = r14
            r5 = r13
            r4 = r12
            r3 = r11
            r8.A00 = r10
            r0 = r9 & 1
            if (r10 == 0) goto L_0x0028
            if (r0 == 0) goto L_0x000f
            r3 = 0
        L_0x000f:
            r0 = r9 & 2
            if (r0 == 0) goto L_0x0014
            r4 = 0
        L_0x0014:
            r0 = r9 & 4
            if (r0 == 0) goto L_0x0019
            r5 = 0
        L_0x0019:
            r0 = r9 & 8
            if (r0 == 0) goto L_0x001e
            r6 = 0
        L_0x001e:
            r0 = r9 & 16
            if (r0 == 0) goto L_0x0023
            r7 = 0
        L_0x0023:
            r2 = 1
        L_0x0024:
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        L_0x0028:
            if (r0 == 0) goto L_0x002b
            r3 = 0
        L_0x002b:
            r0 = r9 & 2
            if (r0 == 0) goto L_0x0030
            r4 = 0
        L_0x0030:
            r0 = r9 & 4
            if (r0 == 0) goto L_0x0035
            r5 = 0
        L_0x0035:
            r0 = r9 & 8
            if (r0 == 0) goto L_0x003a
            r6 = 0
        L_0x003a:
            r0 = r9 & 16
            if (r0 == 0) goto L_0x003f
            r7 = 0
        L_0x003f:
            r2 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9IC.<init>(int, int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
