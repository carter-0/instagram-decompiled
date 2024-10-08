package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderSetterCompletionCallback;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Onk  reason: case insensitive filesystem */
public final class C71609Onk implements MSGNotificationEngineValueProvider.ProviderSetterCallback {
    public final UserSession A00;
    public final AnonymousClass65Y A01;
    public final C70807OMc A02;

    public final void setValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, Object obj, NotificationEngineValueProviderSetterCompletionCallback notificationEngineValueProviderSetterCompletionCallback) {
        0eP A1L;
        RuntimeException A15;
        0eP A1L2;
        NotificationEngineValueProviderSetterCompletionCallback notificationEngineValueProviderSetterCompletionCallback2 = notificationEngineValueProviderSetterCompletionCallback;
        Object obj2 = obj;
        DbZ.A0t(0, mSGNotificationEngineContext, obj2, notificationEngineValueProviderSetterCompletionCallback2);
        if (obj2.toString() == null) {
            A15 = AnonymousClass7TE.A15("Notif Id not received from Notification Engine");
        } else {
            String A0l = AnonymousClass7TF.A0l("_unsend", JTQ.A0d(obj2));
            Map notificationContextDict = mSGNotificationEngineContext.getNotificationContextDict();
            UserSession userSession = this.A00;
            0qQ.A0B(notificationContextDict, 0);
            Object obj3 = notificationContextDict.get("notification.messagePk");
            if (!(obj3 instanceof Long) || obj3 == null) {
                A1L = AnonymousClass7TE.A1L((Object) null, "notification.messagePk not found, or isn't a Long");
            } else {
                A1L = AnonymousClass7TE.A1L(obj3, (Object) null);
            }
            Long l = (Long) A1L.A00;
            String str2 = (String) A1L.A01;
            if (str2 != null || l == null) {
                A15 = AnonymousClass7TE.A15(str2);
            } else {
                Object obj4 = notificationContextDict.get("notification.threadPk");
                if (!(obj4 instanceof Long) || obj4 == null) {
                    A1L2 = AnonymousClass7TE.A1L((Object) null, "notification.threadPk not found, or isn't a Long");
                } else {
                    A1L2 = AnonymousClass7TE.A1L(obj4, (Object) null);
                }
                Number number = (Number) A1L2.A00;
                String str3 = (String) A1L2.A01;
                if (str3 != null || number == null) {
                    A15 = AnonymousClass7TE.A15(str3);
                } else {
                    OZF.A02.A00().A00(this.A02.A01(A0l, l.toString(), this.A01.A01(l, (Long) null, C66581MXm.A0x(number), 2, true, false)), userSession);
                    notificationEngineValueProviderSetterCompletionCallback2.success(mSGNotificationEngineContext);
                    return;
                }
            }
        }
        notificationEngineValueProviderSetterCompletionCallback2.failure(mSGNotificationEngineContext, A15);
    }

    public /* synthetic */ C71609Onk(UserSession userSession) {
        AnonymousClass65Y r2 = new AnonymousClass65Y(C60960kU.A00);
        C70807OMc oMc = new C70807OMc(userSession);
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = oMc;
    }
}
