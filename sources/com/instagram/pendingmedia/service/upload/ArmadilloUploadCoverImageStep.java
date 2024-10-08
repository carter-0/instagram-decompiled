package com.instagram.pendingmedia.service.upload;

import X.MU6;

public final class ArmadilloUploadCoverImageStep implements MU6 {
    /* JADX WARNING: type inference failed for: r15v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object FIH(X.LP8 r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r5 = r19
            r3 = 24
            r4 = r20
            boolean r0 = X.C66138MDq.A02(r3, r4)
            if (r0 == 0) goto L_0x002b
            r15 = r4
            X.MDq r15 = (X.C66138MDq) r15
            int r2 = r15.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r15.A00 = r2
        L_0x001a:
            java.lang.Object r0 = r15.A02
            X.1Hj r2 = X.1Hj.A02
            int r1 = r15.A00
            r3 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r3) goto L_0x0033
            java.lang.Object r5 = r15.A01
            X.LP8 r5 = (X.LP8) r5
            goto L_0x00c2
        L_0x002b:
            X.MDq r15 = new X.MDq
            r0 = r18
            r15.<init>(r0, r4, r3)
            goto L_0x001a
        L_0x0033:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0038:
            X.0eS.A00(r0)
            java.util.EnumSet r1 = X.C63537Kym.A00
            X.3QD r0 = r5.A06
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0048
            X.KVl r2 = X.C62012KVl.A00
            return r2
        L_0x0048:
            X.3Q2 r4 = r5.A0D     // Catch:{ MCs -> 0x00d8 }
            java.lang.String r0 = r4.A2M     // Catch:{ MCs -> 0x00d8 }
            if (r0 != 0) goto L_0x00c7
            com.instagram.common.session.UserSession r10 = r5.A0C     // Catch:{ MCs -> 0x00d8 }
            X.0Tu r6 = X.0Tu.A05     // Catch:{ MCs -> 0x00d8 }
            r0 = 36325982986515899(0x810e4a000735bb, double:3.0360361414408984E-306)
            boolean r0 = X.182.A06(r6, r10, r0)     // Catch:{ MCs -> 0x00d8 }
            int r8 = r4.A0S     // Catch:{ MCs -> 0x00d8 }
            int r7 = r4.A0R     // Catch:{ MCs -> 0x00d8 }
            if (r0 == 0) goto L_0x007a
            r0 = 36607457963480650(0x820e4a000b164a, double:3.214042050282165E-306)
            int r0 = X.DbS.A04(r6, r10, r0)     // Catch:{ MCs -> 0x00d8 }
            float r8 = (float) r8     // Catch:{ MCs -> 0x00d8 }
            float r0 = (float) r0     // Catch:{ MCs -> 0x00d8 }
            float r9 = r8 / r0
            float r6 = (float) r7     // Catch:{ MCs -> 0x00d8 }
            float r1 = r6 / r0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            r9 = r1
        L_0x0076:
            float r8 = r8 / r9
            int r8 = (int) r8     // Catch:{ MCs -> 0x00d8 }
            float r6 = r6 / r9
            int r7 = (int) r6     // Catch:{ MCs -> 0x00d8 }
        L_0x007a:
            X.1iA r0 = r4.A1G     // Catch:{ MCs -> 0x00d8 }
            int r0 = r0.ordinal()     // Catch:{ MCs -> 0x00d8 }
            if (r0 != r3) goto L_0x00c0
            java.lang.String r13 = r4.A33     // Catch:{ MCs -> 0x00d8 }
            if (r13 == 0) goto L_0x00c0
            java.lang.String r1 = "content://"
            r0 = 0
            boolean r0 = X.00p.A0k(r13, r1, r0)     // Catch:{ MCs -> 0x00d8 }
            if (r0 == 0) goto L_0x00a9
            com.instagram.pendingmedia.model.ClipInfo r0 = r4.A1N     // Catch:{ MCs -> 0x00d8 }
            java.lang.String r6 = r0.A0F     // Catch:{ MCs -> 0x00d8 }
            r0 = 16777214(0xfffffe, float:2.3509884E-38)
            com.instagram.pendingmedia.model.ClipInfo r1 = new com.instagram.pendingmedia.model.ClipInfo     // Catch:{ MCs -> 0x00d8 }
            r1.<init>(r6, r0)     // Catch:{ MCs -> 0x00d8 }
            android.content.Context r0 = r5.A0B     // Catch:{ MCs -> 0x00d8 }
            java.io.File r0 = X.C64188LSv.A00(r0, r1, r13, r8, r7)     // Catch:{ MCs -> 0x00d8 }
            if (r0 == 0) goto L_0x00c0
            java.lang.String r13 = r0.getCanonicalPath()     // Catch:{ MCs -> 0x00d8 }
            if (r13 == 0) goto L_0x00c0
        L_0x00a9:
            X.OdG r0 = X.C71122OdG.A00     // Catch:{ MCs -> 0x00d8 }
            java.lang.Integer r11 = X.AnonymousClass05K.A00     // Catch:{ MCs -> 0x00d8 }
            long r16 = X.AnonymousClass0HN.A00()     // Catch:{ MCs -> 0x00d8 }
            java.lang.String r14 = r4.A3p     // Catch:{ MCs -> 0x00d8 }
            java.lang.Integer r12 = r4.A2G     // Catch:{ MCs -> 0x00d8 }
            r15.A01 = r5     // Catch:{ MCs -> 0x00d8 }
            r15.A00 = r3     // Catch:{ MCs -> 0x00d8 }
            java.lang.Object r0 = X.C71122OdG.A00(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ MCs -> 0x00d8 }
            if (r0 != r2) goto L_0x00c5
            return r2
        L_0x00c0:
            r0 = 0
            goto L_0x00c7
        L_0x00c2:
            X.0eS.A00(r0)     // Catch:{ MCs -> 0x00d8 }
        L_0x00c5:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ MCs -> 0x00d8 }
        L_0x00c7:
            X.3Q2 r1 = r5.A0D     // Catch:{ MCs -> 0x00d8 }
            r1.A2M = r0     // Catch:{ MCs -> 0x00d8 }
            X.3QD r0 = X.AnonymousClass3QD.UPLOADED     // Catch:{ MCs -> 0x00d8 }
            r1.A0b(r0)     // Catch:{ MCs -> 0x00d8 }
            X.37k r0 = r5.A0E     // Catch:{ MCs -> 0x00d8 }
            r0.EGC(r1)     // Catch:{ MCs -> 0x00d8 }
            X.KVm r2 = X.C62013KVm.A00     // Catch:{ MCs -> 0x00d8 }
            return r2
        L_0x00d8:
            r4 = move-exception
            com.instagram.pendingmedia.service.upload.ImageUploadUtil r2 = com.instagram.pendingmedia.service.upload.ImageUploadUtil.A00
            java.lang.String r3 = "fbupload:Photo upload error:"
            java.lang.String r1 = X.AnonymousClass7TF.A0m(r3, r4)
            X.55S r0 = X.AnonymousClass55S.A0L
            r2.A06(r0, r5, r1, r4)
            X.55S r2 = X.AnonymousClass55S.A0D
            java.lang.String r1 = X.AnonymousClass7TF.A0m(r3, r4)
            r0 = 0
            X.55U r0 = X.AnonymousClass55V.A01(r2, r1, r0, r4)
            X.KVk r2 = new X.KVk
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.ArmadilloUploadCoverImageStep.FIH(X.LP8, X.4D7):java.lang.Object");
    }

    public final String getName() {
        return "ArmadilloUploadCoverImageStep";
    }
}
