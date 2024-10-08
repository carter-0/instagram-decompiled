package X;

import com.facebook.msys.mci.NotificationCenterInternal$NotificationCallbackInternal;
import com.facebook.msys.mci.SessionedNotificationCenter;
import java.util.Map;

/* renamed from: X.Opy  reason: case insensitive filesystem */
public final class C71738Opy implements NotificationCenterInternal$NotificationCallbackInternal, AnonymousClass66d {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71738Opy(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onNewNotification(String str, AnonymousClass2Lq r6, Map map) {
        0sP r2;
        boolean z;
        if (this.A00 != 0) {
            ((C72207OyX) this.A02).A01.removeEveryObserver(this);
            0fh.A00(-637442150);
            if (map == null || !map.containsKey("ACTRegistrationResult")) {
                r2 = (0sP) this.A01;
                z = false;
            } else {
                r2 = (0sP) this.A01;
                Object obj = map.get("ACTRegistrationResult");
                if (!(obj instanceof Boolean)) {
                    obj = null;
                }
                z = DbX.A1a(obj);
            }
            C51968G9o.A1O(r2, z);
            return;
        }
        NBV nbv = (NBV) this.A01;
        C70812OMh oMh = nbv.A00;
        oMh.A01 = null;
        oMh.A00 = null;
        oMh.A02.set(false);
        nbv.A01.onCompletion((Object) null);
        ((SessionedNotificationCenter) this.A02).removeObserver(this, "MCAMailboxDidShutdownNotification", (AnonymousClass2Lq) null);
    }
}
