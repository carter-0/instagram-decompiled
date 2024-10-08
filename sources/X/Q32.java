package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public final class Q32 {
    public static final Q32 A00 = new Object();
    public static final char[] A01 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final boolean A03(long j, long j2, long j3) {
        long millis = TimeUnit.SECONDS.toMillis(j2);
        return j >= 0 && millis > 0 && j + millis > j3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r5 == null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.C307576Qq r6, java.lang.String r7, java.util.Map r8) {
        /*
            if (r6 == 0) goto L_0x0013
            java.util.Map r0 = r6.A00
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L_0x0012
            X.6Qr r0 = r6.A00(r7)
            if (r0 == 0) goto L_0x0013
            java.lang.String r7 = r0.A01
        L_0x0012:
            return r7
        L_0x0013:
            java.lang.String r6 = "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969"
            X.0eM r0 = X.Q3R.A00
            java.lang.Object r1 = r0.getValue()
            X.13t r1 = (X.13t) r1
            if (r1 == 0) goto L_0x0039
            X.13s r1 = (X.13s) r1
            java.util.concurrent.atomic.AtomicReference r0 = r1.A01
            java.lang.Object r0 = r0.get()
            java.util.Locale r0 = (java.util.Locale) r0
            if (r0 != 0) goto L_0x0033
            java.util.Locale r0 = r1.AcD()
            java.util.Locale r0 = r1.C39(r0)
        L_0x0033:
            java.lang.String r5 = X.1UR.A01(r0)
            if (r5 != 0) goto L_0x003b
        L_0x0039:
            java.lang.String r5 = ""
        L_0x003b:
            java.lang.String r4 = X.C359738dP.A00()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            java.lang.String r2 = ":"
            r3.append(r2)
            X.Q32 r1 = A00
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.A02(r0, r8)
            java.lang.String r0 = r0.toString()
            X.0qQ.A07(r0)
            r3.append(r0)
            r3.append(r2)
            r3.append(r6)
            r3.append(r2)
            r3.append(r5)
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0078
            r3.append(r2)
            r3.append(r4)
        L_0x0078:
            java.lang.String r2 = r3.toString()
            X.0qQ.A07(r2)
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)
            X.0qQ.A07(r1)
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05
            byte[] r0 = r2.getBytes(r0)
            X.0qQ.A07(r0)
            r1.update(r0)
            byte[] r7 = r1.digest()
            X.0qQ.A07(r7)
            r0 = 40
            char[] r6 = new char[r0]
            int r5 = r7.length
            r4 = 0
        L_0x00a1:
            if (r4 >= r5) goto L_0x00bc
            byte r0 = r7[r4]
            r3 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r4 * 2
            char[] r2 = A01
            int r0 = r3 >>> 4
            char r0 = r2[r0]
            r6[r1] = r0
            int r1 = r1 + 1
            r0 = r3 & 15
            char r0 = r2[r0]
            r6[r1] = r0
            int r4 = r4 + 1
            goto L_0x00a1
        L_0x00bc:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q32.A00(X.6Qq, java.lang.String, java.util.Map):java.lang.String");
    }

    public static final String A01(C307576Qq r5, String str, Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (map.containsKey(value)) {
                linkedHashMap.put(key, map.get(value));
            }
        }
        return A00(r5, str, linkedHashMap);
    }

    private final void A02(StringBuilder sb, Object obj) {
        if (obj == null) {
            return;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof String) || (obj instanceof Enum)) {
            sb.append(obj);
        } else if (obj instanceof List) {
            for (Object A02 : 00k.A0a((Iterable) obj)) {
                A00.A02(sb, A02);
            }
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            0qQ.A0B(map, 0);
            for (Map.Entry entry : new TreeMap(map).entrySet()) {
                Q32 q32 = A00;
                q32.A02(sb, entry.getKey());
                q32.A02(sb, entry.getValue());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected object value type ");
            sb2.append(obj.getClass());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static final boolean A04(Q3K q3k, long j, long j2, long j3) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j4 = j2;
        long millis = timeUnit.toMillis(j4);
        if (A03(j, j4, j3)) {
            return true;
        }
        if (q3k == Q3K.PARALLEL_FETCH && millis == 0 && j3 - j < timeUnit.toMillis(5)) {
            return true;
        }
        return false;
    }
}
