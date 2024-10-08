package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLoggingController;
import java.util.HashMap;

/* renamed from: X.7G0  reason: invalid class name */
public final class AnonymousClass7G0 {
    public static final 2Hj A00 = new 2Hj(20132240, "IG_DIRECT_E2EE_MESSAGE_MEDIA_SEND_TO_SENT");
    public static final 2Hj A01 = new 2Hj(20125328, "IG_DIRECT_E2EE_MESSAGE_MEDIA_RELIABILITY");
    public static final 2Hj A02 = new 2Hj(20125233, "MESSAGE_TEXT_RELIABILITY");
    public static final 2Hj A03 = new 2Hj(20130765, "IG_DIRECT_OPEN_MESSAGE_MEDIA_SEND_TO_SENT");
    public static final 2Hj A04 = new 2Hj(20135754, "IG_DIRECT_OPEN_MESSAGE_MEDIA_RELIABILITY");
    public static final 2Hj A05 = new 2Hj(20126011, "IG_DIRECT_MESSAGE_TEXT_SEND_TO_SENT");
    public static final 2Hj A06 = new 2Hj(936447229, "MSYS_TRACE_MESSAGE_SEND_TO_SENT");
    public static final /* synthetic */ AnonymousClass7G0 A07 = new Object();

    public static final IGFOAMessagingSendToSentLogger A00(UserSession userSession, int i) {
        0qQ.A0B(userSession, 1);
        return ((IGFOAMessagingSendToSentLoggingController) userSession.A01(IGFOAMessagingSendToSentLoggingController.class, new AnonymousClass9LH(userSession, 6))).getLogger(Integer.valueOf(i));
    }

    public static final C69242Nhw A01(UserSession userSession, Integer num, int i, boolean z, boolean z2) {
        2Hj r4;
        2Hj r5;
        if (num.intValue() == 0) {
            if (z) {
                r4 = A05;
            } else {
                r4 = A06;
            }
            r5 = A02;
        } else if (z) {
            r4 = A00;
            r5 = A01;
        } else {
            r4 = A03;
            r5 = A04;
        }
        if (!182.A06(0Tu.A05, userSession, 36324033070968511L)) {
            return null;
        }
        0qQ.A0B(r4, 1);
        return new C69242Nhw((2Hm) userSession.A01(IGFOAMessagingSendToSentLoggingController.class, new AnonymousClass9LH(userSession, 6)), r4, r5, new HashMap(), i, z2);
    }
}
