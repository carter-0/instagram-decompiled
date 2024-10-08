package X;

public final class ODH {
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;

    public ODH(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.A01 = bArr;
        this.A02 = bArr2;
        this.A00 = bArr3;
    }
}
