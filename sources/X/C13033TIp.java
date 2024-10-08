package X;

/* renamed from: X.TIp  reason: case insensitive filesystem */
public final class C13033TIp implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C12356Ss2 A01;
    public final /* synthetic */ C10292Rpq A02;

    public C13033TIp(C12356Ss2 ss2, C10292Rpq rpq, long j) {
        this.A01 = ss2;
        this.A02 = rpq;
        this.A00 = j;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.RdV, java.lang.Object] */
    public final void run() {
        C12356Ss2 ss2 = this.A01;
        ss2.A0R = this.A02;
        ss2.A0I = new C7954Qdv(new Object(), this, this.A00);
    }
}
