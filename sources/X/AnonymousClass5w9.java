package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.5w9  reason: invalid class name */
public final class AnonymousClass5w9 {
    public static final AnonymousClass5w8 A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (AnonymousClass5w8) userSession.A01(AnonymousClass5w8.class, new AnonymousClass9L5(userSession, 35));
    }

    public final synchronized void A03(UserSession userSession, Context context, String str) {
        String str2;
        String A05;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, 1);
        C363378jd A00 = C363388je.A00(userSession);
        CallerContext callerContext = AnonymousClass5w8.A04;
        C299935wF A002 = A00.A00(callerContext);
        if (C363388je.A03(A002) && ((str2 = A002.A04) == null || str2.length() == 0 || (A05 = A00(userSession).A05(context, userSession)) == null || A05.length() == 0)) {
            if (182.A06(0Tu.A05, userSession, 36326962238601313L)) {
                C363388je.A00(userSession).A02(callerContext, new C65238Lpi(userSession), str, false);
            } else {
                C363388je.A00(userSession).A01(callerContext, new C59965JcY(userSession), str);
            }
        }
    }

    public static final boolean A02(C295095nZ r2) {
        C295085nY r22 = r2.A01;
        if (r22 == C295085nY.MATCHED || r22 == C295085nY.SHRINKING) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        Integer num = C363388je.A00(userSession).A00(AnonymousClass5w8.A04).A02;
        if (num == AnonymousClass05K.A01 || num == AnonymousClass05K.A0C) {
            return true;
        }
        return false;
    }
}
