package com.instagram.pendingmedia.service.impl;

import X.09i;
import X.0eQ;
import X.0qQ;
import X.1ua;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass7TG;
import X.C66580MXl;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;

public final class RetryUploadingBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int intExtra;
        UserSession userSession;
        String stringExtra;
        int A03 = C66580MXl.A03(this, context, intent, 1280804642);
        AnonymousClass7TG.A1N(context, intent);
        if (0qQ.A0K(intent.getAction(), "com.instagram.pendingmedia.service.notification.ACTION_RETRY_UPLOADING") && (intExtra = intent.getIntExtra("NOTIFICATION_ID", -1)) != -1) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            try {
                userSession = 09i.A0A.A08(this);
            } catch (Throwable th) {
                userSession = new 0eQ(th);
            }
            if (userSession instanceof 0eQ) {
                userSession = null;
            }
            UserSession userSession2 = userSession;
            if (!(userSession2 == null || (stringExtra = intent.getStringExtra("PENDING_MEDIA_KEY")) == null)) {
                1ua.A0G.A01(context, userSession2).A0L((AnonymousClass0iw) null, stringExtra);
            }
            notificationManager.cancel((String) null, intExtra);
        }
        AnonymousClass0fD.A0E(1112799772, A03, intent);
    }
}
