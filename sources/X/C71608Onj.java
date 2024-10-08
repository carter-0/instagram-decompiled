package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;

/* renamed from: X.Onj  reason: case insensitive filesystem */
public final class C71608Onj implements MSGNotificationEngineValueProvider.ProviderGetterCallback {
    public static final C71608Onj A00 = new C71608Onj();

    public final void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, Integer.valueOf(DbW.A02(0, mSGNotificationEngineContext, notificationEngineValueProviderGetterCompletionCallback)));
    }
}
