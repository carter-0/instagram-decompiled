package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public abstract class AB7 {
    public static final void A01(1Ef r4, UserSession userSession, Integer num) {
        int intValue = num.intValue();
        int i = 0;
        if (intValue == 0) {
            TimeUnit timeUnit = TimeUnit.MINUTES;
            0Tu r2 = 0Tu.A05;
            A00(r4, r2, userSession, timeUnit);
            i = (int) 182.A01(r2, userSession, 36599426374700557L);
        } else if (intValue == 1) {
            A00(r4, 0Tu.A05, userSession, TimeUnit.MINUTES);
        } else if (intValue != 2) {
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            0Tu r22 = 0Tu.A05;
            A00(r4, r22, userSession, timeUnit2);
            r4.setNetworkTimeoutSeconds((int) 182.A01(r22, userSession, 36599426374700557L));
            r4.setCacheFallbackByDuration_EXPERIMENTAL(4000);
            return;
        } else {
            r4.setEnsureCacheWrite(true);
            return;
        }
        r4.setNetworkTimeoutSeconds(i);
    }

    public static void A00(1Ef r3, 0Tu r4, 0lg r5, TimeUnit timeUnit) {
        r3.setMaxToleratedCacheAgeMs(timeUnit.toMillis(182.A01(r4, r5, 36599426373979659L)));
        r3.setFreshCacheAgeMs(TimeUnit.SECONDS.toMillis(182.A01(r4, r5, 36599426374045196L)));
    }
}
