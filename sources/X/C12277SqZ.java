package X;

import com.facebook.smartcapture.logging.CommonLoggingFields;
import com.facebook.smartcapture.logging.FederatedAnalyticsCardData;
import com.facebook.smartcapture.logging.SmartCaptureLogger;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.SqZ  reason: case insensitive filesystem */
public final class C12277SqZ implements SmartCaptureLogger {
    public CommonLoggingFields A00 = CommonLoggingFields.NO_OP_LOGGING_FIELDS;
    public String A01 = "";
    public final C58840Ae A02;
    public final 02m A03;

    public C12277SqZ(0lg r2) {
        0qQ.A0B(r2, 1);
        this.A02 = AnonymousClass0kN.A02(r2);
        this.A03 = 02m.A0p;
    }

    public final void logError(String str, String str2, Throwable th) {
        0qQ.A0B(str, 0);
        0wb r1 = 0wb.A01;
        String A0R = 002.A0R("smart_capture: ", str);
        if (th == null) {
            if (str2 == null) {
                str2 = "";
            }
            r1.Ew1(A0R, str2, 10);
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        r1.Ew6(A0R, str2, 10, th);
    }

    public final void logEvent(String str, Map map) {
        HashMap A1E;
        0qQ.A0B(str, 0);
        0Aj A0d = C51969G9p.A0d(this.A02, "scp_event");
        if (A0d.isSampled()) {
            A0d.AAJ("event", str);
            int ordinal = this.A00.featureLevel.ordinal();
            String str2 = "low";
            if (ordinal == 2) {
                str2 = "high";
            } else if (ordinal == 1) {
                str2 = "mid";
            }
            A0d.AAJ("feature_level", str2);
            A0d.AAJ("flow_type", this.A00.flowType);
            A0d.AAJ("product", this.A00.product);
            A0d.A9H("tags", Pxf.A0x(this.A00._tagsMap));
            A0d.AAJ(Py0.A00(), this.A00.sessionId);
            A0d.AAJ(AnonymousClass000.A00(373), this.A00.submissionId);
            if (map != null) {
                A1E = Pxe.A19(map);
            } else {
                A1E = AnonymousClass7TE.A1E();
            }
            A1E.put("wizard_screen", this.A01);
            A0d.A9H("event_specific_fields", A1E);
            A0d.Cgf();
        }
    }

    public final void logFederatedAnalyticsCardData(FederatedAnalyticsCardData federatedAnalyticsCardData) {
    }

    public final void qplMarkerAnnotate(int i, String str, long j) {
        0qQ.A0B(str, 1);
        this.A03.markerAnnotate(i, str, j);
    }

    public final void setCommonFields(CommonLoggingFields commonLoggingFields) {
        0qQ.A0B(commonLoggingFields, 0);
        this.A00 = commonLoggingFields;
    }

    public final void setCurrentScreen(String str) {
        0qQ.A0B(str, 0);
        this.A01 = str;
    }

    public final CommonLoggingFields getCommonFields() {
        return this.A00;
    }

    public final void qplMarkerEnd(int i, boolean z) {
        02m r1 = this.A03;
        short s = 3;
        if (z) {
            s = 2;
        }
        r1.markerEnd(i, s);
    }

    public final void qplMarkerStart(int i) {
        02m r2 = this.A03;
        r2.markerStart(i);
        r2.markerAnnotate(i, "product", this.A00.product);
    }

    public final void logError(String str, Throwable th) {
        0qQ.A0B(str, 0);
        logError(str, "", th);
    }

    public final void logEvent(String str) {
        0qQ.A0B(str, 0);
        logEvent(str, (Map) null);
    }

    public final void qplMarkerAnnotate(int i, String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A03.markerAnnotate(i, str, str2);
    }
}
