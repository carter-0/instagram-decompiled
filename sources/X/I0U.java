package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;

public final class I0U {
    public static final I0U A00 = new Object();

    public final boolean A00(UserSession userSession, L70 l70, C63881LAk lAk) {
        0qQ.A0B(lAk, 1);
        1JQ r4 = 1JQ.A05;
        String str = lAk.A01;
        String str2 = userSession.A06;
        String hexString = Integer.toHexString(002.A0g("offline_", str, str2).hashCode());
        0qQ.A07(hexString);
        boolean A02 = r4.A02(hexString);
        1JQ r8 = 1JQ.A05;
        String hexString2 = Integer.toHexString(002.A0g("offline_", str, str2).hashCode());
        0qQ.A07(hexString2);
        long j = l70.A00;
        String A002 = AnonymousClass000.A00(1287);
        1Fe r7 = 1Fe.A04;
        AnonymousClass3EQ r2 = new AnonymousClass3EQ(hexString2);
        boolean z = false;
        try {
            r2.A05 = A002;
            r2.A00 = -1;
            1Fn A003 = r2.A01(r7, r8.A00, r8.A01, false).A00();
            if (A003 != null && C51966G9m.A07(Long.parseLong(A003.A01)) > j) {
                z = true;
            }
        } catch (IOException unused) {
        }
        boolean z2 = !z;
        boolean z3 = true;
        AnonymousClass1Gh r0 = (AnonymousClass1Gh) 1Gc.A00(userSession).A00.get(A002);
        if (r0 != null) {
            boolean z4 = r0.A03;
            if (Boolean.valueOf(z4) != null) {
                z3 = !z4;
            }
        }
        if (!A02 || !z2 || !z3) {
            return false;
        }
        return true;
    }
}
