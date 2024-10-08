package X;

import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

public final class KEQ extends C228042kh {
    public final long A00;
    public final UserSession A01;
    public final C61266K0b A02;
    public final Integer A03;
    public final String A04;
    public final boolean A05;

    public KEQ(UserSession userSession, C61266K0b k0b, Integer num, String str, long j, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A05 = z;
        this.A01 = userSession;
        this.A00 = j;
        this.A04 = str;
        this.A03 = num;
        this.A02 = k0b;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        if (!this.A05) {
            return new C61820KNj(new C63636L0y(this.A01), this.A00);
        }
        UserSession userSession = this.A01;
        C63635L0x l0x = new C63635L0x(C63305Kuo.A00(userSession));
        C50327FYh A002 = C63304Kun.A00(userSession);
        MonetizationRepository A003 = AnonymousClass2o3.A00(userSession);
        long j = this.A00;
        String str = this.A04;
        return new C61821KNk(userSession, this.A02, l0x, A002, A003, 1Au.A00(userSession), this.A03, str, j);
    }
}
