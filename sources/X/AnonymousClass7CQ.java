package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7CQ  reason: invalid class name */
public final class AnonymousClass7CQ implements C327687Bu {
    public static final AnonymousClass7CR A01 = new Object();
    public final 0Ka A00;

    public final boolean ABE() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (X.AnonymousClass7CR.A01(r5) != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AFJ(com.instagram.common.session.UserSession r4, X.C254703su r5) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.7CR r1 = A01
            boolean r0 = X.AnonymousClass7CR.A02(r5)
            r2 = 1
            if (r0 != 0) goto L_0x0023
            boolean r0 = r1.A04(r5)
            if (r0 != 0) goto L_0x001a
            boolean r0 = X.AnonymousClass7CR.A01(r5)
            r1 = 0
            if (r0 == 0) goto L_0x001b
        L_0x001a:
            r1 = 1
        L_0x001b:
            boolean r0 = r5.CRd()
            if (r0 == 0) goto L_0x0024
            if (r1 == 0) goto L_0x0024
        L_0x0023:
            return r2
        L_0x0024:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7CQ.AFJ(com.instagram.common.session.UserSession, X.3su):boolean");
    }

    public final boolean AFO(C254703su r2) {
        0qQ.A0B(r2, 0);
        return AnonymousClass7CR.A01(r2);
    }

