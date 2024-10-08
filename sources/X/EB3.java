package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EB3 extends 1P0 {
    public UserSession A00;
    public User A01;
    public Integer A02;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(942000989);
        int A032 = AnonymousClass0fD.A03(-1284177850);
        Integer num = this.A02;
        if (num == AnonymousClass05K.A0C) {
            throw AnonymousClass7TE.A11("onBusinessMegaphoneDismissed");
        }
        if (num == AnonymousClass05K.A05) {
            User user = this.A01;
            Boolean A0u = AnonymousClass7TE.A0u();
            user.A03.Eku(A0u);
            user.A03.Ekv(A0u);
            UserSession userSession = this.A00;
            user.A0d(userSession);
            DbT.A1S(userSession, user);
        }
        AnonymousClass0fD.A0A(1865576430, A032);
        AnonymousClass0fD.A0A(306640816, A03);
    }
}
