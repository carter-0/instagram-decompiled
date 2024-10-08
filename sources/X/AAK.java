package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public abstract class AAK {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0033, code lost:
        if (X.182.A06(r2, r8, 36319587779878408L) != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C40201AVr A00(android.content.Context r6, X.B2V r7, com.instagram.common.session.UserSession r8) {
        /*
            X.9w1 r4 = new X.9w1
            r4.<init>()
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            X.9w2 r2 = X.AGo.A06
            X.Q0h r1 = X.C9955RkA.A00
            X.SrT r0 = new X.SrT
            r0.<init>(r6, r1)
            r5.put(r2, r0)
            X.9w2 r0 = X.AGo.A07
            r5.put(r0, r7)
            X.9w2 r3 = X.AGo.A0B
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319587779812871(0x81087900011e07, double:3.031991786970473E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0035
            r0 = 36319587779878408(0x81087900021e08, double:3.031991787011919E-306)
            boolean r1 = X.182.A06(r2, r8, r0)
            r0 = 1
            if (r1 == 0) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.put(r3, r0)
            X.AGo r1 = new X.AGo
            r1.<init>((java.util.Map) r5)
            X.AVr r0 = new X.AVr
            r0.<init>(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AAK.A00(android.content.Context, X.B2V, com.instagram.common.session.UserSession):X.AVr");
    }

    public static final C40201AVr A01(Context context, UserSession userSession, boolean z, boolean z2, boolean z3) {
        B2V aVl;
        if ((z || !182.A06(0Tu.A05, userSession, 36330990918124398L)) && !182.A06(0Tu.A05, userSession, 36330990918058861L)) {
            aVl = new C40195AVk(context, userSession, z2, z3);
        } else {
            aVl = new C40196AVl(userSession, context, z2);
        }
        return A00(context, aVl, userSession);
    }
}
