package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class OZ5 {
    public static final OZ5 A00 = new Object();

    public static final C254703su A00(C2606546n r3, String str, long j) {
        AnonymousClass7TF.A1B(str, 0, r3);
        C254703su r1 = new C254703su();
        r1.A1C(DbV.A0s());
        r1.A1A(Long.valueOf(j));
        r1.A1D(str);
        if (r1.A2D) {
            r1.A2D = false;
            r1.A2C = true;
        }
        r1.A1m(AnonymousClass05K.A0j);
        r1.A17(2FW.A0G, r3);
        return r1;
    }

    public final AnonymousClass7LQ A01(UserSession userSession, AnonymousClass7SD r4, C2606546n r5, User user, long j) {
        0qQ.A0B(r5, 4);
        return new AnonymousClass7LQ(userSession, r4, A00(r5, user.getId(), j), user);
    }
}
