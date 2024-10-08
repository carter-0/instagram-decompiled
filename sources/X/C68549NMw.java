package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NMw  reason: case insensitive filesystem */
public final class C68549NMw extends C228042kh {
    public final UserSession A00;
    public final C254783t2 A01;

    public C68549NMw(UserSession userSession, C254783t2 r3) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        C254783t2 r3 = this.A01;
        2Dr A002 = 1bJ.A00(userSession);
        C254773t1 A02 = AnonymousClass6W3.A02(r3);
        0qQ.A0C(A02, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadId");
        String str = ((C254763t0) A02).A00;
        0qQ.A0B(str, 0);
        AnonymousClass3U9 A0N = A002.A0N(str);
        if (A0N != null) {
            return new C67736Mtp(userSession, A0N, r3);
        }
        throw AnonymousClass7TE.A0y();
    }
}
