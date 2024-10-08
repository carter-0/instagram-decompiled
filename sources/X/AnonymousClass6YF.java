package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6YF  reason: invalid class name */
public abstract class AnonymousClass6YF {
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.0xI r3, com.instagram.common.session.UserSession r4, X.1Xj r5) {
        /*
            boolean r0 = r5.CcK()
            java.lang.String r2 = "tracking_token"
            java.lang.String r1 = "a_i"
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "ad"
            r3.A0C(r1, r0)
            java.lang.String r0 = X.C231122qu.A0F(r4, r5)
        L_0x0013:
            r3.A0C(r2, r0)
        L_0x0016:
            com.instagram.user.model.User r0 = r5.A2A(r4)
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "a_pk"
            r3.A0C(r0, r1)
        L_0x0025:
            java.lang.String r1 = r5.getId()
            java.lang.String r0 = "m_pk"
            r3.A0C(r0, r1)
            long r0 = r5.A1A()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "m_ts"
            r3.A0B(r0, r1)
            return
        L_0x003c:
            boolean r0 = r5.CYg()
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "organic"
            r3.A0C(r1, r0)
            X.1Xy r0 = r5.A0C
            java.lang.String r0 = r0.getOrganicTrackingToken()
            goto L_0x0013
        L_0x004e:
            java.lang.String r0 = "none"
            r3.A0C(r1, r0)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YF.A00(X.0xI, com.instagram.common.session.UserSession, X.1Xj):void");
    }

    public static final void A01(AnonymousClass0iw r3, UserSession userSession, 1Xj r5) {
        if (r5.CeS() && !r5.A4o()) {
            String moduleName = r3.getModuleName();
            if (!182.A06(0Tu.A05, userSession, 36312767371740414L)) {
                0xI A01 = 0xI.A01("video_cover_photo_failed", moduleName);
                0qQ.A0A(A01);
                A00(A01, userSession, r5);
                boolean CcK = r5.CcK();
                AnonymousClass0xN A00 = C60510iO.A00(userSession);
                if (CcK) {
                    A00.EHF(A01);
                } else {
                    A00.EFq(A01);
                }
            }
        }
    }

    public static final void A02(AnonymousClass0iw r3, UserSession userSession, 1Xj r5) {
        if (r5.CeS() && !r5.A4o()) {
            String moduleName = r3.getModuleName();
            if (!182.A06(0Tu.A05, userSession, 36312767371740414L)) {
                0xI A01 = 0xI.A01("video_cover_photo_finished", moduleName);
                0qQ.A0A(A01);
                A00(A01, userSession, r5);
                boolean CcK = r5.CcK();
                AnonymousClass0xN A00 = C60510iO.A00(userSession);
                if (CcK) {
                    A00.EHF(A01);
                } else {
                    A00.EFq(A01);
                }
            }
        }
    }

    public static final void A03(AnonymousClass0iw r3, UserSession userSession, 1Xj r5) {
        if (r5.CeS() && !r5.A4o()) {
            String moduleName = r3.getModuleName();
            if (!182.A06(0Tu.A05, userSession, 36312767371740414L)) {
                0xI A01 = 0xI.A01("video_cover_photo_started", moduleName);
                0qQ.A0A(A01);
                A00(A01, userSession, r5);
                boolean CcK = r5.CcK();
                AnonymousClass0xN A00 = C60510iO.A00(userSession);
                if (CcK) {
                    A00.EHF(A01);
                } else {
                    A00.EFq(A01);
                }
            }
        }
    }
}
