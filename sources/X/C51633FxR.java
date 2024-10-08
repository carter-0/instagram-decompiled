package X;

/* renamed from: X.FxR  reason: case insensitive filesystem */
public final class C51633FxR implements B2L {
    public final /* synthetic */ 1Uk A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C277014uI A02;

    public final void onFailure() {
    }

    public C51633FxR(1Uk r1, C307896Rx r2, C277014uI r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onSuccess() {
        String string = this.A00.getString("sso_settings_v2", (String) null);
        if (string != null) {
            11Z.A02(new C51434Fu4(this.A01, this.A02, string));
        }
    }
}
