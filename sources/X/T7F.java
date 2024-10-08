package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class T7F implements C61110lV, 0lm {
    public int A00;
    public final C238903Dw A01;
    public final UserSession A02;
    public final List A03 = AnonymousClass7TE.A1C();

    public static final int A00(List list, int i) {
        int A0C = Pxh.A0C(list, (double) i) - 1;
        if (A0C < 0 || A0C >= list.size()) {
            return -1;
        }
        return C51971G9r.A0I(list, A0C);
    }

    public T7F(C238903Dw r2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A02 = userSession;
        this.A01 = r2;
        14i.A05(this);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-891488963);
        if (AnonymousClass7TE.A1b(this.A03)) {
            0nY.A00().ATE(new C8786R9n(this));
        }
        AnonymousClass0fD.A0A(1241492679, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(332003939, AnonymousClass0fD.A03(-1674877750));
    }

    public final void onUserSessionWillEnd(boolean z) {
        14i.A06(this);
    }
}
