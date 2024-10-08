package X;

import android.os.Build;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Jk  reason: invalid class name and case insensitive filesystem */
public abstract class C305756Jk {
    public static Boolean A00;
    public static Boolean A01;
    public static final String[] A02 = {"SM-J500M", "SM-J500F"};

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (X.0qg.A00(r4, true) <= 1073741824) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.content.Context r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Boolean r0 = A00
            if (r0 == 0) goto L_0x000d
            boolean r1 = r0.booleanValue()
            return r1
        L_0x000d:
            X.0xi r0 = X.0tS.A4E
            X.0tS r3 = r0.A00()
            X.0s0 r2 = r3.A0w
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 106(0x6a, float:1.49E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0043
            int r1 = X.AnonymousClass0Ke.A00(r4)
            r0 = 2008(0x7d8, float:2.814E-42)
            if (r1 < r0) goto L_0x0033
            r0 = 2010(0x7da, float:2.817E-42)
            if (r1 < r0) goto L_0x0043
        L_0x0033:
            X.0qg.A01()
            r0 = 1
            long r3 = X.0qg.A00(r4, r0)
            r1 = 1073741824(0x40000000, double:5.304989477E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 > 0) goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            A00 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C305756Jk.A00(android.content.Context):boolean");
    }

    public static final boolean A01(UserSession userSession) {
        boolean z;
        0qQ.A0B(userSession, 0);
        Boolean bool = A01;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (A00(userSession.A03.A06())) {
            String str = Build.MODEL;
            if (str != null && str.length() != 0) {
                String[] strArr = A02;
                int i = 0;
                while (true) {
                    if (str.equalsIgnoreCase(strArr[i])) {
                        break;
                    }
                    i++;
                    if (i >= 2) {
                        break;
                    }
                }
            } else {
                z = true;
                A01 = Boolean.valueOf(z);
                return z;
            }
        }
        z = false;
        A01 = Boolean.valueOf(z);
        return z;
    }
}
