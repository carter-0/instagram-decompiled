package com.instagram.pendingmedia.service.impl;

public final class ShareClipsTemplateHelper {
    public static final ShareClipsTemplateHelper A00 = new Object();

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDk, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r0 == 0) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.LP8 r14, X.AnonymousClass4D7 r15, X.C249523jv r16) {
        /*
            r13 = this;
            r9 = r14
            r3 = 4
            boolean r0 = X.C66132MDk.A01(r3, r15)
            if (r0 == 0) goto L_0x00f7
            r4 = r15
            X.MDk r4 = (X.C66132MDk) r4
            int r2 = r4.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00f7
            int r2 = r2 - r1
            r4.A01 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A04
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A01
            r5 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 != r5) goto L_0x00fe
            int r0 = r4.A00
            java.lang.Object r11 = r4.A03
            X.0rm r11 = (X.0rm) r11
            java.lang.Object r9 = r4.A02
            X.LP8 r9 = (X.LP8) r9
            X.0eS.A00(r1)
            if (r0 != 0) goto L_0x0054
        L_0x0030:
            X.37k r2 = r9.A0E
            X.3Q2 r4 = r9.A0D
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Clips Template state machine error from "
            r1.append(r0)
            X.3QD r0 = r9.A05
            r1.append(r0)
            java.lang.String r0 = " to "
            r1.append(r0)
            X.3QD r0 = r9.A06
            java.lang.String r6 = X.AnonymousClass7TF.A0i(r0, r1)
            r3 = 0
            java.lang.String r5 = "CLIPS_TEMPLATE_STATE_MACHINE_ERROR"
            r7 = r3
            r2.Cji(r3, r4, r5, r6, r7)
        L_0x0054:
            java.lang.Object r0 = r11.A00
            X.55U r0 = (X.AnonymousClass55U) r0
            if (r0 != 0) goto L_0x007f
            X.KVm r3 = X.C62013KVm.A00
            return r3
        L_0x005d:
            X.0eS.A00(r1)
            X.0rm r11 = X.C51965G9l.A11()
            X.3QD r1 = r14.A05
            X.3QD r0 = X.AnonymousClass3QD.NOT_UPLOADED
            if (r1 != r0) goto L_0x0030
            X.3Q2 r6 = r14.A0D
            java.util.List r0 = r6.A0L()
            int r1 = r0.size()
            r0 = 2
            if (r1 == r0) goto L_0x0085
            X.55S r3 = X.AnonymousClass55S.A0P
            java.lang.String r0 = "Missing assets and clips for Reels Template"
        L_0x007b:
            X.55U r0 = r14.A02(r3, r0)
        L_0x007f:
            X.KVk r3 = new X.KVk
            r3.<init>(r0)
            return r3
        L_0x0085:
            r1 = 0
            X.1iA r2 = r6.A1G     // Catch:{ IllegalArgumentException -> 0x00c8 }
            X.1iA r0 = X.1iA.A0A     // Catch:{ IllegalArgumentException -> 0x00c8 }
            if (r2 != r0) goto L_0x00b9
            java.util.List r0 = r6.A0L()     // Catch:{ IllegalArgumentException -> 0x00c8 }
            java.lang.Object r7 = r0.get(r1)     // Catch:{ IllegalArgumentException -> 0x00c8 }
            X.3Q2 r7 = (X.AnonymousClass3Q2) r7     // Catch:{ IllegalArgumentException -> 0x00c8 }
            com.instagram.pendingmedia.model.constants.ShareType r1 = r7.A0E()     // Catch:{ IllegalArgumentException -> 0x00c8 }
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS_REUSABLE_TEMPLATE_ASSETS     // Catch:{ IllegalArgumentException -> 0x00c8 }
            if (r1 != r0) goto L_0x00a3
            X.3Q2 r8 = X.AnonymousClass8YL.A02(r6)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            goto L_0x00e0
        L_0x00a3:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ IllegalArgumentException -> 0x00c8 }
            java.lang.String r0 = "PendingMedia index 0 is not CLIPS_REUSABLE_TEMPLATE_ASSETS: "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x00c8 }
            com.instagram.pendingmedia.model.constants.ShareType r0 = r7.A0E()     // Catch:{ IllegalArgumentException -> 0x00c8 }
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)     // Catch:{ IllegalArgumentException -> 0x00c8 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IllegalArgumentException -> 0x00c8 }
            goto L_0x00c7
        L_0x00b9:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ IllegalArgumentException -> 0x00c8 }
            r0 = 2407(0x967, float:3.373E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IllegalArgumentException -> 0x00c8 }
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r2, r0, r1)     // Catch:{ IllegalArgumentException -> 0x00c8 }
        L_0x00c7:
            throw r0     // Catch:{ IllegalArgumentException -> 0x00c8 }
        L_0x00c8:
            r2 = move-exception
            X.55S r3 = X.AnonymousClass55S.A0P
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Missing Template Assets for Reels Template: "
            goto L_0x00db
        L_0x00d2:
            r2 = move-exception
            X.55S r3 = X.AnonymousClass55S.A0P
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Missing Original Reel for Reels Template: "
        L_0x00db:
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            goto L_0x007b
        L_0x00e0:
            r10 = 0
            X.JVZ r6 = new X.JVZ
            r12 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r4.A02 = r14
            r4.A03 = r11
            r4.A00 = r5
            r4.A01 = r5
            java.lang.Object r0 = X.19E.A00(r4, r6)
            if (r0 != r3) goto L_0x0054
            return r3
        L_0x00f7:
            X.MDk r4 = new X.MDk
            r4.<init>(r13, r15, r3)
            goto L_0x0016
        L_0x00fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.ShareClipsTemplateHelper.A00(X.LP8, X.4D7, X.3jv):java.lang.Object");
    }
}
