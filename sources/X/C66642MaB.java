package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.user.model.User;

/* renamed from: X.MaB  reason: case insensitive filesystem */
public abstract class C66642MaB {
    public static final boolean A00(UserSession userSession, Capabilities capabilities, AnonymousClass2Ep r6) {
        0qQ.A0B(capabilities, 1);
        0qQ.A0B(userSession, 2);
        if (capabilities.A00(C376179Gx.SHH_MODE) && r6 != null && r6.C6C() != null && !r6.CUG() && !r6.COb() && !r6.CQq() && !r6.CVr() && !r6.BRV().isEmpty() && !((User) r6.BRZ().get(0)).CPV() && !((User) r6.BRZ().get(0)).isRestricted()) {
            if (C66640Ma9.A06(r6.BRZ(), r6.isPending(), r6.CUG()) || ((r6.BKv() == null && ((AnonymousClass3U9) r6).A01.A23 != null) || r6.C3d() == 2EN.A04 || ((((User) r6.BRZ().get(0)).A2R() && !r6.CJt() && C272094k5.A00(userSession)) || C308556Us.A0J(userSession, r6.AiM())))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, AnonymousClass7SD r2, boolean z) {
        0qQ.A0B(userSession, 0);
        if (!A02(userSession, C331057Pi.A02(r2.A0H)) || C308556Us.A0D(userSession, r2, z)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession, boolean z) {
        if (z && 182.A06(0Tu.A05, userSession, 2342165418790103207L)) {
            return false;
        }
        int intValue = 2Ix.A00(userSession).A01().intValue();
        if (intValue == 2 || intValue == 1) {
            return true;
        }
        return false;
    }
}
