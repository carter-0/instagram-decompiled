package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Us  reason: invalid class name and case insensitive filesystem */
public final class C308556Us {
    public static final C308556Us A00 = new Object();

    public static final int A00(UserSession userSession, C242373Tu r4) {
        0qQ.A0B(userSession, 0);
        if (A0F(userSession, r4)) {
            return 604800;
        }
        return (int) 182.A01(0Tu.A05, userSession, 36601792901091672L);
    }

    public static final C254923tH A01(UserSession userSession, C242373Tu r2) {
        0qQ.A0B(userSession, 0);
        if (A0U(r2)) {
            return C254923tH.DJANGO;
        }
        if (A0K(userSession, r2) || (r2 != null && (r2.A04.A01 & 64) > 0)) {
            return C254923tH.ACT;
        }
        return null;
    }

    public static final boolean A03(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!182.A06(0Tu.A05, userSession, 36320317927465245L)) {
            1Av A002 = 1Au.A00(userSession);
            if (!((Boolean) A002.A13.CDM(A002, 1Av.A8a[2])).booleanValue()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A06(UserSession userSession) {
        if (A05(userSession)) {
            return 182.A06(0Tu.A05, userSession, 2342163327137947908L);
        }
        return false;
    }

    public static final boolean A08(UserSession userSession, AnonymousClass7SD r3) {
        C272964li r0;
        0qQ.A0B(userSession, 0);
        if (r3 == null || (r0 = r3.A0N) == null || !r0.A08 || !A05(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A09(UserSession userSession, AnonymousClass7SD r6) {
        0qQ.A0B(r6, 1);
        return A0L(userSession, r6.A0H, A0W(r6.A0b, r6.A0r, r6.A0y, r6.A0o, r6.A1G));
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0A(com.instagram.common.session.UserSession r3, X.AnonymousClass7SD r4, java.lang.String r5) {
        /*
            r2 = 1
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0qQ.A0B(r4, r2)
            r0 = 3
            X.0qQ.A0B(r5, r0)
            boolean r1 = A08(r3, r4)
            boolean r0 = r4.A14
            if (r0 != 0) goto L_0x0043
            r0 = 340(0x154, float:4.76E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0035
            boolean r0 = A0C(r3, r4, r2)
            if (r0 == 0) goto L_0x0043
            r0 = 914(0x392, float:1.281E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0036
            if (r1 != 0) goto L_0x0043
        L_0x0034:
            r1 = 1
        L_0x0035:
            return r1
        L_0x0036:
            r0 = 913(0x391, float:1.28E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0043
            goto L_0x0034
        L_0x0043:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308556Us.A0A(com.instagram.common.session.UserSession, X.7SD, java.lang.String):boolean");
    }

    public static final boolean A0B(UserSession userSession, AnonymousClass7SD r2, boolean z) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r2, 2);
        if (A0C(userSession, r2, z)) {
            return true;
        }
        if (!A08(userSession, r2) || r2.A14) {
            return false;
        }
        return true;
    }

    public static final boolean A0E(UserSession userSession, C242373Tu r4) {
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 36320317926351124L) || A0I(userSession, r4)) {
            return true;
        }
        return false;
    }

    public static final boolean A0F(UserSession userSession, C242373Tu r2) {
        0qQ.A0B(userSession, 0);
        if (A0K(userSession, r2) || A0G(userSession, r2)) {
            return true;
        }
        return false;
    }

    public static final boolean A0I(UserSession userSession, C242373Tu r5) {
        0qQ.A0B(userSession, 0);
        if (r5 != null && !A03(userSession) && !A0H(userSession, r5) && A0U(r5) && C377839Nl.A00(userSession).booleanValue() && A0G(userSession, r5) && 182.A06(0Tu.A05, userSession, 2342168674372301938L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0L(UserSession userSession, C242373Tu r6, boolean z) {
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36320317927465245L) || !z || !A05(userSession) || r6 == null || (r6.A04.A01 & 576) <= 0 || C331057Pi.A02(r6)) {
            return false;
        }
        if (!A03(userSession)) {
            if (!182.A06(r2, userSession, 36320317927203098L) && (r6.A04.A01 & 1024) <= 0) {
                return false;
            }
            1Av A002 = 1Au.A00(userSession);
            A002.A13.Epx(A002, true, 1Av.A8a[2]);
        }
        return true;
    }

    public static final boolean A0M(UserSession userSession, AnonymousClass2Es r3) {
        return r3 != null && r3.Axj() && A05(userSession);
    }

    public static final boolean A0O(UserSession userSession, AnonymousClass2Ep r3) {
        0qQ.A0B(userSession, 0);
        return A0L(userSession, r3.AiM(), A0P(userSession, r3));
    }

    public static final boolean A0Q(UserSession userSession, AnonymousClass2Ep r4) {
        0qQ.A0B(r4, 1);
        if (!A0P(userSession, r4)) {
            return false;
        }
        if (182.A06(0Tu.A05, userSession, 2342163327138734346L) || A0O(userSession, r4) || C377839Nl.A00(userSession).booleanValue()) {
            return true;
        }
        return false;
    }

    public static final boolean A0S(UserSession userSession, AnonymousClass7S7 r6) {
        1Av A002 = 1Au.A00(userSession);
        C254783t2 C6c = r6.C6c();
        0qQ.A07(C6c);
        boolean z = C6c instanceof C254773t1;
        AnonymousClass7SD C6Q = r6.C6Q();
        0qQ.A07(C6Q);
        if (A0C(userSession, C6Q, z) && !A08(userSession, r6.C6Q())) {
            0xa r62 = A002.A01;
            if (r62.getInt("direct_dm_mode_display_count", 0) >= 3 || TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - r62.getLong("direct_dm_mode_seen_timestamp_ms", 0)) < 1) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0W(List list, boolean z, boolean z2, boolean z3, boolean z4) {
        User user;
        0qQ.A0B(list, 3);
        if (z || z2 || z3 || (user = (User) 00k.A0N(list)) == null || user.A2R() || user.CPV() || user.isRestricted() || z4) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 2342163327141290271L) || 182.A06(r2, userSession, 36320317928513829L)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession) {
        if (182.A06(0Tu.A05, userSession, 2342163327137882371L) || C377839Nl.A00(userSession).booleanValue()) {
            return true;
        }
        return false;
    }

    public static final boolean A07(UserSession userSession, AnonymousClass7SD r4) {
        if (182.A06(0Tu.A05, userSession, 2342163327138734346L) || A09(userSession, r4) || C377839Nl.A00(userSession).booleanValue()) {
            return true;
        }
        return false;
    }

    public static final boolean A0D(UserSession userSession, AnonymousClass7SD r6, boolean z) {
        if (!z) {
            return false;
        }
        if (!A0W(r6.A0b, r6.A0r, r6.A0y, r6.A0o, r6.A1G)) {
            return false;
        }
        C242373Tu r1 = r6.A0H;
        if (A0H(userSession, r1) || A0G(userSession, r1)) {
            return true;
        }
        return false;
    }

    public static final boolean A0K(UserSession userSession, C242373Tu r4) {
        if (182.A06(0Tu.A05, userSession, 36322890609732248L)) {
            return true;
        }
        if (r4 == null || (r4.A04.A01 & 512) <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean A0N(UserSession userSession, AnonymousClass2Ep r4) {
        Long l;
        C272964li Axk;
        if (r4 == null || (Axk = r4.Axk()) == null) {
            l = null;
        } else {
            l = Axk.A04;
        }
        boolean z = false;
        if (l != null) {
            z = true;
        }
        if (!C283115Ge.A00(userSession).A01() || !A0T(userSession, z)) {
            return false;
        }
        return true;
    }

    public static final boolean A0T(UserSession userSession, boolean z) {
        if (!z || !182.A06(0Tu.A05, userSession, 36320317927858464L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0U(C242373Tu r1) {
        if (r1 == null || (r1.A04.A01 & C249703kE.FLAG_MOVED) <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean A0V(N4P n4p) {
        boolean A002 = OPx.A00(n4p.A0A);
        boolean z = n4p.A0n;
        boolean z2 = false;
        if (n4p.A09 == 1012) {
            z2 = true;
        }
        List<C68303N9q> A09 = n4p.A09();
        ArrayList arrayList = new ArrayList(0Yv.A1E(A09, 10));
        for (C68303N9q n9q : A09) {
            arrayList.add(n9q.A00);
        }
        return A0W(arrayList, A002, z, z2, C66640Ma9.A06((List) n4p.A0a.getValue(), n4p.A0C(), A002));
    }

    public static final boolean A04(UserSession userSession) {
        if (!A05(userSession) || !182.A06(0Tu.A05, userSession, 36323981531295378L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0C(UserSession userSession, AnonymousClass7SD r4, boolean z) {
        if (!A0D(userSession, r4, z) || r4.A0x || r4.A14) {
            return false;
        }
        if (!C331057Pi.A02(r4.A0H) || !182.A06(0Tu.A05, userSession, 2342163327140962587L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0G(UserSession userSession, C242373Tu r4) {
        if (!A0U(r4) || !182.A06(0Tu.A05, userSession, 2342168674372301938L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0H(UserSession userSession, C242373Tu r3) {
        if (!A06(userSession)) {
            return false;
        }
        if ((r3 == null || (r3.A04.A01 & 64) <= 0) && !A0K(userSession, r3)) {
            return false;
        }
        return true;
    }

    public static final boolean A0J(UserSession userSession, C242373Tu r2) {
        if (A0H(userSession, r2) || A0G(userSession, r2)) {
            return true;
        }
        return false;
    }

    public static final boolean A0P(UserSession userSession, AnonymousClass2Ep r8) {
        boolean CUG = r8.CUG();
        boolean CVr = r8.CVr();
        boolean COb = r8.COb();
        if (!A0W(r8.BRZ(), CUG, CVr, COb, C66640Ma9.A06(r8.BRZ(), r8.isPending(), r8.CUG())) || !A05(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A0R(UserSession userSession, AnonymousClass7S7 r7) {
        AnonymousClass7SD C6Q = r7.C6Q();
        C254783t2 C6c = r7.C6c();
        0qQ.A07(C6c);
        if (C6c instanceof C254773t1) {
            if (!A0W(C6Q.A0b, C6Q.A0r, C6Q.A0y, C6Q.A0o, C6Q.A1G) || !A05(userSession)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
