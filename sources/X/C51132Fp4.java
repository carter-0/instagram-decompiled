package X;

/* renamed from: X.Fp4  reason: case insensitive filesystem */
public final class C51132Fp4 implements G7U {
    public final /* synthetic */ E35 A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public final void onAuthorizeFail() {
    }

    public C51132Fp4(E35 e35, boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = e35;
        this.A02 = z2;
    }

    public final void onAuthorizeSuccess(String str, String str2) {
        if (this.A01) {
            E35 e35 = this.A00;
            AnonymousClass736 r3 = AnonymousClass736.A00;
            AnonymousClass0eM r4 = e35.A0C;
            r3.A0F(e35, AnonymousClass7TE.A0l(r4), "facebook_page", false);
            r3.A08(e35.requireContext(), De0.FACEBOOK_PAGE, e35, AnonymousClass7TE.A0l(r4));
            F1D f1d = new F1D();
            f1d.A0c = true;
            FG4.A01(e35, AnonymousClass7TE.A0l(r4), f1d, new C51657FyJ(e35, 8));
        } else if (this.A02) {
            E35 e352 = this.A00;
            F1D f1d2 = new F1D();
            f1d2.A0b = true;
            AnonymousClass736 r42 = AnonymousClass736.A00;
            AnonymousClass0eM r32 = e352.A0C;
            r42.A0F(e352, AnonymousClass7TE.A0l(r32), "facebook", false);
            r42.A08(e352.requireContext(), De0.FACEBOOK, e352, AnonymousClass7TE.A0l(r32));
            FG4.A00(e352, AnonymousClass7TE.A0l(r32), f1d2, new C51657FyJ(e352, 9));
        }
    }
}
