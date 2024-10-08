package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;

/* renamed from: X.Ong  reason: case insensitive filesystem */
public final class C71605Ong implements MSGNotificationEngineValueProvider.ProviderGetterCallback {
    public final /* synthetic */ C70767OKn A00;

    public C71605Ong(C70767OKn oKn) {
        this.A00 = oKn;
    }

    public final void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        DbY.A1S(mSGNotificationEngineContext, notificationEngineValueProviderGetterCompletionCallback);
        boolean z = true;
        if (AnonymousClass0BO.A00(this.A00.A00).BO0().size() <= 1) {
            z = false;
        }
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, Boolean.valueOf(z));
    }
}
