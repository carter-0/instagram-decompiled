package X;

public final class ART implements B2N {
    public final /* synthetic */ C39749A7p A00;

    public ART(C39749A7p a7p) {
        this.A00 = a7p;
    }

    public final void DjR(C352728Ep r5) {
        C15331Uag uag = this.A00.A05.A00;
        WT1 A02 = uag.A02();
        String str = r5.A06;
        0qQ.A07(str);
        A02.A03("product_session_id", str);
        uag.A02().A03("effect_session_id", r5.A00);
        uag.A02().A03("delivery_session_id", r5.A01);
    }

    public final void Doe(String str) {
        this.A00.A05.A00.A02().A02(C16612Uy8.EFFECT_FETCH_SUCCESS, "", (String) null);
    }

    public final void onFailure(Throwable th) {
        this.A00.A05.A00.A02().A02(C16612Uy8.EFFECT_FETCH_FAILED, "", th.getMessage());
    }
}
