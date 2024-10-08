package X;

public final class PRN implements C238813Dn {
    public final int A00;
    public final Object A01;

    public PRN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dcp() {
        if (this.A00 != 0) {
            ((C68495NKo) this.A01).A0E().A09();
            return;
        }
        MYR myr = (MYR) this.A01;
        OIC oic = myr.config;
        if (oic == null) {
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        }
        C62320sa r0 = oic.A06;
        0qQ.A0A(r0);
        if (!C51971G9r.A1b(r0)) {
            myr.getRecyclerView().postDelayed(new C73057PUo(myr), 500);
        }
    }
}
