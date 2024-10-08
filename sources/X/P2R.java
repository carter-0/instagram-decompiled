package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class P2R implements C74394PuA {
    public final Context A00;
    public final UserSession A01;
    public final N4P A02;

    public P2R(Context context, UserSession userSession, N4P n4p) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = n4p;
        this.A00 = context;
    }

    public final boolean isEnabled() {
        C68303N9q A07;
        N4P n4p = this.A02;
        if ((!JTO.A15(n4p.A0b).isEmpty()) || ((A07 = n4p.A07()) != null && A07.A0D)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r0.A0D == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List getItems() {
        /*
            r5 = this;
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            com.instagram.common.session.UserSession r4 = r5.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326889224157230(0x810f1d0000382e, double:3.036609249774402E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x006a
            X.N4P r2 = r5.A02
            X.N9q r0 = r2.A07()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.A0D
            r1 = 1
            if (r0 != 0) goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            X.0eM r0 = r2.A0b
            java.util.List r0 = X.JTO.A15(r0)
            int r0 = r0.size()
            if (r1 == 0) goto L_0x002f
            int r0 = r0 + 1
        L_0x002f:
            android.content.Context r2 = r5.A00
            r1 = 2131959607(0x7f131f37, float:1.955586E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.DbW.A0h(r2, r0, r1)
            X.DfA r1 = new X.DfA
            r1.<init>((java.lang.CharSequence) r0)
        L_0x0041:
            r3.add(r1)
            X.N4P r2 = r5.A02
            X.N9q r1 = r2.A07()
            if (r1 == 0) goto L_0x0053
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x0053
            r3.add(r1)
        L_0x0053:
            X.0eM r0 = r2.A0b
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r3.addAll(r0)
            X.0eM r0 = r2.A0Z
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r3.addAll(r0)
            return r3
        L_0x006a:
            r0 = 2131959606(0x7f131f36, float:1.9555857E38)
            X.DfA r1 = new X.DfA
            r1.<init>((int) r0)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P2R.getItems():java.util.List");
    }
}
