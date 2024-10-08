package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class H6Y extends C228042kh {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public H6Y(UserSession userSession, String str, String str2, List list) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = list;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        String str = this.A02;
        List list = this.A03;
        String str2 = this.A01;
        DbY.A1S(userSession, list);
        return new C53039GhV(userSession, new C57093IOh(AnonymousClass12T.A00, userSession, str, str2, list), str);
    }
}
