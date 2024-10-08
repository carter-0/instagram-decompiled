package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;

/* renamed from: X.Oni  reason: case insensitive filesystem */
public final class C71607Oni implements MSGNotificationEngineValueProvider.ProviderGetterCallback {
    public static final C71607Oni A00 = new C71607Oni();

    public final void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        DbY.A1S(mSGNotificationEngineContext, notificationEngineValueProviderGetterCompletionCallback);
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, "android");
    }
}
