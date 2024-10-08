package X;

public final class Q4T {
    public final long A00;
    public final long A01;

    public Q4T(long j, long j2) {
        if (j2 == 0) {
            this.A01 = 0;
            this.A00 = 1;
            return;
        }
        this.A01 = j;
        this.A00 = j2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A01);
        A1A.append("/");
        return Pxe.A10(A1A, this.A00);
    }
}
