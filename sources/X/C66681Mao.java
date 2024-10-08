package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Mao  reason: case insensitive filesystem */
public abstract class C66681Mao {
    public static final String A01(UserSession userSession, 2EN r6, C2611948q r7) {
        int ordinal;
        0qQ.A0B(r7, 0);
        0qQ.A0B(userSession, 1);
        if (DbU.A02(r6, 2) == 0) {
            if (!A02(userSession, r7)) {
                return null;
            }
        } else if (!((2El.A0H(userSession) && A02(userSession, r7)) || (ordinal = r7.ordinal()) == 3 || ordinal == 8)) {
            return null;
        }
        return r7.A00;
    }

    public static final String A00(UserSession userSession, 2EM r3, C2611948q r4) {
        if (r3.A01 != 2EN.A05 || !A02(userSession, r4)) {
            return "all";
        }
        return r4.A00;
    }

    public static final boolean A02(UserSession userSession, C2611948q r5) {
        long j;
        if (2El.A0B(userSession)) {
            if (!2El.A0H(userSession) || !2El.A0I(userSession) || !182.A06(0Tu.A05, userSession, 36328375283694899L)) {
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36323487610121407L)) {
                    int ordinal = r5.ordinal();
                    if (ordinal == 1) {
                        j = 36323487610055870L;
                    } else if (ordinal == 19) {
                        j = 36322293609343028L;
                    }
                    return 182.A06(r2, userSession, j);
                }
            } else {
                int ordinal2 = r5.ordinal();
                if (ordinal2 == 1 || ordinal2 == 2 || ordinal2 == 19 || ordinal2 == 23 || ordinal2 == 24) {
                    return true;
                }
                switch (ordinal2) {
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        return true;
                }
            }
        }
        return false;
    }
}
