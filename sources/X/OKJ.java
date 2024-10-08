package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.Set;

public final class OKJ {
    public final Map A00;
    public final Set A01;

    public final C74392Pu8 A00(OU2 ou2, 2FW r4) {
        Object obj;
        if (ou2.A0S && !this.A01.contains(r4)) {
            return new P2H(r4);
        }
        if (r4 == 2FW.A0s) {
            Map map = O4J.A00;
            Object value = ou2.A0F.getValue();
            if (value == null || !O4J.A00.containsKey(value)) {
                obj = 0Yt.A01(2FW.A17, this.A00);
                return (C74392Pu8) obj;
            }
        }
        obj = this.A00.get(r4);
        if (obj == null) {
            obj = new P2H(r4);
        }
        return (C74392Pu8) obj;
    }

    public OKJ(UserSession userSession) {
        2FW r3 = 2FW.A1g;
        0eP A1L = AnonymousClass7TE.A1L(r3, new Object());
        0eP A1L2 = AnonymousClass7TE.A1L(2FW.A0G, new Object());
        0eP A1L3 = AnonymousClass7TE.A1L(2FW.A0K, new Object());
        0eP A1L4 = AnonymousClass7TE.A1L(2FW.A1A, new P2G(userSession));
        0eP A1L5 = AnonymousClass7TE.A1L(2FW.A1k, new Object());
        0eP A1L6 = AnonymousClass7TE.A1L(2FW.A1b, new Object());
        0eP A1L7 = AnonymousClass7TE.A1L(2FW.A1j, new Object());
        2FW r2 = 2FW.A17;
        0eP A1L8 = AnonymousClass7TE.A1L(r2, new Object());
        2FW r1 = 2FW.A0s;
        this.A00 = 0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, AnonymousClass7TE.A1L(r1, new P2I(userSession))});
        this.A01 = 0sc.A07(new 2FW[]{r3, r2, r1});
    }
}
