package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4xV  reason: invalid class name and case insensitive filesystem */
public final class C278774xV {
    public final long A00;
    public final 1QP A01;
    public final UserSession A02;

    public static final boolean A00(C278774xV r3) {
        return 182.A06(0Tu.A05, r3.A02, 36319364441775284L);
    }

    public C278774xV(UserSession userSession) {
        this.A02 = userSession;
        1QP A002 = AnonymousClass1QO.A00(userSession);
        this.A01 = A002;
        this.A00 = A002.generateNewFlowId(760415659);
    }
}
