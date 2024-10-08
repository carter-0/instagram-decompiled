package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KDc  reason: case insensitive filesystem */
public final class C61575KDc extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C313666go A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        C313786h0 r0 = C313776gz.A0K;
        UserSession userSession = this.A01;
        C313666go r3 = this.A02;
        C313776gz A002 = r0.A00(userSession, r3);
        return new C60218Jhb(this.A00, userSession, r3, A002.A01(), A002.A04, A002.A03());
    }

    public C61575KDc(AnonymousClass0iw r1, UserSession userSession, C313666go r3) {
        AnonymousClass7TG.A1P(userSession, r3);
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = r3;
    }
}
