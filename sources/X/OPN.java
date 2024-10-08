package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

public abstract class OPN {
    public static final boolean A01(UserSession userSession, N4P n4p) {
        int i;
        2HR r0;
        if (n4p.A0m || !n4p.A0v || (i = n4p.A09) == 29 || i == 1012) {
            return false;
        }
        C254793t3 r02 = n4p.A0L;
        0qQ.A0B(r02, 0);
        if (r02 instanceof MsysThreadId) {
            return false;
        }
        boolean A0C = n4p.A0C();
        boolean A05 = N4P.A05(n4p);
        if (C66640Ma9.A06(JTO.A15(n4p.A0c), A0C, A05) || n4p.A0n) {
            return false;
        }
        if ((!AnonymousClass7TE.A1b(JTO.A15(n4p.A0a)) && !AnonymousClass7TE.A1a(2HM.A00(userSession).A0H.A00())) || AnonymousClass6FC.A01(userSession)) {
            return false;
        }
        if (!A05) {
            r0 = 2HM.A00(userSession).A0c;
        } else if (!N4P.A04(userSession, n4p)) {
            return false;
        } else {
            r0 = 2HM.A00(userSession).A0b;
        }
        if (!DbX.A1Z(r0) || !C66582MXn.A1W(2HM.A00(userSession).A1T)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (r1 == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r0 != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        r2.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (r1 != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r16 != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        if (r11 != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r7.A1c() == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (X.AnonymousClass7TF.A1Y(r7.A03.COs(), true) != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r10 != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(androidx.fragment.app.FragmentActivity r12, X.AnonymousClass0iw r13, com.instagram.common.session.UserSession r14, X.N4P r15, boolean r16) {
        /*
            boolean r11 = X.N4P.A05(r15)
            if (r11 == 0) goto L_0x0072
            java.lang.String r6 = r15.A0P
        L_0x0008:
            X.2HN r2 = X.2HM.A00(r14)
            X.2HR r0 = r2.A03
            boolean r10 = X.DbX.A1Z(r0)
            X.0eM r0 = r15.A0c
            java.util.List r1 = X.JTO.A15(r0)
            X.2HR r0 = r2.A0B
            boolean r9 = X.DbX.A1Z(r0)
            r4 = 0
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0q(r1, r4)
            java.util.Iterator r8 = r1.iterator()
        L_0x0027:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r3 = r8.next()
            r0 = r3
            X.N9q r0 = (X.C68303N9q) r0
            com.instagram.user.model.User r7 = r0.A00
            int r1 = r7.A00()
            r5 = 1
            if (r1 == r5) goto L_0x0044
            r0 = 2
            if (r1 == r0) goto L_0x0044
            r0 = 4
            if (r1 == r0) goto L_0x0044
            goto L_0x0027
        L_0x0044:
            boolean r1 = r7.A29()
            boolean r0 = r7.A2A()
            if (r9 == 0) goto L_0x0056
            if (r1 != 0) goto L_0x0052
        L_0x0050:
            if (r0 == 0) goto L_0x0059
        L_0x0052:
            r2.add(r3)
            goto L_0x0027
        L_0x0056:
            if (r1 == 0) goto L_0x0059
            goto L_0x0050
        L_0x0059:
            if (r16 != 0) goto L_0x0052
            if (r11 != 0) goto L_0x0027
            boolean r0 = r7.A1c()
            if (r0 == 0) goto L_0x0027
            X.4Cl r0 = r7.A03
            java.lang.Boolean r0 = r0.COs()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r5)
            if (r0 != 0) goto L_0x0052
            if (r10 != 0) goto L_0x0027
            goto L_0x0052
        L_0x0072:
            r6 = 0
            goto L_0x0008
        L_0x0074:
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r1 = r2.iterator()
        L_0x007c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r1.next()
            X.N9q r0 = (X.C68303N9q) r0
            com.instagram.user.model.User r0 = r0.A00
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient r0 = X.OXK.A00(r0)
            r7.add(r0)
            goto L_0x007c
        L_0x0092:
            X.OZd r0 = X.C71026OZd.A00(r14)
            java.lang.Integer r0 = r0.A01
            int r5 = r0.intValue()
            java.lang.String r0 = "thread_details"
            X.1pE r3 = X.1pE.A01(r12, r13, r14, r0)
            X.3tH r2 = X.C254923tH.ACT
            com.instagram.direct.msys.subtype.MsysThreadSubtype$Standard r1 = com.instagram.direct.msys.subtype.MsysThreadSubtype.Standard.A00
            X.PIO r0 = new X.PIO
            r0.<init>(r2, r1, r7)
            r3.A0B = r0
            if (r6 == 0) goto L_0x00c1
            int r0 = r6.length()
            if (r0 < r5) goto L_0x00c1
            int r0 = r5 + -1
            java.lang.String r1 = X.C51967G9n.A0q(r6, r4, r0)
            r0 = 8230(0x2026, float:1.1533E-41)
            java.lang.String r6 = X.002.A0C(r1, r0)
        L_0x00c1:
            r3.A0j = r6
            r0 = 1
            r3.A0v = r0
            X.P4D r0 = new X.P4D
            r0.<init>(r12, r4)
            r3.A06 = r0
            r3.A06()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OPN.A00(androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, X.N4P, boolean):void");
    }
}
