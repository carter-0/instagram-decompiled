package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class ELD extends ED6 {
    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-1863685568);
        C48769Ejs.A00(this.A00, r4, 2131971435);
        AnonymousClass0fD.A0A(-1080325180, A03);
    }

    public final void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-118001082);
        1Xj r2 = this.A02;
        DbX.A1Q(r2, 0);
        UserSession userSession = this.A01;
        r2.AE7(userSession);
        User A2A = r2.A2A(userSession);
        A2A.getClass();
        A2A.A0Y();
        A2A.A0d(userSession);
        AnonymousClass0fD.A0A(-1407534451, A03);
    }
}
