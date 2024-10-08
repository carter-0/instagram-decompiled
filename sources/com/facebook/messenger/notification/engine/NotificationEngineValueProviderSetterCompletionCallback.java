package com.facebook.messenger.notification.engine;

import X.C69707NqT;
import X.C70910ORf;
import com.facebook.simplejni.NativeHolder;

public final class NotificationEngineValueProviderSetterCompletionCallback {
    public static final C69707NqT Companion = new Object();
    public NativeHolder mNativeHolder;

    private final native void failureNative(MSGNotificationEngineContext mSGNotificationEngineContext, Throwable th);

    private final native void successNative(MSGNotificationEngineContext mSGNotificationEngineContext);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.NqT, java.lang.Object] */
    static {
        C70910ORf.A00();
    }

    public NotificationEngineValueProviderSetterCompletionCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public final void success(MSGNotificationEngineContext mSGNotificationEngineContext) {
        successNative(mSGNotificationEngineContext);
    }

    public final void failure(MSGNotificationEngineContext mSGNotificationEngineContext, Throwable th) {
        failureNative(mSGNotificationEngineContext, th);
    }
}
