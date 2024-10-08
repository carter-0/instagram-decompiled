package X;

/* renamed from: X.Fkt  reason: case insensitive filesystem */
public final class C50914Fkt implements C51916G7k {
    public final /* synthetic */ E7Q A00;
    public final /* synthetic */ C358448av A01;

    public C50914Fkt(E7Q e7q, C358448av r2) {
        this.A01 = r2;
        this.A00 = e7q;
    }

    public final void DFx() {
        this.A01.CkS();
    }

    public final void Dhk(String str) {
        this.A01.CkH();
        C14221Ts1 ts1 = this.A00.A09;
        if (ts1 == null) {
            0qQ.A0F("typeaheadManager");
            throw AnonymousClass00P.createAndThrow();
        } else {
            ts1.A06(str);
        }
    }

    public final void Dhm(String str) {
        if (str.length() == 0) {
            E7Q e7q = this.A00;
            if (e7q.A0L.isEmpty()) {
                e7q.updateUi(JXP.LOADING, 0sn.A00);
                E7Q.A04(e7q);
                e7q.A0O.clear();
                e7q.A0D.clear();
                return;
            }
            e7q.A0B(E7Q.A02(e7q));
            return;
        }
        C14221Ts1 ts1 = this.A00.A09;
        if (ts1 == null) {
            0qQ.A0F("typeaheadManager");
            throw AnonymousClass00P.createAndThrow();
        } else {
            ts1.A06(str);
        }
    }
}
