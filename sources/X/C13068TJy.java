package X;

import android.app.ActivityManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.direct.locationsharing.service.DirectLiveLocationService;
import java.util.List;

/* renamed from: X.TJy  reason: case insensitive filesystem */
public final class C13068TJy implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ VN2 A02;
    public final /* synthetic */ Integer A03;

    public C13068TJy(Context context, UserSession userSession, VN2 vn2, Integer num) {
        this.A02 = vn2;
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = num;
    }

    public final void run() {
        String str;
        String packageName;
        Context context = this.A00;
        UserSession userSession = this.A01;
        Integer num = this.A03;
        if (1DL.A08(context, new String[]{AnonymousClass000.A00(27)})) {
            if (num == AnonymousClass05K.A00) {
                Object systemService = context.getSystemService("activity");
                0qQ.A0C(systemService, AnonymousClass000.A00(174));
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (!(runningAppProcesses == null || (packageName = context.getPackageName()) == null)) {
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (!packageName.equals(next.processName) || next.importance != 100) {
                        }
                    }
                }
                0wj.A01.AEf("DirectLiveLocationServiceLauncher - not in foreground when location service started", 20134884).report();
                return;
            }
            NotificationChannel notificationChannel = new NotificationChannel("ig_location_sharing_channel_id", "ig_location_sharing_channel_name", 3);
            Object systemService2 = context.getSystemService("notification");
            0qQ.A0C(systemService2, AnonymousClass000.A00(175));
            ((NotificationManager) systemService2).createNotificationChannel(notificationChannel);
            Intent A0A = C66580MXl.A0A(context, DirectLiveLocationService.class);
            if (num.intValue() != 0) {
                str = "STOP_SHARING";
            } else {
                str = "START_SHARING";
            }
            A0A.putExtra("action", str);
            A0A.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
            0Tu r3 = 0Tu.A05;
            A0A.putExtra("location_update_time_interval_ms", 182.A01(r3, userSession, 36602600354878129L));
            A0A.putExtra("location_update_min_distance_meters", 182.A01(r3, userSession, 36602600354943666L));
            0kR.A00.A07().A0B(context, A0A);
        }
    }
}
