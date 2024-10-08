package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IOf  reason: case insensitive filesystem */
public final class C57091IOf implements AnonymousClass0lh {
    public final 1Bk A00;

    public C57091IOf(UserSession userSession) {
        this.A00 = 1Bk.A03.A02(002.A0R(userSession.A06, "_hashtag_page_seen_media_cache"));
    }

    public final void onSessionWillEnd() {
        this.A00.A09();
    }
}
