package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;

public final class L45 {
    public final LruCache A00 = new LruCache(10);
    public final UserSession A01;

    public L45(UserSession userSession) {
        this.A01 = userSession;
    }
}
