package X;

import android.view.View;

/* renamed from: X.Fp3  reason: case insensitive filesystem */
public final class C51131Fp3 implements G7U {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C50672FgX A01;

    public C51131Fp3(View view, C50672FgX fgX) {
        this.A01 = fgX;
        this.A00 = view;
    }

    public final void onAuthorizeFail() {
        C59689JTv.A0B(this.A01.A04.getContext(), "authorize_failed");
    }

    public final void onAuthorizeSuccess(String str, String str2) {
        C50672FgX fgX = this.A01;
        Ey8 ey8 = new Ey8(fgX.A04, fgX.A02);
        ey8.A00 = new JG2(42, this.A00, fgX);
        FG4.A02(ey8.A02, ey8, 13);
    }
}
