package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6ji  reason: invalid class name and case insensitive filesystem */
public final class C315326ji implements C315036jF {
    public final AnonymousClass3BQ A00;

    public final View C8E(C255773uh r3, C316026kz r4) {
        C309406Yd r42;
        AnonymousClass6PB r1;
        0qQ.A0B(r4, 0);
        if (!(r4 instanceof C309406Yd) || (r42 = (C309406Yd) r4) == null || (r1 = r42.A0X) == null) {
            return null;
        }
        return r1.A05;
    }

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        0qQ.A0B(context, 1);
        String string = context.getString(2131965852);
        0qQ.A07(string);
        return new C315476jx((CharSequence) string);
    }

    public final void DsI(Context context, AnonymousClass0iw r2, UserSession userSession, C255773uh r4, C250973mM r5) {
    }

    public final boolean EtQ(UserSession userSession, C255773uh r7, C250973mM r8, C316026kz r9) {
        C309406Yd r92;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r7, 1);
        0qQ.A0B(r9, 3);
        if (!(r9 instanceof C309406Yd) || (r92 = (C309406Yd) r9) == null || r92.A0X == null) {
            return false;
        }
        1Xj r3 = r7.A0b;
        boolean z = false;
        if (this.A00 == AnonymousClass3BQ.ACTIVITY_FEED_USER_CONTENT_RESHARED_IN_AD_NOTIF) {
            z = true;
        }
        if (r3 == null || !r3.CcK() || !z || !182.A06(0Tu.A05, userSession, 36323947171622527L)) {
            return false;
        }
        return true;
    }

    public final C226262fy C8G() {
        return C226262fy.BELOW_ANCHOR;
    }

    public C315326ji(AnonymousClass3BQ r1) {
        this.A00 = r1;
    }
}
