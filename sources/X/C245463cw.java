package X;

import android.content.Context;
import com.facebook.litho.ComponentsSystrace;

/* renamed from: X.3cw  reason: invalid class name and case insensitive filesystem */
public final class C245463cw implements C253183qL {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        if (r4 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        r4.A09 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        com.facebook.litho.ComponentsSystrace.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
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
            boolean r0 = r8 instanceof android.graphics.drawable.Drawable
            if (r0 == 0) goto L_0x0040
            r5 = r8
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            android.graphics.drawable.Drawable$Callback r0 = r5.getCallback()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L_0x0040
            android.graphics.drawable.Drawable$Callback r4 = r5.getCallback()
            android.view.View r4 = (android.view.View) r4
            X.0qQ.A0A(r4)
            int r3 = r9.A00
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r2 = 1
            r1 = 32
            r0 = r3 & 32
            if (r0 == r1) goto L_0x0033
            r0 = r3 & 1
            if (r0 != r2) goto L_0x0040
        L_0x0033:
            boolean r0 = r5.isStateful()
            if (r0 == 0) goto L_0x0040
            int[] r0 = r4.getDrawableState()
            r5.setState(r0)
        L_0x0040:
            X.3mp r5 = r9.A03
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.litho.SpecGeneratedComponent"
            X.0qQ.A0C(r5, r0)
            X.3mo r5 = (X.C251253mo) r5
            X.2V1 r4 = r9.A04
            X.3cz r0 = X.2Tk.A07
            X.2Tq r3 = r0.A01(r10)
            if (r4 == 0) goto L_0x0057
            java.lang.String r0 = "bind"
            r4.A09 = r0
        L_0x0057:
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r2 = r0.isTracing()
            if (r2 == 0) goto L_0x006c
            java.lang.String r1 = "onBind: "
            java.lang.String r0 = r5.A0J()
            java.lang.String r0 = X.002.A0R(r1, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x006c:
            r5.A0s(r4, r3, r8)     // Catch:{ Exception -> 0x0070 }
            goto L_0x0077
        L_0x0070:
            r0 = move-exception
            if (r4 == 0) goto L_0x0083
            X.2Vb.A03(r4, r0)     // Catch:{ all -> 0x0084 }
            goto L_0x0079
        L_0x0077:
            if (r4 == 0) goto L_0x007c
        L_0x0079:
            r0 = 0
            r4.A09 = r0
        L_0x007c:
            if (r2 == 0) goto L_0x0081
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x0081:
            r0 = 0
            return r0
        L_0x0083:
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r1 = move-exception
            if (r4 == 0) goto L_0x008a
            r0 = 0
            r4.A09 = r0
        L_0x008a:
            if (r2 == 0) goto L_0x008f
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x008f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245463cw.ADM(android.content.Context, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
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
            ComponentsSystrace.A02(002.A0R("onUnbind: ", r42.A0J()));
        }
        try {
            r42.A0u(r3, A01, obj);
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

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public final /* synthetic */ String getDescription() {
        return AnonymousClass3XB.A00(getClass());
    }
}
