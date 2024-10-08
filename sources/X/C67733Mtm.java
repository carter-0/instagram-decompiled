package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Mtm  reason: case insensitive filesystem */
public final class C67733Mtm extends 2YL {
    public final UserSession A00;
    public final C317986oA A01;
    public final User A02;
    public final String A03;
    public final Map A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;

    public C67733Mtm(UserSession userSession, C317986oA r9, User user, String str, Map map) {
        0qQ.A0B(userSession, 1);
        C51973G9u.A0r(3, map, user, str);
        this.A00 = userSession;
        this.A01 = r9;
        this.A04 = map;
        this.A02 = user;
        this.A03 = str;
        02z A10 = DbS.A10(new C68173N3o("", 0, 0, true, false, false));
        this.A05 = A10;
        this.A06 = 10b.A03(A10);
    }
}
