package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.3vb  reason: invalid class name and case insensitive filesystem */
public abstract class C256333vb {
    public static void A00(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Map map, int i, int i2) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = lightweightQuickPerformanceLogger;
                int i3 = i;
                int i4 = i2;
                if (value instanceof String) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, (String) value);
                } else if (value instanceof Integer) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, ((Number) value).intValue());
                } else if (value instanceof Double) {
                    lightweightQuickPerformanceLogger2.markerAnnotate(i3, i4, str, ((Number) value).doubleValue());
                } else if (value instanceof Long) {
                    lightweightQuickPerformanceLogger2.markerAnnotate(i3, i4, str, ((Number) value).longValue());
                } else if (value instanceof Boolean) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, ((Boolean) value).booleanValue());
                } else if (value instanceof String[]) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, (String[]) value);
                } else if (value instanceof int[]) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, (int[]) value);
                } else if (value instanceof double[]) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, (double[]) value);
                } else if (value instanceof long[]) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, (long[]) value);
                } else if (value instanceof boolean[]) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, (boolean[]) value);
                } else {
                    0wb.A03("VideoQpl", String.format(Locale.US, "Failed to annotate marker: markerId %d instanceId %d key %s value %s class %s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, value, value.getClass().getSimpleName()}));
                }
            }
        }
    }
}
