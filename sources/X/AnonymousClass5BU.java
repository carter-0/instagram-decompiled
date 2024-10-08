package X;

/* renamed from: X.5BU  reason: invalid class name */
public final class AnonymousClass5BU extends C229022mi {
    public final /* synthetic */ 1IX A00;

    public AnonymousClass5BU(1IX r1) {
        this.A00 = r1;
    }

    public final void A00(AnonymousClass3JD r5) {
        Object r0;
        C254583si r52 = (C254583si) r5;
        AnonymousClass3JC r3 = new AnonymousClass3JC(r52.A00, r52.A01);
        boolean isOk = r3.isOk();
        1IX r2 = this.A00;
        if (!isOk) {
            r0 = new C297815sO(new C268674do(r3));
        } else {
            r0 = new C239793Ih(r3);
        }
        r2.resumeWith(r0);
    }

    public final void A02(Throwable th) {
        this.A00.resumeWith(new C297815sO(new C268664dn(th)));
    }
}
