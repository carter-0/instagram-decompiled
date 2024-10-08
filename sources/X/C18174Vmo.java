package X;

import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vmo  reason: case insensitive filesystem */
public abstract class C18174Vmo {
    public static final boolean A00(PromoteData promoteData) {
        String str;
        String str2 = promoteData.A1C;
        if (str2 == null || str2.length() == 0 || (str = promoteData.A1D) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean A01(PromoteData promoteData, UserSession userSession) {
        PromoteAudience A06;
        boolean A1Z = AnonymousClass7TG.A1Z(promoteData, userSession);
        if (promoteData.A2E || (A06 = promoteData.A06()) == null || A06.A0C != A1Z || !182.A06(0Tu.A05, userSession, 36318539807791330L)) {
            return false;
        }
        return true;
    }
}
