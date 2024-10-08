package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

public final class EF2 extends C228042kh {
    public final IGRevShareProductType A00;
    public final UserSession A01;

    public EF2(IGRevShareProductType iGRevShareProductType, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = iGRevShareProductType;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserMonetizationProductType userMonetizationProductType;
        FAE fae;
        IGRevShareProductType iGRevShareProductType = this.A00;
        int A02 = DbU.A02(iGRevShareProductType, 0);
        if (A02 == 2) {
            userMonetizationProductType = UserMonetizationProductType.REELS_OVERLAY_ADS;
        } else if (A02 != 1) {
            userMonetizationProductType = UserMonetizationProductType.UNRECOGNIZED;
        } else {
            userMonetizationProductType = UserMonetizationProductType.IGTV_REVSHARE;
        }
        UserSession userSession = this.A01;
        MonetizationRepository A002 = AnonymousClass2o3.A00(userSession);
        synchronized (FAE.A02) {
            0qQ.A0B(userSession, 0);
            fae = new FAE(userSession);
        }
        return new C46775Dl2(iGRevShareProductType, userMonetizationProductType, userSession, A002, 2AW.A00(userSession), fae);
    }
}
