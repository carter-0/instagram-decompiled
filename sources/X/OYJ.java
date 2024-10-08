package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.instagram.common.session.UserSession;

public final class OYJ {
    public static final OYJ A00 = new Object();

    public static final boolean A00(Context context, UserSession userSession) {
        NotificationManager notificationManager;
        NotificationChannel notificationChannel;
        Object systemService = context.getSystemService("notification");
        if (!(systemService instanceof NotificationManager) || (notificationManager = (NotificationManager) systemService) == null || (notificationChannel = notificationManager.getNotificationChannel("ig_direct")) == null || notificationChannel.getImportance() != 0) {
            return 182.A06(0Tu.A05, userSession, 36326034525664732L);
        }
        return false;
    }
}
