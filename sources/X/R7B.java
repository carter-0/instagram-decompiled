package X;

public final class R7B extends C11013S5k {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public R7B(byte[] bArr, int i, int i2, int i3, int i4) {
        super(i3, i4);
        if (i3 > i || i4 > i2) {
            throw AnonymousClass7TE.A0w("Crop rectangle does not fit within image data.");
        }
        this.A02 = bArr;
        this.A01 = i;
        this.A00 = i2;
    }
}
