package X;

/* renamed from: X.Iic  reason: case insensitive filesystem */
public final class C57921Iic implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C59554JOa A02;

    public C57921Iic(C59554JOa jOa, long j, long j2) {
        this.A00 = j;
        this.A02 = jOa;
        this.A01 = j2;
    }

    public final void run() {
        long j = this.A00;
        if (j > 0) {
            this.A02.DYg(j);
        } else {
            this.A02.DYg(this.A01);
        }
    }
}
