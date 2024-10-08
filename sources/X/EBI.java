package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EBI extends 1P0 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass789 A01;
    public final /* synthetic */ User A02;

    public EBI(UserSession userSession, AnonymousClass789 r2, User user) {
        this.A00 = userSession;
        this.A02 = user;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1947828624);
        C320136rp r8 = (C320136rp) obj;
        int A032 = AnonymousClass0fD.A03(-22111384);
        0qQ.A0B(r8, 0);
        UserSession userSession = this.A00;
        C294705mt A002 = C294695ms.A00(userSession);
        User user = this.A02;
        A002.A0C(r8, user, (String) null);
        Boolean bool = r8.A02;
        if (bool == null || !bool.booleanValue()) {
            AnonymousClass78A.A00(userSession, this.A01, user, "", false);
        }
        AnonymousClass0fD.A0A(1936947605, A032);
        AnonymousClass0fD.A0A(1969723991, A03);
    }
}
