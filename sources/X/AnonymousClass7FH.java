package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7FH  reason: invalid class name */
public abstract class AnonymousClass7FH {
    public static final boolean A00(UserSession userSession, AnonymousClass7LQ r8) {
        Integer num;
        AnonymousClass7SD r2 = r8.A0G;
        if ((!r2.A1A && r2.A08 != 29) || r2.A1G) {
            return false;
        }
        C254703su r22 = r8.A0e;
        AnonymousClass7AG r0 = r22.A0Q;
        if (r0 != null) {
            num = r0.A02;
        } else {
            num = null;
        }
        if (num == AnonymousClass05K.A01) {
            return false;
        }
        2FW r1 = r22.A10;
        0qQ.A07(r1);
        if (!C327657Br.A00().A01(r1).CVT(userSession, r22) || r22.A1F != AnonymousClass05K.A0j) {
            return false;
        }
        AnonymousClass7SD r5 = r8.A0G;
        if (r5.A1G || r22.A13 != null || r22.C7c() < 1450137600000000L) {
            return false;
        }
        return r5.A08 != 29 || (r5.A0n && r5.A07 == 7) || r5.A07 == 0;
    }
}
