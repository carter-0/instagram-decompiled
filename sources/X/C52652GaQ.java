package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GaQ  reason: case insensitive filesystem */
public final class C52652GaQ implements JQ4 {
    public 0sL A00;
    public final UserSession A01;
    public final C51979GAc A02;

    public final void CJL(28D r5, 1Xj r6) {
        long j;
        Long A10;
        0sL r0 = this.A00;
        if (r0 != null) {
            r0.invoke(r6, r5);
        }
        UserSession userSession = this.A01;
        C51979GAc gAc = this.A02;
        0Aj A0M = C51972G9s.A0M(gAc, userSession);
        if (A0M.isSampled()) {
            AnonymousClass93T A002 = C51979GAc.A00(A0M, gAc, "use_template_tap");
            String A2n = r6.A2n();
            if (A2n == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A18(A0M, j);
            C51965G9l.A1H(A0M, C51974G9v.A0U(r6));
            A0M.A8M(XSE.TEMPLATE, "midcard_type");
            C51965G9l.A1R(A0M, A002.A00);
            A0M.Cgf();
        }
    }

    public C52652GaQ(UserSession userSession, C51979GAc gAc) {
        this.A02 = gAc;
        this.A01 = userSession;
    }

    public final void EbD(0sL r1) {
        this.A00 = r1;
    }
}
