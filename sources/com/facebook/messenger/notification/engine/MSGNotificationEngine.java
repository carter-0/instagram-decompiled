package com.facebook.messenger.notification.engine;

import X.C70910ORf;
import X.OOQ;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

public abstract class MSGNotificationEngine {
    public static final OOQ Companion = new Object();

    public class MSGNotificationEngineOpenPathIntegratorCallback {
        public void onNotification(MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification) {
        }
    }

    public static final native NativeHolder initNativeHolder(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider);

    public final native void processOpenPathNotification(Map map, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.OOQ, java.lang.Object] */
    static {
        C70910ORf.A00();
    }
}
