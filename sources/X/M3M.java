package X;

import com.instagram.api.schemas.GenAIMagicModNotificationType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class M3M implements Runnable {
    public final /* synthetic */ UserSession A00;

    public M3M(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void run() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        UserSession userSession = this.A00;
        1Av A002 = 1Au.A00(userSession);
        0s0 r1 = A002.A5a;
        AnonymousClass0YZ[] r2 = 1Av.A8a;
        if (AnonymousClass7TG.A1a(A002, r1, r2, 472)) {
            if (!AnonymousClass7TG.A1a(A002, A002.A5n, r2, 473) && C364778lz.A00(userSession).booleanValue()) {
                A1C.add(GenAIMagicModNotificationType.BACKDROP);
            }
            if (!AnonymousClass7TG.A1a(A002, A002.A5o, r2, 474) && C364768ly.A00(userSession).booleanValue()) {
                A1C.add(GenAIMagicModNotificationType.RESTYLE);
            }
            if (!A1C.isEmpty()) {
                AnonymousClass7TE.A1Z(MHJ.A02(A002, A1C, userSession, (AnonymousClass4D7) null, 46), AnonymousClass1HX.A02(1879881788, 3));
            }
        }
    }
}
