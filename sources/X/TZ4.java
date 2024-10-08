package X;

public final class TZ4 extends TAH {
    public final transient int[] A00;
    public final transient byte[][] A01;

    public TZ4(C13198TPe tPe, int i) {
        super((byte[]) null);
        SCP.A00(tPe.A00, 0, (long) i);
        SRX srx = tPe.A01;
        SRX srx2 = srx;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (srx.A00 != srx.A01) {
                i3 += srx.A00 - srx.A01;
                i4++;
                srx = srx.A02;
            } else {
                throw Pxe.A0e("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        this.A01 = bArr;
        int[] iArr = new int[(i4 * 2)];
        this.A00 = iArr;
        int i5 = 0;
        while (i2 < i) {
            bArr[i5] = srx2.A06;
            i2 += srx2.A00 - srx2.A01;
            if (i2 > i) {
                i2 = i;
            }
            iArr[i5] = i2;
            iArr[i4 + i5] = srx2.A01;
            srx2.A05 = true;
            i5++;
            srx2 = srx2.A02;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r4 = (X.TAH) r4;
        r1 = r4.A05();
        r0 = A05();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 1
            if (r4 == r3) goto L_0x0019
            boolean r0 = r4 instanceof X.TAH
            if (r0 == 0) goto L_0x001a
            X.TAH r4 = (X.TAH) r4
            int r1 = r4.A05()
            int r0 = r3.A05()
            if (r1 != r0) goto L_0x001a
            boolean r0 = r3.A0C(r4, r0)
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            return r2
        L_0x001a:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TZ4.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.A01;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            int[] iArr = this.A00;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.A00 = i4;
        return i4;
    }

    public final String toString() {
        return new TAH(A0E()).toString();
    }
}
