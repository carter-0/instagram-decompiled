package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Kwj  reason: case insensitive filesystem */
public abstract class C63423Kwj {
    public static final boolean A00(UserSession userSession, C347577x2 r5, C61019JvJ jvJ) {
        Integer num = jvJ.A03;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return false;
            }
            if (intValue == 1) {
                return r5.A09;
            }
            if (intValue != 2 || (r5.A09 && 182.A06(0Tu.A05, userSession, 36321962896664431L))) {
                return true;
            }
            return false;
        }
        return true;
    }
}
