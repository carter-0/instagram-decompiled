package X;

/* renamed from: X.3Ut  reason: invalid class name and case insensitive filesystem */
public final class C242563Ut implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C228642m2 A03;

    public C242563Ut(C228642m2 r1, int i, int i2, long j) {
        this.A03 = r1;
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void run() {
        AnonymousClass28j r8 = this.A03.A00;
        long j = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        synchronized (r8.A01) {
            C241343Ov r2 = r8.A00;
            if (r2 != null) {
                r2.A02 = j - r2.A05;
                r2.A01 = i;
                r2.A00 = i2;
                AnonymousClass28j.A00(r8);
            }
        }
    }
}
