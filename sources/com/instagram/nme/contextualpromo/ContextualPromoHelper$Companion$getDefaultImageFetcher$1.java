package com.instagram.nme.contextualpromo;

import com.instagram.common.session.UserSession;

public final class ContextualPromoHelper$Companion$getDefaultImageFetcher$1 {
    public final /* synthetic */ UserSession A00;

    public ContextualPromoHelper$Companion$getDefaultImageFetcher$1(UserSession userSession) {
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 8
            boolean r0 = X.ME6.A02(r3, r9)
            if (r0 == 0) goto L_0x0059
            r6 = r9
            X.ME6 r6 = (X.ME6) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0059
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x003b
            if (r0 != r3) goto L_0x0061
            X.0eS.A00(r1)
        L_0x0025:
            X.Kmv r1 = (X.C62819Kmv) r1
            boolean r0 = r1 instanceof X.C61925KRv
            if (r0 == 0) goto L_0x0032
            X.KRv r1 = (X.C61925KRv) r1
            X.3LX r0 = r1.A00
            android.graphics.Bitmap r4 = r0.A01
        L_0x0031:
            return r4
        L_0x0032:
            boolean r0 = r1 instanceof X.C61924KRu
            if (r0 != 0) goto L_0x0031
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x003b:
            X.0eS.A00(r1)
            if (r8 == 0) goto L_0x0031
            com.instagram.common.session.UserSession r2 = r7.A00
            android.util.LruCache r0 = X.0cp.A00
            android.net.Uri r1 = android.net.Uri.parse(r8)
            X.0qQ.A07(r1)
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C253833rU.A00(r1, r0, r0)
            r6.A00 = r3
            java.lang.Object r1 = com.instagram.genai.imageservice.download.GenAIImageDownloadUtil.A01(r2, r0, r6)
            if (r1 != r5) goto L_0x0025
            return r5
        L_0x0059:
            r0 = 42
            X.ME6 r6 = new X.ME6
            r6.<init>(r7, r9, r3, r0)
            goto L_0x0016
        L_0x0061:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nme.contextualpromo.ContextualPromoHelper$Companion$getDefaultImageFetcher$1.A00(java.lang.String, X.4D7):java.lang.Object");
    }
}
