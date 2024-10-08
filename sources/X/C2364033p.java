package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.33p  reason: invalid class name and case insensitive filesystem */
public final class C2364033p {
    public static final C2364133q A02 = new Object();
    public final UserSession A00;
    public final String A01;

    public C2364033p(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    public final Integer A00(1Xj r7) {
        if (r7.BR7() != 1iA.A0S) {
            UserSession userSession = this.A00;
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36320648637915841L)) {
                if (182.A06(r2, userSession, 36320648637981378L)) {
                    return AnonymousClass05K.A0u;
                }
                if (!0sc.A07(new String[]{"feed_contextual_self_profile", "feed_contextual_profile", "feed_contextual_group_profile"}).contains(this.A01) || 182.A06(r2, userSession, 36320648636932793L)) {
                    if (182.A06(r2, userSession, 36320648636670647L)) {
                        return AnonymousClass05K.A01;
                    }
                    if (182.A06(r2, userSession, 36320648637719230L)) {
                        return AnonymousClass05K.A0C;
                    }
                    if (182.A06(r2, userSession, 36320648637784767L) && A01(r7)) {
                        return AnonymousClass05K.A0N;
                    }
                    if (182.A06(r2, userSession, 36320648637850304L)) {
                        return AnonymousClass05K.A0Y;
                    }
                }
                return AnonymousClass05K.A00;
            }
        }
        return AnonymousClass05K.A0j;
    }

    public final boolean A01(1Xj r5) {
        long j;
        boolean CcK = r5.CcK();
        UserSession userSession = this.A00;
        0Tu r2 = 0Tu.A05;
        if (CcK) {
            j = 36320648637457083L;
        } else {
            j = 36320648637522620L;
        }
        return 182.A06(r2, userSession, j);
    }
}
