package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class IT6 implements C270594gz {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ C234042wt A02;
    public final /* synthetic */ C240253Ke A03;

    public IT6(1Xj r1, 1Xj r2, C234042wt r3, C240253Ke r4) {
        this.A02 = r3;
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = r4;
    }

    public final void A8S(C254523sc r4, AnonymousClass4DU r5, String str) {
        DbY.A1S(str, r4);
        UserSession userSession = this.A02.A0B;
        C271794jb r1 = new C271794jb(userSession, this.A01);
        r1.A00 = this.A00.A15(userSession);
        r1.A8S(r4, r5, str);
        User user = this.A03.A01;
        0qQ.A0B(user, 0);
        0jB A0k = C51965G9l.A0k();
        GU0.A00(A0k, user);
        r4.A0E(A0k);
    }
}
