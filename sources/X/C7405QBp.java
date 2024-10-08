package X;

/* renamed from: X.QBp  reason: case insensitive filesystem */
public final class C7405QBp extends AnonymousClass5LA {
    public final int A00;
    public final int A01;

    public final byte A01(int i) {
        int i2 = this.A00;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.A00[this.A01 + i];
        }
        if (i < 0) {
            throw Pxj.A0c(i);
        }
        throw Pxj.A0d(i, i2);
    }

    public final byte A02(int i) {
        return this.A00[this.A01 + i];
    }

    public final int A03() {
        return this.A00;
    }

    public final int A04() {
        return this.A01;
    }

    public C7405QBp(byte[] bArr, int i, int i2) {
        super(bArr);
        AnonymousClass5L9.A00(i, i + i2, bArr.length);
        this.A01 = i;
        this.A00 = i2;
    }
}
