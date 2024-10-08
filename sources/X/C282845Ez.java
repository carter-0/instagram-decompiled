package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.5Ez  reason: invalid class name and case insensitive filesystem */
public abstract class C282845Ez {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(com.instagram.common.session.UserSession r5, X.1Xj r6) {
        /*
            r0 = 0
            X.0qQ.A0B(r6, r0)
            boolean r0 = A02(r5, r6)
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x002f
            int r3 = A00(r5)
            int r2 = r3 + -1
            X.1Xy r0 = r6.A0C
            java.util.List r1 = r0.AtY()
            if (r3 == 0) goto L_0x002f
            if (r1 == 0) goto L_0x002d
            int r0 = r1.size()
        L_0x0020:
            if (r2 >= r0) goto L_0x002f
            if (r1 == 0) goto L_0x0036
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
        L_0x002a:
            if (r0 == 0) goto L_0x0036
            return r0
        L_0x002d:
            r0 = 0
            goto L_0x0020
        L_0x002f:
            X.1Xy r0 = r6.A0C
            java.lang.String r0 = r0.BMq()
            goto L_0x002a
        L_0x0036:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C282845Ez.A01(com.instagram.common.session.UserSession, X.1Xj):java.lang.String");
    }

    public static final boolean A02(UserSession userSession, 1Xj r6) {
        List AtY;
        0qQ.A0B(r6, 0);
        if (r6.A0C.AtY() == null || (AtY = r6.A0C.AtY()) == null || AtY.size() < 3 || A00(userSession) < 1) {
            return false;
        }
        return true;
    }

    public static final int A00(UserSession userSession) {
        long j;
        0Tu r2;
        long j2;
        String language = AnonymousClass1Q2.A02().getLanguage();
        int hashCode = language.hashCode();
        if (hashCode == 3246) {
            if (language.equals("es")) {
                r2 = 0Tu.A05;
                j2 = 36600427101359996L;
            }
            j = 0;
            Long valueOf = Long.valueOf(j);
            0qQ.A0A(valueOf);
            return (int) valueOf.longValue();
        } else if (hashCode == 3329) {
            if (language.equals("hi")) {
                r2 = 0Tu.A05;
                j2 = 36600427101425533L;
            }
            j = 0;
            Long valueOf2 = Long.valueOf(j);
            0qQ.A0A(valueOf2);
            return (int) valueOf2.longValue();
        } else if (hashCode != 3588) {
            if (hashCode == 3700 && language.equals("th")) {
                r2 = 0Tu.A05;
                j2 = 36600427101556607L;
            }
            j = 0;
            Long valueOf22 = Long.valueOf(j);
            0qQ.A0A(valueOf22);
            return (int) valueOf22.longValue();
        } else {
            if (language.equals("pt")) {
                r2 = 0Tu.A05;
                j2 = 36600427101491070L;
            }
            j = 0;
            Long valueOf222 = Long.valueOf(j);
            0qQ.A0A(valueOf222);
            return (int) valueOf222.longValue();
        }
        j = 182.A01(r2, userSession, j2);
        Long valueOf2222 = Long.valueOf(j);
        0qQ.A0A(valueOf2222);
        return (int) valueOf2222.longValue();
    }
}
