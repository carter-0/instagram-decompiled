package com.instagram.bugreporter.screencast;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass9T8;
import X.Pxg;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

public final class ScreencastService extends Service {
    public static final List A00 = AnonymousClass7TE.A1C();

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        int A04 = AnonymousClass0fD.A04(1746634125);
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            NotificationChannel notificationChannel = new NotificationChannel("SCREEN_CAST_NOTIFICATION_CHANNEL_ID", "Screencast background service", 0);
            notificationChannel.setLockscreenVisibility(0);
            Object systemService = getSystemService("notification");
            0qQ.A0C(systemService, AnonymousClass000.A00(175));
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
            Notification A03 = new AnonymousClass9T8((Context) this, "SCREEN_CAST_NOTIFICATION_CHANNEL_ID").A03();
            0qQ.A07(A03);
            if (i >= 34) {
                startForeground(20029, A03, 32);
                Iterator it = A00.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass7TE.A11("this$0");
                }
            } else {
                startForeground(20029, A03);
            }
        }
        AnonymousClass0fD.A0B(152224827, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        AnonymousClass0fD.A0B(-1887423320, Pxg.A01(this, intent, 214269576));
        return 0;
    }
}
