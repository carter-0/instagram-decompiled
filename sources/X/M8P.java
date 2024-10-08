package X;

import com.instagram.common.session.UserSession;

public final class M8P implements Runnable {
    public final /* synthetic */ LP6 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public M8P(LP6 lp6, String str, boolean z) {
        this.A00 = lp6;
        this.A01 = str;
        this.A02 = z;
    }

    public final void run() {
        LP6 lp6 = this.A00;
        AnonymousClass4DH r4 = lp6.A08;
        UserSession userSession = lp6.A09;
        String str = this.A01;
        1NY A0O = DbU.A0O(userSession);
        A0O.A0A("nametag/nametag_lookup_by_name/{user_name}/");
        A0O.A9m("user_name", str);
        1OC A0S = DbT.A0S(A0O, CGA.class, D0R.class);
        A0S.A00 = new KAZ(lp6, str, this.A02);
        r4.schedule(A0S);
    }
}
