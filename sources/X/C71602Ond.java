package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;

/* renamed from: X.Ond  reason: case insensitive filesystem */
public final class C71602Ond implements MSGNotificationEngineValueProvider.ProviderGetterCallback {
    public final /* synthetic */ OFM A00;

    public C71602Ond(OFM ofm) {
        this.A00 = ofm;
    }

    public final void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        DbY.A1S(mSGNotificationEngineContext, notificationEngineValueProviderGetterCompletionCallback);
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, this.A00.A01.A00());
    }
}
