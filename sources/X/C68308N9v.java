package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineInstagramSyncPathIntegrator;
import com.facebook.simplejni.NativeHolder;

/* renamed from: X.N9v  reason: case insensitive filesystem */
public final class C68308N9v extends MSGNotificationEngineInstagramSyncPathIntegrator.MSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback {
    public final /* synthetic */ MSGNotificationEngineInstagramSyncPathIntegrator A00;

    public final void onIntegratorCreate(NativeHolder nativeHolder) {
        0qQ.A0B(nativeHolder, 0);
        MSGNotificationEngineInstagramSyncPathIntegrator mSGNotificationEngineInstagramSyncPathIntegrator = this.A00;
        OX0 ox0 = MSGNotificationEngineInstagramSyncPathIntegrator.Companion;
        mSGNotificationEngineInstagramSyncPathIntegrator.mNativeHolder = nativeHolder;
    }

    public C68308N9v(MSGNotificationEngineInstagramSyncPathIntegrator mSGNotificationEngineInstagramSyncPathIntegrator) {
        this.A00 = mSGNotificationEngineInstagramSyncPathIntegrator;
    }
}
