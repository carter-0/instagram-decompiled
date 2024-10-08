package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.HwH  reason: case insensitive filesystem */
public abstract class C56304HwH {
    public static final void A01(Context context, UserSession userSession, 1Xj r5, AnonymousClass3W1 r6) {
        AnonymousClass7TG.A1Q(r5, r6);
        r5.A4J(true);
        if (r5.A67()) {
            r5.A0C.EQl(false);
        }
        r6.A3D = false;
        r5.AE7(userSession);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0K("media/%s/disable_comments/", C51969G9p.A1b(r5));
        1OC A0S = DbU.A0S(A0a, 1XP.class, 1XY.class);
        A0S.A00 = new C47692EDb(11, (Object) r5, (Object) userSession, (Object) context);
        1ES.A03(A0S);
    }

    public static final void A00(Context context, UserSession userSession, 1Xj r5) {
        boolean A1Y = DbW.A1Y(r5);
        r5.A4J(false);
        if (r5.A67()) {
            r5.A0C.EQl(Boolean.valueOf(A1Y));
        }
        r5.AE7(userSession);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0K("media/%s/enable_comments/", C51969G9p.A1b(r5));
        1OC A0S = DbU.A0S(A0a, 1XP.class, 1XY.class);
        A0S.A00 = new C47692EDb(12, (Object) r5, (Object) userSession, (Object) context);
        1ES.A03(A0S);
    }
}
