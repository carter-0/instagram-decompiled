package X;

/* renamed from: X.XvO  reason: case insensitive filesystem */
public final /* synthetic */ class C22098XvO implements Y91 {
    public final /* synthetic */ C22017XrB A00;

    public /* synthetic */ C22098XvO(C22017XrB xrB) {
        this.A00 = xrB;
    }

    public final long Ezm(long j) {
        C22017XrB xrB = this.A00;
        return Math.max(0, Math.min((j * ((long) xrB.A07)) / 1000000, xrB.A09 - 1));
    }
}
