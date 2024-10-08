package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KNo  reason: case insensitive filesystem */
public final class C61825KNo extends LT6 {
    public final UserSession A00;
    public final C3499682q A01;

    public static final boolean A00(UserSession userSession, C61075JwD jwD) {
        1iA r2;
        1iA r1 = null;
        if (jwD != null) {
            r2 = jwD.A0D;
        } else {
            r2 = null;
        }
        if (r2 == 1iA.A0Q) {
            return AnonymousClass30D.A09(userSession);
        }
        if (jwD != null) {
            r1 = jwD.A0D;
        }
        if (r1 != 1iA.A09) {
            return false;
        }
        if (!C64187LSu.A04(jwD)) {
            return AnonymousClass30D.A05(userSession);
        }
        return AnonymousClass30D.A04(userSession);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61825KNo(UserSession userSession, C3499682q r3) {
        super(userSession, C62462KgC.FEED);
        AnonymousClass7TG.A1O(userSession, r3);
        this.A00 = userSession;
        this.A01 = r3;
    }
}
