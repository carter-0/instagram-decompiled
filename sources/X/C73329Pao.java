package X;

/* renamed from: X.Pao  reason: case insensitive filesystem */
public final class C73329Pao implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ PJK A01;
    public final /* synthetic */ boolean A02;

    public C73329Pao(PJK pjk, long j, boolean z) {
        this.A01 = pjk;
        this.A00 = j;
        this.A02 = z;
    }

    public final void run() {
        this.A01.A01.CfR(this.A00, this.A02);
    }
}
