package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PRa  reason: case insensitive filesystem */
public final class C72967PRa implements G8B {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C333517Zg A01;

    public final void CyN() {
    }

    public final void D5S() {
    }

    public final void DED() {
    }

    public final void Doy() {
    }

    public final void onCancel() {
    }

    public C72967PRa(UserSession userSession, C333517Zg r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void onSuccess() {
        UserSession userSession = this.A00;
        String C6C = this.A01.C6l().C6C();
        String str = userSession.A06;
        0Aj A0e = AnonymousClass7TE.A0e(C66580MXl.A0N(new AnonymousClass0kM(userSession), "direct_thread"), "direct_thread_action");
        A0e.AAJ("sender_id", str);
        C66580MXl.A1J(A0e, C6C);
        DbV.A1G(A0e, "block_user");
    }
}
