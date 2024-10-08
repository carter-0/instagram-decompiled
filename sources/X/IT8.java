package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class IT8 implements C270594gz {
    public final /* synthetic */ C267324bN A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass3W1 A02;
    public final /* synthetic */ User A03;

    public IT8(C267324bN r1, UserSession userSession, AnonymousClass3W1 r3, User user) {
        this.A00 = r1;
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = user;
    }

    public final void A8S(C254523sc r7, AnonymousClass4DU r8, String str) {
        DbY.A1S(str, r7);
        C267324bN r5 = this.A00;
        1Xj r4 = r5.A02;
        if (r4 != null) {
            UserSession userSession = this.A01;
            AnonymousClass3W1 r0 = this.A02;
            User user = this.A03;
            new C271794jb(userSession, r4, r0.A06()).A8S(r7, r8, str);
            if (user != null) {
                0jB A0k = C51965G9l.A0k();
                GU0.A00(A0k, user);
                r7.A0E(A0k);
            }
            if (r5.CcK()) {
                r7.A0K(userSession, r5.A06());
            }
        }
    }
}
