package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GEw  reason: case insensitive filesystem */
public final class C52102GEw implements JR7 {
    public 0sS A00;
    public 0sP A01;
    public 0sE A02;
    public final UserSession A03;
    public final GGS A04;
    public final C51979GAc A05;
    public final AnonymousClass93T A06;

    public C52102GEw(UserSession userSession, GGS ggs, C51979GAc gAc, AnonymousClass93T r5) {
        0qQ.A0B(r5, 4);
        this.A04 = ggs;
        this.A03 = userSession;
        this.A05 = gAc;
        this.A06 = r5;
    }

    public final void CIA(C267324bN r13, C52058GDe gDe, 2EG r15) {
        C267324bN r3 = r13;
        C52058GDe gDe2 = gDe;
        2EG r9 = r15;
        C51973G9u.A1E(r13, gDe, r15);
        0sE r2 = this.A02;
        if (r2 != null) {
            Integer A052 = C52058GDe.A05(gDe);
            Float valueOf = Float.valueOf(-1.0f);
            r2.invoke(r3, gDe2, A052, valueOf, valueOf, (Object) null, r9, false, (Boolean) null);
        }
    }

    public final void CIM(C267324bN r23, C52058GDe gDe, boolean z) {
        long j;
        Long l;
        String attributionAppId;
        Long A10;
        C267324bN r5 = r23;
        C52058GDe gDe2 = gDe;
        AnonymousClass7TF.A1H(r5, gDe2);
        1Xj r0 = r5.A02;
        if (r0 != null) {
            0sS r4 = this.A00;
            if (r4 != null) {
                r4.CNs(r5, gDe2, r5.A08(this.A03), AnonymousClass3ZC.A01(r5), (Object) null, (Object) null, "attribution_row_business_category", (Object) null, (Object) null, (Object) null, (Object) null, false, Boolean.valueOf(z), (Object) null, (Object) null, (Object) null, (Object) null);
            }
            C51979GAc gAc = this.A05;
            UserSession userSession = this.A03;
            AnonymousClass93T r9 = this.A06;
            String A2n = r0.A2n();
            if (A2n == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            DUF A0j = C51965G9l.A0j(r0);
            if (A0j == null || (attributionAppId = A0j.getAttributionAppId()) == null) {
                l = null;
            } else {
                l = AnonymousClass7TE.A10(attributionAppId);
            }
            C52086GEg.A07(AnonymousClass5OC.ATTRIBUTE_PILLS, C52236GKd.A0L, gAc, userSession, r9, (Integer) null, l, C51974G9v.A0T(userSession, r0), DbT.A0x(r0), gDe2.A09(), j);
        }
    }

    public final void CIu(C52236GKd gKd, C267324bN r11, C52058GDe gDe) {
        C52236GKd gKd2 = gKd;
        C267324bN r2 = r11;
        AnonymousClass7TG.A1T(r11, gDe, gKd);
        1Xj r5 = r11.A02;
        if (r5 != null) {
            C52086GEg.A06(AnonymousClass5OC.ATTRIBUTE_PILLS, gKd2, r2, this.A05, this.A03, r5, this.A06, (Integer) null, gDe.A09());
        }
    }

    public final void CIN(C267324bN r13, C52058GDe gDe) {
        long j;
        Long l;
        String attributionAppId;
        Long A10;
        AnonymousClass7TG.A1N(r13, gDe);
        1Xj r1 = r13.A02;
        if (r1 != null) {
            0sP r0 = this.A01;
            if (r0 != null) {
                r0.invoke(r13);
            }
            C51979GAc gAc = this.A05;
            UserSession userSession = this.A03;
            AnonymousClass93T r4 = this.A06;
            String A2n = r1.A2n();
            if (A2n == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            DUF A0j = C51965G9l.A0j(r1);
            if (A0j == null || (attributionAppId = A0j.getAttributionAppId()) == null) {
                l = null;
            } else {
                l = AnonymousClass7TE.A10(attributionAppId);
            }
            C52086GEg.A07(AnonymousClass5OC.ATTRIBUTE_PILLS, C52236GKd.A0M, gAc, userSession, r4, (Integer) null, l, C51974G9v.A0T(userSession, r1), DbT.A0x(r1), gDe.A09(), j);
        }
    }

    public final void Eb1(0sE r1) {
        this.A02 = r1;
    }

    public final void Eb8(0sS r1) {
        this.A00 = r1;
    }

    public final void Eb9(0sP r1) {
        this.A01 = r1;
    }
}
