package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.notifications.armadillo.retry.ArmadilloPushNotificationRetryWorker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5q0  reason: invalid class name and case insensitive filesystem */
public final class C296405q0 {
    public static final C296405q0 A00 = new Object();

    public final void A00(UserSession userSession) {
        AnonymousClass385.A00(C60960kU.A00).A05(002.A0R("ArmadilloPushNotificationRetryScheduler", userSession.A06));
    }

    public final void A01(UserSession userSession, Map map) {
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession, 36327722447813261L)) {
            long A01 = 182.A01(r4, userSession, 36609197424580427L);
            C255333tx r8 = new C255333tx();
            String A002 = C66579MXk.A00(954);
            Map map2 = r8.A00;
            map2.put(A002, Integer.valueOf((int) 182.A01(r4, userSession, 36609197424711500L)));
            String str = userSession.A06;
            map2.put("recipient_id", str);
            if (map != null) {
                r8.A02(map);
            }
            C375589Ef r6 = new C375589Ef(ArmadilloPushNotificationRetryWorker.class);
            C375569Ed r0 = new C375569Ed();
            Integer num = AnonymousClass05K.A01;
            r0.A01(num);
            r6.A02(r0.A00());
            TimeUnit timeUnit = TimeUnit.MINUTES;
            r6.A01(A01, timeUnit);
            r6.A00.A0C = r8.A00();
            r6.A03(num, timeUnit, A01);
            AnonymousClass385 A003 = AnonymousClass385.A00(C60960kU.A00);
            String A0R = 002.A0R("ArmadilloPushNotificationRetryScheduler", str);
            A003.A02((C7485QFt) r6.A00(), AnonymousClass05K.A00, A0R);
        }
    }
}
