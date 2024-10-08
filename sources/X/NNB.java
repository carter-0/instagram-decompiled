package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

public final class NNB extends C228042kh {
    public final UserSession A00;
    public final DirectThreadKey A01;
    public final String A02;
    public final String A03;

    public NNB(UserSession userSession, DirectThreadKey directThreadKey, String str, String str2) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = directThreadKey;
        this.A02 = str;
        this.A03 = str2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C67746Mtz(userSession, C69911NuD.A00(userSession), this.A01, this.A02, this.A03);
    }
}
