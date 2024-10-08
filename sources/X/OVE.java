package X;

public final class OVE {
    public long A00;
    public long A01;
    public final C62320sa A02;

    public OVE() {
        this(C73843Pkg.A00);
    }

    public final long A00() {
        long j = this.A00;
        if (this.A01 >= 0) {
            j += JTR.A0O(this.A02) - this.A01;
        }
        this.A00 = j;
        this.A01 = -1;
        return j;
    }

    public OVE(C62320sa r3) {
        this.A02 = r3;
        this.A01 = -1;
    }
}
