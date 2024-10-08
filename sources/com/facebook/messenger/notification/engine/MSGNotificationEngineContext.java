package com.facebook.messenger.notification.engine;

import X.C69704NqQ;
import X.C70910ORf;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

public final class MSGNotificationEngineContext {
    public static final C69704NqQ Companion = new Object();
    public NativeHolder mNativeHolder;

    public final native Map getNotificationContextDict();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.NqQ, java.lang.Object] */
    static {
        C70910ORf.A00();
    }

    public MSGNotificationEngineContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
