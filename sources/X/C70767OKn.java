package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueType;
import com.instagram.common.session.UserSession;

/* renamed from: X.OKn  reason: case insensitive filesystem */
public final class C70767OKn {
    public final UserSession A00;
    public final C71604Onf A01;
    public final C71606Onh A02;

    public final void A00(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider) {
        0qQ.A0B(mSGNotificationEngineValueProvider, 0);
        mSGNotificationEngineValueProvider.registerGetter("context.os", NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_STRING, C71607Oni.A00);
        mSGNotificationEngineValueProvider.registerGetter("context.app", NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_NUMBER, C71608Onj.A00);
        mSGNotificationEngineValueProvider.registerGetter("getUnreadMessages", NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_ARRAY, this.A02);
        mSGNotificationEngineValueProvider.registerGetter("areMultipleUsersLoggedIn", NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_BOOLEAN, new C71605Ong(this));
        mSGNotificationEngineValueProvider.registerGetter("isMessagingStyleEnabled", NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_BOOLEAN, this.A01);
    }

    public C70767OKn(UserSession userSession, C71604Onf onf, C71606Onh onh) {
        this.A00 = userSession;
        this.A02 = onh;
        this.A01 = onf;
    }
}
