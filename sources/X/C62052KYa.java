package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.KYa  reason: case insensitive filesystem */
public final class C62052KYa extends C64839Lj1 {
    public static final CallerContext A02 = CallerContext.A01("CrosspostingUnifiedOnboardingUpsellManager");
    public static final LRS A03 = new Object();
    public static final C262224Cq A04 = DbY.A0r(AnonymousClass12T.A00, 763);
    public AnonymousClass819 A00;
    public LA0 A01;

    public final void A07() {
        LA0 la0 = this.A01;
        if (la0 != null) {
            UserSession userSession = la0.A03;
            FragmentActivity fragmentActivity = la0.A00;
            AnonymousClass4DH r3 = la0.A02;
            C63428Kwo.A00(fragmentActivity, la0.A01, r3, userSession, la0.A04, la0.A05);
        }
        this.A01 = null;
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A0E.A03(C62052KYa.class);
    }
}
