package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4NP  reason: invalid class name */
public final class AnonymousClass4NP {
    public final 1yA A00;
    public final AnonymousClass4NL A01;
    public final Map A02 = new ConcurrentHashMap();

    public final void A00(C264144Ot r6, String str) {
        int i;
        Integer num;
        if (this.A00.A0E) {
            Map map = this.A02;
            C264174Ow r4 = (C264174Ow) map.get(str);
            if (r4 == null) {
                r4 = new C264174Ow();
                map.put(str, r4);
            }
            Map map2 = r4.A00.A00;
            Number number = (Number) map2.get(r6);
            if (number != null) {
                i = number.intValue();
            } else {
                i = 0;
            }
            int i2 = i + 1;
            if (i2 > 10) {
                i2 = 10;
            }
            map2.put(r6, Integer.valueOf(i2));
            StringBuilder sb = new StringBuilder();
            sb.append(r6);
            sb.append('_');
            sb.append(i2);
            String obj = sb.toString();
            C264204Oz r2 = r4.A01;
            int ordinal = r6.ordinal();
            if (ordinal == 6 || ordinal == 12 || ordinal == 0) {
                num = AnonymousClass05K.A00;
                r2.A00 = num;
            } else if (ordinal == 1 || ordinal == 7) {
                num = AnonymousClass05K.A01;
                r2.A00 = num;
            }
            AnonymousClass4NL r0 = this.A01;
            if (r0 != null) {
                int hashCode = str.hashCode();
                QuickPerformanceLogger quickPerformanceLogger = r0.A00;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerPoint(409476402, hashCode, obj);
                }
            }
        }
    }

    public final void A01(String str) {
        int hashCode;
        short s;
        if (this.A00.A0E) {
            Map map = this.A02;
            C264174Ow r0 = (C264174Ow) map.get(str);
            if (r0 == null) {
                r0 = new C264174Ow();
                map.put(str, r0);
            }
            Integer num = r0.A01.A00;
            Integer num2 = AnonymousClass05K.A00;
            AnonymousClass4NL r02 = this.A01;
            if (num == num2) {
                if (r02 != null) {
                    hashCode = str.hashCode();
                    s = 3;
                } else {
                    return;
                }
            } else if (r02 != null) {
                hashCode = str.hashCode();
                s = 2;
            } else {
                return;
            }
            QuickPerformanceLogger quickPerformanceLogger = r02.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerEnd(409476402, hashCode, s);
            }
        }
    }

    public AnonymousClass4NP(1yA r2, AnonymousClass4NL r3) {
        this.A01 = r3;
        this.A00 = r2;
    }
}
