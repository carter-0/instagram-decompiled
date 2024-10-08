package com.instagram.pendingmedia.service.impl;

public final class ShareAudioHelper {
    public static final ShareAudioHelper A00 = new Object();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.instagram.pendingmedia.service.upload.UploadAudioStep} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: com.instagram.pendingmedia.service.upload.UploadAudioStep} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.instagram.pendingmedia.service.upload.UploadAudioStep} */
    /* JADX WARNING: type inference failed for: r11v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        if (X.182.A06(r4, r7, 36330436867146367L) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.LP8 r15, X.AnonymousClass4D7 r16) {
        /*
            r14 = this;
            r10 = r15
            r3 = 21
            r4 = r16
            boolean r0 = X.C66138MDq.A02(r3, r4)
            if (r0 == 0) goto L_0x002d
            r11 = r4
            X.MDq r11 = (X.C66138MDq) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x0019:
            java.lang.Object r0 = r11.A02
            X.1Hj r3 = X.1Hj.A02
            int r1 = r11.A00
            r6 = 2
            r5 = 5
            r2 = 1
            if (r1 == 0) goto L_0x003b
            if (r1 == r2) goto L_0x0033
            if (r1 == r6) goto L_0x0033
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002d:
            X.MDq r11 = new X.MDq
            r11.<init>(r14, r4, r3)
            goto L_0x0019
        L_0x0033:
            java.lang.Object r10 = r11.A01
            X.LP8 r10 = (X.LP8) r10
            X.0eS.A00(r0)
            goto L_0x0052
        L_0x003b:
            X.0eS.A00(r0)
            X.KVl r0 = X.C62012KVl.A00
            X.3QD r1 = r15.A05
            if (r1 == 0) goto L_0x0052
            int r4 = r1.ordinal()
            if (r4 == r6) goto L_0x006c
            if (r4 == r5) goto L_0x00b7
            r1 = 6
            if (r4 == r1) goto L_0x00b7
            r1 = 7
            if (r4 == r1) goto L_0x00b7
        L_0x0052:
            X.3QD r2 = r10.A06
            boolean r1 = r0 instanceof X.C62012KVl
            if (r1 == 0) goto L_0x006b
            X.3QD r1 = X.AnonymousClass3QD.NOT_UPLOADED
            if (r2 == r1) goto L_0x006b
            X.37k r1 = r10.A0E
            X.3Q2 r3 = r10.A0D
            java.lang.String r5 = X.LP8.A00(r10, r2)
            r2 = 0
            java.lang.String r4 = "AUDIO_STATE_MACHINE_ERROR"
            r6 = r2
            r1.Cji(r2, r3, r4, r5, r6)
        L_0x006b:
            return r0
        L_0x006c:
            com.instagram.pendingmedia.service.common.IngestionStepDebugLogger r8 = com.instagram.pendingmedia.service.common.IngestionStepDebugLogger.A00
            X.3Q2 r0 = r15.A0D
            boolean r0 = r0.A5D
            if (r0 == 0) goto L_0x008f
            com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressUploadMediaStep r9 = new com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressUploadMediaStep
            r9.<init>()
        L_0x0079:
            com.instagram.common.session.UserSession r5 = r15.A0C
            X.0Tu r4 = X.0Tu.A05
            r0 = 36611598311233776(0x82120e000018f0, double:3.2166604228730844E-306)
            long r12 = X.182.A01(r4, r5, r0)
            r11.A01 = r15
            r11.A00 = r2
            java.lang.Object r0 = r8.A01(r9, r10, r11, r12)
            goto L_0x00bb
        L_0x008f:
            X.LEr r5 = r15.A0F
            com.instagram.common.session.UserSession r7 = r15.A0C
            r6 = 0
            X.0Tu r4 = X.0Tu.A05
            r0 = 36318084541257576(0x81071b00011768, double:3.031041132855049E-306)
            boolean r0 = X.182.A06(r4, r7, r0)
            if (r0 != 0) goto L_0x00ad
            r0 = 36330436867146367(0x8112570000427f, double:3.038852793485944E-306)
            boolean r1 = X.182.A06(r4, r7, r0)
            r0 = 0
            if (r1 == 0) goto L_0x00ae
        L_0x00ad:
            r0 = 1
        L_0x00ae:
            X.0qQ.A0B(r5, r6)
            com.instagram.pendingmedia.service.upload.UploadAudioStep r9 = new com.instagram.pendingmedia.service.upload.UploadAudioStep
            r9.<init>(r5, r0)
            goto L_0x0079
        L_0x00b7:
            java.lang.Object r0 = X.C66138MDq.A00(r15, r11, r6)
        L_0x00bb:
            if (r0 != r3) goto L_0x0052
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.ShareAudioHelper.A00(X.LP8, X.4D7):java.lang.Object");
    }
}
