package X;

import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.NotificationCenterInternal$NotificationCallbackInternal;
import java.util.Map;

/* renamed from: X.Opw  reason: case insensitive filesystem */
public final class C71736Opw implements NotificationCenterInternal$NotificationCallbackInternal {
    public final /* synthetic */ C71735Opv A00;

    public C71736Opw(C71735Opv opv) {
        this.A00 = opv;
    }

    public final void onNewNotification(String str, AnonymousClass2Lq r6, Map map) {
        if (r6 != null) {
            C71735Opv opv = this.A00;
            C295145ne r2 = (C295145ne) opv.A02.remove(r6);
            if (r2 != null) {
                NotificationCenter notificationCenter = opv.A00;
                C71736Opw opw = opv.A01;
                synchronized (notificationCenter) {
                    notificationCenter.A00(r6, opw, str);
                }
                r2.DfW(map);
            }
        }
    }
}
