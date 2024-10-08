package X;

import com.instagram.common.session.UserSession;

public abstract class DcE {
    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (AnonymousClass7TF.A0R(r2, userSession, 36319858362752697L).booleanValue() || 182.A06(r2, userSession, 36325343035929479L) || 182.A06(r2, userSession, 36325343035995016L) || 182.A06(r2, userSession, 36325343036060553L) || !182.A06(r2, userSession, 36315937058328268L)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return AnonymousClass7TF.A0R(0Tu.A05, userSession, 36319858362752697L).booleanValue();
    }

    public static final boolean A06(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (z) {
            if (AnonymousClass7TF.A0R(r2, userSession, 36319858362752697L).booleanValue() || !182.A06(r2, userSession, 36315937057738438L)) {
                return false;
            }
            return true;
        } else if (182.A06(r2, userSession, 36325343035929479L) || !182.A06(r2, userSession, 36315937057738438L)) {
            return false;
        } else {
            return true;
        }
    }

    public static final boolean A00(UserSession userSession) {
        0Tu A0H = AnonymousClass7TF.A0H(userSession);
        if (!182.A06(A0H, userSession, 36315937057738438L) || !182.A06(A0H, userSession, 36315937058262731L) || !182.A06(A0H, userSession, 36315937058590415L)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        return 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36315937058262731L);
    }

    public static final boolean A03(UserSession userSession) {
        return 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36325794007495921L);
    }

    public static final boolean A04(UserSession userSession) {
        return 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36315937058459342L);
    }
}
