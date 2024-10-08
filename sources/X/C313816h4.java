package X;

/* renamed from: X.6h4  reason: invalid class name and case insensitive filesystem */
public final class C313816h4 {
    public C313556gd A00;
    public final AnonymousClass6h5 A01;
    public final C313666go A02;
    public final 05G A03;
    public final 05G A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0Ud A08;

    public /* synthetic */ C313816h4(C313666go r4) {
        AnonymousClass6h5 r2 = new AnonymousClass6h5();
        this.A02 = r4;
        this.A01 = r2;
        02z A012 = 106.A01(Long.valueOf(r2.A00));
        this.A04 = A012;
        this.A07 = 10b.A03(A012);
        02z A013 = 106.A01(r2.A02);
        this.A03 = A013;
        this.A06 = 10b.A03(A013);
        02z A014 = 106.A01(r2.A03);
        this.A05 = A014;
        this.A08 = 10b.A03(A014);
    }

    public final long A00() {
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            return this.A01.A00;
        }
        if (ordinal == 2) {
            return Long.MAX_VALUE;
        }
        if (ordinal == 1) {
            C313556gd r0 = this.A00;
            if (r0 != null) {
                return r0.AXh();
            }
            return 0;
        }
        throw new RuntimeException();
    }
}
