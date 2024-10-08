package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.5rw  reason: invalid class name and case insensitive filesystem */
public final class C297555rw {
    public UserSession A00;

    public final void A00(User user, String str, String str2, String str3, String str4) {
        0wc A01 = AnonymousClass0kN.A01(new 0xG(str), this.A00);
        0Aj A002 = A01.A00(A01.A00, "instagram_feed_favorites_user_action_add");
        if (A002.isSampled()) {
            A002.AAJ("module", str);
            A002.A9F("target_user_id", Long.valueOf(Long.parseLong(user.getId())));
            A002.AAJ("management_session_id", str2);
            A002.AAJ("detail", str3);
            A002.AAJ(C66579MXk.A00(33), str4);
            A002.Cgf();
        }
    }

    public final void A01(User user, String str, String str2, String str3, String str4) {
        0wc A01 = AnonymousClass0kN.A01(new 0xG(str), this.A00);
        0Aj A002 = A01.A00(A01.A00, "instagram_feed_favorites_user_action_remove");
        if (A002.isSampled()) {
            A002.AAJ("module", str);
            A002.A9F("target_user_id", Long.valueOf(Long.parseLong(user.getId())));
            A002.AAJ("management_session_id", str2);
            A002.AAJ("detail", str3);
            A002.AAJ(C66579MXk.A00(33), str4);
            A002.Cgf();
        }
    }
}
