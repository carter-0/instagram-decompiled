package X;

/* renamed from: X.RiT  reason: case insensitive filesystem */
public abstract class C9854RiT {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if ("*/*".equals(r3) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a5, code lost:
        if (r6 != false) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.app.Activity r19, android.content.Intent r20, android.net.Uri r21, X.C61058Jvw r22, X.0lg r23, java.lang.Runnable r24, java.lang.String r25, java.util.HashMap r26, java.util.List r27, int r28, int r29) {
        /*
            r0 = 1
            r14 = r23
            X.0qQ.A0B(r14, r0)
            r5 = 3
            r0 = 6
            r13 = r22
            X.0qQ.A0B(r13, r0)
            r17 = r20
            java.lang.String r3 = r17.getType()
            X.8nf r0 = X.C365768ne.A0A
            X.8ne r10 = r0.A00()
            X.02m r4 = X.02m.A0p
            java.util.Iterator r1 = r27.iterator()
            r7 = 0
            r2 = r7
        L_0x0021:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r1.next()
            if (r0 == 0) goto L_0x0021
            if (r2 != 0) goto L_0x0033
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
        L_0x0033:
            r2.add(r0)
            goto L_0x0021
        L_0x0037:
            X.RFJ r9 = X.RFJ.OTHER
            r8 = r9
            if (r3 == 0) goto L_0x005d
            java.lang.String r1 = r17.getAction()
            java.lang.String r0 = "android.intent.action.SEND_MULTIPLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "*/*"
            boolean r0 = r0.equals(r3)
            r6 = 1
            if (r0 != 0) goto L_0x0052
        L_0x0051:
            r6 = 0
        L_0x0052:
            java.lang.String r0 = "image"
            r1 = 1
            boolean r0 = X.C66580MXl.A1a(r0, r1, r3)
            if (r0 == 0) goto L_0x009c
            X.RFJ r9 = X.RFJ.PHOTO
        L_0x005d:
            r0 = r28
            r10.A01 = r0
            r0 = r29
            r10.A00 = r0
            r20 = r24
            if (r9 == r8) goto L_0x00af
            X.T8E r15 = new X.T8E
            r11 = r19
            r16 = r11
            r18 = r4
            r19 = r14
            r15.<init>(r16, r17, r18, r19, r20)
            android.os.Bundle r1 = r17.getExtras()
            if (r1 == 0) goto L_0x008a
            r0 = 1506(0x5e2, float:2.11E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x008a:
            r10.A04 = r7
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            r12 = r21
            r18 = r25
            r19 = r26
            r20 = r2
            r17 = r3
            r10.A01(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x009c:
            java.lang.String r0 = "video"
            boolean r0 = X.C66580MXl.A1a(r0, r1, r3)
            if (r0 != 0) goto L_0x00aa
            if (r6 == 0) goto L_0x005d
        L_0x00a7:
            X.RFJ r9 = X.RFJ.MIXED
            goto L_0x005d
        L_0x00aa:
            if (r6 != 0) goto L_0x00a7
            X.RFJ r9 = X.RFJ.VIDEO
            goto L_0x005d
        L_0x00af:
            r2 = 18951415(0x1212cf7, float:2.960329E-38)
            boolean r0 = r4.isMarkerOn(r2)
            if (r0 == 0) goto L_0x00c2
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "ineligible_media_type"
            r4.markerAnnotate(r2, r1, r0)
            r4.markerEnd(r2, r5)
        L_0x00c2:
            r20.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9854RiT.A00(android.app.Activity, android.content.Intent, android.net.Uri, X.Jvw, X.0lg, java.lang.Runnable, java.lang.String, java.util.HashMap, java.util.List, int, int):void");
    }
}
