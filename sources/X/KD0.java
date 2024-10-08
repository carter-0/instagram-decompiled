package X;

import com.instagram.common.session.UserSession;

public final class KD0 extends C228042kh {
    public final UserSession A00;
    public final C313666go A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        AnonymousClass6h3 r1;
        C313786h0 r0 = C313776gz.A0K;
        UserSession userSession = this.A00;
        C313666go r3 = this.A01;
        C313776gz A002 = r0.A00(userSession, r3);
        LES A02 = A002.A02();
        C59720JVe A03 = A002.A03();
        L5Q l5q = null;
        if ((A002 instanceof AnonymousClass6h3) && (r1 = (AnonymousClass6h3) A002) != null) {
            l5q = (L5Q) r1.A03.getValue();
        }
        return new C60171Jgq(r3, l5q, A02, A03, C278264wZ.A04(userSession), C278264wZ.A03(userSession));
    }

    public KD0(UserSession userSession, C313666go r2) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A00 = userSession;
        this.A01 = r2;
    }
}
