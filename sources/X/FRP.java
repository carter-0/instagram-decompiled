package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;

public abstract class FRP implements CallerContextable {
    public static final String __redex_internal_original_name = "CrosspostingDestinationUtil";

    @Deprecated(message = "Use Service Cache API")
    public static final C253663rB A00(UserSession userSession, User user) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        long currentTimeMillis = System.currentTimeMillis() - user.A01;
        if (user.A03.BMx() != null && currentTimeMillis > TimeUnit.HOURS.toMillis(24)) {
            C253653rA r2 = new C253653rA((AnonymousClass5Bm) null, (AnonymousClass4EU) null);
            user.A01 = System.currentTimeMillis();
            user.A03.EcE(r2);
            DbT.A1S(userSession, user);
            user.A0d(userSession);
            Integer num = AnonymousClass05K.A0O;
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("stale_destination_duration_in_ms", String.valueOf(currentTimeMillis));
            C378219Oy.A00(userSession2, false, num, (String) null, (String) null, A1E);
        }
        return user.A03.BMx();
    }

    public static final void A01(UserSession userSession, String str) {
        boolean A1X = DbW.A1X(userSession);
        C378219Oy.A00(userSession, Boolean.valueOf(A1X), AnonymousClass05K.A0A, str, (String) null, (Map) null);
    }
}
