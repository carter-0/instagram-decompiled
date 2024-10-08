package com.aiplatform.tools.upload.ig;

public final class ImageUploadTool {
    public static final ImageUploadTool A00 = new Object();

    /* JADX WARNING: type inference failed for: r11v1, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.aiplatform.tools.upload.ig.ImageUploadTool r14, com.instagram.common.session.UserSession r15, java.lang.String r16, X.AnonymousClass4D7 r17, int r18) {
        /*
            r3 = 16
            r4 = r17
            boolean r0 = X.MEC.A03(r3, r4)
            if (r0 == 0) goto L_0x008a
            r11 = r4
            X.MEC r11 = (X.MEC) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008a
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x0018:
            java.lang.Object r4 = r11.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r11.A00
            r3 = 1
            if (r0 == 0) goto L_0x0057
            if (r0 != r3) goto L_0x0094
            X.0eS.A00(r4)
        L_0x0026:
            X.KnM r4 = (X.C62846KnM) r4
            boolean r0 = r4 instanceof X.KVt
            r1 = 0
            if (r0 == 0) goto L_0x0037
            X.KVt r4 = (X.KVt) r4
            java.lang.String r0 = r4.A00
        L_0x0031:
            X.JqU r2 = new X.JqU
            r2.<init>(r0, r1)
            return r2
        L_0x0037:
            boolean r0 = r4 instanceof X.C62020KVu
            if (r0 == 0) goto L_0x0042
            X.KVu r4 = (X.C62020KVu) r4
            java.lang.Throwable r1 = r4.A00
            java.lang.String r0 = "Media Upload Failure"
            goto L_0x0031
        L_0x0042:
            boolean r0 = r4 instanceof X.C62021KVv
            if (r0 == 0) goto L_0x008f
            X.KVv r4 = (X.C62021KVv) r4
            X.SJe r0 = r4.A00
            java.lang.String r0 = r0.A05
            if (r0 == 0) goto L_0x0054
            X.JqT r2 = new X.JqT
            r2.<init>(r0)
            return r2
        L_0x0054:
            java.lang.String r0 = "Successful response, but missing file handle"
            goto L_0x0031
        L_0x0057:
            X.0eS.A00(r4)
            java.lang.String r9 = X.JTQ.A0Z()
            com.instagram.pendingmedia.service.upload.FbUploaderUtil r4 = com.instagram.pendingmedia.service.upload.FbUploaderUtil.A00
            r13 = r15
            X.SmU r5 = X.JTR.A0e(r15)
            X.Lb3 r6 = new X.Lb3
            r6.<init>()
            X.1iA r1 = X.1iA.A0Q
            java.lang.String r15 = "ig_sharing_genai"
            r12 = 0
            r8 = r16
            r17 = r18
            r14 = r9
            r18 = r12
            X.SFy r0 = X.C63392KwD.A00(r13, r14, r15, r16, r17, r18)
            X.L4y r7 = new X.L4y
            r7.<init>(r0, r1)
            r11.A00 = r3
            java.lang.String r10 = ""
            java.lang.Object r4 = r4.A05(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r4 != r2) goto L_0x0026
            return r2
        L_0x008a:
            X.MEC r11 = X.MEC.A00(r14, r4, r3)
            goto L_0x0018
        L_0x008f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0094:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aiplatform.tools.upload.ig.ImageUploadTool.A00(com.aiplatform.tools.upload.ig.ImageUploadTool, com.instagram.common.session.UserSession, java.lang.String, X.4D7, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a9, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(android.content.Context r13, android.graphics.Bitmap r14, com.instagram.common.session.UserSession r15, X.AnonymousClass4D7 r16) {
        /*
            r12 = this;
            r3 = 16
            r4 = r16
            boolean r0 = X.C66144MDw.A02(r3, r4)
            if (r0 == 0) goto L_0x00aa
            r8 = r4
            X.MDw r8 = (X.C66144MDw) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00aa
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r8.A02
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r6) goto L_0x00b1
            java.lang.Object r9 = r8.A01
            java.io.File r9 = (java.io.File) r9
            X.0eS.A00(r1)
        L_0x002a:
            boolean r0 = r1 instanceof X.C60736JqT
            if (r0 == 0) goto L_0x0031
            r9.delete()
        L_0x0031:
            return r1
        L_0x0032:
            X.0eS.A00(r1)
            android.graphics.Bitmap$Config r1 = r14.getConfig()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r5 = 0
            if (r1 == r0) goto L_0x0055
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "bitmap format not supported: "
            r1.append(r0)
            android.graphics.Bitmap$Config r0 = r14.getConfig()
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r0, r1)
            X.JqU r0 = new X.JqU
            r0.<init>(r1, r5)
            return r0
        L_0x0055:
            int r4 = r14.getWidth()
            r0 = 4115(0x1013, float:5.766E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x006a }
            java.lang.String r2 = ".jpg"
            java.io.File r1 = r13.getCacheDir()     // Catch:{ IOException -> 0x006a }
            java.io.File r9 = java.io.File.createTempFile(r0, r2, r1)     // Catch:{ IOException -> 0x006a }
            goto L_0x006b
        L_0x006a:
            r9 = 0
        L_0x006b:
            java.lang.String r10 = "new file creation failed"
            if (r9 == 0) goto L_0x00b6
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.JPEG
            r1 = 100
            java.io.File r2 = r9.getParentFile()
            r3 = 0
            if (r2 == 0) goto L_0x0086
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x0097
            boolean r0 = r2.mkdirs()
            if (r0 != 0) goto L_0x0097
        L_0x0086:
            if (r3 == 0) goto L_0x00b6
            java.lang.String r0 = X.JTP.A0t(r9)
            r8.A01 = r9
            r8.A00 = r6
            java.lang.Object r1 = A00(r12, r15, r0, r8, r4)
            if (r1 != r7) goto L_0x002a
            return r7
        L_0x0097:
            java.io.FileOutputStream r2 = X.JTO.A0t(r9)     // Catch:{ IOException -> 0x0086 }
            X.0fO.A02(r11, r14, r2, r1)     // Catch:{ all -> 0x00a3 }
            r2.close()     // Catch:{ IOException -> 0x0086 }
            r3 = 1
            goto L_0x0086
        L_0x00a3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ IOException -> 0x0086 }
            throw r0     // Catch:{ IOException -> 0x0086 }
        L_0x00aa:
            X.MDw r8 = new X.MDw
            r8.<init>(r12, r4, r3)
            goto L_0x0018
        L_0x00b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00b6:
            X.JqU r7 = new X.JqU
            r7.<init>(r10, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aiplatform.tools.upload.ig.ImageUploadTool.A01(android.content.Context, android.graphics.Bitmap, com.instagram.common.session.UserSession, X.4D7):java.lang.Object");
    }
}
