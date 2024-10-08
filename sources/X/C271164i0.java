package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.4i0  reason: invalid class name and case insensitive filesystem */
public final class C271164i0 {
    public final C242813Wa A00;

    public C271164i0(C242813Wa r1) {
        this.A00 = r1;
    }

    public final C381479bp A00(UserSession userSession, 1Xj r6, AnonymousClass3W1 r7) {
        List A3l;
        boolean A02 = 2R8.A02(userSession, r6);
        0Tu r3 = 0Tu.A05;
        if (!182.A06(r3, userSession, 36320219140006000L) || (A02 && 182.A06(r3, userSession, 36326472612329245L))) {
            A3l = r6.A3l(userSession);
        } else {
            A3l = 00k.A0g(r6.A3l(userSession), new AnonymousClass53X());
        }
        int i = 2;
        if (182.A06(r3, userSession, 36330758989693705L)) {
            i = 1;
        }
        return new C381479bp(r6, r7, A3l, i);
    }
}
