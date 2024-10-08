package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.CrI  reason: case insensitive filesystem */
public abstract class C45155CrI {
    public static final void A00(UserSession userSession, String str) {
        User A01;
        0qQ.A0B(userSession, 0);
        17i A00 = 17h.A00(userSession);
        if (str != null) {
            A01 = A00.A02(str);
        } else {
            A01 = AnonymousClass0t1.A01.A01(userSession);
        }
        if (A01 != null) {
            1OC A002 = C45154CrH.A00(userSession);
            A002.A00 = new CHB(4, A00, A01);
            1ES.A03(A002);
        }
    }
}
