package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8KZ  reason: invalid class name */
public final class AnonymousClass8KZ {
    public final UserSession A00;

    public AnonymousClass8KZ(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final AnonymousClass3U9 A00(String str) {
        if (str != null) {
            return 2L2.A00(this.A00).A0N(str);
        }
        return null;
    }

    public final Long A01(String str) {
        C272964li Axk;
        Integer num;
        AnonymousClass3U9 A002 = A00(str);
        if (A002 == null || (Axk = A002.Axk()) == null || !Axk.A08 || (num = Axk.A02) == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis((long) num.intValue()));
    }
}
