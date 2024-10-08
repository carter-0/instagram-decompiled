package X;

public final class FAT {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public FAT(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = z;
        this.A00 = z2;
        this.A04 = z3;
        this.A02 = z4;
        this.A01 = z5;
    }

    public FAT(boolean z, boolean z2, boolean z3) {
        this(z, z2, false, z3, false);
    }
}
