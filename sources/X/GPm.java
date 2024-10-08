package X;

import com.instagram.api.schemas.MusicInfo;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicConsumptionModel;

public abstract class GPm {
    public static final boolean A00(UserSession userSession, 1Xj r5) {
        MusicConsumptionModel musicConsumptionModel;
        C67231sQ A0n;
        MusicInfo BUr;
        if (r5 == null || (A0n = C51966G9m.A0n(r5)) == null || (BUr = A0n.BUr()) == null) {
            musicConsumptionModel = null;
        } else {
            musicConsumptionModel = BUr.BUp();
        }
        if (musicConsumptionModel == null || !AnonymousClass7TF.A1Y(musicConsumptionModel.Bty(), true)) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36316413799043430L)) {
            return true;
        }
        return 182.A06(r2, userSession, 36316413798912356L);
    }
}
