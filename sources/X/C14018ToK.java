package X;

/* renamed from: X.ToK  reason: case insensitive filesystem */
public final class C14018ToK implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C14004To6 A03;

    public C14018ToK(C14004To6 to6, int i, long j, long j2) {
        this.A03 = to6;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    public final void run() {
        C14004To6 to6 = this.A03;
        new C14019ToL(to6, this.A00).A00(to6.A02);
    }
}
