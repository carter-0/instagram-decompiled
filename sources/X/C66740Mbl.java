package X;

/* renamed from: X.Mbl  reason: case insensitive filesystem */
public final class C66740Mbl implements C229122ms {
    public final C66633Ma2 A00;

    public C66740Mbl(C66633Ma2 ma2) {
        0qQ.A0B(ma2, 1);
        this.A00 = ma2;
    }

    public final boolean CJz() {
        return AnonymousClass7TE.A1b(C66581MXm.A0U(this.A00).A0E.A0O);
    }

    public final boolean CKB() {
        return C66583MXo.A1Z(this.A00);
    }

    public final boolean CT5() {
        return C66581MXm.A0V(this.A00).BNZ().CT5();
    }

    public final boolean CWV() {
        C66633Ma2 ma2 = this.A00;
        if (!ma2.A18() || !((AnonymousClass3AD) ma2.A0z.getValue()).isLoading()) {
            return true;
        }
        return false;
    }

    public final void CgO() {
        this.A00.A0z();
    }

    public final boolean isLoading() {
        return this.A00.A18();
    }
}
