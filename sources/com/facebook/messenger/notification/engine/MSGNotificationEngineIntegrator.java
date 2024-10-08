package com.facebook.messenger.notification.engine;

import X.C70910ORf;
import X.OOR;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.DatabaseConnection;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;

public final class MSGNotificationEngineIntegrator {
    public static final OOR Companion = new Object();
    public NativeHolder mNativeHolder;

    public class MSGNotificationEngineIntegratorCallback {
        public void onNotification(MSGRenderedNotification mSGRenderedNotification) {
        }
    }

    public static final native NativeHolder initNativeHolder(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, NotificationCenter notificationCenter, DatabaseConnection databaseConnection, Mailbox mailbox, MSGNotificationEngineIntegratorCallback mSGNotificationEngineIntegratorCallback);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.OOR, java.lang.Object] */
    static {
        C70910ORf.A00();
    }

    public MSGNotificationEngineIntegrator(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
