package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.32W  reason: invalid class name */
public final class AnonymousClass32W {
    public boolean A00;
    public final UserSession A01;

    public AnonymousClass32W(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A00(AnonymousClass4DH r3, JOC joc, C55539HjL hjL, String str, Map map) {
        if (!this.A00) {
            this.A00 = true;
            C360678ey A05 = C359988do.A05(this.A01, str, map);
            A05.A00(new E83(r3, joc, this, hjL));
            r3.schedule(A05);
        }
    }
}
