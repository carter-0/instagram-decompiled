package X;

import android.content.Context;
import com.facebook.litho.ComponentsSystrace;

/* renamed from: X.3cv  reason: invalid class name and case insensitive filesystem */
public final class C245453cv implements C253183qL {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (r4 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r4.A09 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        com.facebook.litho.ComponentsSystrace.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object ADM(android.content.Context r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r6 = this;
            X.2Tg r9 = (X.2Tg) r9
            r0 = 1
            X.0qQ.A0B(r8, r0)
            r0 = 2
            X.0qQ.A0B(r9, r0)
            X.3mp r5 = r9.A03
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.litho.SpecGeneratedComponent"
            X.0qQ.A0C(r5, r0)
            X.3mo r5 = (X.C251253mo) r5
            X.2V1 r4 = r9.A04
            X.3cz r0 = X.2Tk.A07
            X.2Tq r3 = r0.A01(r10)
            if (r4 == 0) goto L_0x0021
            java.lang.String r0 = "mount"
            r4.A09 = r0
        L_0x0021:
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r2 = r0.isTracing()
            if (r2 == 0) goto L_0x0036
            java.lang.String r1 = "onMount: "
            java.lang.String r0 = r5.A0J()
            java.lang.String r0 = X.002.A0R(r1, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0036:
            r5.A0t(r4, r3, r8)     // Catch:{ Exception -> 0x003a }
            goto L_0x0041
        L_0x003a:
            r0 = move-exception
            if (r4 == 0) goto L_0x004d
            X.2Vb.A03(r4, r0)     // Catch:{ all -> 0x004e }
            goto L_0x0043
        L_0x0041:
            if (r4 == 0) goto L_0x0046
        L_0x0043:
            r0 = 0
            r4.A09 = r0
        L_0x0046:
            if (r2 == 0) goto L_0x004b
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x004b:
            r0 = 0
            return r0
        L_0x004d:
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            if (r4 == 0) goto L_0x0054
            r0 = 0
            r4.A09 = r0
        L_0x0054:
            if (r2 == 0) goto L_0x0059
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x0059:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245453cv.ADM(android.content.Context, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        C245433ct r2 = (C245433ct) obj;
        C245433ct r3 = (C245433ct) obj2;
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        if (r3.A03 instanceof 2T7) {
            return false;
        }
        return C245433ct.A07.A00(r2, r3, obj3, obj4);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        2Tg r8 = (2Tg) obj2;
        0qQ.A0B(obj, 1);
        0qQ.A0B(r8, 2);
        C251263mp r4 = r8.A03;
        0qQ.A0C(r4, "null cannot be cast to non-null type com.facebook.litho.SpecGeneratedComponent");
        C251253mo r42 = (C251253mo) r4;
        2V1 r3 = r8.A04;
        C70672Tq A01 = 2Tk.A07.A01(obj3);
        if (ComponentsSystrace.A00.isTracing()) {
            ComponentsSystrace.A02(002.A0R("onUnmount: ", r42.A0J()));
        }
        try {
            r42.A0v(r3, A01, obj);
        } catch (Exception e) {
            if (r3 != null) {
                2Vb.A03(r3, e);
            }
        } catch (Throwable th) {
            ComponentsSystrace.A01();
            throw th;
        }
        ComponentsSystrace.A01();
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return AnonymousClass3XB.A00(getClass());
    }
}
