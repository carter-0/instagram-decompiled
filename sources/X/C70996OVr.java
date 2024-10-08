package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import java.util.Map;

/* renamed from: X.OVr  reason: case insensitive filesystem */
public final class C70996OVr {
    public static boolean A00;
    public static final long A01;
    public static final UserFlowLogger A02;
    public static final C70996OVr A03 = new Object();
    public static final Map A04 = AnonymousClass7TE.A1H();
    public static final UserFlowConfig A05 = new UserFlowConfig("CALL_SETUP", false);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.OVr] */
    static {
        UserFlowLoggerImpl userFlowLoggerImpl = new UserFlowLoggerImpl(02m.A0p);
        A02 = userFlowLoggerImpl;
        A01 = userFlowLoggerImpl.generateFlowId(29229058, 0);
    }

    public final void A00(Integer num, boolean z) {
        String str;
        UserFlowLogger userFlowLogger = A02;
        long j = A01;
        userFlowLogger.flowStart(j, A05);
        A04.clear();
        if (!A00) {
            userFlowLogger.flowAnnotate(j, "is_cold", true);
            A00 = true;
        } else {
            userFlowLogger.flowAnnotate(j, "is_cold", false);
        }
        if (num.intValue() != 0) {
            str = "INCOMING";
        } else {
            str = "OUTGOING";
        }
        userFlowLogger.flowAnnotate(j, "call_direction", str);
        userFlowLogger.flowAnnotate(j, "with_video", z);
    }

    public final void A01(String str) {
        String str2;
        UserFlowLogger userFlowLogger = A02;
        long j = A01;
        Map map = A04;
        int i = map.get(str);
        if (i == null) {
            i = 0;
        }
        int A0M = AnonymousClass7TE.A0M(i);
        if (A0M != 0) {
            str2 = 002.A0G(str, '-', A0M);
        } else {
            str2 = str;
        }
        C66580MXl.A1T(str, map, A0M + 1);
        userFlowLogger.flowMarkPoint(j, str2);
    }
}
