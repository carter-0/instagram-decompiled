package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.RvS  reason: case insensitive filesystem */
public final class C10633RvS {
    public final UserSession A00;
    public final 1vn A01;
    public final 0lg A02;

    public C10633RvS(0lg r3) {
        UserSession userSession;
        1vn A002;
        this.A02 = r3;
        boolean z = r3 instanceof UserSession;
        if (z) {
            userSession = (UserSession) r3;
        } else {
            userSession = null;
        }
        this.A00 = userSession;
        if (z) {
            A002 = 1vm.A01((UserSession) r3);
        } else {
            A002 = 1vm.A00((AnonymousClass0aP) r3);
        }
        this.A01 = A002;
    }
}
