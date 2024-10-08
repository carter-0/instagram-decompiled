package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FnC  reason: case insensitive filesystem */
public final class C51020FnC implements C330317Mh {
    public final int A00;
    public final Object A01;

    public C51020FnC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFail(C268654dm r3) {
        switch (this.A00) {
            case 1:
            case 2:
                ((AnonymousClass4D7) this.A01).resumeWith((Object) null);
                return;
            case 3:
                ((C46755Dki) this.A01).A04.Epw(EPG.A00);
                return;
            default:
                return;
        }
    }

    public final void onSuccess(User user) {
        switch (this.A00) {
            case 1:
            case 2:
                0qQ.A0B(user, 0);
                ((AnonymousClass4D7) this.A01).resumeWith(user);
                return;
            case 3:
                0qQ.A0B(user, 0);
                ((C46755Dki) this.A01).A03.Epw(new C49507Ewm(user, false));
                return;
            case 5:
                C47498E5d e5d = (C47498E5d) this.A01;
                e5d.A0E = true;
                if (e5d.A04 == null) {
                    UserSession userSession = e5d.A01;
                    1OC A02 = C320126ro.A02(userSession, user.getId(), DbW.A1S(1, user, userSession));
                    A02.A00 = new C47656EBq(1, e5d, user);
                    1ES.A03(A02);
                }
                e5d.A04 = user;
                C47498E5d.A01(e5d);
                return;
            default:
                0qQ.A0B(user, 0);
                DbT.A1S((UserSession) this.A01, user);
                return;
        }
    }
}
