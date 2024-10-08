package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;

public final class WT4 implements AnonymousClass0lh, AnonymousClass15X {
    public final LruCache A00 = new LruCache(50);
    public final UserSession A01;

    public WT4(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        AnonymousClass1K7.A00().EBn(this);
    }

    public final void FI1(1Jh r6) {
        LruCache lruCache = this.A00;
        if (lruCache.size() > 0) {
            if (182.A06(0Tu.A05, this.A01, 36323586394434836L)) {
                lruCache.evictAll();
            }
        }
    }

    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
