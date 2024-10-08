package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;

/* renamed from: X.One  reason: case insensitive filesystem */
public final class C71603One implements MSGNotificationEngineValueProvider.ProviderGetterCallback {
    public final /* synthetic */ OFM A00;

    public C71603One(OFM ofm) {
        this.A00 = ofm;
    }

    public final void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        DbY.A1S(mSGNotificationEngineContext, notificationEngineValueProviderGetterCompletionCallback);
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, Boolean.valueOf(DbT.A1a(this.A00.A03.A01, "notification_engine_annotation")));
    }
}
