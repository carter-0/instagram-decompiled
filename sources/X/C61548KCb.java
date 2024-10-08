package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KCb  reason: case insensitive filesystem */
public final class C61548KCb extends C228042kh {
    public final UserSession A00;
    public final String A01;

    public C61548KCb(UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        return new C60282Jid((KWY) userSession.A01(KWY.class, MKH.A00), C63397KwI.A00(userSession), this.A01);
    }
}
