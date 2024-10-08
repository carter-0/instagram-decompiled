package X;

/* renamed from: X.AjQ  reason: case insensitive filesystem */
public final class C40794AjQ implements Runnable {
    public final /* synthetic */ AnonymousClass8W6 A00;

    public C40794AjQ(AnonymousClass8W6 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass8W6 r1 = this.A00;
        C357028Wd r0 = r1.A00;
        if (r0 != null) {
            r0.A00();
            C357028Wd r02 = r1.A00;
            if (r02 != null) {
                r02.A01();
                return;
            }
        }
        0qQ.A0F("backPressDelegate");
        throw AnonymousClass00P.createAndThrow();
    }
}
