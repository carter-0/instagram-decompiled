package X;

import com.instagram.common.session.UserSession;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class OYM {
    public static Future A00;
    public static final ScheduledExecutorService A01;

    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        long j;
        Calendar instance;
        long timeInMillis;
        Object A012 = r12.A01();
        0qQ.A0C(A012, "null cannot be cast to non-null type kotlin.Number");
        ((Number) A012).longValue();
        List list = r12.A00;
        C277014uI A0R = DbV.A0R(list, 1);
        0qQ.A0C(A0R, "null cannot be cast to non-null type com.instagram.common.lispy.lang.Expression");
        C277014uI A0R2 = DbV.A0R(list, 2);
        0qQ.A0C(A0R2, "null cannot be cast to non-null type com.instagram.common.lispy.lang.Expression");
        String A0h = DbY.A0h(r12, 4);
        boolean A1W = JTQ.A1W(r12.A03(5));
        long A0R3 = AnonymousClass7TE.A0R(DbT.A0q(r12, "null cannot be cast to non-null type kotlin.Number", 6));
        if (JTQ.A1W(r12.A03(7))) {
            Future future = A00;
            if (future != null) {
                future.cancel(true);
            }
            A00 = null;
            return null;
        }
        if (A0h.equals("Until I change it")) {
            timeInMillis = 120000;
        } else if (A0h.equals("For 1 hour")) {
            timeInMillis = 3600000;
        } else if (A0h.equals("For 4 hours")) {
            timeInMillis = 14400000;
        } else {
            if (A0h.equals("Until 8:00 AM")) {
                instance = Calendar.getInstance();
                Calendar instance2 = Calendar.getInstance();
                int i = instance.get(11);
                int i2 = instance.get(5);
                if (i >= 8) {
                    i2++;
                }
                instance2.set(5, i2);
                instance2.set(11, 8);
                instance2.set(12, 0);
                instance2.set(13, 0);
                instance2.set(14, 0);
                j = instance2.getTimeInMillis();
            } else {
                j = A0R3 * 1000;
                instance = Calendar.getInstance();
            }
            timeInMillis = j - instance.getTimeInMillis();
        }
        A00 = A01.schedule(new C73349Pb8(r11, A0R, A0R2, A1W), timeInMillis, TimeUnit.MILLISECONDS);
        return null;
    }

    static {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C61560nl.A00().A00;
        0qQ.A07(scheduledThreadPoolExecutor);
        A01 = scheduledThreadPoolExecutor;
    }

    public static final void A01(C307896Rx r8, C277014uI r9, C277014uI r10, UserSession userSession, String str) {
        UserSession userSession2 = userSession;
        FGP.A03(C64361Kj.A00().A00, AnonymousClass07i.A00(C308206Td.A04(r8)), userSession2, new C50933FlM(r8, r9, r10, userSession2, 2), str, true);
    }
}
