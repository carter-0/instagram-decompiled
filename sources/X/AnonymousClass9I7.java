package X;

/* renamed from: X.9I7  reason: invalid class name */
public final class AnonymousClass9I7 extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    public AnonymousClass9I7(boolean z, int i, int i2, int i3, int i4) {
        this.A02 = i4;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r6.A03 < r8) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass9I7 A00(int r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x000d
            int r0 = r6.A00
            if (r0 < r7) goto L_0x000d
            int r0 = r6.A03
            r1 = 1
            if (r0 >= r8) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            int r0 = r6.A00
            int r2 = java.lang.Math.max(r0, r7)
            int r0 = r6.A03
            int r4 = java.lang.Math.max(r0, r8)
            int r3 = r6.A01
            r5 = 0
            X.9I7 r0 = new X.9I7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9I7.A00(int, int):X.9I7");
    }

    public final boolean equals(Object obj) {
        if (1 - this.A02 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass9I7)) {
            return false;
        }
        AnonymousClass9I7 r3 = (AnonymousClass9I7) obj;
        if (r3.A02 == 1 && this.A00 == r3.A00 && this.A01 == r3.A01 && this.A03 == r3.A03 && this.A04 == r3.A04) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (1 - this.A02 != 0) {
            return super.hashCode();
        }
        int i = ((((this.A00 * 31) + this.A01) * 31) + this.A03) * 31;
        int i2 = 1237;
        if (this.A04) {
            i2 = 1231;
        }
        return i + i2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9I7(int r8, int r9, int r10) {
        /*
            r7 = this;
            r3 = r9
            r4 = r8
            r2 = 0
            r1 = r7
            r7.A02 = r2
            r0 = r10 & 1
            if (r0 == 0) goto L_0x000b
            r4 = 0
        L_0x000b:
            r0 = r10 & 2
            if (r0 == 0) goto L_0x0010
            r3 = 0
        L_0x0010:
            r5 = r2
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9I7.<init>(int, int, int):void");
    }
}
