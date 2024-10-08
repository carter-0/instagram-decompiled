package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

public final class NN8 extends C228042kh {
    public final UserSession A00;
    public final User A01;
    public final String A02;
    public final Map A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C67733Mtm(userSession, new C317986oA(userSession), this.A01, this.A02, this.A03);
    }

    public NN8(UserSession userSession, User user, String str, Map map) {
        C51974G9v.A1P(userSession, map, user, str);
        this.A00 = userSession;
        this.A03 = map;
        this.A01 = user;
        this.A02 = str;
    }
}
