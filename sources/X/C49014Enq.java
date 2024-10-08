package X;

import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.model.PillsFilterCategory;

/* renamed from: X.Enq  reason: case insensitive filesystem */
public abstract class C49014Enq {
    public static final C46352Dcv A00(UserSession userSession, PillsFilterCategory pillsFilterCategory, String str) {
        0qQ.A0B(userSession, 0);
        C46352Dcv dcv = new C46352Dcv();
        dcv.setArguments(DbY.A0C("summary_id", str, AnonymousClass7TE.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05), AnonymousClass7TE.A1L("newsfeed_filter", pillsFilterCategory)));
        return dcv;
    }
}
