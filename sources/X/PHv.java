package X;

import com.instagram.common.session.UserSession;

public final class PHv implements C234222xL {
    public final /* synthetic */ C329067Hl A00;

    public final boolean Ds8(AnonymousClass5Gv r2) {
        return false;
    }

    public final void DsC(AnonymousClass5Gv r1) {
    }

    public final void DsE(AnonymousClass5Gv r1) {
    }

    public PHv(C329067Hl r1) {
        this.A00 = r1;
    }

    public final void DsH(AnonymousClass5Gv r8) {
        C329067Hl r6 = this.A00;
        UserSession userSession = r6.A1Z;
        AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession);
        AnonymousClass7TF.A1J(A002, A002.A0I, AnonymousClass4kA.A0c, 27, true);
        if (r6.A0W != null) {
            C313756gx A003 = C313746gw.A00(userSession);
            int AdN = r6.A0W.AdN();
            String C6C = r6.A0W.C6C();
            String C6k = r6.A0W.C6k();
            1Ln A0J = DbT.A0J(A003);
            if (DbT.A1Y(A0J)) {
                DbW.A17(A0J, A003);
                C66581MXm.A1I(A0J, "live_creation_option_rendered");
                A0J.A0p("go_live_tooltip");
                C66582MXn.A1C(A0J, A003, DbZ.A0b(A0J, "thread_view", C6C, C6k, AdN));
            }
        }
    }
}
