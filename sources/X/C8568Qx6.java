package X;

/* renamed from: X.Qx6  reason: case insensitive filesystem */
public final class C8568Qx6 extends C8569Qx7 {
    public final int A00;

    public final int A05() {
        return this.A00;
    }

    public final byte A02(int i) {
        int i2 = this.A00;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.A00[i];
        }
        if (i < 0) {
            throw Pxj.A0c(i);
        }
        throw Pxj.A0d(i, i2);
    }

    public C8568Qx6(byte[] bArr, int i) {
        super(bArr);
        TAQ.A00(0, i, bArr.length);
        this.A00 = i;
    }
}
