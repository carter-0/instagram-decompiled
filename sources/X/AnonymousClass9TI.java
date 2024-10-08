package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9TI  reason: invalid class name */
public abstract class AnonymousClass9TI {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        if (X.AnonymousClass7TF.A0R(r2, r8, 36320171895496783L).booleanValue() != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        if (X.AnonymousClass7TF.A0R(r2, r8, 36320171895496783L).booleanValue() != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        if (X.AnonymousClass7TF.A0R(r2, r8, 36320171895496783L).booleanValue() != false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A00(android.content.Context r7, com.instagram.common.session.UserSession r8, boolean r9) {
        /*
            r0 = 0
            X.AnonymousClass7TF.A1B(r8, r0, r7)
            X.0qg.A01()
            long r6 = X.0qg.A00(r7, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36601646872400146(0x82090100061112, double:3.210367092883469E-306)
            long r3 = X.182.A01(r2, r8, r0)
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r3 = r3 * r0
            r5 = 1
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            r0 = 0
            if (r1 < 0) goto L_0x0021
            r0 = 1
        L_0x0021:
            if (r9 != 0) goto L_0x00b8
            if (r0 == 0) goto L_0x00b8
            r0 = 36320171895365709(0x8109010001204d, double:3.0323611839981324E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x00b8
        L_0x0030:
            r0 = 36320171895365709(0x8109010001204d, double:3.0323611839981324E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0056
            r0 = 36320171895562320(0x81090100042050, double:3.03236118412247E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0056
            r0 = 36320171895496783(0x8109010003204f, double:3.032361184081024E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r8, r0)
            boolean r0 = r0.booleanValue()
            r4 = 1
            if (r0 == 0) goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            r0 = 36320171895365709(0x8109010001204d, double:3.0323611839981324E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x007d
            r0 = 36320171895758929(0x81090100072051, double:3.032361184246806E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x007d
            r0 = 36320171895496783(0x8109010003204f, double:3.032361184081024E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r8, r0)
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 == 0) goto L_0x007e
        L_0x007d:
            r3 = 0
        L_0x007e:
            r0 = 36320171895365709(0x8109010001204d, double:3.0323611839981324E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x00af
            r0 = 36320171895562320(0x81090100042050, double:3.03236118412247E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 != 0) goto L_0x00af
            r0 = 36320171895758929(0x81090100072051, double:3.032361184246806E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 != 0) goto L_0x00af
            r0 = 36320171895496783(0x8109010003204f, double:3.032361184081024E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r8, r0)
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L_0x00b0
        L_0x00af:
            r1 = 0
        L_0x00b0:
            r0 = 0
            if (r5 == 0) goto L_0x00b7
            if (r4 == 0) goto L_0x00bb
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x00b7:
            return r0
        L_0x00b8:
            r5 = 0
            goto L_0x0030
        L_0x00bb:
            if (r3 == 0) goto L_0x00d0
            r0 = 36320171895955540(0x810901000a2054, double:3.032361184371144E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00cd
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            return r0
        L_0x00cd:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            return r0
        L_0x00d0:
            if (r1 == 0) goto L_0x00d5
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            return r0
        L_0x00d5:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9TI.A00(android.content.Context, com.instagram.common.session.UserSession, boolean):java.lang.Integer");
    }

    public static final boolean A02(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36320171895431246L) || !182.A06(r2, userSession, 36320171895758929L) || AnonymousClass7TF.A0R(r2, userSession, 36320171895496783L).booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36320171895431246L) || !182.A06(r2, userSession, 36320171895562320L) || AnonymousClass7TF.A0R(r2, userSession, 36320171895496783L).booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean A04(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36320171895431246L) || 182.A06(r2, userSession, 36320171895562320L) || 182.A06(r2, userSession, 36320171895758929L) || AnonymousClass7TF.A0R(r2, userSession, 36320171895496783L).booleanValue()) {
            return false;
        }
        return true;
    }

    public static Integer A01(0Tu r2, UserSession userSession) {
        if (A03(userSession)) {
            return AnonymousClass05K.A01;
        }
        if (A02(userSession)) {
            if (!182.A06(r2, userSession, 36320171895955540L)) {
                return AnonymousClass05K.A0Y;
            }
            return AnonymousClass05K.A0N;
        } else if (A04(userSession)) {
            return AnonymousClass05K.A0C;
        } else {
            return AnonymousClass05K.A00;
        }
    }
}
