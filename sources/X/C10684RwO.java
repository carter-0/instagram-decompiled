package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.RwO  reason: case insensitive filesystem */
public final class C10684RwO {
    public final long A00;
    public final 1QP A01;
    public final UserSession A02;
    public final AnonymousClass3Q2 A03;

    public C10684RwO(UserSession userSession, AnonymousClass3Q2 r5) {
        this.A02 = userSession;
        this.A03 = r5;
        1QP A002 = AnonymousClass1QO.A00(userSession);
        this.A01 = A002;
        this.A00 = A002.generateFlowId(356981044, r5.A35.hashCode());
    }
}
