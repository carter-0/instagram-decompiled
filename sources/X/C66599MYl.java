package X;

import com.facebook.msys.mci.SessionedNotificationCenter;
import java.util.Map;

/* renamed from: X.MYl  reason: case insensitive filesystem */
public final class C66599MYl implements AnonymousClass66d {
    public final /* synthetic */ SessionedNotificationCenter A00;
    public final /* synthetic */ 2DU A01;

    public C66599MYl(SessionedNotificationCenter sessionedNotificationCenter, 2DU r2) {
        this.A01 = r2;
        this.A00 = sessionedNotificationCenter;
    }

    public final void onNewNotification(String str, AnonymousClass2Lq r5, Map map) {
        2DU.A06(this.A01, "apps_start_offline_completion");
        this.A00.removeObserver(this, "MEMOfflineMessageProcessingFinishedNotification", (AnonymousClass2Lq) null);
    }
}
