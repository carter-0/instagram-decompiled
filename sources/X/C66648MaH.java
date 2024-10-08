package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.MaH  reason: case insensitive filesystem */
public abstract class C66648MaH {
    public static final boolean A00(UserSession userSession, AnonymousClass2Ep r7) {
        User BZK;
        Boolean AaL;
        if (A04(userSession, r7.BZK(), r7.CQl(), r7.C6a(), r7.BRZ().size()) && (BZK = r7.BZK()) != null && (AaL = BZK.A03.AaL()) != null && AaL.booleanValue()) {
            return true;
        }
        if (r7.C6a() != 1014 || !182.A06(0Tu.A05, userSession, 36330204939174409L)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, AnonymousClass2Ep r6) {
        User BZK;
        Boolean AaM;
        if (!A04(userSession, r6.BZK(), r6.CQl(), r6.C6a(), r6.BRZ().size()) || (BZK = r6.BZK()) == null || (AaM = BZK.A03.AaM()) == null || !AaM.booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession, AnonymousClass2Ep r5) {
        return r5.C6a() == 1014 && 182.A06(0Tu.A05, userSession, 36330204939174409L);
    }

    public static final boolean A03(UserSession userSession, C331527Ri r6) {
        User BZK;
        Boolean AaM;
        if (r6 != null) {
            if (!A04(userSession, r6.BZK(), r6.BJ5(), r6.C6a(), r6.BRV().size()) || (BZK = r6.BZK()) == null || (AaM = BZK.A03.AaM()) == null || !AaM.booleanValue()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x000c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A04(com.instagram.common.session.UserSession r3, com.instagram.user.model.User r4, java.util.Map r5, int r6, int r7) {
        /*
            r2 = 0
            r1 = 1
            if (r6 == 0) goto L_0x0041
            r0 = 1003(0x3eb, float:1.406E-42)
            if (r6 == r0) goto L_0x000d
            r0 = 1013(0x3f5, float:1.42E-42)
            if (r6 == r0) goto L_0x0050
        L_0x000c:
            return r2
        L_0x000d:
            if (r4 == 0) goto L_0x000c
            X.6oA r0 = new X.6oA
            r0.<init>(r3)
            boolean r0 = r4.CQp(r0)
            if (r0 != r1) goto L_0x000c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            if (r5 == 0) goto L_0x0050
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = r4.getId()
            java.lang.Object r0 = r5.get(r0)
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = r3.A06
            java.lang.Object r0 = r5.get(r0)
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x000c
            goto L_0x0050
        L_0x0041:
            if (r7 != r1) goto L_0x000c
            if (r4 == 0) goto L_0x000c
            X.6oA r0 = new X.6oA
            r0.<init>(r3)
            boolean r0 = r4.CQp(r0)
            if (r0 != r1) goto L_0x000c
        L_0x0050:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66648MaH.A04(com.instagram.common.session.UserSession, com.instagram.user.model.User, java.util.Map, int, int):boolean");
    }
}
