package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class H4M extends 1P0 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C267064at A01;
    public final /* synthetic */ User A02;

    public H4M(UserSession userSession, C267064at r2, User user) {
        this.A01 = r2;
        this.A02 = user;
        this.A00 = userSession;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, -684262836);
        H4M.super.onFail(r5);
        C267064at.A02(this.A00, this.A01, this.A02);
        AnonymousClass0fD.A0A(-1512029069, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(-444467012);
        int A0D = AnonymousClass7TG.A0D(obj, 918476378);
        H4M.super.onSuccess(obj);
        C267064at r3 = this.A01;
        String A002 = AnonymousClass3ZA.A00(r3.A0D);
        User user = this.A02;
        if (!0qQ.A0K(A002, AnonymousClass3ZA.A00(user))) {
            i = 470381604;
        } else {
            C267064at.A02(this.A00, r3, user);
            i = -1033427885;
        }
        AnonymousClass0fD.A0A(i, A0D);
        AnonymousClass0fD.A0A(1531911615, A03);
    }
}
