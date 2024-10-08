package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Oze  reason: case insensitive filesystem */
public final class C72269Oze implements C250603lj {
    public static C230012om A04;
    public final UserSession A00;
    public final AnonymousClass0iw A01;
    public final String A02;
    public final AnonymousClass0eM A03;

    public C72269Oze(AnonymousClass0iw r2, UserSession userSession, String str, AnonymousClass0eM r5) {
        AnonymousClass7TG.A0w(1, userSession, str, r5);
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = str;
        this.A03 = r5;
    }

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        C230012om r1;
        AnonymousClass7TG.A1N(r6, r7);
        if (r7.CEk(r6) == AnonymousClass05K.A00) {
            if (A04 == null) {
                UserSession userSession = this.A00;
                if (!182.A06(0Tu.A05, userSession, 36330754694988547L)) {
                    A04 = new C230012om(this.A01, userSession);
                }
            }
            N4Q n4q = (N4Q) r6.A03;
            AnonymousClass6KM r4 = new AnonymousClass6KM("recommended_users_direct_inbox", DbS.A0q(n4q.A01), this.A02);
            String str = n4q.A02;
            if (str != null) {
                r4.A07 = str;
            }
            r4.A00 = n4q.A00;
            if (182.A06(0Tu.A05, this.A00, 36330754694988547L)) {
                r1 = (C230012om) this.A03.getValue();
            } else {
                r1 = A04;
                if (r1 == null) {
                    return;
                }
            }
            r1.A09(new AnonymousClass6KN(r4));
        }
    }
}
