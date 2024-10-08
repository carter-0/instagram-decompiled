package X;

/* renamed from: X.Aoz  reason: case insensitive filesystem */
public final /* synthetic */ class C41139Aoz implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C21451Xb3 A01;
    public final /* synthetic */ C387389m8 A02;

    public /* synthetic */ C41139Aoz(C21451Xb3 xb3, C387389m8 r2, long j) {
        this.A02 = r2;
        this.A01 = xb3;
        this.A00 = j;
    }

    public final void run() {
        long j;
        C387389m8 r5 = this.A02;
        C21451Xb3 xb3 = this.A01;
        long j2 = this.A00;
        String str = xb3.A05;
        str.getClass();
        if (C387389m8.A02(r5, str)) {
            C353028Fz r4 = r5.A0H;
            float f = (float) j2;
            if (r5.A0A) {
                j = 1000000000;
            } else {
                j = 1800000000;
            }
            r4.A00(f / ((float) j));
        }
    }
}
