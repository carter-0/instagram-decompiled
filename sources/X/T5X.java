package X;

import com.instagram.common.session.UserSession;

public final class T5X implements AnonymousClass1Ca {
    public final int A00;
    public final UserSession A01;

    public final boolean Est(int i) {
        return AnonymousClass20W.A02() || i % this.A00 == 0;
    }

    public final boolean isEnabled() {
        if (C246563eo.A00(this.A01).A02 || AnonymousClass20W.A02()) {
            return true;
        }
        return false;
    }

    public T5X(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = DbS.A04(0Tu.A05, userSession, 36594774924396367L);
    }
}
