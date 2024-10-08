package X;

public final class R35 extends R36 {
    public final int A00;
    public final int A01;

    public R35(byte[] bArr, int i, int i2) {
        super(bArr);
        TAP.A00(i, i + i2, bArr.length);
        this.A01 = i;
        this.A00 = i2;
    }
}
