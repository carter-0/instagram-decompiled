package X;

public final class P4B implements C74402PuI {
    public final int A00;
    public final Object A01;

    public P4B(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DFF() {
        if (this.A00 == 0) {
            NJ6 nj6 = (NJ6) this.A01;
            C67808MvC mvC = nj6.A01;
            mvC.A01 = false;
            mvC.notifyDataSetChanged();
            nj6.A06 = false;
            nj6.A08 = true;
        }
    }

    public final void DU4(OLT olt) {
        if (this.A00 != 0) {
            0qQ.A0B(olt, 0);
            NJY njy = (NJY) this.A01;
            njy.A0f = AnonymousClass7TE.A1b(C51966G9m.A1J(olt.A04));
            NJY.A0C(njy);
            return;
        }
        NJ6 nj6 = (NJ6) this.A01;
        NJ6.A02(nj6, olt);
        C67808MvC mvC = nj6.A01;
        mvC.A01 = false;
        mvC.notifyDataSetChanged();
        nj6.A06 = false;
        nj6.A08 = false;
        nj6.A02.getClass();
        AnonymousClass1Nd.A00(nj6.A00).A00(new AnonymousClass7MR(nj6.A04, nj6.A02.A00));
    }
}
