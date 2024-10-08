package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EC3 extends 1P0 {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C294705mt A02;
    public final /* synthetic */ User A03;

    public EC3(1P0 r1, UserSession userSession, C294705mt r3, User user) {
        this.A00 = r1;
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = user;
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, 1672211280);
        this.A00.onFail(r3);
        AnonymousClass0fD.A0A(-162095585, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-308341936);
        int A0D = AnonymousClass7TG.A0D(obj, 837768660);
        this.A00.onSuccess(obj);
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A01;
        r0.A01(userSession).A0e(this.A02.A02);
        this.A03.A0f(userSession);
        AnonymousClass0fD.A0A(385962513, A0D);
        AnonymousClass0fD.A0A(-1747601535, A032);
    }
}
