package com.facebook.browser.helium.preload;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public final class AppZygoteWarmerService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }
}
