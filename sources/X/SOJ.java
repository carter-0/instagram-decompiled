package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SOJ {
    public static final AtomicBoolean A07 = JTQ.A0k();
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final QuickPerformanceLogger A04;
    public final C58840Ae A05;
    public final C61062Jw0 A06;

    public static final void A00(C8951RIq rIq, SOJ soj, Long l, String str, String str2) {
        String str3;
        0Aj A0d = C51969G9p.A0d(soj.A05, "application_direct_install_event");
        if (A0d.isSampled()) {
            C61062Jw0 jw0 = soj.A06;
            A0d.AAJ("oxygen_app_manager_id", jw0.A02);
            A0d.A9F("oxygen_update_id", (Long) null);
            A0d.AAJ("event", str);
            A0d.AAJ("uri_intent", jw0.A04);
            A0d.A9F("mai_app_id", (Long) jw0.A00);
            A0d.A8M(rIq, "error_reason");
            A0d.AAJ("error_code_oem", str2);
            A0d.AAJ("download_url", (String) null);
            A0d.A9F("download_progress", l);
            A0d.A9F("dso_id", (Long) jw0.A01);
            C51965G9l.A1L(A0d, jw0.A03);
            A0d.AAJ("fbrpc_url", (String) null);
            A0d.AAJ("oem_response_id", soj.A01);
            A0d.AAJ("oem_request_id", soj.A00);
            A0d.A9H("oxygen_eligibility_data", (Map) null);
            A0d.Cgf();
        }
        if (str.equals("RUNNING_DOWNLOAD")) {
            if (!soj.A03) {
                soj.A03 = true;
            } else {
                return;
            }
        }
        if (str.equals("PAUSED_DOWNLOAD")) {
            if (!soj.A02) {
                soj.A02 = true;
            } else {
                return;
            }
        }
        if (str.equals("DOWNLOAD_BUTTON_CLICKED")) {
            soj.A03 = false;
            soj.A02 = false;
        }
        QuickPerformanceLogger quickPerformanceLogger = soj.A04;
        quickPerformanceLogger.markerPoint(279584123, 0, str);
        C61062Jw0 jw02 = soj.A06;
        Number number = (Number) jw02.A00;
        if (number != null) {
            quickPerformanceLogger.markerAnnotate(279584123, 0, "mai_app_id", number.longValue());
        }
        String str4 = jw02.A04;
        if (str4 != null) {
            quickPerformanceLogger.markerAnnotate(279584123, 0, "uri_intent", str4);
        }
        if (rIq != null) {
            str3 = rIq.A00;
        } else {
            str3 = null;
        }
        if (str3 != null) {
            quickPerformanceLogger.markerAnnotate(279584123, 0, "error_reason", str3);
        }
        if (str2 != null) {
            quickPerformanceLogger.markerAnnotate(279584123, 0, "error_reason_extra", str2);
        }
        if (l != null) {
            quickPerformanceLogger.markerAnnotate(279584123, 0, "download_progress", l.longValue());
        }
        Number number2 = (Number) jw02.A01;
        if (number2 != null) {
            quickPerformanceLogger.markerAnnotate(279584123, 0, "dso_id", number2.longValue());
        }
    }

    public final void A01(String str) {
        A00((C8951RIq) null, this, (Long) null, str, (String) null);
    }

    public SOJ(C58840Ae r1, C61062Jw0 jw0, QuickPerformanceLogger quickPerformanceLogger) {
        this.A05 = r1;
        this.A06 = jw0;
        this.A04 = quickPerformanceLogger;
    }
}
