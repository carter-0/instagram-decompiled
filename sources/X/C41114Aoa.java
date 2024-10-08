package X;

/* renamed from: X.Aoa  reason: case insensitive filesystem */
public final class C41114Aoa implements Runnable {
    public final /* synthetic */ C391719tX A00;
    public final /* synthetic */ C41827B2i A01;
    public final /* synthetic */ C341627nG A02;

    public C41114Aoa(C391719tX r1, C41827B2i b2i, C341627nG r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = b2i;
    }

    public final void run() {
        C382309dU r0;
        C391719tX r2 = this.A00;
        boolean z = r2 instanceof C382309dU;
        C41827B2i b2i = this.A01;
        if (z) {
            r0 = (C382309dU) r2;
        } else {
            r0 = new C382309dU(r2);
        }
        b2i.D0z(r0);
    }
}
