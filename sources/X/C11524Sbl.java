package X;

import android.webkit.ValueCallback;

/* renamed from: X.Sbl  reason: case insensitive filesystem */
public final class C11524Sbl implements ValueCallback {
    public final int A00;
    public final Object A01;

    public C11524Sbl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onReceiveValue(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x005e;
                case 1: goto L_0x0019;
                case 2: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r7.A01
            X.TfO r0 = (X.C13705TfO) r0
            java.lang.String r8 = (java.lang.String) r8
            if (r0 == 0) goto L_0x000c
            r0.DfV(r8)
            return
        L_0x0019:
            com.android.webview.chromium.membrane.MembraneJavaScriptExecutionResultWithOrigin r8 = (com.android.webview.chromium.membrane.MembraneJavaScriptExecutionResultWithOrigin) r8
            if (r8 == 0) goto L_0x000c
            java.lang.String r6 = r8.mOriginName
            java.lang.String r1 = r8.mCallbackResult
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x000c
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x000c
            org.json.JSONObject r1 = X.C66580MXl.A17(r1)     // Catch:{ JSONException -> 0x000c }
            java.lang.String r0 = "text_and_dom"
            java.lang.String r5 = r1.getString(r0)     // Catch:{ JSONException -> 0x000c }
            java.lang.String r0 = "text_only"
            java.lang.String r4 = r1.getString(r0)     // Catch:{ JSONException -> 0x000c }
            java.lang.String r0 = "dom_only"
            java.lang.String r3 = r1.getString(r0)     // Catch:{ JSONException -> 0x000c }
            java.lang.Object r2 = r7.A01     // Catch:{ JSONException -> 0x000c }
            X.QKt r2 = (X.C7578QKt) r2     // Catch:{ JSONException -> 0x000c }
            java.util.Map r1 = r2.A08     // Catch:{ JSONException -> 0x000c }
            monitor-enter(r1)     // Catch:{ JSONException -> 0x000c }
            r1.put(r6, r5)     // Catch:{ all -> 0x005b }
            java.util.Map r0 = r2.A0A     // Catch:{ all -> 0x005b }
            r0.put(r6, r4)     // Catch:{ all -> 0x005b }
            java.util.Map r0 = r2.A09     // Catch:{ all -> 0x005b }
            r0.put(r6, r3)     // Catch:{ all -> 0x005b }
            monitor-exit(r1)     // Catch:{ all -> 0x005b }
            goto L_0x00b2
        L_0x005b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005b }
            throw r0     // Catch:{ JSONException -> 0x000c }
        L_0x005e:
            java.lang.Object r4 = r7.A01
            X.Rxr r4 = (X.C10773Rxr) r4
            boolean r0 = X.AnonymousClass7TE.A1a(r8)
            if (r0 != 0) goto L_0x009a
            java.lang.String r3 = r4.A04
            java.lang.String r2 = "http://"
            boolean r0 = r3.startsWith(r2)
            java.lang.String r1 = "https://"
            if (r0 == 0) goto L_0x0089
            java.lang.String r1 = r3.replaceFirst(r2, r1)
        L_0x0078:
            android.content.Context r0 = r4.A00
            X.C9226RUd.A00(r0, r1)
            X.SlD r1 = r4.A01
            java.lang.String r0 = r4.A03
            r1.ESr(r3, r0)
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x000c
            goto L_0x0096
        L_0x0089:
            boolean r0 = r3.startsWith(r1)
            if (r0 != 0) goto L_0x0094
            java.lang.String r1 = X.002.A0R(r1, r3)
            goto L_0x0078
        L_0x0094:
            r1 = r3
            goto L_0x0078
        L_0x0096:
            r1.flush()     // Catch:{  }
            goto L_0x00b3
        L_0x009a:
            X.A9z r2 = r4.A02
            if (r2 == 0) goto L_0x000c
            boolean r0 = r2.A0p
            if (r0 == 0) goto L_0x000c
            boolean r0 = r2.A0g
            if (r0 != 0) goto L_0x000c
            r0 = 1
            r2.A0g = r0
            X.0JP r0 = r2.A0m
            long r0 = r0.now()
            r2.A09 = r0
            return
        L_0x00b2:
            return
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11524Sbl.onReceiveValue(java.lang.Object):void");
    }
}
