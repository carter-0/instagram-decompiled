package com.facebook.messenger.notification.engine;

import X.AnonymousClass7TG;
import X.C68308N9v;
import X.C70910ORf;
import X.OX0;
import com.facebook.msys.mca.Mailbox;
import com.facebook.simplejni.NativeHolder;

public final class MSGNotificationEngineInstagramSyncPathIntegrator {
    public static final OX0 Companion = new Object();
    public NativeHolder mNativeHolder;

    public class MSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback {
        public void onIntegratorCreate(NativeHolder nativeHolder) {
        }
    }

    public class MSGNotificationEngineOpenPathIntegratorCallback {
        public void onNotification(MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification) {
        }
    }

    public static final native NativeHolder initNativeHolder(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback, boolean z);

    public static final native void initNativeHolderAsync(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback, MSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback mSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback, boolean z);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.OX0] */
    static {
        C70910ORf.A00();
    }

    public MSGNotificationEngineInstagramSyncPathIntegrator(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public MSGNotificationEngineInstagramSyncPathIntegrator(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback, boolean z, boolean z2) {
        AnonymousClass7TG.A1U(mSGNotificationEngineValueProvider, mailbox, mSGNotificationEngineOpenPathIntegratorCallback);
        if (z2) {
            initNativeHolderAsync(mSGNotificationEngineValueProvider, mailbox, mSGNotificationEngineOpenPathIntegratorCallback, new C68308N9v(this), z);
        } else {
            this.mNativeHolder = initNativeHolder(mSGNotificationEngineValueProvider, mailbox, mSGNotificationEngineOpenPathIntegratorCallback, z);
        }
    }
}
