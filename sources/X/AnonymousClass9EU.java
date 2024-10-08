package X;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.notifications.local.LocalNotificationAlarmReceiver;

/* renamed from: X.9EU  reason: invalid class name */
public final class AnonymousClass9EU implements AnonymousClass0lh {
    public C61110lV A00;
    public final AlarmManager A01;
    public final Context A02;
    public final UserSession A03;
    public final AnonymousClass9ET A04;

    public static final PendingIntent A00(AnonymousClass9EU r5) {
        Context context = r5.A02;
        Intent intent = new Intent(context, LocalNotificationAlarmReceiver.class);
        intent.setAction("com.instagram.android.LOCAL_NOTIFICATION_EVENT");
        intent.putExtra(AnonymousClass000.A00(3521), AnonymousClass000.A00(1041));
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", r5.A03.A05);
        0Sy r2 = new 0Sy();
        r2.A0B(intent, context.getClassLoader());
        return r2.A02(context, 0, 134217728);
    }

    public static final boolean A01(AnonymousClass9EU r4) {
        if (1Au.A00(r4.A03).A01.getInt(AnonymousClass000.A00(325), 0) != 1) {
            return false;
        }
        Context context = r4.A02;
        0qQ.A0B(context, 0);
        Object systemService = context.getSystemService("notification");
        0qQ.A0C(systemService, AnonymousClass000.A00(175));
        NotificationChannel notificationChannel = ((NotificationManager) systemService).getNotificationChannel("ig_likes");
        if (notificationChannel == null || notificationChannel.getImportance() == 0) {
            return false;
        }
        return true;
    }

    public AnonymousClass9EU(Context context, UserSession userSession, AnonymousClass9ET r5) {
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = r5;
        Object systemService = context.getSystemService("alarm");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        this.A01 = (AlarmManager) systemService;
    }

    public final void onSessionWillEnd() {
        PendingIntent A002 = A00(this);
        if (A002 != null) {
            this.A01.cancel(A002);
        }
        C61110lV r0 = this.A00;
        if (r0 != null) {
            14i.A06(r0);
        }
    }
}
