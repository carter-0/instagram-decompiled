package com.facebook.messenger.notification.engine;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C70910ORf;
import X.OOS;
import com.facebook.msys.mca.Mailbox;
import com.facebook.simplejni.NativeHolder;

public final class MSGNotificationEngineSyncPathIntegrator {
    public static final OOS Companion = new Object();
    public NativeHolder mNativeHolder;

    public class MSGNotificationEngineOpenPathIntegratorCallback {
        public void onNotification(MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification) {
        }
    }

    public MSGNotificationEngineSyncPathIntegrator(boolean z, boolean z2, boolean z3, MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback) {
        0qQ.A0B(mSGNotificationEngineValueProvider, 4);
        AnonymousClass7TG.A1S(mailbox, mSGNotificationEngineOpenPathIntegratorCallback);
        this.mNativeHolder = initNativeHolder(z, z2, z3, mSGNotificationEngineValueProvider, mailbox, mSGNotificationEngineOpenPathIntegratorCallback);
    }

    public static final native NativeHolder initNativeHolder(boolean z, boolean z2, boolean z3, MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.OOS, java.lang.Object] */
    static {
        C70910ORf.A00();
    }

    public MSGNotificationEngineSyncPathIntegrator(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
