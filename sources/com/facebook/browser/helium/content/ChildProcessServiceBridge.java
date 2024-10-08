package com.facebook.browser.helium.content;

import android.content.Intent;
import android.os.IBinder;

public interface ChildProcessServiceBridge {
    IBinder onBind(Intent intent);

    void onCreate();

    void onDestroy();
}
