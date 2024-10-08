package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3vL  reason: invalid class name and case insensitive filesystem */
public final class C256173vL implements C256163vK {
    public final UserSession A00;
    public final C231332rR A01;
    public final C233002un A02;
    public final C256163vK A03;

    public C256173vL(UserSession userSession, C256163vK r3, C231332rR r4, C233002un r5) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r4, 4);
        this.A03 = r3;
        this.A00 = userSession;
        this.A02 = r5;
        this.A01 = r4;
    }

    public final void D4f(C62320sa r2) {
        0qQ.A0B(r2, 0);
        this.A03.D4f(r2);
    }

    public final void D4g(1Xj r12, AnonymousClass3W1 r13, int i, boolean z) {
        16V r0;
        String id;
        1Xj r6 = r12;
        0qQ.A0B(r12, 0);
        AnonymousClass3W1 r7 = r13;
        0qQ.A0B(r13, 1);
        this.A03.D4g(r12, r13, i, z);
        Integer num = AnonymousClass05K.A0C;
        AnonymousClass3DY r8 = AnonymousClass3DY.COMMENT_BUTTON;
        C233002un r5 = this.A02;
        if (r5 == null) {
            return;
        }
        if (r5.A09(r12, r13, r8, num)) {
            C231332rR r4 = this.A01;
            UserSession userSession = this.A00;
            if ((182.A06(0Tu.A05, userSession, 36312879040824667L) || C228342lQ.A08(userSession, 1Au.A00(userSession))) && r12.A2R() != null) {
                id = r12.A2R();
            } else {
                id = r12.getId();
            }
            r5.A06(r6, r7, r8, (Integer) null, r4.BJU(id));
            return;
        }
        User CCd = r12.A0C.CCd();
        if (CCd != null) {
            r0 = CCd.A0J();
        } else {
            r0 = null;
        }
        if (r5.A08(r12, r13, r8, r0)) {
            r5.A05(r12, r13, r8, this.A01.BJU(r12.getId()));
        }
    }
}
