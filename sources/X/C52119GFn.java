package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GFn  reason: case insensitive filesystem */
public abstract class C52119GFn {
    public static final boolean A00(C267324bN r3, UserSession userSession, Integer num) {
        1Xj r0;
        long j;
        long j2;
        AnonymousClass7TG.A1N(userSession, r3);
        C295365o2 r2 = r3.A01;
        if (r2 == C295365o2.AD) {
            return GJ7.A00.A0H(r3, userSession);
        }
        if (!C52076GDw.A03(r3) || num == null) {
            r0 = r3.A02;
        } else {
            List list = r3.A0R;
            if (list != null) {
                r0 = DbZ.A0T(list, num.intValue());
            } else {
                r0 = null;
            }
        }
        boolean A1W = AnonymousClass7TF.A1W(r2, C295365o2.ORGANIC);
        if (r0 != null) {
            j = (long) r0.A0k();
        } else {
            j = 0;
        }
        boolean A03 = C52076GDw.A03(r3);
        if (!A1W) {
            return false;
        }
        if (A03) {
            j2 = 10;
        } else {
            j2 = 15;
        }
        if (j >= j2) {
            return true;
        }
        return false;
    }
}
