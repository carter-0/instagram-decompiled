package X;

/* renamed from: X.Mql  reason: case insensitive filesystem */
public final class C67613Mql extends F3o {
    public final /* synthetic */ C67614Mqm A00;

    public C67613Mql(C67614Mqm mqm) {
        this.A00 = mqm;
    }

    public final void A00() {
        C67614Mqm mqm = this.A00;
        if (!mqm.A01) {
            C67614Mqm.A00(C21123XFn.FETCHING_CANCELLED, mqm);
        }
        mqm.A08.A00();
    }

    public final void A01() {
        this.A00.A01 = true;
    }

    public final void A02() {
        C67614Mqm mqm = this.A00;
        C67614Mqm.A00(C21123XFn.FETCHING_START, mqm);
        mqm.A08.A02();
    }

    public final void A03() {
        C67614Mqm mqm = this.A00;
        C67614Mqm.A00(C21123XFn.FETCHING_DONE, mqm);
        mqm.A08.A04((Integer) null);
    }

    public final void A04(C268654dm r4) {
        C268654dm r1;
        C67614Mqm mqm = this.A00;
        Throwable A01 = r4.A01();
        if (A01 != null) {
            r1 = new C268664dn(A01);
        } else {
            AnonymousClass1XT r0 = (AnonymousClass1XT) r4.A00();
            if (r0 != null) {
                r1 = new C268674do(new OAQ(r0.getErrorMessage()));
            }
            mqm.A08.A01();
        }
        C67614Mqm.A01(r1, mqm);
        mqm.A08.A01();
    }
}
