package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

public final class MZM implements Consumer {
    public final /* synthetic */ UserSession A00;

    public MZM(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        Iterator A0u = AnonymousClass7TF.A0u(((C3027765f) userSession.A01(C3027765f.class, new C73920Pm0(userSession, 31))).A00);
        while (A0u.hasNext()) {
            ((1K2) ((Map.Entry) A0u.next()).getValue()).set(C60340gF.A00);
        }
    }
}
