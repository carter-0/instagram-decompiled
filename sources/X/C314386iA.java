package X;

import android.os.SystemClock;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.ar.core.voltron.IgArVoltronModuleLoader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6iA  reason: invalid class name and case insensitive filesystem */
public final class C314386iA {
    public final C312876fJ A00;
    public final C312516eY A01;
    public final C312656et A02;
    public final IgArVoltronModuleLoader A03;
    public final ScheduledExecutorService A04;

    public C314386iA(C312876fJ r1, C312516eY r2, C312656et r3, IgArVoltronModuleLoader igArVoltronModuleLoader, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = igArVoltronModuleLoader;
        this.A04 = scheduledExecutorService;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public static ListenableFuture A00(C314386iA r13, C352728Ep r14, List list) {
        if (list.isEmpty()) {
            return new 1Ks(true);
        }
        ? obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C314386iA r8 = r13;
            C312896fL r3 = r13.A00.A00;
            C352728Ep r9 = r14;
            int i = 22413316;
            if (r14.A02) {
                i = 22413315;
            }
            String str2 = r14.A01;
            int hashCode = Arrays.hashCode(new Object[]{str2, str});
            QuickPerformanceLogger quickPerformanceLogger = r3.A02;
            quickPerformanceLogger.markerStart(i, hashCode, false);
            if (quickPerformanceLogger.isMarkerOn(i, hashCode)) {
                C312906fM r32 = r3.A01;
                MarkerEditor withMarker = quickPerformanceLogger.withMarker(i, hashCode);
                synchronized (r32) {
                    r32.A01.get(str2);
                    withMarker.annotate("asset_id", str);
                    withMarker.annotate("asset_type", "VoltronModule");
                    withMarker.annotate("operation_id", str2);
                    withMarker.annotate("effect_session_id", r14.A00);
                    withMarker.annotate("event_timestamp_ms", Long.toString(SystemClock.uptimeMillis()));
                    String str3 = r14.A03;
                    if (str3 != null) {
                        withMarker.annotate("onecamera_active_session_id", str3);
                    }
                }
                withMarker.markerEditingCompleted();
            }
            r13.A03.loadModule(str, new C352738Eq(r8, r9, obj, str, atomicInteger));
        }
        return obj;
    }
}
