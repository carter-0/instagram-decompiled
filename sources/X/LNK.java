package X;

import com.instagram.comments.request.CommentsFetcher;
import com.instagram.common.session.UserSession;

public final class LNK {
    public static final LNK A00 = new Object();

    public final void A00(AnonymousClass07V r9, UserSession userSession, 1Xj r11, String str, int i, long j) {
        String str2 = str;
        0qQ.A0B(str, 1);
        1Xj r5 = r11;
        if (!r11.A4c()) {
            UserSession userSession2 = userSession;
            C39709A6a a6a = (C39709A6a) userSession.A01(C39709A6a.class, new C20611Wvs(userSession, 9));
            String id = r11.getId();
            if (id == null) {
                throw AnonymousClass7TE.A0y();
            } else if (a6a.A00.get(id) != null) {
            } else {
                if (!182.A06(0Tu.A05, userSession, 36318724491778463L) || !(C61970qY.A04().A00 == AnonymousClass05K.A01 || C61970qY.A04().A00 == AnonymousClass05K.A0C)) {
                    new CommentsFetcher(r9, userSession2, r5, str2, i).A03(C333797aA.NOT_SET, AnonymousClass05K.A0u, j);
                }
            }
        }
    }
}
