package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Z8  reason: invalid class name */
public final class AnonymousClass3Z8 {
    public final UserSession A00;

    public AnonymousClass3Z8(UserSession userSession) {
        this.A00 = userSession;
    }

    public final AnonymousClass9IZ A00(1Xj r5) {
        Integer num;
        if (r5.A1w() == AnonymousClass3X1.FAN_CLUB) {
            num = AnonymousClass05K.A01;
        } else {
            if (r5.A1w() == AnonymousClass3X1.PREVIEW) {
                if (182.A06(0Tu.A05, this.A00, 36315894107868825L)) {
                    num = AnonymousClass05K.A0C;
                }
            } else if (r5.A1t() == AnonymousClass3QO.CLOSE_FRIENDS) {
                num = AnonymousClass05K.A0N;
            } else if (r5.A1t() == AnonymousClass3QO.OPAL && C318996ps.A01() && C318996ps.A00().A04(this.A00)) {
                num = AnonymousClass05K.A0j;
            }
            num = AnonymousClass05K.A00;
        }
        return new AnonymousClass9IZ(r5.A0C.CCd(), num, r5.A5G());
    }
}
