package X;

/* renamed from: X.Wec  reason: case insensitive filesystem */
public final class C19735Wec implements C229122ms, C229132mt {
    public final /* synthetic */ C15381Ube A00;

    public C19735Wec(C15381Ube ube) {
        this.A00 = ube;
    }

    public final void ACw() {
        C15381Ube ube = this.A00;
        C18575VuR vuR = ube.A0I;
        if (vuR == null) {
            0qQ.A0F("feedRequestController");
            throw AnonymousClass00P.createAndThrow();
        } else if (C18459Vs8.A00(vuR).A06()) {
            C15381Ube.A04(ube);
        }
    }

    public final boolean CJz() {
        C14074TpO tpO = this.A00.A07;
        if (tpO != null) {
            return AnonymousClass7TF.A1R(tpO.A0E.getCount());
        }
        C13988Tno.A0n();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CKB() {
        C18575VuR vuR = this.A00.A0I;
        if (vuR != null) {
            return C18459Vs8.A00(vuR).A05();
        }
        0qQ.A0F("feedRequestController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CT5() {
        C18575VuR vuR = this.A00.A0I;
        if (vuR != null) {
            return C51973G9u.A1Y(C18459Vs8.A00(vuR));
        }
        0qQ.A0F("feedRequestController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CWV() {
        C18575VuR vuR = this.A00.A0I;
        if (vuR == null) {
            0qQ.A0F("feedRequestController");
            throw AnonymousClass00P.createAndThrow();
        } else if (C51973G9u.A1X(C18459Vs8.A00(vuR))) {
            return CJz();
        } else {
            return true;
        }
    }

    public final void CgO() {
        C15381Ube.A04(this.A00);
    }

    public final boolean isLoading() {
        C18575VuR vuR = this.A00.A0I;
        if (vuR != null) {
            return C51973G9u.A1X(C18459Vs8.A00(vuR));
        }
        0qQ.A0F("feedRequestController");
        throw AnonymousClass00P.createAndThrow();
    }
}
