package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.93T  reason: invalid class name */
public final class AnonymousClass93T extends C270664h6 implements AnonymousClass93U {
    public String A00;
    public final String A01;
    public final UserSession A02;

    public AnonymousClass93T(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A01 = obj;
        String obj2 = UUID.randomUUID().toString();
        0qQ.A07(obj2);
        this.A00 = obj2;
    }

    public final void D3u(C52263GLe gLe) {
        0qQ.A0B(gLe, 0);
        boolean A03 = 1KU.A03(this.A02);
        if (!gLe.A0G) {
            return;
        }
        if (!A03 || gLe.A0C) {
            String obj = UUID.randomUUID().toString();
            0qQ.A0B(obj, 0);
            this.A00 = obj;
        }
    }

    public final String AmZ() {
        return this.A00;
    }

    public final String CFD() {
        return this.A01;
    }

    public final String getSessionId() {
        return this.A00;
    }
}
