package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class I40 {
    public static long A00;
    public static final I40 A01 = new Object();

    public static final boolean A00(UserSession userSession) {
        long max = Math.max(AnonymousClass7TE.A0q(userSession).getLong("world_pages_tooltip_last_seen_timestamp_ms", 0), A00);
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36329083952709406L) || ((long) DbT.A00(AnonymousClass7TE.A0q(userSession), "world_pages_tooltip_impression_count")) >= 182.A01(r2, userSession, 36610558929475634L)) {
            return false;
        }
        if (TimeUnit.MILLISECONDS.toDays(C51966G9m.A07(max)) > 1 || max == 0) {
            return true;
        }
        return false;
    }
}
