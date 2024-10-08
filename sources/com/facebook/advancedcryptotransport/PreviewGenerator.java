package com.facebook.advancedcryptotransport;

import X.MZ7;

public class PreviewGenerator {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030 A[SYNTHETIC, Splitter:B:18:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003a A[SYNTHETIC, Splitter:B:27:0x003a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean generatePreviewFromFullVideoContent(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = 1
            android.graphics.Bitmap r4 = android.media.ThumbnailUtils.createVideoThumbnail(r6, r5)
            r3 = 0
            if (r4 != 0) goto L_0x0009
            return r3
        L_0x0009:
            r1 = 0
            java.io.File r0 = X.AnonymousClass7TE.A0t(r7)     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            r0.createNewFile()     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0034, all -> 0x0027 }
            r0 = 70
            X.0fO.A02(r1, r4, r2, r0)     // Catch:{ Exception -> 0x0034, all -> 0x0027 }
            r2.flush()     // Catch:{ Exception -> 0x0034, all -> 0x0027 }
            r4.recycle()
            r2.close()     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            return r5
        L_0x0027:
            r0 = move-exception
            r1 = r2
            goto L_0x002b
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            r4.recycle()
            if (r1 == 0) goto L_0x0033
            r1.close()     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            throw r0
        L_0x0034:
            r1 = r2
        L_0x0035:
            r4.recycle()
            if (r1 == 0) goto L_0x003d
            r1.close()     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.advancedcryptotransport.PreviewGenerator.generatePreviewFromFullVideoContent(java.lang.String, java.lang.String):boolean");
    }

    static {
        MZ7.A00();
    }
}
