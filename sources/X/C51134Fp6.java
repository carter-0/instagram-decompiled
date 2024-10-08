package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fp6  reason: case insensitive filesystem */
public final class C51134Fp6 implements C66520MUy {
    public final /* synthetic */ FH4 A00;

    public final void getDismissAction() {
    }

    public final void getSecondaryCtaAction() {
        C51130Fp2 fp2 = new C51130Fp2(this, 1);
        FH4 fh4 = this.A00;
        Fragment fragment = fh4.A00;
        if (fragment != null) {
            1Z9 r1 = 1Z9.A01;
            UserSession userSession = fh4.A04;
            r1.A01(fragment, userSession, fp2).A06("ig_logout_upsell", C317816nt.A00(userSession).A08("IG_LOGOUT_UPSELL"));
        }
    }

    public C51134Fp6(FH4 fh4) {
        this.A00 = fh4;
    }

    public final void getPrimaryCtaAction() {
        this.A00.A0D(EVP.SINGLE, true);
    }
}
