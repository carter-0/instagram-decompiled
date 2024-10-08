package X;

/* renamed from: X.TEp  reason: case insensitive filesystem */
public final /* synthetic */ class C12938TEp implements Runnable {
    public final /* synthetic */ AnonymousClass39K A00;
    public final /* synthetic */ C255373u1 A01;

    public /* synthetic */ C12938TEp(AnonymousClass39K r1, C255373u1 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass39K r0 = this.A00;
        C255373u1 r4 = this.A01;
        synchronized (r0.A09) {
            for (AnonymousClass39S DDI : r0.A0A) {
                DDI.DDI(r4, false);
            }
        }
    }
}
