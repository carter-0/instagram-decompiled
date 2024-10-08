package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Em4  reason: case insensitive filesystem */
public abstract class C48904Em4 {
    public static final void A00(AnonymousClass0iw r9, UserSession userSession, User user, String str, String str2) {
        Long l;
        0qQ.A0B(userSession, 0);
        String id = user.getId();
        boolean A1W = AnonymousClass7TF.A1W(user.A0N(), AnonymousClass05K.A0C);
        String A06 = 1aC.A06(user.B6o());
        boolean A1u = user.A1u();
        boolean A1s = user.A1s();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r9, userSession), "ig_overflow_menu_selected");
        if (A0e.isSampled()) {
            DbW.A15(A0e, r9);
            A0e.A9F("target_user_id", Long.valueOf(DbZ.A07(id)));
            A0e.A7p("target_is_private", Boolean.valueOf(A1W));
            if (str != null) {
                l = 00y.A0n(10, str);
            } else {
                l = null;
            }
            A0e.A9F("media_id", l);
            A0e.AAJ("selected_from", str2);
            A0e.AAJ("follow_status", A06);
            A0e.AAJ("reel_type", "story");
            A0e.A7p("target_stories_muted", Boolean.valueOf(A1u));
            A0e.A7p("target_posts_muted", Boolean.valueOf(A1s));
            A0e.Cgf();
        }
    }
}
