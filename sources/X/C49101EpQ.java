package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.EpQ  reason: case insensitive filesystem */
public abstract class C49101EpQ {
    public static final void A00(UserSession userSession, Reel reel, AnonymousClass3N2 r4, long j) {
        0qQ.A0B(userSession, 2);
        if (reel != null) {
            r4.AeH().postDelayed(new C51483Fur(userSession, reel, r4), j);
        }
    }
}
