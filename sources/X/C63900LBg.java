package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LBg  reason: case insensitive filesystem */
public final class C63900LBg {
    public final boolean A00(AnonymousClass818 r4, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (r4 != null && ((r4 == AnonymousClass818.IG_SELF_STORY_VIEW_FB_BUTTON || r4 == AnonymousClass818.IG_SELF_STORY_VIEW_OVERFLOW_MENU) && !C363018iu.A00(userSession) && 182.A06(0Tu.A05, userSession, 36329002348068568L))) {
            return true;
        }
        if (C363018iu.A00(userSession) || C363558jv.A00(userSession)) {
            return false;
        }
        return true;
    }
}
