package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7La  reason: invalid class name and case insensitive filesystem */
public final class C329997La {
    public static final C329997La A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r3.BJk();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A07(X.2Er r3, java.lang.String r4) {
        /*
            r2 = 0
            int r1 = r3.C6a()
            r0 = 29
            if (r1 != r0) goto L_0x0016
            java.util.List r0 = r3.BJk()
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0016
            r2 = 1
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329997La.A07(X.2Er, java.lang.String):boolean");
    }

    public final boolean A08(UserSession userSession, N4P n4p) {
        0qQ.A0B(userSession, 0);
        int i = n4p.A09;
        if (i == 29 && !A01(userSession, n4p)) {
            String str = userSession.A06;
            C242243Te r1 = n4p.A0E;
            if (A05(r1, str, i) || A03(r1, str, i) || A06(r1, str, i) || A04(r1, str, i)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, N4P n4p) {
        String str;
        String str2 = userSession.A06;
        int i = n4p.A09;
        C242243Te r0 = n4p.A0E;
        if (r0 != null) {
            str = r0.A07;
        } else {
            str = null;
        }
        if (i != 29 || !str2.equals(str)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(C242243Te r1, String str, int i) {
        String str2;
        if (i == 29) {
            if (r1 != null) {
                str2 = r1.A07;
            } else {
                str2 = null;
            }
            if (!0qQ.A0K(str2, str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A03(C242243Te r2, String str, int i) {
        List list;
        boolean z = false;
        if (i == 29) {
            z = true;
        }
        if (!z || r2 == null || (list = r2.A0B) == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static final boolean A04(C242243Te r2, String str, int i) {
        List list;
        boolean z = false;
        if (i == 29) {
            z = true;
        }
        if (!z || r2 == null || (list = r2.A0C) == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(C242243Te r2, String str, int i) {
        List list;
        boolean z = false;
        if (i == 29) {
            z = true;
        }
        if (!z || r2 == null || (list = r2.A0D) == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static final boolean A06(C242243Te r2, String str, int i) {
        List list;
        boolean z = false;
        if (i == 29) {
            z = true;
        }
        if (!z || r2 == null || (list = r2.A0E) == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static final String A00(C242243Te r1, String str, int i) {
        if (A02(r1, str, i)) {
            return "creator";
        }
        if (A05(r1, str, i)) {
            return "collaborator";
        }
        if (A06(r1, str, i)) {
            return "moderator";
        }
        return "viewer";
    }
}
