package com.meta.foa.instagram.performancelogging.s2s;

import X.0qQ;
import X.2Hl;
import X.AnonymousClass7G2;
import X.AnonymousClass9LH;
import X.C66579MXk;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.instagram.common.session.UserSession;
import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;

public final class IGFOAMessagingSendToSentLoggingController extends 2Hl {
    public static final AnonymousClass7G2 Companion = new Object();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGFOAMessagingSendToSentLoggingController(UserSession userSession) {
        super(true, userSession);
        0qQ.A0B(userSession, 1);
    }

    public static final IGFOAMessagingSendToSentLoggingController getInstance(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (IGFOAMessagingSendToSentLoggingController) userSession.A01(IGFOAMessagingSendToSentLoggingController.class, new AnonymousClass9LH(userSession, 6));
    }

    public void onLoggerEnded(FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger) {
        0qQ.A0B(fOAMessagingPerformanceLogger, 0);
        Integer instanceKey = fOAMessagingPerformanceLogger.getInstanceKey();
        if (instanceKey != null && this.activeLoggers.remove(instanceKey) == null) {
            debugS2STextQPL(instanceKey, "unstarted_trace");
        }
    }

    public boolean onLoggerStarted(FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger) {
        0qQ.A0B(fOAMessagingPerformanceLogger, 0);
        Integer instanceKey = fOAMessagingPerformanceLogger.getInstanceKey();
        if (instanceKey != null) {
            if (this.activeLoggers.putIfAbsent(instanceKey, fOAMessagingPerformanceLogger) == null) {
                return true;
            }
            debugS2STextQPL(instanceKey, "starting_duplicate_logger");
        }
        return false;
    }

    private final void debugS2STextQPL(Integer num, String str) {
        EventBuilder markEventBuilder;
        EventBuilder annotate;
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance != null) {
            EventBuilder markEventBuilder2 = qPLInstance.markEventBuilder(936446320, str);
            int i = 0;
            if (markEventBuilder2 != null && markEventBuilder2.isSampled() && (markEventBuilder = qPLInstance.markEventBuilder(936446320, str)) != null) {
                if (num != null) {
                    i = num.intValue();
                }
                EventBuilder annotate2 = markEventBuilder.annotate("instanceKey", i);
                if (annotate2 != null && (annotate = annotate2.annotate(C66579MXk.A00(823), str)) != null) {
                    annotate.report();
                }
            }
        }
    }

    public IGFOAMessagingSendToSentLogger getLogger(Integer num) {
        return IGFOAMessagingSendToSentLoggingController.super.getLogger(num);
    }
}
