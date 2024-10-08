package X;

import android.util.ArrayMap;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class W00 {
    public final QuickPerformanceLogger A00;
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();
    public final AnonymousClass0vF A03;
    public volatile boolean A04;

    public final void A02(C16529UwZ uwZ, String str, String str2, String str3, long j) {
        0qQ.A0B(str2, 1);
        A03(new C20344Wpj(this, uwZ, str, str2, str3, j));
    }

    public static final void A00(W00 w00, int i, long j, short s) {
        ArrayMap arrayMap;
        if (w00.A04) {
            int i2 = i;
            if (i != -1) {
                Map map = w00.A02;
                Integer valueOf = Integer.valueOf(i);
                if (map.containsKey(valueOf)) {
                    Map map2 = w00.A01;
                    if (!(map2.get(valueOf) == null || (arrayMap = (ArrayMap) map2.get(valueOf)) == null || !(!arrayMap.isEmpty()))) {
                        JSONObject jSONObject = new JSONObject();
                        ArrayMap arrayMap2 = (ArrayMap) map2.get(valueOf);
                        if (arrayMap2 != null) {
                            Iterator it = arrayMap2.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry A1J = AnonymousClass7TE.A1J(it);
                                try {
                                    String A13 = DbT.A13(A1J);
                                    Object value = A1J.getValue();
                                    0qQ.A07(value);
                                    jSONObject.put(A13, AnonymousClass7TE.A0M(value));
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                }
                            }
                        }
                        QuickPerformanceLogger quickPerformanceLogger = w00.A00;
                        ArrayMap arrayMap3 = new ArrayMap();
                        arrayMap3.put("PREFETCH_CALL_COUNT", jSONObject.toString());
                        SKX.A02(arrayMap3, quickPerformanceLogger, i);
                    }
                    short s2 = s;
                    w00.A00.markerEnd(1906462, i2, s2, j, TimeUnit.MILLISECONDS);
                    map.remove(valueOf);
                    ArrayMap arrayMap4 = (ArrayMap) map2.get(valueOf);
                    if (arrayMap4 != null) {
                        arrayMap4.clear();
                    }
                    map2.remove(valueOf);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r1.contains(r0) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r1.contains(r0) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        if (r1 == false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.W00 r13, X.C16529UwZ r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, long r18) {
        /*
            boolean r0 = r13.A04
            if (r0 == 0) goto L_0x002a
            if (r15 == 0) goto L_0x002a
            r0 = r16
            int r8 = X.SKX.A00(r15, r0)
            r0 = -1
            if (r8 == r0) goto L_0x002a
            java.util.Map r5 = r13.A02
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r5.get(r4)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r5.get(r4)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r1 = 1
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.contains(r14)
            if (r0 != r1) goto L_0x002b
        L_0x002a:
            return
        L_0x002b:
            java.lang.Object r1 = r5.get(r4)
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            if (r1 == 0) goto L_0x005e
            X.UwZ r0 = X.C16529UwZ.DATA_FETCH_ISSUED
            if (r0 != r14) goto L_0x003e
            boolean r0 = r1.contains(r0)
            r3 = 1
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            X.UwZ r0 = X.C16529UwZ.DATA_FETCH_ISSUED_AUDIO
            if (r0 != r14) goto L_0x004a
            boolean r0 = r1.contains(r0)
            r2 = 1
            if (r0 != 0) goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            X.UwZ r0 = X.C16529UwZ.DATA_FETCH_ISSUED_VIDEO
            if (r0 != r14) goto L_0x0056
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r3 != 0) goto L_0x002a
            if (r2 != 0) goto L_0x002a
            if (r0 == 0) goto L_0x005e
            return
        L_0x005e:
            com.facebook.quicklog.QuickPerformanceLogger r6 = r13.A00
            r7 = 1906462(0x1d171e, float:2.671522E-39)
            java.lang.String r9 = r14.name()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            r10 = r17
            r11 = r18
            r6.markerPoint(r7, r8, r9, r10, r11, r13)
            java.lang.Object r0 = r5.get(r4)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L_0x002a
            r0.add(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W00.A01(X.W00, X.UwZ, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    public final void A03(Runnable runnable) {
        if (this.A04) {
            this.A03.ATE(new C15855Ujf(runnable));
        }
    }

    public W00(QuickPerformanceLogger quickPerformanceLogger, AnonymousClass0vF r3) {
        this.A00 = quickPerformanceLogger;
        this.A03 = r3;
    }
}