    public final boolean AFS(UserSession userSession, C254703su r8, int i) {
        String str;
        ImmutableList A0H;
        C254873tC r0;
        C254873tC r02;
        ImmutableList A012;
        AnonymousClass9JN r03;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r8, 1);
        AnonymousClass7CR r2 = A01;
        if (!AnonymousClass7CR.A02(r8)) {
            return false;
        }
        ImmutableList A0H2 = r8.A0H();
        if (A0H2 == null || A0H2.get(0) == null) {
            AnonymousClass7CR.A00();
            return false;
        }
        C254873tC r04 = (C254873tC) A0H2.get(0);
        if (r04 == null || !r04.A04() || r8.A2P || r2.A04(r8)) {
            return false;
        }
        ImmutableList A0H3 = r8.A0H();
        if (A0H3 == null || (r02 = (C254873tC) A0H3.get(0)) == null || (A012 = r02.A01()) == null || (r03 = (AnonymousClass9JN) 00k.A0J(A012)) == null) {
            str = null;
        } else {
            str = r03.A05;
        }
        if (0qQ.A0K(str, "xma_igd_pinned_location_sharing")) {
            return false;
        }
        if (i != 29 || ((r8.A0z == 2FW.A1g && 182.A06(0Tu.A05, userSession, 36319342967135374L)) || ((A0H = r8.A0H()) != null && !A0H.isEmpty() && (r0 = (C254873tC) A0H.get(0)) != null && r0.A02 == 9 && 182.A06(0Tu.A05, userSession, 36319342968249503L)))) {
            return true;
        }
        return false;
    }

    public final boolean AFY(C254703su r2) {
        return true;
    }

    public final boolean AFk(UserSession userSession, C254703su r4) {
        0qQ.A0B(r4, 1);
        if (r4.A0g() != null) {
            AnonymousClass7CR r1 = A01;
            if (!AnonymousClass7CR.A02(r4) || r4.A2P || r1.A04(r4)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean AFl(UserSession userSession, C254703su r5) {
        2FW r1;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r5, 1);
        if (r5.A1S() && 182.A06(0Tu.A05, userSession, 36323367350971505L)) {
            return true;
        }
        if ((r5.A10 == 2FW.A0y && !A01.A04(r5) && !AnonymousClass7CR.A01(r5)) || (r1 = r5.A10) == 2FW.A1I) {
            return true;
        }
        if (r1 != 2FW.A1E || !182.A06(0Tu.A05, userSession, 36313480336640029L)) {
            return false;
        }
        return true;
    }

    public final boolean AFm(UserSession userSession, C254703su r6) {
        ImmutableList A012;
        String str;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 1);
        if (r6.A1S() && 182.A06(0Tu.A05, userSession, 36323367350971505L)) {
            return true;
        }
        if (r6.A10 == 2FW.A0y) {
            ImmutableList A0H = r6.A0H();
            if (A0H == null || A0H.isEmpty()) {
                AnonymousClass7CR.A00();
            } else if (((C254873tC) A0H.get(0)).A02 == 8 && (A012 = ((C254873tC) A0H.get(0)).A01()) != null && !A012.isEmpty() && (str = ((AnonymousClass9JN) A012.get(0)).A02) != null && 00l.A0d(str, "daily_prompt", false) && !AnonymousClass7CR.A01(r6)) {
                return true;
            }
        }
        2FW r1 = r6.A10;
        if (r1 == 2FW.A1I) {
            return true;
        }
        if (r1 != 2FW.A1E || !182.A06(0Tu.A05, userSession, 36313480336640029L)) {
            return false;
        }
        return true;
    }

    public final boolean AFn(UserSession userSession, C254703su r3) {
        return false;
    }

    public final boolean AFp(C254703su r2) {
        0qQ.A0B(r2, 0);
        return A01.A03(r2);
    }

    public final boolean AFq(UserSession userSession, C254703su r6) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 1);
        if ((r6.A0z == 2FW.A1g && r6.A10 != 2FW.A0y) || r6.A1Q()) {
            return true;
        }
        AnonymousClass7CR r3 = A01;
        if (r3.A04(r6) && 182.A06(0Tu.A05, userSession, 36319342967921818L)) {
            return true;
        }
        if (!r3.A05(r6) || !182.A06(0Tu.A05, userSession, 36319342967987355L)) {
            return false;
        }
        return true;
    }

    public final boolean AG2(UserSession userSession, C254703su r4, int i) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 1);
        if (AnonymousClass7FL.A00(r4, userSession.A06)) {
            AnonymousClass7CR r1 = A01;
            if (!AnonymousClass7CR.A02(r4) || r1.A04(r4)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean AG3(C254703su r2) {
        0qQ.A0B(r2, 0);
        return A01.A03(r2);
    }

    public final String C1n(UserSession userSession, C254703su r7) {
        List list;
        C254873tC r1;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r7, 1);
        2FW r12 = r7.A10;
        if (r12 == 2FW.A1E || (r12 == 2FW.A1s && !r7.A1S() && 182.A06(0Tu.A05, userSession, 36322594256857379L))) {
            Object obj = r7.A1T;
            if (!(obj instanceof List) || (list = (List) obj) == null || list.isEmpty()) {
                return null;
            }
            Object obj2 = list.get(0);
            if (!(obj2 instanceof C254873tC) || (r1 = (C254873tC) obj2) == null) {
                return null;
            }
            return r1.A0u;
        } else if (r7.A0z == 2FW.A1g) {
            return r7.A1q;
        } else {
            return null;
        }
    }

    public final String CFp() {
        return "media_reshare_message";
    }

    public final boolean CPF() {
        return true;
    }

    public final boolean CRy(UserSession userSession) {
        return false;
    }

    public final boolean CS1(UserSession userSession, C254703su r4) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 1);
        AnonymousClass7CR r1 = A01;
        if (!AnonymousClass7CR.A02(r4) || !C3267277x.A00((1Av) this.A00.AXH(userSession)) || r1.A04(r4)) {
            return false;
        }
        return true;
    }

    public final boolean CS3(UserSession userSession, C254703su r4) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 1);
        AnonymousClass7CR r1 = A01;
        if (!AnonymousClass7CR.A02(r4) || !C3267277x.A01((1Av) this.A00.AXH(userSession)) || r1.A04(r4)) {
            return false;
        }
        return true;
    }

    public final boolean CSF(UserSession userSession, C254703su r4) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 1);
        AnonymousClass7CR r1 = A01;
        if (!AnonymousClass7CR.A02(r4) || !C3267277x.A02((1Av) this.A00.AXH(userSession)) || r1.A04(r4)) {
            return false;
        }
        return true;
    }

    public final boolean CdO() {
        return true;
    }

    public final boolean Ce6(C254713sv r2) {
        0qQ.A0B(r2, 0);
        return !r2.CRd();
    }

    public AnonymousClass7CQ() {
        AnonymousClass7CS r1 = AnonymousClass7CS.A00;
        0qQ.A0B(r1, 1);
        this.A00 = r1;
    }

    public final boolean CVT(UserSession userSession, C254703su r4) {
        if (r4 != null) {
            AnonymousClass7CR r1 = A01;
            if (!AnonymousClass7CR.A02(r4) || r1.A04(r4)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
