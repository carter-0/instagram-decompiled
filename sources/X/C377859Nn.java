package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Nn  reason: invalid class name and case insensitive filesystem */
public abstract class C377859Nn {
    public static final boolean A00(UserSession userSession, AnonymousClass2Ep r9) {
        long j;
        0qQ.A0B(userSession, 0);
        if (r9 == null || r9.C6a() != 29) {
            return false;
        }
        FanClubInfoDict B3v = AnonymousClass7TF.A0Q(userSession).A03.B3v();
        if (B3v != null && B3v.getFanClubId() != null) {
            return false;
        }
        0xa r3 = C314986jA.A00(userSession).A01;
        if (r3.getInt("messaging_led_broadcast_channels_impression_count", 0) >= 3 || r3.getLong("messaging_led_broadcast_channels_last_seen_timestamp", 0) >= System.currentTimeMillis() - TimeUnit.DAYS.toMillis(7)) {
            return false;
        }
        C254703su BKv = r9.BKv();
        if (BKv != null) {
            j = AnonymousClass7TE.A0P(BKv.C7c());
        } else {
            j = 0;
        }
        if (j <= System.currentTimeMillis() - 1000 || !182.A06(0Tu.A05, userSession, 36328542786633124L)) {
            return false;
        }
        return true;
    }
}
