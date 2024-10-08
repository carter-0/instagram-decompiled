package X;

import com.facebook.common.dextricks.DexOptimization;
import com.instagram.common.session.UserSession;

public final class LQK {
    public static final LQK A00 = new Object();

    public static final void A00(AnonymousClass0iw r4, UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), AnonymousClass000.A00(304));
        A0e.A9F("ig_userid", Long.valueOf(DbZ.A07(userSession.A06)));
        A0e.AAJ("product", "support_diversity_business_sticker_produce");
        DbS.A1H(A0e, "support_diversity_business_sticker_tray");
        DbS.A1J(A0e, str);
        A0e.AAJ("event_source", DexOptimization.OPT_KEY_CLIENT);
        A0e.Cgf();
    }
}
