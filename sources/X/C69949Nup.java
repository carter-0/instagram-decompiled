package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Nup  reason: case insensitive filesystem */
public abstract class C69949Nup {
    public static final boolean A00(UserSession userSession, N4P n4p, C67350MmR mmR) {
        DbY.A1S(userSession, mmR);
        if (C329997La.A00.A08(userSession, n4p) || n4p.A07 == 8) {
            return false;
        }
        switch (mmR.ordinal()) {
            case 0:
            case 3:
            case 4:
            case 5:
                return false;
            case 1:
                return C329997La.A01(userSession, n4p);
            case 2:
                return AnonymousClass7OI.A01(userSession, n4p.A0L);
            default:
                throw AnonymousClass7TE.A1K();
        }
    }
}
