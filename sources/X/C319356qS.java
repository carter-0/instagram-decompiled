package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6qS  reason: invalid class name and case insensitive filesystem */
public abstract class C319356qS {
    public static final void A00(1P0 r6, UserSession userSession, AnonymousClass4D6 r8) {
        boolean z = !182.A06(0Tu.A05, userSession, 36327894246636309L);
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0A("text_feed/ig_text_post_app_new_activity_feed_count/");
        r2.A0O((15p) null, C319366qT.class, C319376qU.class, false);
        r2.A9m("threads_app_version", 0oI.A05(userSession.A03.A06(), "com.instagram.barcelona"));
        r2.A0H("include_promotional_notifs", z);
        1OC A0M = r2.A0M();
        if (r6 != null) {
            A0M.A00 = r6;
        }
        r8.schedule(A0M);
    }
}
