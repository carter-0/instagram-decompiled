package X;

import com.instagram.common.session.UserSession;

@Deprecated
/* renamed from: X.9zT  reason: invalid class name and case insensitive filesystem */
public abstract class C395259zT {
    public static void A00(UserSession userSession, String str) {
        if (str != null) {
            0xa A0q = AnonymousClass7TE.A0q(userSession);
            0xY AR4 = A0q.AR4();
            AR4.ED3(002.A0R("direct_thread_draft_", str));
            AR4.apply();
            0xY AR42 = A0q.AR4();
            AR42.ED3(002.A0R("direct_thread_draft_timestamp_", str));
            AR42.apply();
        }
    }
}
