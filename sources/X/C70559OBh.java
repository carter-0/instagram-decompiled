package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;

/* renamed from: X.OBh  reason: case insensitive filesystem */
public final class C70559OBh {
    public final LruCache A00 = new LruCache(2);
    public final UserSession A01;

    public C70559OBh(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }
}
