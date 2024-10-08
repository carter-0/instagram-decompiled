package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderSetterCompletionCallback;

/* renamed from: X.Onl  reason: case insensitive filesystem */
public final class C71610Onl implements MSGNotificationEngineValueProvider.ProviderSetterCallback {
    public static final C71610Onl A00 = new C71610Onl();

    public final void setValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, Object obj, NotificationEngineValueProviderSetterCompletionCallback notificationEngineValueProviderSetterCompletionCallback) {
        AnonymousClass7TF.A1C(mSGNotificationEngineContext, 0, notificationEngineValueProviderSetterCompletionCallback);
        notificationEngineValueProviderSetterCompletionCallback.success(mSGNotificationEngineContext);
    }
}
