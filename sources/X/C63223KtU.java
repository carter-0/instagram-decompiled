package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KtU  reason: case insensitive filesystem */
public abstract class C63223KtU {
    public static final void A00(C54689HOu hOu, AnonymousClass8ZN r5, AnonymousClass0iw r6, UserSession userSession) {
        DbY.A1S(userSession, r5);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), AnonymousClass000.A00(162));
        if (A0e.isSampled()) {
            DbW.A16(A0e, r6);
            A0e.AAJ("media_compound_key", "");
            A0e.A8M(hOu, "action_source");
            Long A0m = C51971G9r.A0m();
            A0e.A9F("target_id", A0m);
            A0e.AAJ("media_tap_token", "");
            A0e.A9F(AnonymousClass000.A00(322), A0m);
            A0e.AAJ(AnonymousClass000.A00(392), (String) null);
            A0e.AAJ("mezql_token", "");
            C51973G9u.A14(A0e, "ranking_info_token", "");
            A0e.A8M(r5, AnonymousClass000.A00(1685));
            DbX.A1L(A0e);
        }
    }
}
