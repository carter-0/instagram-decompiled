package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;

public final class KDU extends C228042kh {
    public final UserSession A00;
    public final C273004lm A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60217Jha(this.A00, this.A01, this.A02);
    }

    public /* synthetic */ KDU(UserSession userSession) {
        String str;
        C273004lm A002 = C272994ll.A00(userSession);
        FanClubInfoDict B3v = DbX.A0m(userSession).B3v();
        if (B3v != null) {
            str = B3v.getFanClubId();
        } else {
            str = null;
        }
        AnonymousClass7TG.A1O(userSession, A002);
        this.A00 = userSession;
        this.A01 = A002;
        this.A02 = str;
    }
}
