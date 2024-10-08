package com.instagram.pendingmedia.service.impl;

public final class ShareVideoHelper {
    public static final ShareVideoHelper A00 = new Object();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: X.LvB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.LvB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: X.LvB} */
    /* JADX WARNING: type inference failed for: r14v1, types: [X.MDQ, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v14, types: [X.MU6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r14v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        if (X.182.A06(r8, r6, 36330436867277441L) != false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0163, code lost:
        if ((r1 instanceof X.C62012KVl) == false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016f, code lost:
        if (r2 == 0) goto L_0x0064;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0142 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.LP8 r22, X.AnonymousClass4D7 r23) {
        /*
            r21 = this;
            r3 = r23
            r13 = r22
            boolean r0 = r3 instanceof X.MDQ
            if (r0 == 0) goto L_0x002f
            r14 = r3
            X.MDQ r14 = (X.MDQ) r14
            int r2 = r14.A03
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002f
            int r2 = r2 - r1
            r14.A03 = r2
        L_0x0016:
            java.lang.Object r1 = r14.A09
            X.1Hj r4 = X.1Hj.A02
            int r0 = r14.A03
            r2 = 0
            r10 = 3
            r11 = 6
            r7 = 2
            r9 = 5
            r12 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 == r12) goto L_0x0143
            if (r0 == r7) goto L_0x0037
            if (r0 == r10) goto L_0x0037
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002f:
            X.MDQ r14 = new X.MDQ
            r0 = r21
            r14.<init>(r0, r3)
            goto L_0x0016
        L_0x0037:
            int r2 = r14.A00
            java.lang.Object r3 = r14.A06
            java.lang.Object r5 = r14.A05
            X.37k r5 = (X.C2373837k) r5
            java.lang.Object r13 = r14.A04
            X.LP8 r13 = (X.LP8) r13
            X.0eS.A00(r1)
            goto L_0x016f
        L_0x0048:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r6 = r13.A0C
            X.37k r5 = r13.A0E
            X.KVl r1 = X.C62012KVl.A00
            X.3QD r3 = r13.A06
            X.3QD r0 = r13.A05
            if (r0 == 0) goto L_0x0064
            int r8 = r0.ordinal()
            if (r8 == r7) goto L_0x00d4
            if (r8 == r9) goto L_0x0076
            if (r8 == r11) goto L_0x00bd
            r0 = 7
            if (r8 == r0) goto L_0x00bd
        L_0x0064:
            X.3QD r0 = X.AnonymousClass3QD.NOT_UPLOADED
            if (r3 == r0) goto L_0x0075
            X.3Q2 r7 = r13.A0D
            java.lang.String r9 = X.LP8.A00(r13, r3)
            r6 = 0
            java.lang.String r8 = "VIDEO_STATE_MACHINE_ERROR"
            r10 = r6
            r5.Cji(r6, r7, r8, r9, r10)
        L_0x0075:
            return r1
        L_0x0076:
            com.instagram.pendingmedia.service.common.IngestionStepDebugLogger r11 = com.instagram.pendingmedia.service.common.IngestionStepDebugLogger.A00
            X.3Q2 r0 = r13.A0D
            boolean r0 = r0.A5E
            if (r0 == 0) goto L_0x009d
            com.instagram.pendingmedia.service.upload.ArmadilloUploadCoverImageStep r12 = new com.instagram.pendingmedia.service.upload.ArmadilloUploadCoverImageStep
            r12.<init>()
        L_0x0083:
            X.0Tu r8 = X.0Tu.A05
            r0 = 36611598311299313(0x82120e000118f1, double:3.21666042291453E-306)
            long r15 = X.182.A01(r8, r6, r0)
            r14.A04 = r13
            r14.A05 = r5
            r14.A06 = r3
            r14.A00 = r2
            r14.A03 = r7
            java.lang.Object r1 = r11.A01(r12, r13, r14, r15)
            goto L_0x00d1
        L_0x009d:
            X.0Tu r8 = X.0Tu.A05
            r0 = 36318084541519723(0x81071b0005176b, double:3.0310411330208316E-306)
            boolean r0 = X.182.A06(r8, r6, r0)
            if (r0 != 0) goto L_0x00b6
            r0 = 36330436867277441(0x81125700024281, double:3.038852793568836E-306)
            boolean r1 = X.182.A06(r8, r6, r0)
            r0 = 0
            if (r1 == 0) goto L_0x00b7
        L_0x00b6:
            r0 = 1
        L_0x00b7:
            X.LvB r12 = new X.LvB
            r12.<init>(r0)
            goto L_0x0083
        L_0x00bd:
            r14.A04 = r13
            r14.A05 = r5
            r14.A06 = r3
            r14.A00 = r2
            r14.A03 = r10
            r1 = 0
            X.MGd r0 = new X.MGd
            r0.<init>((java.lang.Object) r13, (X.AnonymousClass4D7) r1, (int) r9)
            java.lang.Object r1 = X.19E.A00(r14, r0)
        L_0x00d1:
            if (r1 != r4) goto L_0x016f
            return r4
        L_0x00d4:
            android.content.Context r8 = r13.A0B
            X.3Q2 r9 = r13.A0D
            java.lang.String r0 = "videolite"
            r9.A3q = r0
            boolean r0 = r9.A5D
            if (r0 == 0) goto L_0x00ed
            X.0Tu r7 = X.0Tu.A05
            r0 = 36325622208803939(0x810df600003463, double:3.03580798416312E-306)
            boolean r0 = X.182.A06(r7, r6, r0)
            r9.A5E = r0
        L_0x00ed:
            boolean r0 = r9.A5D
            if (r0 == 0) goto L_0x0187
            boolean r0 = r9.A5E
            if (r0 != 0) goto L_0x0173
            X.Lv6 r10 = new X.Lv6
            r10.<init>(r6)
            com.instagram.pendingmedia.service.upload.armadilloexpress.RenderVideoStep r9 = new com.instagram.pendingmedia.service.upload.armadilloexpress.RenderVideoStep
            r9.<init>(r6, r8)
            X.Lv7 r7 = new X.Lv7
            r7.<init>(r6)
            X.LvD r1 = new X.LvD
            r1.<init>(r8, r6)
            com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressUploadMediaStep r0 = new com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressUploadMediaStep
            r0.<init>()
            X.MU6[] r7 = new X.MU6[]{r10, r9, r7, r1, r0}
        L_0x0112:
            int r0 = r7.length
            r8 = 0
            r9 = 0
        L_0x0115:
            r16 = r7[r9]
            com.instagram.pendingmedia.service.common.IngestionStepDebugLogger r15 = com.instagram.pendingmedia.service.common.IngestionStepDebugLogger.A00
            X.0Tu r1 = X.DbS.A0J(r6, r2)
            r10 = 36611598311364850(0x82120e000218f2, double:3.216660422955976E-306)
            long r19 = X.182.A01(r1, r6, r10)
            r14.A04 = r13
            r14.A05 = r6
            r14.A06 = r5
            r14.A07 = r3
            r14.A08 = r7
            r14.A00 = r8
            r14.A01 = r9
            r14.A02 = r0
            r14.A03 = r12
            r17 = r13
            r18 = r14
            java.lang.Object r1 = r15.A01(r16, r17, r18, r19)
            if (r1 != r4) goto L_0x015e
            return r4
        L_0x0143:
            int r0 = r14.A02
            int r9 = r14.A01
            int r8 = r14.A00
            java.lang.Object r7 = r14.A08
            X.MU6[] r7 = (X.MU6[]) r7
            java.lang.Object r3 = r14.A07
            java.lang.Object r5 = r14.A06
            X.37k r5 = (X.C2373837k) r5
            java.lang.Object r6 = r14.A05
            X.0lg r6 = (X.0lg) r6
            java.lang.Object r13 = r14.A04
            X.LP8 r13 = (X.LP8) r13
            X.0eS.A00(r1)
        L_0x015e:
            if (r8 != 0) goto L_0x0165
            boolean r10 = r1 instanceof X.C62012KVl
            r8 = 0
            if (r10 != 0) goto L_0x0166
        L_0x0165:
            r8 = 1
        L_0x0166:
            boolean r10 = r1 instanceof X.C62011KVk
            if (r10 != 0) goto L_0x0075
            int r9 = r9 + 1
            if (r9 < r0) goto L_0x0115
            r2 = r8
        L_0x016f:
            if (r2 != 0) goto L_0x0075
            goto L_0x0064
        L_0x0173:
            X.Lv6 r7 = new X.Lv6
            r7.<init>(r6)
            com.facebook.videolite.instagram.VideoIngestionStep r1 = new com.facebook.videolite.instagram.VideoIngestionStep
            r1.<init>(r8, r6, r5)
            X.LvD r0 = new X.LvD
            r0.<init>(r8, r6)
            X.MU6[] r7 = new X.MU6[]{r7, r1, r0}
            goto L_0x0112
        L_0x0187:
            com.facebook.videolite.instagram.VideoIngestionStep r1 = new com.facebook.videolite.instagram.VideoIngestionStep
            r1.<init>(r8, r6, r5)
            X.LvD r0 = new X.LvD
            r0.<init>(r8, r6)
            X.MU6[] r7 = new X.MU6[]{r1, r0}
            goto L_0x0112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.ShareVideoHelper.A00(X.LP8, X.4D7):java.lang.Object");
    }
}
