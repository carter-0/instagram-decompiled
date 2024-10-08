package X;

/* renamed from: X.Fp0  reason: case insensitive filesystem */
public final class C51128Fp0 implements G7U {
    public final /* synthetic */ AnonymousClass36O A00;

    public final void onAuthorizeFail() {
    }

    public C51128Fp0(AnonymousClass36O r1) {
        this.A00 = r1;
    }

    public final void onAuthorizeSuccess(String str, String str2) {
        AnonymousClass36O.A0H.post(new C51160FpW(this.A00));
    }
}
