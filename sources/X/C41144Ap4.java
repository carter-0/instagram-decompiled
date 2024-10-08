package X;

/* renamed from: X.Ap4  reason: case insensitive filesystem */
public final class C41144Ap4 implements Runnable {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ C380639Yy A01;
    public final /* synthetic */ C362608iB A02;

    public C41144Ap4(AnonymousClass0iw r1, C380639Yy r2, C362608iB r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void run() {
        C380639Yy r6 = this.A01;
        AnonymousClass07Z A002 = C71362ch.A00(r6.A01);
        if (A002 != null) {
            AnonymousClass0xx A003 = C71772f0.A00(A002.getLifecycle());
            1Eo.A05(r6.A02, new C66176MGn(this.A00, r6, this.A02, (AnonymousClass4D7) null), A003);
        }
    }
}
