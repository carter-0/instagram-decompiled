package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3H5  reason: invalid class name */
public abstract class AnonymousClass3H5 {
    public static final CallerContext A00 = CallerContext.A01("CompanyIdentitySwitcherBadgingHelper");
    public static final AnonymousClass3H6 A01 = new Object();

    public static final int A00(UserSession userSession) {
        AnonymousClass3H6 r1 = A01;
        0qQ.A0B(userSession, 0);
        if (AnonymousClass3EM.A01()) {
            return r1.A02(userSession, AnonymousClass3EM.A04());
        }
        return 0;
    }
}
