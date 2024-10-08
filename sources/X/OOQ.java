package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngine;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.simplejni.NativeHolder;

public final class OOQ {
    private final NativeHolder initNativeHolder(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider) {
        return MSGNotificationEngine.initNativeHolder(mSGNotificationEngineValueProvider);
    }
}
