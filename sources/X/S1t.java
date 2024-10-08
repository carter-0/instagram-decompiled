package X;

public class S1t {
    public final long A00;
    public final long A01;
    public final long A02;

    public final S1t A00(S1t s1t) {
        return new S1t(this.A00 + s1t.A00, this.A02 + s1t.A02, this.A01 + s1t.A01);
    }

    public S1t(long j, long j2, long j3) {
        this.A00 = j;
        this.A02 = j2;
        this.A01 = j3;
    }
}
