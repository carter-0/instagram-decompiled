package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.fxcal.upsell.common.FxIgLogoutACUpsellImpl;

/* renamed from: X.6xi  reason: invalid class name and case insensitive filesystem */
public final class C323576xi {
    public static final FxIgLogoutACUpsellImpl A00(UserSession userSession, Context context, String str) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, 1);
        0qQ.A0B(str, 2);
        return (FxIgLogoutACUpsellImpl) userSession.A01(FxIgLogoutACUpsellImpl.class, new C377689Mu(userSession, context, str, 17));
    }
}
