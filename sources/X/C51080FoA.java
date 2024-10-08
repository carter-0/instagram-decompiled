package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FoA  reason: case insensitive filesystem */
public final class C51080FoA implements C51887G6c {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass3FW A01;
    public final /* synthetic */ String A02;

    public C51080FoA(UserSession userSession, AnonymousClass3FW r2, String str) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = str;
    }

    public final void Dol(boolean z) {
        UserSession userSession = this.A00;
        C46359DdX.A06(userSession);
        Dba.A1J(AnonymousClass1Nd.A00(userSession), true);
        AnonymousClass0iw r0 = C46359DdX.A00;
        AnonymousClass7TG.A1N(userSession, r0);
        new DcM(r0, userSession).A04(Dba.A0Q(this.A01), (Boolean) null, (Long) null, (Long) null, (Long) null, this.A02, true, false);
    }
}
