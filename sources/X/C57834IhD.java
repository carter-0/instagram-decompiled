package X;

/* renamed from: X.IhD  reason: case insensitive filesystem */
public final class C57834IhD implements Runnable {
    public final /* synthetic */ C55938Hq2 A00;
    public final /* synthetic */ AnonymousClass3W1 A01;

    public C57834IhD(C55938Hq2 hq2, AnonymousClass3W1 r2) {
        this.A01 = r2;
        this.A00 = hq2;
    }

    public final void run() {
        AnonymousClass3W1 r2 = this.A01;
        AnonymousClass3W8 r1 = r2.A3R;
        if (!AnonymousClass7TE.A1a(r1.A00)) {
            r1.A00(r2, AnonymousClass7TE.A0v());
            r2.A1L = "delay";
            this.A00.A01.remove(C51969G9p.A0q(r2));
        }
    }
}
