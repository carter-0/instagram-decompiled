package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLoggingController;
import java.util.HashMap;

/* renamed from: X.7Fx  reason: invalid class name and case insensitive filesystem */
public final class C328727Fx {
    public static final 2Hj A00 = new 2Hj(20122678, "DIRECT_LOCAL_SEND_SPEED");
    public static final 2Hj A01 = new 2Hj(20134487, "FOA_DIRECT_LOCAL_SEND_SPEED");
    public static final /* synthetic */ C328727Fx A02 = new Object();

    public static final IGFOAMessagingLocalSendSpeedLogger A00(UserSession userSession, Integer num) {
        0qQ.A0B(userSession, 1);
        return C331107Po.A00(userSession).getLogger(num);
    }

    public static final C69240Nhu A01(UserSession userSession, int i) {
        2Hj r1;
        0Tu r5 = 0Tu.A05;
        if (!182.A06(r5, userSession, 36324033070902974L)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        IGFOAMessagingLocalSendSpeedLoggingController A002 = C331107Po.A00(userSession);
        hashMap.put(C66579MXk.A00(855), new C39793A9o());
        if (182.A06(r5, userSession, 2342167042284859074L)) {
            r1 = A00;
        } else {
            r1 = A01;
        }
        0qQ.A0B(r1, 0);
        return new C69240Nhu(A002, r1, hashMap, i);
    }
}
