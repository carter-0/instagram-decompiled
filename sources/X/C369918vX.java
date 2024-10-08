package X;

/* renamed from: X.8vX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C369918vX implements Runnable {
    public final /* synthetic */ C366768pd A00;
    public final /* synthetic */ AnonymousClass8BA A01;

    public /* synthetic */ C369918vX(C366768pd r1, AnonymousClass8BA r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C369348uP r0;
        Boolean bool;
        AnonymousClass8BA r3 = this.A01;
        C366768pd r2 = this.A00;
        AnonymousClass8BA.A0G(r3, false, false);
        if (r3.A1M.CQ0(AnonymousClass80V.MEDIA_EDIT)) {
            AnonymousClass8BA.A0E(r3, true);
        } else {
            r3.A0T = new C40779AjB(r3);
        }
        if (r3.A0c && (r0 = r2.A00) != null && (bool = r0.A01) != null && bool.booleanValue()) {
            if (r3.A03 != null) {
                AnonymousClass8BA.A05(r3);
            } else {
                r3.A0U = new Aj1(r3);
            }
        }
    }
}
