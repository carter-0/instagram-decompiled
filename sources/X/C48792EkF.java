package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.clips.model.metadata.ClipsFanClubMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EkF  reason: case insensitive filesystem */
public abstract class C48792EkF {
    public static final ClipsFanClubMetadata A00(UserSession userSession, AnonymousClass3Q2 r2, boolean z, boolean z2) {
        User A0Q;
        C46401DeO deO;
        0qQ.A0B(userSession, 0);
        if (z) {
            A0Q = AnonymousClass7TF.A0Q(userSession);
            deO = C46401DeO.PROMOTIONAL;
        } else if (z2) {
            A0Q = AnonymousClass7TF.A0Q(userSession);
            deO = C46401DeO.WELCOME;
        } else if (r2 != null) {
            return r2.A11;
        } else {
            return null;
        }
        FanClubInfoDict B3v = A0Q.A03.B3v();
        if (B3v != null) {
            String fanClubId = B3v.getFanClubId();
            if (fanClubId != null) {
                return new ClipsFanClubMetadata(deO, fanClubId);
            }
            throw AnonymousClass7TE.A0z("fanClubId is null");
        }
        throw AnonymousClass7TE.A0z("fanClubInfoDict is null");
    }
}
