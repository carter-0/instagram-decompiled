package X;

/* renamed from: X.8ku  reason: invalid class name and case insensitive filesystem */
public final class C364128ku {
    public final int A00;
    public final C363848kR A01;
    public final Integer A02;
    public final Integer A03;
    public final byte[] A04;

    public C364128ku(byte[] bArr, int i) {
        this.A04 = bArr;
        this.A01 = null;
        this.A00 = i;
        this.A03 = null;
        this.A02 = null;
    }

    public C364128ku(C363848kR r3) {
        Integer num;
        Integer num2 = null;
        this.A04 = null;
        this.A01 = r3;
        this.A00 = 35;
        if (r3 != null) {
            num = Integer.valueOf(r3.A02);
        } else {
            num = null;
        }
        this.A03 = num;
        this.A02 = r3 != null ? Integer.valueOf(r3.A00) : num2;
    }
}
