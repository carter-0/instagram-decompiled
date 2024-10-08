package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5IJ  reason: invalid class name */
public abstract class AnonymousClass5IJ {
    public static final boolean A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (A01(userSession) || A02(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (0eE.A00(userSession).A00().A0N() != AnonymousClass05K.A01) {
            return false;
        }
        if (AnonymousClass7K4.A00(userSession) || C375469Dr.A00(userSession)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(com.instagram.common.session.UserSession r4, boolean r5) {
        /*
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r1.A01(r4)
            boolean r0 = X.2Ek.A01(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0035
            if (r5 != 0) goto L_0x001c
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315855453163110(0x81051400000e66, double:3.029631448568291E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
        L_0x001a:
            if (r0 == 0) goto L_0x003e
        L_0x001c:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317934218385060(0x8106f8001016a4, double:3.030946068065168E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x003e
            r0 = 36317934218974892(0x8106f8001916ac, double:3.03094606843818E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x003e
            return r3
        L_0x0035:
            com.instagram.user.model.User r0 = r1.A01(r4)
            boolean r0 = X.2Ek.A02(r0)
            goto L_0x001a
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5IJ.A03(com.instagram.common.session.UserSession, boolean):boolean");
    }

    public static final boolean A04(UserSession userSession, boolean z) {
        0eE r1 = AnonymousClass0t1.A01;
        if (2Ek.A01(r1.A01(userSession))) {
            if (z || 182.A06(0Tu.A05, userSession, 36315855453163110L)) {
                return true;
            }
            return false;
        } else if (!2Ek.A02(r1.A01(userSession)) || 182.A06(0Tu.A05, userSession, 36317934217795227L)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        if (C375479Ds.A01(userSession) || C375489Dt.A01(userSession)) {
            return true;
        }
        return false;
    }
}
