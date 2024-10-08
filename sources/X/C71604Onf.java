package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;
import com.instagram.common.session.UserSession;

/* renamed from: X.Onf  reason: case insensitive filesystem */
public final class C71604Onf implements MSGNotificationEngineValueProvider.ProviderGetterCallback {
    public final UserSession A00;

    public C71604Onf(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        DbY.A1S(mSGNotificationEngineContext, notificationEngineValueProviderGetterCompletionCallback);
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, AnonymousClass7TF.A0R(0Tu.A06, this.A00, 36314863316110179L));
    }
}
