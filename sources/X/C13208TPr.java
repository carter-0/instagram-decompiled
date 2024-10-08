package X;

import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* renamed from: X.TPr  reason: case insensitive filesystem */
public final class C13208TPr implements WebMessageListenerBoundaryInterface {
    public TZi A00;

    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.RnT[]} */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object, X.RnT] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPostMessage(android.webkit.WebView r9, java.lang.reflect.InvocationHandler r10, android.net.Uri r11, boolean r12, java.lang.reflect.InvocationHandler r13) {
        /*
            r8 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r7 = X.SL3.A00(r0, r10)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r7 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r7
            java.lang.reflect.InvocationHandler[] r6 = r7.getPorts()
            int r5 = r6.length
            X.RnT[] r3 = new X.C10152RnT[r5]
            r4 = 0
        L_0x0010:
            if (r4 >= r5) goto L_0x0028
            r2 = r6[r4]
            X.RnT r1 = new X.RnT
            r1.<init>()
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r0 = X.SL3.A00(r0, r2)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r0
            r1.A00 = r0
            r3[r4] = r1
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0028:
            X.QFd r0 = X.SDO.A0Z
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00a6
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r1 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r0 = r7.getMessagePayload()
            java.lang.Object r2 = X.SL3.A00(r1, r0)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r2 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r2
            int r1 = r2.getType()
            if (r1 == 0) goto L_0x00a1
            r0 = 1
            if (r1 != r0) goto L_0x0089
            byte[] r0 = r2.getAsArrayBuffer()
            X.SF2 r4 = new X.SF2
            r4.<init>((byte[]) r0, (X.C10152RnT[]) r3)
        L_0x004e:
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r0 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r2 = X.SL3.A00(r0, r13)
            org.chromium.support_lib_boundary.IsomorphicObjectBoundaryInterface r2 = (org.chromium.support_lib_boundary.IsomorphicObjectBoundaryInterface) r2
            r1 = 1
            X.TNH r0 = new X.TNH
            r0.<init>(r2, r1)
            java.lang.Object r2 = r2.getOrCreatePeer(r0)
            X.TZi r3 = r8.A00
            X.Sg0 r3 = (X.C11762Sg0) r3
            X.C51972G9s.A1C(r11, r2)
            java.lang.String r1 = "FbPaySDKIFrameInjector"
            if (r12 != 0) goto L_0x008a
            X.QKZ r3 = r3.A00
            java.lang.ref.WeakReference r0 = r3.A00
            if (r0 == 0) goto L_0x0074
            r0.clear()
        L_0x0074:
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r2)
            r3.A00 = r0
            r1 = 0
            int r0 = r4.A00
            if (r1 != r0) goto L_0x00b0
            java.lang.String r2 = r4.A01
            if (r2 == 0) goto L_0x0089
            X.S3p r1 = r3.A01
            r0 = 0
        L_0x0086:
            r1.A01(r2, r0)
        L_0x0089:
            return
        L_0x008a:
            java.lang.String r0 = "Web message listener is called on the main frame"
            X.0KC.A0C(r1, r0)
            r1 = 0
            int r0 = r4.A00
            if (r1 != r0) goto L_0x00c1
            java.lang.String r2 = r4.A01
            if (r2 == 0) goto L_0x0089
            X.QKZ r0 = r3.A00
            X.S3p r1 = r0.A01
            java.lang.String r0 = r11.toString()
            goto L_0x0086
        L_0x00a1:
            java.lang.String r0 = r2.getAsString()
            goto L_0x00aa
        L_0x00a6:
            java.lang.String r0 = r7.getData()
        L_0x00aa:
            X.SF2 r4 = new X.SF2
            r4.<init>((java.lang.String) r0, (X.C10152RnT[]) r3)
            goto L_0x004e
        L_0x00b0:
            java.lang.String r3 = "Wrong data accessor type detected. "
            java.lang.String r2 = "ArrayBuffer"
            java.lang.String r1 = " expected, but got "
            java.lang.String r0 = "String"
            java.lang.String r0 = X.002.A0u(r3, r2, r1, r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00c1:
            java.lang.String r3 = "Wrong data accessor type detected. "
            java.lang.String r2 = "ArrayBuffer"
            java.lang.String r1 = " expected, but got "
            java.lang.String r0 = "String"
            java.lang.String r0 = X.002.A0u(r3, r2, r1, r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13208TPr.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }
}
