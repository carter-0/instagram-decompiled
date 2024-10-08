package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

public abstract class JVU {
    public static final boolean A01(UserSession userSession, Integer num) {
        long j;
        0qQ.A0B(userSession, 0);
        C63139Ks7 ks7 = C63139Ks7.$redex_init_class;
        int intValue = num.intValue();
        0Tu r2 = 0Tu.A05;
        switch (intValue) {
            case 0:
                j = 36331167011586992L;
                break;
            case 1:
                j = 36331167011652529L;
                break;
            case 2:
                j = 36331167011718066L;
                break;
            case 3:
                j = 36331167011783603L;
                break;
            case 4:
                j = 36331167011849140L;
                break;
            case 5:
                j = 36331167011914677L;
                break;
            case 6:
                j = 36331167011980214L;
                break;
            case 7:
                j = 36331167012045751L;
                break;
            case 8:
                j = 36331167012111288L;
                break;
            case 9:
                j = 36331167012176825L;
                break;
            case 10:
                j = 36331167012242362L;
                break;
            case 11:
                j = 36331167012307899L;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                j = 36331167012373436L;
                break;
            case 13:
                j = 36331167012438973L;
                break;
            case 14:
                j = 36331167012504510L;
                break;
            default:
                j = 36331167012570047L;
                break;
        }
        return DbY.A1Z(r2, userSession, j);
    }

    public static final boolean A00(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36327907133176621L) && 182.A06(r2, userSession, 36327907133242158L)) {
            return true;
        }
        0Tu r22 = 0Tu.A06;
        if (!182.A06(r22, userSession, 36311569076126302L) || !182.A06(r22, userSession, 36311569077371505L)) {
            return false;
        }
        return true;
    }
}
