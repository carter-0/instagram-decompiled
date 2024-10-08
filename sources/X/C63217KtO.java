package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KtO  reason: case insensitive filesystem */
public abstract class C63217KtO {
    public static final Integer A00(UserSession userSession, C62462KgC kgC, AnonymousClass3QO r5, boolean z) {
        int i;
        boolean A1Y = C51970G9q.A1Y(kgC);
        boolean A1W = AnonymousClass7TF.A1W(JTR.A0w(userSession), AnonymousClass05K.A0C);
        if (r5 == AnonymousClass3QO.CLOSE_FRIENDS) {
            i = 2131955222;
            if (kgC.ordinal() != A1Y) {
                i = 2131962272;
            }
        } else if (r5 == AnonymousClass3QO.FAN_CLUB) {
            i = 2131955224;
            if (kgC.ordinal() != A1Y) {
                i = 2131962273;
            }
        } else if (A1W || r5 == AnonymousClass3QO.FOLLOWERS_ONLY) {
            i = 2131962606;
        } else if (z) {
            return null;
        } else {
            i = 2131955223;
        }
        return Integer.valueOf(i);
    }
}
