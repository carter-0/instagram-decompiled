package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EQA extends C252733pa {
    public final UserSession A00;
    public final C273004lm A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;

    public EQA(UserSession userSession, User user, String str, String str2) {
        super("Profile", AnonymousClass43D.A01(854803684, DbW.A03(1, userSession, str)));
        this.A00 = userSession;
        this.A02 = user;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = C272994ll.A00(userSession);
        02z A10 = DbS.A10(new C68171N3m(1, user.A25(), user.A24(), user.A23(), user.A22(), AnonymousClass7TG.A1X(user.A03.CTE())));
        this.A05 = A10;
        this.A06 = A10;
    }

    public static final void A00(EQA eqa) {
        Object value;
        User user;
        05G r2 = eqa.A05;
        do {
            value = r2.getValue();
            user = eqa.A02;
        } while (!r2.AIY(value, new C68171N3m(1, user.A25(), user.A24(), user.A23(), user.A22(), AnonymousClass7TG.A1X(user.A03.CTE()))));
    }

    public static final void A01(EQA eqa, String str) {
        UserSession userSession = eqa.A00;
        0xG A0O = DbS.A0O(eqa.A04);
        User user = eqa.A02;
        C319976rX.A06(A0O, userSession, DbV.A0e(user), str, user.getId(), eqa.A03);
    }
}
