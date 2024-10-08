package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.7FK  reason: invalid class name */
public final class AnonymousClass7FK {
    public static final AnonymousClass7FK A00 = new Object();

    public static final boolean A02(UserSession userSession, C242373Tu r5, C254703su r6, Integer num, int i) {
        if (i == 29 || !AnonymousClass7CY.A01(userSession, r6, i)) {
            return false;
        }
        if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A0N) {
            return (r5 == null || !r5.A01()) && !AnonymousClass48O.A06(Integer.valueOf(i)) && 182.A06(0Tu.A05, userSession, 36328186304281654L);
        }
        return false;
    }

    public static final boolean A03(UserSession userSession, C254703su r4, C327687Bu r5, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        0qQ.A0B(r5, 0);
        if (r5.AG2(userSession, r4, i) && r4.A13 == null && !z && !z2 && ((z3 || (i == 29 && i2 != 8)) && ((!z4 || !z5) && (!z6 || !182.A06(0Tu.A05, userSession, 36316409504207198L))))) {
            ImmutableList of = ImmutableList.of(6, 8);
            0qQ.A07(of);
            if (of.contains(Integer.valueOf(i2))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r0 = ((java.lang.Boolean) r0.getValue()).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r0 = r5.A0k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(com.instagram.common.session.UserSession r4, X.AnonymousClass9HC r5, X.C254703su r6, java.lang.Integer r7) {
        /*
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r1 = r0.A01(r4)
            boolean r0 = r6.A1S()
            r3 = 1
            if (r0 != 0) goto L_0x001a
            boolean r0 = r6.A1T()
            if (r0 != 0) goto L_0x001a
            int r0 = r7.intValue()
            switch(r0) {
                case 0: goto L_0x0057;
                case 1: goto L_0x002d;
                case 2: goto L_0x0047;
                case 3: goto L_0x001c;
                case 4: goto L_0x0030;
                case 5: goto L_0x004a;
                default: goto L_0x001a;
            }
        L_0x001a:
            r3 = 0
            return r3
        L_0x001c:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317732353873379(0x8106c9000015e3, double:3.030818408135138E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x001a
        L_0x002d:
            X.0eM r0 = r5.A0k
            goto L_0x004c
        L_0x0030:
            boolean r0 = r6.A1j(r1)
            if (r0 == 0) goto L_0x001a
            X.0eM r0 = r5.A0k
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x001a
            X.0eM r0 = r5.A0i
            goto L_0x004c
        L_0x0047:
            X.0eM r0 = r5.A0l
            goto L_0x004c
        L_0x004a:
            X.0eM r0 = r5.A0j
        L_0x004c:
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0059
        L_0x0057:
            boolean r0 = r5.A1T
        L_0x0059:
            if (r0 == 0) goto L_0x001a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7FK.A00(com.instagram.common.session.UserSession, X.9HC, X.3su, java.lang.Integer):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r0.A02 != 8) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.common.session.UserSession r4, X.C242373Tu r5, X.C254703su r6, int r7, boolean r8, boolean r9) {
        /*
            com.google.common.collect.ImmutableList r1 = r6.A0H()
            r3 = 1
            r0 = 0
            if (r1 == 0) goto L_0x0017
            java.lang.Object r0 = X.00k.A0O(r1, r0)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x0017
            int r2 = r0.A02
            r0 = 8
            r1 = 1
            if (r2 == r0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = X.AnonymousClass48O.A05(r7)
            if (r0 == 0) goto L_0x0058
            if (r8 == 0) goto L_0x0058
            boolean r0 = r6.A2P
            if (r0 != 0) goto L_0x0058
            boolean r0 = r6.A1T()
            if (r0 != 0) goto L_0x0058
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r6.A13
            if (r0 != 0) goto L_0x0058
            boolean r0 = r6.A1S()
            if (r0 != 0) goto L_0x0058
            if (r5 == 0) goto L_0x0058
            boolean r0 = r5.A03(r4)
            if (r0 != 0) goto L_0x0058
            if (r9 != 0) goto L_0x0058
            if (r1 != 0) goto L_0x0058
            X.2FW r1 = r6.A10
            com.google.common.collect.ImmutableSet r0 = X.2FW.A06
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0058
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329698132771074(0x8111ab00004102, double:3.0383856148923643E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0058
            return r3
        L_0x0058:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7FK.A01(com.instagram.common.session.UserSession, X.3Tu, X.3su, int, boolean, boolean):boolean");
    }

    public static final boolean A04(UserSession userSession, C254703su r3, Integer num, String str) {
        boolean contains;
        boolean z;
        boolean contains2;
        switch (num.intValue()) {
            case 0:
                C67542Mpc A002 = C67539MpY.A00(userSession);
                synchronized (A002) {
                    contains = A002.A02.contains(str);
                }
                if (contains) {
                    return A002.A02(str);
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                0qQ.A0B(userSession, 0);
                Object A01 = userSession.A01(C72188Oxx.class, C73751PjC.A00);
                C72188Oxx oxx = (C72188Oxx) A01;
                synchronized (A01) {
                    z = oxx.A00;
                }
                if (z) {
                    synchronized (A01) {
                        contains2 = oxx.A01.contains(str);
                    }
                    return contains2;
                }
                break;
            default:
                return false;
        }
        return r3.A2M;
    }

    public final boolean A05(UserSession userSession, AnonymousClass9HC r6, C242373Tu r7, C254703su r8, C254793t3 r9, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        2FW r1;
        C254873tC r0;
        if (r8.A1T() || r7 == null || r7.A03(userSession) || r8.A1S() || r8.A13 != null || z || z2 || z3 || z4 || (r1 = r8.A10) == 2FW.A0k || r1 == 2FW.A0h || r8.A1F != AnonymousClass05K.A0j || i == 29 || AnonymousClass48O.A01(i) || AnonymousClass48O.A02(i) || !((Boolean) r6.A0e.getValue()).booleanValue()) {
            return false;
        }
        ImmutableList A0H = r8.A0H();
        if ((A0H == null || (r0 = (C254873tC) 00k.A0J(A0H)) == null || r0.A02 != 8 || !182.A06(0Tu.A05, userSession, 36324136150708047L)) && AnonymousClass9HV.A00(userSession).A00(r9, 54)) {
            return true;
        }
        return false;
    }
}
