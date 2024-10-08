package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8ix  reason: invalid class name and case insensitive filesystem */
public abstract class C363038ix {
    public static final Integer A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        int ordinal = AnonymousClass0eD.A01(userSession).ordinal();
        if (ordinal == 1) {
            return AnonymousClass05K.A01;
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                return AnonymousClass05K.A0C;
            }
        } else if (!182.A06(0Tu.A05, userSession, 36326799029843939L)) {
            return AnonymousClass05K.A00;
        }
        0xa r2 = 2D5.A00(userSession).A04;
        Integer num = AnonymousClass05K.A0N;
        String string = r2.getString("PREFERENCE_CREATOR_DESTINATION_TYPE_STRING", "OTHER");
        for (Integer num2 : AnonymousClass05K.A00(4)) {
            if (0qQ.A0K(C378169Ot.A00(num2), string)) {
                return num2;
            }
        }
        return num;
    }

    public static final boolean A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (0eE.A00(userSession).A00().A0J() == 16V.A05) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return A00(userSession) == AnonymousClass05K.A00;
    }
}
