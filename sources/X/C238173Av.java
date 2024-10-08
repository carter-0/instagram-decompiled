package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Av  reason: invalid class name and case insensitive filesystem */
public abstract class C238173Av {
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0020 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(com.instagram.common.session.UserSession r5, X.1Av r6) {
        /*
            java.lang.String r0 = "ig_olympus_disable_video_autoplay"
            boolean r0 = A02(r5, r0)
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0020
            X.0xa r2 = r6.A01
            r0 = 1213(0x4bd, float:1.7E-42)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            int r0 = r2.getInt(r1, r4)
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "ig_autoplay_disabled_default"
            boolean r0 = A02(r5, r0)
            if (r0 == 0) goto L_0x0021
        L_0x0020:
            r4 = 1
        L_0x0021:
            return r4
        L_0x0022:
            int r0 = r2.getInt(r1, r4)
            if (r0 != r3) goto L_0x0021
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238173Av.A01(com.instagram.common.session.UserSession, X.1Av):boolean");
    }

    public static boolean A00(UserSession userSession) {
        1Av A00 = 1Au.A00(userSession);
        if (A02(userSession, "ig_olympus_disable_video_autoplay")) {
            return true;
        }
        if (!A02(userSession, "ig_disable_video_autoplay")) {
            return false;
        }
        if (!A02(userSession, "ig_video_setting") || A01(userSession, A00)) {
            return true;
        }
        return false;
    }

    public static boolean A02(UserSession userSession, String str) {
        return AnonymousClass1Qz.A00(userSession).C82().A0C.contains(str);
    }
}
