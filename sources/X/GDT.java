package X;

import com.instagram.common.session.UserSession;

public final class GDT {
    public final UserSession A00;

    public static final void A00(UserSession userSession, 1Xj r4, AnonymousClass4DU r5, String str, String str2) {
        0qQ.A0B(r5, 4);
        String A0i = 002.A0i(AnonymousClass000.A00(1139), str, str2, '_');
        C254523sc A0c = C51967G9n.A0c(userSession, r4, r5, "gesture");
        A0c.A73 = "bottom_sheet";
        A0c.A4s = "clips_viewer_watch_browser";
        A0c.A7M = A0i;
        C233822wX.A0H(userSession, A0c, r5);
    }

    public GDT(UserSession userSession) {
        this.A00 = userSession;
    }
}
