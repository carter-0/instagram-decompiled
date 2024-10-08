package X;

/* renamed from: X.Wee  reason: case insensitive filesystem */
public final class C19737Wee implements C229122ms, C229132mt {
    public final /* synthetic */ C15358UbA A00;

    public C19737Wee(C15358UbA ubA) {
        this.A00 = ubA;
    }

    public final void ACw() {
        C17899Vhq vhq = this.A00.A0A;
        if (vhq == null) {
            0qQ.A0F("requestController");
            throw AnonymousClass00P.createAndThrow();
        } else if (vhq.A00.A06()) {
            CgO();
        }
    }

    public final boolean CJz() {
        C14074TpO tpO = this.A00.A03;
        if (tpO != null) {
            return tpO.A0A();
        }
        C13988Tno.A0n();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CKB() {
        C17899Vhq vhq = this.A00.A0A;
        if (vhq != null) {
            return vhq.A00.A05();
        }
        0qQ.A0F("requestController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CT5() {
        C17899Vhq vhq = this.A00.A0A;
        if (vhq != null) {
            return C51973G9u.A1Y(vhq.A00);
        }
        0qQ.A0F("requestController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CgO() {
        C15358UbA.A04(this.A00, false);
    }

    public final boolean isLoading() {
        C17899Vhq vhq = this.A00.A0A;
        if (vhq != null) {
            return C51973G9u.A1X(vhq.A00);
        }
        0qQ.A0F("requestController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CWV() {
        if (isLoading()) {
            return CJz();
        }
        return true;
    }
}
