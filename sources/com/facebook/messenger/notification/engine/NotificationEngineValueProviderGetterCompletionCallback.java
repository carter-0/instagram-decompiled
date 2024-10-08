package com.facebook.messenger.notification.engine;

import X.C69706NqS;
import X.C70910ORf;
import com.facebook.simplejni.NativeHolder;

public final class NotificationEngineValueProviderGetterCompletionCallback {
    public static final C69706NqS Companion = new Object();
    public NativeHolder mNativeHolder;

    private final native void failureNative(MSGNotificationEngineContext mSGNotificationEngineContext, Throwable th);

    private final native void successNative(MSGNotificationEngineContext mSGNotificationEngineContext, Object obj);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.NqS, java.lang.Object] */
    static {
        C70910ORf.A00();
    }

    public NotificationEngineValueProviderGetterCompletionCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public final void failure(MSGNotificationEngineContext mSGNotificationEngineContext, Throwable th) {
        failureNative(mSGNotificationEngineContext, th);
    }

    public final void success(MSGNotificationEngineContext mSGNotificationEngineContext, Object obj) {
        successNative(mSGNotificationEngineContext, obj);
    }
}
