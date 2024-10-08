package X;

import com.instagram.common.session.UserSession;

public final /* synthetic */ class AfE implements C336227eH {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AfE(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    public final 1OC AMt(String str) {
        return FGQ.A04(this.A00, "users/search/", str, this.A01, (String) null);
    }
}
