package com.instagram.notifications.push;

import X.0b6;
import X.AnonymousClass000;
import X.C66581MXm;
import X.DbS;
import android.app.IntentService;
import android.content.Intent;

public class BloksNotificationService extends IntentService {
    public BloksNotificationService() {
        super("BloksNotificationService");
    }

    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            intent = DbS.A09();
        }
        C66581MXm.A17(intent, getPackageName(), "com.instagram.mainactivity.InstagramMainActivity");
        intent.setFlags(268435456);
        0b6.A00().A08(AnonymousClass000.A00(1136)).A0G(this, intent);
    }
}
