package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7CY  reason: invalid class name */
public abstract class AnonymousClass7CY {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (((java.lang.Number) r3.A05.CDM(r3, X.AnonymousClass4kA.A0c[21])).intValue() < 3) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(com.instagram.common.session.UserSession r4, X.AnonymousClass7SD r5) {
        /*
            int r1 = r5.A08
            r0 = 29
            if (r1 != r0) goto L_0x0033
            boolean r0 = r5.A0n
            if (r0 == 0) goto L_0x0023
            X.4kA r3 = X.AnonymousClass4k9.A00(r4)
            X.0s0 r2 = r3.A05
            X.0YZ[] r1 = X.AnonymousClass4kA.A0c
            r0 = 21
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 3
            if (r1 >= r0) goto L_0x0031
        L_0x0023:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319407392234791(0x81084f00111d27, double:3.031877709139733E-306)
            boolean r1 = X.182.A06(r2, r4, r0)
        L_0x002e:
            r0 = 1
            if (r1 != 0) goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            return r0
        L_0x0033:
            java.lang.Boolean r0 = X.AnonymousClass78L.A00(r4)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x003f
            r0 = 1
            return r0
        L_0x003f:
            boolean r0 = r5.A1C
            if (r0 == 0) goto L_0x0031
            boolean r1 = X.C69958Nuy.A00(r4, r5)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7CY.A00(com.instagram.common.session.UserSession, X.7SD):boolean");
    }

    public static final boolean A01(UserSession userSession, C254703su r2, int i) {
        if (i == 29) {
            return C66839MdX.A00(userSession, r2);
        }
        if (AnonymousClass78L.A00(userSession).booleanValue()) {
            2FW r1 = r2.A10;
            C48832Eku eku = C48832Eku.$redex_init_class;
            int ordinal = r1.ordinal();
            if (ordinal == 2 || ordinal == 11 || ordinal == 96) {
                return true;
            }
            return false;
        } else if (r2.A10 != 2FW.A1g) {
            return false;
        } else {
            return true;
        }
    }
}
