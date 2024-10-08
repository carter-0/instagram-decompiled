package X;

import com.instagram.common.session.UserSession;

public final class GXS {
    public static final GXS A00 = new Object();

    public final AnonymousClass2vG A00(UserSession userSession, C233172vA r16, AnonymousClass4DU r17, C249763kK r18) {
        C233192vD r5;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        IYG iyg = new IYG(userSession, 0);
        String sessionId = r18.getSessionId();
        boolean A03 = 1P7.A03(userSession);
        AnonymousClass4DU r11 = r17;
        String moduleName = r11.getModuleName();
        if (0qQ.A0K(moduleName, "explore_popular")) {
            r5 = C233192vD.EXPLORE_GRID;
        } else if (0qQ.A0K(moduleName, "serp_top")) {
            r5 = C233192vD.SEARCH_GRID;
        } else {
            0wb.A03("grid_sponsored_content_logger_factory", 002.A0R("grid logger is used by other surface: ", moduleName));
            r5 = C233192vD.UNKNOWN;
        }
        GXT gxt = new GXT(userSession, r16, r11, iyg, sessionId);
        if (A03) {
            return C55154Hd4.A00(userSession2, iyg, r5, gxt, sessionId, sessionId, sessionId);
        }
        AnonymousClass2vG A002 = C233232vL.A00(userSession, iyg, r5, gxt, sessionId);
        0qQ.A0A(A002);
        return A002;
    }
}
