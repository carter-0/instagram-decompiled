package X;

/* renamed from: X.9I6  reason: invalid class name */
public final class AnonymousClass9I6 extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public boolean A02;
    public final int A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9I6(int r2, int r3, int r4, int r5, boolean r6) {
        /*
            r1 = this;
            r1.A03 = r5
            r0 = r4 & 1
            if (r5 == 0) goto L_0x001a
            if (r0 == 0) goto L_0x0009
            r6 = 1
        L_0x0009:
            r0 = r4 & 2
            if (r0 == 0) goto L_0x000e
            r2 = 0
        L_0x000e:
            r0 = r4 & 4
            if (r0 == 0) goto L_0x0015
            r3 = 2131165248(0x7f070040, float:1.7944708E38)
        L_0x0015:
            r0 = 1
        L_0x0016:
            r1.<init>(r6, r2, r3, r0)
            return
        L_0x001a:
            if (r0 == 0) goto L_0x001d
            r6 = 0
        L_0x001d:
            r0 = r4 & 2
            if (r0 == 0) goto L_0x0022
            r2 = 0
        L_0x0022:
            r0 = r4 & 4
            if (r0 == 0) goto L_0x0027
            r3 = 0
        L_0x0027:
            r0 = 0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9I6.<init>(int, int, int, int, boolean):void");
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        if (this.A03 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass9I6)) {
                return false;
            }
            AnonymousClass9I6 r3 = (AnonymousClass9I6) obj;
            if (r3.A03 != 1 || this.A02 != r3.A02 || this.A01 != r3.A01) {
                return false;
            }
            i = this.A00;
            i2 = r3.A00;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof AnonymousClass9I6)) {
                return false;
            }
            AnonymousClass9I6 r32 = (AnonymousClass9I6) obj;
            if (r32.A03 != 0 || this.A02 != r32.A02 || this.A00 != r32.A00) {
                return false;
            }
            i = this.A01;
            i2 = r32.A01;
        }
        if (i != i2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.A03;
        boolean z = this.A02;
        int i4 = 1237;
        if (i3 != 0) {
            if (z) {
                i4 = 1231;
            }
            i = ((i4 * 31) + this.A01) * 31;
            i2 = this.A00;
        } else {
            if (z) {
                i4 = 1231;
            }
            i = ((i4 * 31) + this.A00) * 31;
            i2 = this.A01;
        }
        return i + i2;
    }

    public AnonymousClass9I6(boolean z, int i, int i2, int i3) {
        this.A03 = i3;
        this.A02 = z;
        if (i3 != 0) {
            this.A01 = i;
            this.A00 = i2;
            return;
        }
        this.A00 = i;
        this.A01 = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9I6() {
        this(false, 0, 0, 0);
        this.A03 = 0;
        this.A03 = 0;
    }
}
