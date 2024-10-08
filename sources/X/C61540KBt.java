package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KBt  reason: case insensitive filesystem */
public final class C61540KBt extends C228042kh {
    public final UserSession A00;

    public C61540KBt(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        C39762A8c a8c = new C39762A8c(userSession);
        0qQ.A0B(userSession, 0);
        Context A0P = C51966G9m.A0P(userSession);
        return new C60150JgV(userSession, a8c, (AnonymousClass7Hf) userSession.A01(C65282Lqb.class, new C58208IoC(44, A0P, userSession, AnonymousClass7IC.A00(userSession), JTO.A0n(A0P, userSession))));
    }
}
