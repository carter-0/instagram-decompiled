package com.facebook.messenger.notification.engine;

import X.C69705NqR;
import X.C70910ORf;
import com.facebook.simplejni.NativeHolder;

public final class MSGNotificationEngineValueProvider {
    public static final C69705NqR Companion = new Object();
    public final NativeHolder mNativeHolder = initNativeHolder();

    public interface ProviderGetterCallback {
        void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback);
    }

    public interface ProviderSetterCallback {
        void setValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, Object obj, NotificationEngineValueProviderSetterCompletionCallback notificationEngineValueProviderSetterCompletionCallback);
    }

    private final native NativeHolder initNativeHolder();

    public final native void registerGetter(String str, NotificationEngineValueType notificationEngineValueType, ProviderGetterCallback providerGetterCallback);

    public final native void registerSetter(String str, NotificationEngineValueType notificationEngineValueType, ProviderSetterCallback providerSetterCallback);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.NqR, java.lang.Object] */
    static {
        C70910ORf.A00();
    }
}
