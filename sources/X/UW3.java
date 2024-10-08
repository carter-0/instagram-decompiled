package X;

public final class UW3 extends UVP {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public UW3(UVD uvd, String str, String str2, int i, boolean z) {
        super(uvd);
        this.A02 = str;
        this.A00 = i;
        this.A03 = z;
        this.A01 = str2;
    }
}
