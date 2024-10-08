package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

public final class FRZ implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(FRZ.class);
    public static final String __redex_internal_original_name = "BusinessConversionGatingUtil";

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r0.booleanValue() != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0.booleanValue() != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(com.instagram.common.session.UserSession r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r4 = 0
            boolean r1 = A01(r5, r0)
            r0 = 1
            if (r1 == 0) goto L_0x000d
            return r0
        L_0x000d:
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r5)
            X.4Cl r0 = r1.A03
            java.lang.Boolean r0 = r0.CUd()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 == 0) goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            X.4Cl r0 = r1.A03
            java.lang.Boolean r0 = r0.CXy()
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            X.4Cl r0 = r1.A03
            java.lang.Integer r0 = r0.B6v()
            if (r0 == 0) goto L_0x0060
            int r1 = r0.intValue()
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r0) goto L_0x0060
            if (r3 != 0) goto L_0x0045
            if (r2 == 0) goto L_0x0060
        L_0x0045:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314012912191857(0x81036700000971, double:3.028466218238754E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0060
            X.0Tu r2 = X.0Tu.A06
            r0 = 36316280654926021(0x810577000010c5, double:3.029900347875306E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0060
            r4 = 1
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FRZ.A00(com.instagram.common.session.UserSession):boolean");
    }

    public static final boolean A01(UserSession userSession, boolean z) {
        0Tu r2;
        0qQ.A0B(userSession, 0);
        C51948G8r Bsx = DbX.A0m(userSession).Bsx();
        if (Bsx != null && Bsx.CRv()) {
            if (z) {
                r2 = 0Tu.A05;
            } else {
                r2 = 0Tu.A06;
            }
            if (!DbY.A1Z(r2, userSession, 36316280655057095L)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
