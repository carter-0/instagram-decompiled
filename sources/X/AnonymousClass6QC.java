package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6QC  reason: invalid class name */
public final class AnonymousClass6QC {
    public static final AnonymousClass6QC A00 = new Object();
    public static final Map A01 = new LinkedHashMap();
    public static final Map A02 = new LinkedHashMap();
    public static final Map A03 = new LinkedHashMap();

    public static final int A00(String str, int i, int i2) {
        Number number;
        Map map = (Map) A01.get(new AnonymousClass9I1(i, i2, 0));
        if (map == null || (number = (Number) map.get(str)) == null) {
            return 0;
        }
        return number.intValue();
    }

    public static final void A01(QuickPerformanceLogger quickPerformanceLogger, String str, String str2, TimeUnit timeUnit, int i, int i2, long j) {
        int i3;
        int i4 = i;
        int i5 = i2;
        Map map = (Map) A01.get(new AnonymousClass9I1(i, i2, 0));
        if (map != null) {
            String str3 = str;
            Number number = (Number) map.get(str);
            if (number != null) {
                i3 = number.intValue();
            } else {
                i3 = 0;
            }
            map.put(str, Integer.valueOf(i3 + 1));
            quickPerformanceLogger.markerPoint(i4, i5, str3, str2, j, timeUnit);
        }
    }

    public static final void A02(QuickPerformanceLogger quickPerformanceLogger, String str, TimeUnit timeUnit, int i, int i2, long j) {
        int i3;
        int i4 = i;
        int i5 = i2;
        Map map = (Map) A01.get(new AnonymousClass9I1(i, i2, 0));
        if (map != null) {
            String str2 = str;
            Number number = (Number) map.get(str);
            if (number != null) {
                i3 = number.intValue();
            } else {
                i3 = 0;
            }
            map.put(str, Integer.valueOf(i3 + 1));
            quickPerformanceLogger.markerPoint(i4, i5, str2, j, timeUnit);
        }
    }

    public static final void A03(QuickPerformanceLogger quickPerformanceLogger, Map map, TimeUnit timeUnit, int i, int i2, long j) {
        int i3 = i;
        int i4 = i2;
        AnonymousClass9I1 r2 = new AnonymousClass9I1(i, i2, 0);
        Map map2 = A01;
        if (!map2.containsKey(r2)) {
            map2.put(r2, new LinkedHashMap());
            QuickPerformanceLogger quickPerformanceLogger2 = quickPerformanceLogger;
            quickPerformanceLogger2.markerStart(i3, i4, j, timeUnit);
            for (Map.Entry entry : map.entrySet()) {
                quickPerformanceLogger2.markerAnnotate(i, i2, (String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public static final void A04(QuickPerformanceLogger quickPerformanceLogger, Map map, TimeUnit timeUnit, int i, int i2, long j, short s) {
        int i3 = i;
        int i4 = i2;
        AnonymousClass9I1 r4 = new AnonymousClass9I1(i, i2, 0);
        Map map2 = A01;
        if (map2.containsKey(r4)) {
            Iterator it = map.entrySet().iterator();
            while (true) {
                QuickPerformanceLogger quickPerformanceLogger2 = quickPerformanceLogger;
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    quickPerformanceLogger.markerAnnotate(i, i2, (String) entry.getKey(), (String) entry.getValue());
                } else {
                    short s2 = s;
                    quickPerformanceLogger2.markerEnd(i3, i4, s2, j, timeUnit);
                    map2.remove(r4);
                    return;
                }
            }
        }
    }

    public final void A05(QuickPerformanceLogger quickPerformanceLogger, C306966Oh r22, TimeUnit timeUnit, int i, int i2, long j) {
        int i3;
        int i4 = i;
        int i5 = i2;
        Map map = (Map) A01.get(new AnonymousClass9I1(i4, i5, 0));
        if (map != null) {
            C306966Oh r5 = r22;
            AnonymousClass0eM r1 = r5.A06;
            Object value = r1.getValue();
            int i6 = 0;
            if (value == null || !((Boolean) r5.A04.getValue()).booleanValue()) {
                AnonymousClass0eM r2 = r5.A02;
                Number number = (Number) map.get(r2.getValue());
                if (number != null) {
                    i6 = number.intValue();
                }
                i3 = i6 + 1;
                map.put(r2.getValue(), Integer.valueOf(i3));
            } else {
                Map map2 = A03;
                Number number2 = (Number) map2.get(value);
                if (number2 != null) {
                    Map map3 = A02;
                    C306966Oh r9 = (C306966Oh) map3.get(r1.getValue());
                    if ((((Boolean) r5.A03.getValue()).booleanValue() && r9 != null && ((Boolean) r9.A05.getValue()).booleanValue()) || (((Boolean) r5.A05.getValue()).booleanValue() && r9 != null && ((Boolean) r9.A03.getValue()).booleanValue())) {
                        map3.remove(value);
                        map2.remove(value);
                        i3 = number2.intValue();
                    }
                }
                AnonymousClass0eM r23 = r5.A02;
                Number number3 = (Number) map.get(r23.getValue());
                if (number3 != null) {
                    i6 = number3.intValue();
                }
                i3 = i6 + 1;
                Integer valueOf = Integer.valueOf(i3);
                map.put(r23.getValue(), valueOf);
                A02.put(value, r5);
                map2.put(value, valueOf);
            }
            String A0g = 00p.A0g(r5.A00, "#", String.valueOf(i3), false);
            0XK r15 = new 0XK();
            for (Map.Entry entry : r5.A01.entrySet()) {
                r15.A00((String) entry.getKey(), (String) entry.getValue(), 1);
            }
            quickPerformanceLogger.markerPoint(i4, i5, 7, A0g, r15, j, timeUnit, 0);
        }
    }
}
