package X;

/* renamed from: X.WQj  reason: case insensitive filesystem */
public final class C19228WQj implements 1wn, C20917X4i, C20913X4e, C20914X4f, C20915X4g, C20916X4h {
    public final /* synthetic */ C15398Uc1 A00;

    public C19228WQj(C15398Uc1 uc1) {
        this.A00 = uc1;
    }

    private final void A00() {
        C15398Uc1 uc1 = this.A00;
        C15488Udd udd = uc1.A00;
        if (udd == null) {
            0qQ.A0F("editSearchHistoryAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        udd.A00 = C15398Uc1.A00(uc1);
        udd.A00();
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(1376649097);
        WQG wqg = (WQG) obj;
        int A0D = AnonymousClass7TG.A0D(wqg, -1869043033);
        if (wqg.A00) {
            C15488Udd udd = this.A00.A00;
            if (udd == null) {
                0qQ.A0F("editSearchHistoryAdapter");
                throw AnonymousClass00P.createAndThrow();
            } else {
                udd.A00 = C14448TwW.A00();
                udd.A00();
            }
        } else {
            A00();
        }
        AnonymousClass0fD.A0A(304409343, A0D);
        AnonymousClass0fD.A0A(-1544598996, A03);
    }

    public final void CLC(String str) {
        A00();
    }

    public final void CLP(String str) {
        A00();
    }

    public final void CLV(String str) {
        A00();
    }

    public final void CLi(String str) {
        A00();
    }

    public final void CLu(String str) {
        A00();
    }
}
