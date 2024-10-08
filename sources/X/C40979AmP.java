package X;

/* renamed from: X.AmP  reason: case insensitive filesystem */
public final class C40979AmP implements Runnable {
    public final /* synthetic */ C3737196q A00;
    public final /* synthetic */ AnonymousClass9GD A01;

    public C40979AmP(C3737196q r1, AnonymousClass9GD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C3737196q r0 = this.A00;
        synchronized (r0.A01) {
            C3736596k r1 = r0.A00;
            Exception A05 = this.A01.A05();
            AnonymousClass3Qk.A02(A05);
            r1.onFailure(A05);
        }
    }
}
