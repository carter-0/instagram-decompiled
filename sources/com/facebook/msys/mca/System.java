package com.facebook.msys.mca;

import X.C300465xE;
import X.C66595MYh;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;

public class System {
    public final NativeHolder mNativeHolder;
    public final NotificationCenter mNotificationCenter;

    public static native NativeHolder initNativeHolder(NotificationCenter notificationCenter);

    static {
        C66595MYh.A00();
    }

    public System() {
        NotificationCenter A00 = C300465xE.A00();
        this.mNotificationCenter = A00;
        this.mNativeHolder = initNativeHolder(A00);
    }
}
