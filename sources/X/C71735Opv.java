package X;

import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.util.NotificationScope;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* renamed from: X.Opv  reason: case insensitive filesystem */
public final class C71735Opv implements C295125nc {
    public final NotificationCenter A00;
    public final C71736Opw A01 = new C71736Opw(this);
    public final Map A02 = new ConcurrentHashMap();

    public final NotificationScope EBU(C295145ne r5, String str, int i) {
        NotificationScope notificationScope = new NotificationScope();
        NotificationCenter notificationCenter = this.A00;
        C71736Opw opw = this.A01;
        synchronized (notificationCenter) {
            notificationCenter.A01(notificationScope, opw, str, 1);
        }
        this.A02.put(notificationScope, r5);
        return notificationScope;
    }

    public final void FIs(NotificationScope notificationScope, String str) {
        this.A02.remove(notificationScope);
        NotificationCenter notificationCenter = this.A00;
        C71736Opw opw = this.A01;
        synchronized (notificationCenter) {
            notificationCenter.A00(notificationScope, opw, str);
        }
    }

    public C71735Opv(NotificationCenter notificationCenter) {
        this.A00 = notificationCenter;
    }
}
