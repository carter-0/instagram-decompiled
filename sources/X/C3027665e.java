package X;

import com.facebook.msys.mci.NotificationCenterInternal;
import com.facebook.msys.mci.NotificationCenterInternal$NotificationCallbackInternal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.65e  reason: invalid class name and case insensitive filesystem */
public final class C3027665e extends AnonymousClass45Y {
    public final /* synthetic */ AnonymousClass2Lq A00;
    public final /* synthetic */ NotificationCenterInternal A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ Map A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3027665e(AnonymousClass2Lq r2, NotificationCenterInternal notificationCenterInternal, String str, ArrayList arrayList, Map map) {
        super("dispatchNotificationToCallbacks");
        this.A01 = notificationCenterInternal;
        this.A03 = arrayList;
        this.A02 = str;
        this.A00 = r2;
        this.A04 = map;
    }

    public final void run() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((NotificationCenterInternal$NotificationCallbackInternal) it.next()).onNewNotification(this.A02, this.A00, this.A04);
        }
    }
}
