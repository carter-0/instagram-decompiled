package X;

/* renamed from: X.S1x  reason: case insensitive filesystem */
public final class C10941S1x {
    public boolean A00;
    public final long A01;
    public final long A02;

    public C10941S1x(long j, long j2) {
        this.A02 = j;
        this.A01 = j2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("WifiScanOperationParams{timeoutMs=");
        A1A.append(this.A02);
        A1A.append(", ageLimitMs=");
        A1A.append(this.A01);
        C51975G9x.A1G(A1A, ", returnAllResults=");
        return Pxg.A0x(A1A);
    }
}
