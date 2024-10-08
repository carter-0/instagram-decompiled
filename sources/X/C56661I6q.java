package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.I6q  reason: case insensitive filesystem */
public final class C56661I6q {
    public final QuickPerformanceLogger A00 = QuickPerformanceLoggerProvider.getQPLInstance();
    public final C56568I1x A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final AtomicBoolean A04 = new AtomicBoolean(false);

    public C56661I6q(C56568I1x i1x) {
        0qQ.A0B(i1x, 1);
        this.A01 = i1x;
    }

    public static final void A00(C56661I6q i6q) {
        QuickPerformanceLogger quickPerformanceLogger = i6q.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(325713921, 3);
        }
    }

    public static final void A01(C56661I6q i6q) {
        QuickPerformanceLogger quickPerformanceLogger;
        if (!i6q.A04.get() && (quickPerformanceLogger = i6q.A00) != null) {
            quickPerformanceLogger.markerEnd(325720704, 3);
        }
    }

    public static final void A02(C56661I6q i6q, String str) {
        QuickPerformanceLogger quickPerformanceLogger = i6q.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(325713921, str);
        }
    }

    public static final void A03(C56661I6q i6q, String str) {
        QuickPerformanceLogger quickPerformanceLogger;
        if (!i6q.A04.get() && (quickPerformanceLogger = i6q.A00) != null) {
            quickPerformanceLogger.markerPoint(325720704, str);
        }
    }

    public static final void A04(C56661I6q i6q, String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger = i6q.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerAnnotate(325713921, str, str2);
        }
    }

    public static final void A05(C56661I6q i6q, String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger;
        if (!i6q.A04.get() && (quickPerformanceLogger = i6q.A00) != null) {
            quickPerformanceLogger.markerAnnotate(325720704, str, str2);
        }
    }

    public final void A06() {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerStart(325713921);
        }
        A02(this, "query_begin");
        C56568I1x i1x = this.A01;
        A04(this, "bottom_sheet_session_id", i1x.A06);
        A04(this, "surface_session_id", i1x.A07);
        A04(this, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, I3J.A01(i1x.A05));
        if (!this.A04.get()) {
            A03(this, "query_begin");
        }
    }
}
