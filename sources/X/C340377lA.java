package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7lA  reason: invalid class name and case insensitive filesystem */
public abstract class C340377lA {
    public static final int A00(UserSession userSession, C279284yO r6, Integer num, boolean z) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 3);
        if ((num != null && num.intValue() == 1) || z || 1Au.A00(userSession).A1v()) {
            return 1;
        }
        if (r6 instanceof AnonymousClass80M) {
            1Av A00 = 1Au.A00(userSession);
            if (((Boolean) A00.A0y.CDM(A00, 1Av.A8a[68])).booleanValue()) {
                return 1;
            }
        } else if (!1Au.A00(userSession).A1u()) {
            return 0;
        } else {
            return 1;
        }
        return 0;
    }
}
