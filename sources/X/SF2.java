package X;

public final class SF2 {
    public final int A00;
    public final String A01;
    public final byte[] A02;
    public final C10152RnT[] A03;

    public SF2(byte[] bArr, C10152RnT[] rnTArr) {
        bArr.getClass();
        this.A02 = bArr;
        this.A01 = null;
        this.A03 = rnTArr;
        this.A00 = 1;
    }

    public SF2(String str, C10152RnT[] rnTArr) {
        this.A01 = str;
        this.A02 = null;
        this.A03 = rnTArr;
        this.A00 = 0;
    }
}
