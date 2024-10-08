package X;

/* renamed from: X.Wed  reason: case insensitive filesystem */
public final class C19736Wed implements C229122ms, C229132mt {
    public final /* synthetic */ C15357Ub9 A00;

    public final boolean CWV() {
        return true;
    }

    public C19736Wed(C15357Ub9 ub9) {
        this.A00 = ub9;
    }

    public final void ACw() {
        C15357Ub9.A03(this.A00, false);
    }

    public final boolean CJz() {
        HAI hai = this.A00.A08;
        return !C13991Tnr.A1Z(hai.A00, hai);
    }

    public final boolean CKB() {
        C15357Ub9 ub9 = this.A00;
        return ub9.A0E.A02(ub9.A08.A00);
    }

    public final boolean CT5() {
        C15357Ub9 ub9 = this.A00;
        C18621VvE vvE = ub9.A0E;
        if (vvE == null || !C51973G9u.A1Y(C18621VvE.A00(vvE, ub9.A08.A00).A04)) {
            return false;
        }
        return true;
    }

    public final void CgO() {
        C15357Ub9.A03(this.A00, true);
    }

    public final boolean isLoading() {
        C15357Ub9 ub9 = this.A00;
        C18621VvE vvE = ub9.A0E;
        if (vvE == null) {
            return false;
        }
        if (C51973G9u.A1X(C18621VvE.A00(vvE, ub9.A08.A00).A04) || ub9.A0H == null) {
            return true;
        }
        return false;
    }
}
