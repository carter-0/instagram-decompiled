package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.user.model.User;

public abstract class JYR {
    public static final boolean A00(UserSession userSession) {
        User A0j = DbT.A0j(userSession);
        MonetizationRepository A00 = AnonymousClass2o3.A00(userSession);
        Boolean Aks = A0j.A03.Aks();
        if ((Aks == null || !Aks.booleanValue()) && !A00.A04(UserMonetizationProductType.BRANDED_CONTENT_DEAL_BRAND)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        User A0j = DbT.A0j(userSession);
        MonetizationRepository A00 = AnonymousClass2o3.A00(userSession);
        if (A0j.A1S() || A00.A04(UserMonetizationProductType.BRANDED_CONTENT_DEAL_CREATOR)) {
            return true;
        }
        return false;
    }
}
