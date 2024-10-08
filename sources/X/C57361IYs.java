package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.IYs  reason: case insensitive filesystem */
public final class C57361IYs implements 1Ky {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C20695WxR(this, 12));
    public final Map A02;

    public final void EEc(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A02;
        if (map.containsKey(str)) {
            map.remove(str);
        }
    }

    public final void AAG(AnonymousClass9IV r5) {
        C254383sO r3 = C254383sO.A00;
        if (C254383sO.A00(r5)) {
            AnonymousClass3KZ r2 = AnonymousClass3KY.A00;
            UserSession userSession = this.A00;
            if (AnonymousClass3KZ.A01(userSession) || AnonymousClass3KZ.A00(userSession)) {
                r3.A01(r5, (AnonymousClass3DW) this.A01.getValue());
                if (r2.A02((AnonymousClass9J4) r5.A01, userSession)) {
                    return;
                }
            }
        }
        this.A02.put(((AnonymousClass9J4) r5.A01).A06, r5);
    }

    public final List Ab0() {
        return 00k.A0a(this.A02.values());
    }

    public C57361IYs(UserSession userSession, Map map) {
        this.A00 = userSession;
        this.A02 = map;
    }
}
