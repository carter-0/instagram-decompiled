package com.facebook.video.heroplayer.service;

import X.0eG;
import X.AnonymousClass0fD;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public final class HeroKeepAliveService extends Service {
    public final Binder A00 = new Binder();

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0fD.A04(87171365);
        if (intent != null) {
            0eG.A01.A01(this, intent);
        }
        int onStartCommand = super.onStartCommand(intent, i, i2);
        AnonymousClass0fD.A0B(-1415623181, A04);
        return onStartCommand;
    }

    public final IBinder onBind(Intent intent) {
        return this.A00;
    }
}
