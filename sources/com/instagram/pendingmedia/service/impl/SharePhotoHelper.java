package com.instagram.pendingmedia.service.impl;

public final class SharePhotoHelper {
    public static final SharePhotoHelper A00 = new Object();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.instagram.pendingmedia.service.upload.UploadImageStep} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.instagram.pendingmedia.service.upload.UploadImageStep} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: com.instagram.pendingmedia.service.upload.UploadImageStep} */
    /* JADX WARNING: type inference failed for: r9v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a4, code lost:
        if (X.182.A06(r5, r4, 36330436867342978L) != false) goto L_0x00a6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.LP8 r13, X.AnonymousClass4D7 r14) {
        /*
            r12 = this;
            r8 = r13
            r3 = 22
            boolean r0 = X.C66138MDq.A02(r3, r14)
            if (r0 == 0) goto L_0x002b
            r9 = r14
            X.MDq r9 = (X.C66138MDq) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0017:
            java.lang.Object r0 = r9.A02
            X.1Hj r3 = X.1Hj.A02
            int r1 = r9.A00
            r7 = 2
            r6 = 6
            r2 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 == r2) goto L_0x0031
            if (r1 == r7) goto L_0x0031
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002b:
            X.MDq r9 = new X.MDq
            r9.<init>(r12, r14, r3)
            goto L_0x0017
        L_0x0031:
            java.lang.Object r8 = r9.A01
            X.LP8 r8 = (X.LP8) r8
            X.0eS.A00(r0)
            goto L_0x0054
        L_0x0039:
            X.0eS.A00(r0)
            X.3Q2 r5 = r13.A0D
            com.instagram.common.session.UserSession r4 = r13.A0C
            X.VFE.A00(r4, r5)
            X.3QD r0 = r13.A05
            if (r0 == 0) goto L_0x0052
            int r1 = r0.ordinal()
            if (r1 == r7) goto L_0x006e
            if (r1 == r6) goto L_0x00ad
            r0 = 7
            if (r1 == r0) goto L_0x00ad
        L_0x0052:
            X.KVl r0 = X.C62012KVl.A00
        L_0x0054:
            X.3QD r2 = r8.A06
            boolean r1 = r0 instanceof X.C62012KVl
            if (r1 == 0) goto L_0x006d
            X.3QD r1 = X.AnonymousClass3QD.NOT_UPLOADED
            if (r2 == r1) goto L_0x006d
            X.37k r1 = r8.A0E
            X.3Q2 r3 = r8.A0D
            java.lang.String r5 = X.LP8.A00(r8, r2)
            r2 = 0
            java.lang.String r4 = "PHOTO_STATE_MACHINE_ERROR"
            r6 = r2
            r1.Cji(r2, r3, r4, r5, r6)
        L_0x006d:
            return r0
        L_0x006e:
            com.instagram.pendingmedia.service.common.IngestionStepDebugLogger r6 = com.instagram.pendingmedia.service.common.IngestionStepDebugLogger.A00
            boolean r0 = r5.A5D
            if (r0 == 0) goto L_0x008d
            com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressUploadMediaStep r7 = new com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressUploadMediaStep
            r7.<init>()
        L_0x0079:
            X.0Tu r5 = X.0Tu.A05
            r0 = 36611598311299313(0x82120e000118f1, double:3.21666042291453E-306)
            long r10 = X.182.A01(r5, r4, r0)
            r9.A01 = r13
            r9.A00 = r2
            java.lang.Object r0 = r6.A01(r7, r8, r9, r10)
            goto L_0x00b1
        L_0x008d:
            X.0Tu r5 = X.0Tu.A05
            r0 = 36318084541585260(0x81071b0006176c, double:3.0310411330622774E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 != 0) goto L_0x00a6
            r0 = 36330436867342978(0x81125700034282, double:3.038852793610282E-306)
            boolean r1 = X.182.A06(r5, r4, r0)
            r0 = 0
            if (r1 == 0) goto L_0x00a7
        L_0x00a6:
            r0 = 1
        L_0x00a7:
            com.instagram.pendingmedia.service.upload.UploadImageStep r7 = new com.instagram.pendingmedia.service.upload.UploadImageStep
            r7.<init>(r0)
            goto L_0x0079
        L_0x00ad:
            java.lang.Object r0 = X.C66138MDq.A00(r13, r9, r7)
        L_0x00b1:
            if (r0 != r3) goto L_0x0054
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.SharePhotoHelper.A00(X.LP8, X.4D7):java.lang.Object");
    }
}
