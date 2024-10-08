package X;

import android.util.LruCache;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.A6a  reason: case insensitive filesystem */
public final class C39709A6a {
    public final LruCache A00 = new LruCache(100);
    public final AwakeTimeSinceBootClock A01;
    public final Map A02;
    public final UserSession A03;

    public C39709A6a(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        0qQ.A07(awakeTimeSinceBootClock);
        this.A01 = awakeTimeSinceBootClock;
        this.A02 = AnonymousClass7TE.A1E();
    }
}
