package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.WFm  reason: case insensitive filesystem */
public final class C18985WFm implements C20946X5p {
    public X2H A00;
    public final UserSession A01;
    public final /* synthetic */ 1ZN A02;

    public C18985WFm(1ZN r1, UserSession userSession) {
        this.A02 = r1;
        this.A01 = userSession;
    }

    public final X2H E4n() {
        X2H x2h = this.A00;
        if (x2h != null) {
            return x2h;
        }
        C18987WFo wFo = new C18987WFo(this, this.A02);
        this.A00 = wFo;
        return wFo;
    }

    public final C297775sJ E4q() {
        return this.A02.A00(this.A01);
    }
}
