package X;

import com.instagram.common.session.UserSession;

public abstract class ELQ extends DdO {
    public AnonymousClass6VJ A00;
    public final C227812jx A01;
    public final UserSession A02;
    public final AnonymousClass3BQ A03 = AnonymousClass3BQ.DISCOVER_PEOPLE;
    public final AnonymousClass32A A04;
    public final String A05 = AnonymousClass7TG.A0j();
    public final String A06 = AnonymousClass7TG.A0j();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ELQ(C227812jx r3, AnonymousClass0iw r4, UserSession userSession) {
        super(r3.requireActivity(), r4, userSession);
        0qQ.A0B(userSession, 3);
        this.A01 = r3;
        this.A02 = userSession;
        this.A04 = new AnonymousClass32A(r3, userSession, DbV.A0f(r3));
    }
}
