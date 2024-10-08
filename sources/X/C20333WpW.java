package X;

/* renamed from: X.WpW  reason: case insensitive filesystem */
public final class C20333WpW implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C226742hm A01;
    public final /* synthetic */ C226732hl A02;
    public final /* synthetic */ WHX A03;
    public final /* synthetic */ Object A04;

    public C20333WpW(C226742hm r1, C226732hl r2, WHX whx, Object obj, long j) {
        this.A00 = j;
        this.A01 = r1;
        this.A03 = whx;
        this.A02 = r2;
        this.A04 = obj;
    }

    public final void run() {
        long j = this.A00;
        C226742hm r8 = this.A01;
        UJ4 uj4 = (UJ4) r8;
        if (j == uj4.BG9()) {
            WHX whx = this.A03;
            1TY A012 = whx.A00.A01(this.A02, this.A04);
            synchronized (uj4) {
                if (j == uj4.BG9()) {
                    1TY r0 = uj4.A03;
                    if (!(r0 == null || r0 == A012)) {
                        r0.A04();
                    }
                    uj4.A03 = A012;
                }
            }
            A012.A06((C226532gy) r8, whx.A02);
        }
    }
}
