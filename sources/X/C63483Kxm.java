package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Kxm  reason: case insensitive filesystem */
public abstract class C63483Kxm {
    public static final C61064Jw2 A00(UserSession userSession, C63966LFs lFs) {
        0qQ.A0B(lFs, 0);
        17i A00 = 17h.A00(userSession);
        String str = lFs.A02;
        User A02 = A00.A02(str);
        if (A02 == null) {
            AnonymousClass441.A02.A02(userSession, (C330317Mh) null, str);
        }
        0qQ.A07(str);
        boolean z = lFs.A01;
        C62530KhM khM = lFs.A00;
        0qQ.A07(khM);
        return new C61064Jw2(A02, khM, str, z);
    }
}
