package X;

/* renamed from: X.IaL  reason: case insensitive filesystem */
public final class C57415IaL implements C229122ms, C229132mt {
    public final /* synthetic */ C52469GTv A00;

    public C57415IaL(C52469GTv gTv) {
        this.A00 = gTv;
    }

    public final void ACw() {
        C52469GTv gTv = this.A00;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C56006HrC hrC = gTv.A0I;
        if (hrC.A07.A06()) {
            hrC.A00(gTv.A00());
        }
    }

    public final boolean CJz() {
        return AnonymousClass7TE.A1b(((IWI) this.A00.A00().A00).A01);
    }

    public final boolean CKB() {
        C52469GTv gTv = this.A00;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        return gTv.A0I.A07.A05();
    }

    public final boolean CT5() {
        C52469GTv gTv = this.A00;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        return C51973G9u.A1Y(gTv.A0I.A07);
    }

    public final void CgO() {
        C52469GTv gTv = this.A00;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        gTv.A0I.A00(gTv.A00());
    }

    public final boolean isLoading() {
        C52469GTv gTv = this.A00;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        return C51973G9u.A1X(gTv.A0I.A07);
    }

    public final boolean CWV() {
        if (CT5() || !isLoading()) {
            return true;
        }
        C52469GTv gTv = this.A00;
        if (AnonymousClass7TE.A1b(((IWI) gTv.A00().A00).A01) || gTv.A0R) {
            return true;
        }
        return false;
    }
}
