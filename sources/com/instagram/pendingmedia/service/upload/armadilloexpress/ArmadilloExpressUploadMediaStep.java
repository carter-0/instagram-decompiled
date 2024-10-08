package com.instagram.pendingmedia.service.upload.armadilloexpress;

import X.MU6;

public final class ArmadilloExpressUploadMediaStep implements MU6 {
    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object FIH(X.LP8 r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 21
            boolean r0 = X.ME9.A03(r3, r9)
            if (r0 == 0) goto L_0x0057
            r6 = r9
            X.ME9 r6 = (X.ME9) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0057
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r4) goto L_0x005c
            java.lang.Object r3 = r6.A02
            X.3Q2 r3 = (X.AnonymousClass3Q2) r3
            java.lang.Object r8 = r6.A01
            X.LP8 r8 = (X.LP8) r8
            X.0eS.A00(r1)
        L_0x002c:
            boolean r0 = r1 instanceof X.C62013KVm
            if (r0 == 0) goto L_0x0035
            X.37k r0 = r8.A0E
            r0.EGC(r3)
        L_0x0035:
            return r1
        L_0x0036:
            X.0eS.A00(r1)
            X.3Q2 r3 = r8.A0D
            X.3QD r2 = r3.A6J
            X.3QD r1 = X.AnonymousClass3QD.UPLOADED
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED
            java.util.EnumSet r0 = java.util.EnumSet.of(r1, r0)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0061
            com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressMediaUploader r0 = com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressMediaUploader.A00
            X.ME9.A01(r8, r3, r6, r4)
            java.lang.Object r1 = r0.A00(r8, r6)
            if (r1 != r5) goto L_0x002c
            return r5
        L_0x0057:
            X.ME9 r6 = X.ME9.A00(r7, r9, r3)
            goto L_0x0016
        L_0x005c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0061:
            X.KVl r1 = X.C62012KVl.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressUploadMediaStep.FIH(X.LP8, X.4D7):java.lang.Object");
    }

    public final String getName() {
        return "UploadArmadilloExpressMedia";
    }
}
