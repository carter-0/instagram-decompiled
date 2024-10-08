package X;

/* renamed from: X.1Sv  reason: invalid class name */
public final class AnonymousClass1Sv {
    public int A00;
    public int A01;
    public byte[] A02;

    public final byte A00() {
        int i = this.A00;
        if (i < this.A01) {
            byte[] bArr = this.A02;
            this.A00 = i + 1;
            return bArr[i];
        }
        throw new IllegalStateException();
    }
}
