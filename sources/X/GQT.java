package X;

public final class GQT {
    public long A00 = 0;
    public final long A01;
    public final long A02;

    public GQT(long j, long j2, long j3) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("HistoricalChange(uptimeMillis=");
        A1A.append(this.A02);
        A1A.append(", position=");
        return AnonymousClass7TG.A0n(C289295dM.A08(this.A01), A1A);
    }
}
