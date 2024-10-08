package X;

import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.Jgo  reason: case insensitive filesystem */
public final class C60169Jgo extends 2YL {
    public final UserSession A00;
    public final MonetizationRepository A01;
    public final C249513ju A02;
    public final AnonymousClass0r6 A03;
    public final 05G A04 = JTO.A1J();

    public C60169Jgo(UserSession userSession, MonetizationRepository monetizationRepository) {
        AnonymousClass7TG.A1O(userSession, monetizationRepository);
        this.A00 = userSession;
        this.A01 = monetizationRepository;
        1HR A0o = JTQ.A0o();
        this.A02 = A0o;
        this.A03 = 0u9.A04(A0o);
        UserSession userSession2 = this.A00;
        boolean A06 = 182.A06(0Tu.A06, userSession2, 36319106743409564L);
        boolean A062 = 182.A06(0Tu.A05, userSession2, 36315829685784142L);
        if (A06 || A062) {
            AnonymousClass7TE.A1Z(new MGK(this, (AnonymousClass4D7) null, 3, A06, A062), C318116oQ.A00(this));
        }
    }
}
