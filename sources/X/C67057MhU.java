package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MhU  reason: case insensitive filesystem */
public abstract class C67057MhU {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0 = (r0 = r4.getResources()).getDisplayMetrics();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.content.Context r4, com.instagram.common.session.UserSession r5) {
        /*
            r3 = 0
            if (r4 == 0) goto L_0x0023
            android.content.res.Resources r0 = r4.getResources()
            if (r0 == 0) goto L_0x0023
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r0 == 0) goto L_0x0023
            int r1 = r0.widthPixels
            r0 = 360(0x168, float:5.04E-43)
            if (r1 <= r0) goto L_0x0023
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315915582770872(0x81052200010eb8, double:3.0296694747743623E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0023
            r3 = 1
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67057MhU.A00(android.content.Context, com.instagram.common.session.UserSession):boolean");
    }

    public static final boolean A01(UserSession userSession) {
        return 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36329899996234101L);
    }
}
