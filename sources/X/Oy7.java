package X;

import com.instagram.common.session.UserSession;

public final class Oy7 implements AnonymousClass0lh {
    public final 0wc A00;
    public final UserSession A01;

    public final void A00(String str, String str2) {
        0qQ.A0B(str, 0);
        1Ln A0F = 1Ln.A0F(this.A00);
        if (DbT.A1Y(A0F)) {
            Dbb.A1G(A0F, this.A01);
            DbV.A1M(A0F, "jcs_accept_chat_limits");
            A0F.A0p("jcs_group_limit");
            Dba.A1E(A0F, "story");
            A0F.A0s(str);
            A0F.A0v(str2);
            A0F.Cgf();
        }
    }

    public final void onSessionWillEnd() {
        this.A01.A03(Oy7.class);
    }

    public Oy7(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = DbY.A0M(userSession).A00();
    }
}
