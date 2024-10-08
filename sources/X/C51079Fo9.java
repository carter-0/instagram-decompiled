package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fo9  reason: case insensitive filesystem */
public final class C51079Fo9 implements C51887G6c {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public C51079Fo9(AnonymousClass0iw r1, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void Dol(boolean z) {
        UserSession userSession = this.A01;
        C46359DdX.A06(userSession);
        Dba.A1J(AnonymousClass1Nd.A00(userSession), true);
        AnonymousClass0iw r0 = this.A00;
        AnonymousClass7TG.A1N(userSession, r0);
        DcM dcM = new DcM(r0, userSession);
        F10 A03 = new AnonymousClass3FW(userSession).A03(2Aq.A03(userSession).A0O());
        String str = this.A02;
        if (str == null) {
            str = "unknown";
        }
        dcM.A04(A03, (Boolean) null, (Long) null, (Long) null, (Long) null, str, true, false);
    }
}
