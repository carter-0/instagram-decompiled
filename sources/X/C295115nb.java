package X;

import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.msys.util.NotificationScope;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5nb  reason: invalid class name and case insensitive filesystem */
public final class C295115nb implements C295125nc {
    public final AnonymousClass66d A00 = new C295135nd(this);
    public final SessionedNotificationCenter A01;
    public final Map A02 = new ConcurrentHashMap();

    public final NotificationScope A00(C295145ne r2, String str) {
        return EBU(r2, str, 1);
    }

    public final NotificationScope EBU(C295145ne r5, String str, int i) {
        NotificationScope notificationScope = new NotificationScope();
        this.A01.addObserver(this.A00, str, 1, notificationScope);
        this.A02.put(notificationScope, r5);
        return notificationScope;
    }

    public final void FIs(NotificationScope notificationScope, String str) {
        this.A02.remove(notificationScope);
        this.A01.removeObserver(this.A00, str, notificationScope);
    }

    public C295115nb(SessionedNotificationCenter sessionedNotificationCenter) {
        this.A01 = sessionedNotificationCenter;
    }
}
