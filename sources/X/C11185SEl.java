package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.SEl  reason: case insensitive filesystem */
public final class C11185SEl {
    public final long A00;
    public final 1QP A01;
    public final UserSession A02;

    public static final boolean A00(C11185SEl sEl) {
        return 182.A06(0Tu.A05, sEl.A02, 36322074565814199L);
    }

    public C11185SEl(UserSession userSession) {
        this.A02 = userSession;
        1QP A002 = AnonymousClass1QO.A00(userSession);
        this.A01 = A002;
        this.A00 = A002.generateNewFlowId(173998081);
    }
}
