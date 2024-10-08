package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KDb  reason: case insensitive filesystem */
public final class C61574KDb extends C228042kh {
    public final float A00;
    public final UserSession A01;
    public final C313666go A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        C313786h0 r2 = C313776gz.A0K;
        UserSession userSession = this.A01;
        return new C60181Jh0(r2.A00(userSession, this.A02).A03(), this.A00, C278264wZ.A03(userSession));
    }

    public C61574KDb(UserSession userSession, C313666go r2, float f) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A01 = userSession;
        this.A02 = r2;
        this.A00 = f;
    }
}
