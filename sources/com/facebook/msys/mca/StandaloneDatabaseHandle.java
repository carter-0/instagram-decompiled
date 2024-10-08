package com.facebook.msys.mca;

import X.C295115nb;
import X.C295125nc;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.simplejni.NativeHolder;

public class StandaloneDatabaseHandle {
    public final NativeHolder mNativeHolder;
    public C295125nc mNotificationCenterCallbackManager;

    private native SessionedNotificationCenter getSessionedNotificationCenterNative();

    public synchronized C295125nc getNotificationCenterCallbackManager() {
        C295125nc r1;
        r1 = this.mNotificationCenterCallbackManager;
        if (r1 == null) {
            r1 = new C295115nb(getSessionedNotificationCenterNative());
            this.mNotificationCenterCallbackManager = r1;
        }
        return r1;
    }

    public StandaloneDatabaseHandle(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public C295115nb getSessionedNotificationCenterCallbackManager() {
        return (C295115nb) getNotificationCenterCallbackManager();
    }
}
