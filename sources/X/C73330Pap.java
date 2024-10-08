package X;

/* renamed from: X.Pap  reason: case insensitive filesystem */
public final class C73330Pap implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ PJL A01;
    public final /* synthetic */ boolean A02;

    public C73330Pap(PJL pjl, long j, boolean z) {
        this.A01 = pjl;
        this.A00 = j;
        this.A02 = z;
    }

    public final void run() {
        this.A01.A00.CfR(this.A00, this.A02);
    }
}
