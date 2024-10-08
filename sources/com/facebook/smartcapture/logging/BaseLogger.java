package com.facebook.smartcapture.logging;

import X.00k;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C51968G9o;
import X.DbS;
import X.DbU;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class BaseLogger implements SmartCaptureLogger {
    public static final Companion Companion = new Object();
    public final SmartCaptureLogger logger;

    public static final Map buildMap(Object... objArr) {
        return Companion.buildMap(objArr);
    }

    public final void logButtonClick(String str) {
        0qQ.A0B(str, 0);
        logEvent("button_click", Companion.buildMap("button_name", str));
    }

    public final void logCaptureSessionEnd(String str) {
        0qQ.A0B(str, 0);
        logEvent("capture_session_end", Companion.buildMap("state_history", str));
    }

    public void logError(String str, String str2, Throwable th) {
        0qQ.A0B(str, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.logError(str, str2, th);
        }
    }

    public void logEvent(String str, Map map) {
        0qQ.A0B(str, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.logEvent(str, map);
        }
    }

    public void logFederatedAnalyticsCardData(FederatedAnalyticsCardData federatedAnalyticsCardData) {
        0qQ.A0B(federatedAnalyticsCardData, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.logFederatedAnalyticsCardData(federatedAnalyticsCardData);
        }
    }

    public final void logFlowCancel(CancelReason cancelReason) {
        0qQ.A0B(cancelReason, 0);
        logEvent("flow_cancel", Companion.buildMap("cancel_reason", cancelReason.getReason()));
    }

    public void qplMarkerAnnotate(int i, String str, long j) {
        0qQ.A0B(str, 1);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.qplMarkerAnnotate(i, str, j);
        }
    }

    public void setCommonFields(CommonLoggingFields commonLoggingFields) {
        0qQ.A0B(commonLoggingFields, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.setCommonFields(commonLoggingFields);
        }
    }

    public void setCurrentScreen(String str) {
        0qQ.A0B(str, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.setCurrentScreen(str);
        }
    }

    public CommonLoggingFields getCommonFields() {
        CommonLoggingFields commonFields;
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger == null || (commonFields = smartCaptureLogger.getCommonFields()) == null) {
            return CommonLoggingFields.NO_OP_LOGGING_FIELDS;
        }
        return commonFields;
    }

    public final void logCameraInitialize(int i, int i2, int i3, int i4, int i5, int i6) {
        logEvent("camera_initialize", Companion.buildMap("preview_width", Integer.valueOf(i), "preview_height", Integer.valueOf(i2), "image_width", Integer.valueOf(i3), "image_height", Integer.valueOf(i4), "view_width", Integer.valueOf(i5), "view_height", Integer.valueOf(i6)));
    }

    public final void logFlowEnd() {
        logEvent("flow_end");
    }

    public final void logFlowStart() {
        logEvent("flow_start");
    }

    public final void logPermissionGrant(int i) {
        logEvent("permission_grant", Companion.buildMap(C51968G9o.A1Z("attempts", i)));
    }

    public void qplMarkerEnd(int i, boolean z) {
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.qplMarkerEnd(i, z);
        }
    }

    public void qplMarkerStart(int i) {
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.qplMarkerStart(i);
        }
    }

    public BaseLogger(SmartCaptureLogger smartCaptureLogger) {
        this.logger = smartCaptureLogger;
    }

    public final void logPermissionExplain() {
        logEvent("permission_explain");
    }

    public final void logPermissionNeverAskAgain() {
        logEvent("permission_never_ask_again");
    }

    public final void logPermissionReject() {
        logEvent("permission_reject");
    }

    public final class Companion {
        public final Map buildMap(Object... objArr) {
            0qQ.A0B(objArr, 0);
            if (r6 % 2 == 0) {
                HashMap A1E = AnonymousClass7TE.A1E();
                ArrayList A0v = DbS.A0v(r6);
                for (Object A1X : objArr) {
                    DbU.A1X(A1X, A0v);
                }
                Iterator it = 00k.A0Q(A0v, 2).iterator();
                while (it.hasNext()) {
                    List list = (List) it.next();
                    A1E.put(list.get(0), list.get(1));
                }
                return A1E;
            }
            throw AnonymousClass7TE.A0w("Must pass a key & value in pairs.");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public void logError(String str, Throwable th) {
        0qQ.A0B(str, 0);
        logError(str, "", th);
    }

    public void logEvent(String str) {
        0qQ.A0B(str, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.logEvent(str);
        }
    }

    public void qplMarkerAnnotate(int i, String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.qplMarkerAnnotate(i, str, str2);
        }
    }
}
