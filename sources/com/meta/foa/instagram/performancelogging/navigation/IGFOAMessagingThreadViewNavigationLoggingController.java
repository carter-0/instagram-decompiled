package com.meta.foa.instagram.performancelogging.navigation;

import X.00k;
import X.0qQ;
import X.14i;
import X.15Y;
import X.2Hm;
import X.C330787Of;
import X.C61110lV;
import com.instagram.common.session.UserSession;
import java.util.Collection;

public final class IGFOAMessagingThreadViewNavigationLoggingController extends 2Hm {
    public static final IGFOAMessagingThreadViewNavigationLoggingController INSTANCE = new 2Hm(false, false);
    public static final String TAG = "IGFOAMessagingThreadViewNavigationLoggingController";
    public static final 14i backgroundDetector = 14i.A08;
    public static final C61110lV backgroundDetectorListener;

    static {
        C330787Of r1 = new C330787Of();
        backgroundDetectorListener = r1;
        14i.A03(15Y.A03, r1);
    }

    public IGFOAMessagingThreadViewNavigationLoggingController() {
        super(false, false);
    }

    public final IGFOAMessagingThreadViewNavigationLogger getLogger(UserSession userSession) {
        IGFOAMessagingThreadViewNavigationLogger iGFOAMessagingThreadViewNavigationLogger;
        0qQ.A0B(userSession, 0);
        Collection values = this.activeLoggers.values();
        0qQ.A07(values);
        Object A0A = 00k.A0A(values);
        if (!(A0A instanceof IGFOAMessagingThreadViewNavigationLogger) || (iGFOAMessagingThreadViewNavigationLogger = (IGFOAMessagingThreadViewNavigationLogger) A0A) == null) {
            return null;
        }
        iGFOAMessagingThreadViewNavigationLogger.updateExtras(userSession);
        return iGFOAMessagingThreadViewNavigationLogger;
    }

    public String getTAG() {
        return TAG;
    }
}
