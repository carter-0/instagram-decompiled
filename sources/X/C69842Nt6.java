package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Nt6  reason: case insensitive filesystem */
public abstract class C69842Nt6 {
    public static final void A00(UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "send_quick_message");
        if (A0e.isSampled()) {
            A0e.AAJ("target_id", str);
            A0e.AAJ("view_module", "activity_feed");
            A0e.AAJ("request_type", "message_sent");
            A0e.Cgf();
        }
    }
}
