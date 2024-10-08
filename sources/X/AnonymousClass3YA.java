package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.EnumSet;

/* renamed from: X.3YA  reason: invalid class name */
public abstract class AnonymousClass3YA {
    public static final Integer A00(UserSession userSession, 1Xj r3, AnonymousClass4DU r4) {
        AnonymousClass3YD r1 = AnonymousClass3YC.A00;
        if (r1.A09(r3)) {
            if (r1.A08(r3)) {
                return AnonymousClass05K.A01;
            }
            if (r1.A0A(r3)) {
                return AnonymousClass05K.A0C;
            }
        } else if (AnonymousClass3YF.A00(userSession, r3)) {
            if (0qQ.A0K(r4.getModuleName(), "profile")) {
                return AnonymousClass05K.A1I;
            }
            return AnonymousClass05K.A0Y;
        } else if (A02(userSession, r3)) {
            UpcomingEvent A27 = r3.A27(userSession);
            if (A27 == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (A27.getReminderEnabled()) {
                return AnonymousClass05K.A1F;
            } else {
                return AnonymousClass05K.A15;
            }
        }
        return AnonymousClass05K.A0j;
    }

    public static final boolean A01(UserSession userSession, 1Xj r3) {
        UpcomingEvent A27 = r3.A27(userSession);
        if (A27 == null || !C18810W3l.A0B(A27)) {
            return false;
        }
        if ((C18810W3l.A07(A27) || C18810W3l.A0D(A27, System.currentTimeMillis())) && !C18810W3l.A09(A27)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession, 1Xj r3) {
        if (r3.CcK()) {
            EnumSet enumSet = 1sx.A01;
            if (!C243213Xw.A03(userSession, r3)) {
                return false;
            }
        }
        UpcomingEvent A27 = r3.A27(userSession);
        if (A27 == null || !(!C18810W3l.A0B(A27))) {
            return false;
        }
        if (new C310296al(userSession).A00(A27) || (C243213Xw.A04(userSession, r3) && C243213Xw.A09(r3))) {
            return C243203Xv.A00(userSession, r3);
        }
        return false;
    }
}
