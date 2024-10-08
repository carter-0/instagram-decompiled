package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class I25 {
    public final QuickPerformanceLogger A00 = QuickPerformanceLoggerProvider.getQPLInstance();
    public final C56150Htc A01;

    public final void A02(C54726HQf hQf) {
        String str;
        0qQ.A0B(hQf, 0);
        String A002 = hQf.A00();
        if (A002 == null || (str = 002.A0g(hQf.A01(), ": ", A002)) == null) {
            str = hQf.A01();
        }
        A03(str);
    }

    private final void A00(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            if (str2 == null) {
                str2 = "unknown";
            }
            quickPerformanceLogger.markerAnnotate(325724260, str, str2);
        }
    }

    public final void A01() {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerStart(325724260);
        }
        A04("query_begin");
        C56150Htc htc = this.A01;
        A00(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, htc.A02.A00);
        A00("surface_session_id", htc.A0B);
        A00("bottom_sheet_session_id", htc.A0A);
    }

    public final void A04(String str) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(325724260, str);
        }
    }

    public final void A05(String str) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(325715839, str);
        }
    }

    public final void A06(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            if (str2 == null) {
                str2 = "unknown";
            }
            quickPerformanceLogger.markerAnnotate(325726718, str, str2);
        }
    }

    public final void A07(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            if (str2 == null) {
                str2 = "unknown";
            }
            quickPerformanceLogger.markerAnnotate(325715894, str, str2);
        }
    }

    public final void A08(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            if (str2 == null) {
                str2 = "unknown";
            }
            quickPerformanceLogger.markerAnnotate(325715839, str, str2);
        }
    }

    public final void A09(String str, String str2, int i) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            if (str2 == null) {
                str2 = "unknown";
            }
            quickPerformanceLogger.markerAnnotate(325725822, i, str, str2);
        }
    }

    public I25(C56150Htc htc) {
        this.A01 = htc;
    }

    public final void A03(String str) {
        QuickPerformanceLogger quickPerformanceLogger;
        if (!(str == null || (quickPerformanceLogger = this.A00) == null)) {
            quickPerformanceLogger.markerAnnotate(325715894, "error_message", str);
            quickPerformanceLogger.markerAnnotate(325725822, "error_message", str);
            quickPerformanceLogger.markerAnnotate(325715839, "error_message", str);
            quickPerformanceLogger.markerAnnotate(325724260, "error_message", str);
        }
        QuickPerformanceLogger quickPerformanceLogger2 = this.A00;
        if (quickPerformanceLogger2 != null) {
            quickPerformanceLogger2.markerEnd(325715894, 3);
            quickPerformanceLogger2.markerEnd(325725822, 3);
            quickPerformanceLogger2.markerEnd(325715839, 3);
            quickPerformanceLogger2.markerEnd(325724260, 3);
        }
    }
}
