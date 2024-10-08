package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "Deprecated after UUL migration. To modify Logout upsell please use FxIgLogoutACUpsellImpl instead")
/* renamed from: X.FYx  reason: case insensitive filesystem */
public final class C50340FYx implements AnonymousClass0lh, CallerContextable {
    public static final String __redex_internal_original_name = "FxLogoutSsoUpsellHelper";
    public EVP A00 = EVP.SINGLE;
    public final UserSession A01;

    public C50340FYx(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void onSessionWillEnd() {
        this.A01.A03(C50340FYx.class);
    }
}
