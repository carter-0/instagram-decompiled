package X;

import com.instagram.common.session.UserSession;

public final class AfO implements MUC {
    public final /* synthetic */ C363548ju A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public AfO(C363548ju r1, String str, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = str;
    }

    public final void DED() {
        C363548ju r1 = this.A00;
        String str = this.A01;
        boolean z = this.A02;
        Integer num = AnonymousClass05K.A00;
        UserSession userSession = r1.A01;
        AnonymousClass9Q7.A05(userSession, str, "server_setting_updated_failed", (String) null, C378169Ot.A01(num), C363558jv.A00(userSession), z);
        C39689A5f a5f = r1.A00;
        if (a5f != null) {
            C59689JTv.A0F(a5f.A00, AnonymousClass000.A00(287), 2131962363);
        }
    }

    public final void DoV(C383489ff r6) {
        C363548ju r4 = this.A00;
        boolean z = this.A02;
        C363548ju.A00(r4, AnonymousClass05K.A00, this.A01, z, AnonymousClass7TF.A1V(r6));
    }
}
