package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.4cC  reason: invalid class name and case insensitive filesystem */
public final class C267784cC implements 2Ax {
    public final UserSession A00;
    public final 2Ay A01;

    public C267784cC(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        2Ay r1 = 2Ay.A0B;
        this.A01 = r1;
        2B0.A01.A06(userSession, r1);
    }

    public final AnonymousClass9IL Crb(Map map) {
        long j;
        0qQ.A0B(map, 0);
        UserSession userSession = this.A00;
        long A012 = new 2Cd(userSession).A01();
        boolean z = false;
        if (A012 > 0) {
            z = true;
        }
        if (!z) {
            return null;
        }
        0xY AR4 = 2B0.A01.A07(userSession).AR4();
        AR4.E5T(AnonymousClass000.A00(954), true);
        AR4.apply();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Object obj = map.get("session_adjustment_for_breaks");
        if ((obj instanceof Long) && 182.A01(0Tu.A05, userSession, 36595200126814286L) > 0) {
            Number number = (Number) obj;
            if (number.longValue() > A012) {
                A012 = 5;
            } else {
                j = (currentTimeMillis + A012) - number.longValue();
                return new AnonymousClass9IL(j, (Object) null, 3);
            }
        }
        j = currentTimeMillis + A012;
        return new AnonymousClass9IL(j, (Object) null, 3);
    }

    public final 2Ay CAd() {
        return this.A01;
    }
}
