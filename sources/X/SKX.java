package X;

import android.util.ArrayMap;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Iterator;
import java.util.Map;

public abstract class SKX {
    public static final int A00(String str, String str2) {
        0qQ.A0B(str2, 1);
        if (str != null) {
            return C41845B3m.A01(str2, (str.hashCode() + 527) * 31);
        }
        return -1;
    }

    public static final Integer A01(String str) {
        int i;
        0qQ.A0B(str, 0);
        Integer A0m = 00y.A0m(str, 10);
        if (A0m != null) {
            int intValue = A0m.intValue();
            for (Integer num : AnonymousClass05K.A00(10)) {
                switch (num.intValue()) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 0;
                        break;
                    case 5:
                        i = 10;
                        break;
                    case 6:
                        i = 11;
                        break;
                    case 7:
                        i = 12;
                        break;
                    case 8:
                        i = 13;
                        break;
                    case 9:
                        i = 14;
                        break;
                    default:
                        i = -1;
                        break;
                }
                if (i == intValue) {
                    return num;
                }
            }
        }
        return AnonymousClass05K.A00;
    }

    public static final void A02(ArrayMap arrayMap, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, int i) {
        String obj;
        double A04;
        0qQ.A0B(arrayMap, 2);
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) AnonymousClass7TF.A0a(it);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = lightweightQuickPerformanceLogger;
                int i2 = i;
                if (value instanceof String) {
                    obj = (String) value;
                } else if (value instanceof Boolean) {
                    lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str, AnonymousClass7TE.A1a(value));
                } else if (value instanceof Integer) {
                    lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str, AnonymousClass7TE.A0M(value));
                } else if (value instanceof Long) {
                    lightweightQuickPerformanceLogger2.markerAnnotate(1906462, i2, str, AnonymousClass7TE.A0R(value));
                } else {
                    if (value instanceof Double) {
                        A04 = JTO.A00(value);
                    } else if (value instanceof Float) {
                        A04 = (double) AnonymousClass7TE.A04(value);
                    } else {
                        if (!(value instanceof Object[])) {
                            if (value instanceof int[]) {
                                lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str, (int[]) value);
                            } else if (value instanceof double[]) {
                                lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str, (double[]) value);
                            } else if (value instanceof long[]) {
                                lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str, (long[]) value);
                            } else if (value instanceof boolean[]) {
                                lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str, (boolean[]) value);
                            }
                        }
                        obj = value.toString();
                    }
                    lightweightQuickPerformanceLogger2.markerAnnotate(1906462, i2, str, A04);
                }
                lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str, obj);
            }
        }
    }
}
