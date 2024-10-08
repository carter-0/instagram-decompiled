package X;

import android.content.Context;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2nk  reason: invalid class name and case insensitive filesystem */
public final class C229612nk {
    public static final AtomicInteger A03 = new AtomicInteger(0);
    public final int A00;
    public final QuickPerformanceLogger A01;
    public final Map A02 = new 01r(0);

    public final void A00(C307786Rm r13, String str) {
        Map map = this.A02;
        Q3X q3x = (Q3X) map.remove(str);
        if (q3x != null) {
            int i = q3x.A04;
            double d = q3x.A00;
            long j = q3x.A05;
            QuickPerformanceLogger quickPerformanceLogger = q3x.A09;
            int i2 = q3x.A07;
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(36713009, i2);
            withMarker.annotate("sfd", i);
            withMarker.annotate("lfd", d);
            withMarker.annotate("ts", TimeUnit.NANOSECONDS.toMillis(j));
            withMarker.annotate("max_cac", q3x.A03);
            withMarker.annotate("bloks_logging_id", q3x.A0C);
            withMarker.annotate("module", q3x.A0A);
            withMarker.annotate("animation_key", q3x.A0B);
            withMarker.markerEditingCompleted();
            q3x.A01 = -1;
            q3x.A06 = false;
            quickPerformanceLogger.markerEnd(36713009, i2, 2);
            List list = C307476Qg.A02(r13).A0E;
            synchronized (list) {
                list.remove(q3x);
            }
            for (Q3X q3x2 : map.values()) {
                q3x2.A02--;
            }
        }
    }

    public C229612nk(Context context, QuickPerformanceLogger quickPerformanceLogger) {
        this.A01 = quickPerformanceLogger;
        this.A00 = C229622nl.A00(context);
    }
}
