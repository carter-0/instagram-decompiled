package X;

import com.instagram.api.schemas.MusicInfo;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicConsumptionModel;

public abstract class LIZ {
    public static final boolean A00(UserSession userSession, 1Xj r5) {
        boolean A05;
        0qQ.A0B(userSession, 1);
        if (r5 == null || r5.A4r()) {
            return false;
        }
        if (!r5.A5D() && r5.A5p()) {
            A05 = AnonymousClass30D.A09(userSession);
        } else if (r5.A5D() && !r5.A4a()) {
            A05 = AnonymousClass30D.A04(userSession);
        } else if (!r5.A5D() || !r5.A4a()) {
            return false;
        } else {
            A05 = AnonymousClass30D.A05(userSession);
        }
        if (!A05 || !182.A06(0Tu.A05, userSession, 36323599279336755L)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, 1Xj r5) {
        AnonymousClass1dn musicMetadata;
        MusicInfo BUr;
        MusicConsumptionModel BUp;
        0qQ.A0B(userSession, 1);
        if (r5 == null || (musicMetadata = r5.A0C.getMusicMetadata()) == null || (BUr = musicMetadata.BUr()) == null || (BUp = BUr.BUp()) == null || !AnonymousClass7TF.A1Y(BUp.Bty(), true) || !182.A06(0Tu.A05, userSession, 36323599279205682L)) {
            return false;
        }
        return true;
    }
}
