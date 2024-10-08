package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9zE  reason: invalid class name and case insensitive filesystem */
public abstract class C395109zE {
    public static final boolean A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        if (A0q.getInt("ai_sticker_disclosure_sheet_seen_count", 0) >= ((int) 182.A01(0Tu.A05, userSession, 36599207331565006L))) {
            return false;
        }
        AnonymousClass7TG.A1M(A0q, "ai_sticker_disclosure_sheet_seen_count", A0q.getInt("ai_sticker_disclosure_sheet_seen_count", 0) + 1);
        return true;
    }
}
