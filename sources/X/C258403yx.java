package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3yx  reason: invalid class name and case insensitive filesystem */
public final class C258403yx {
    public final 02m A00;
    public final UserSession A01;
    public final boolean A02;

    public static final void A00(C258403yx r2, 1Xj r3) {
        02m r22;
        String A07 = C231122qu.A07(r2.A01, r3);
        if (A07 != null && !00l.A0W(A07) && (r22 = r2.A00) != null) {
            r22.markerAnnotate(1056313521, "ad_id", A07);
        }
    }

    public final void A01(C62320sa r3) {
        if (this.A02) {
            0KC.A0D("cta_bar_misclick", (String) r3.invoke());
        }
    }

    public C258403yx(UserSession userSession) {
        02m r0;
        this.A01 = userSession;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36323393122086018L);
        this.A02 = A06;
        if (A06) {
            r0 = 02m.A0p;
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }
}
