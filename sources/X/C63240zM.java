package X;

/* renamed from: X.0zM  reason: invalid class name and case insensitive filesystem */
public final class C63240zM {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public final byte[] A06;

    public C63240zM(int i) {
        this.A06 = new byte[i];
    }

    public final void A00(int i, int i2) {
        int i3;
        if (i < 0 || i >= (i3 = this.A00)) {
            throw new AnonymousClass0oy();
        }
        int i4 = this.A01;
        int i5 = this.A04;
        int min = Math.min(i4 - i5, i2);
        this.A03 = i2 - min;
        this.A02 = i;
        int i6 = (i5 - i) - 1;
        if (i >= i5) {
            i6 += this.A06.length;
        }
        do {
            byte[] bArr = this.A06;
            int i7 = i5;
            i5++;
            this.A04 = i5;
            int i8 = r4 + 1;
            bArr[i7] = bArr[r4];
            int i9 = i8;
            if (i8 == bArr.length) {
                i9 = 0;
            }
            min--;
        } while (min > 0);
        if (i3 < i5) {
            this.A00 = i5;
        }
    }
}
