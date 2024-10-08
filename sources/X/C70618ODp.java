package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ODp  reason: case insensitive filesystem */
public final class C70618ODp {
    public final P7X A00;
    public final AnonymousClass0eM A01;
    public final boolean A02;

    public C70618ODp(UserSession userSession, AnonymousClass7TO r12, AnonymousClass9HO r13, OFA ofa, AnonymousClass7L2 r15, C253023q5 r16, String str, boolean z) {
        AnonymousClass0eM r0;
        0qQ.A0B(r12, 4);
        this.A02 = z;
        C73917Pls pls = new C73917Pls(r15, r16, r12, r13, ofa, str, 3);
        0eO r1 = 0eO.A03;
        if (C331817Sm.A00(userSession)) {
            r0 = AnonymousClass0eN.A00(r1, pls);
        } else {
            r0 = new 1Ue(pls.invoke());
        }
        this.A01 = r0;
        this.A00 = new P7X(r15);
    }
}
