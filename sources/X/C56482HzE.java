package X;

import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.common.session.UserSession;
import java.util.EnumSet;

/* renamed from: X.HzE  reason: case insensitive filesystem */
public abstract class C56482HzE {
    public static final EnumSet A00 = EnumSet.of(1sy.A0H, 1sy.A0U);
    public static final EnumSet A01 = EnumSet.of(1sy.A0R, 1sy.A0J, 1sy.A0W);

    public static final String A00(UserSession userSession, 1Xj r4, C52212GJd gJd) {
        long j;
        int ordinal = gJd.ordinal();
        0Tu r2 = 0Tu.A05;
        if (ordinal != 0) {
            j = 36327898541996830L;
        } else {
            j = 36327898541734682L;
        }
        if (!DbY.A1Z(r2, userSession, j)) {
            return null;
        }
        return C247573gZ.A00(IGAdTransparencyDisclaimerPlacement.OVERFLOW_MENU, C231122qu.A02(userSession, r4));
    }
}
