package X;

import java.io.File;

/* renamed from: X.LSv  reason: case insensitive filesystem */
public final class C64188LSv {
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File A00(android.content.Context r12, com.instagram.pendingmedia.model.ClipInfo r13, java.lang.String r14, int r15, int r16) {
        /*
            r0 = 2
            X.0qQ.A0B(r12, r0)
            java.io.File r5 = X.AnonymousClass457.A01()
            java.io.File r0 = r5.getParentFile()
            if (r0 != 0) goto L_0x0017
            java.lang.Class<X.LSv> r1 = X.C64188LSv.class
            java.lang.String r0 = "Unable to get video cover folder"
            X.0KC.A02(r1, r0)
            r5 = 0
            return r5
        L_0x0017:
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0020
            X.AnonymousClass457.A0E()
        L_0x0020:
            r8 = 100
            r11 = 0
            java.io.FileOutputStream r2 = X.JTO.A0t(r5)     // Catch:{ IOException -> 0x0070 }
            r4 = 0
            r6 = r15
            r7 = r16
            if (r14 == 0) goto L_0x0058
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0069 }
            r0 = 29
            if (r1 < r0) goto L_0x0058
            java.lang.String r0 = "content://"
            boolean r0 = X.00p.A0k(r14, r0, r11)     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0058
            android.content.ContentResolver r3 = r12.getContentResolver()     // Catch:{ all -> 0x0069 }
            android.net.Uri r1 = X.0cp.A03(r14)     // Catch:{ all -> 0x0069 }
            android.util.Size r0 = new android.util.Size     // Catch:{ all -> 0x0069 }
            r0.<init>(r15, r7)     // Catch:{ all -> 0x0069 }
            android.graphics.Bitmap r1 = r3.loadThumbnail(r1, r0, r4)     // Catch:{ all -> 0x0069 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0069 }
            A03(r5)     // Catch:{ all -> 0x0069 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0069 }
            X.0fO.A02(r0, r1, r2, r8)     // Catch:{ all -> 0x0069 }
            goto L_0x0065
        L_0x0058:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0069 }
            r4 = r13
            int r0 = r13.A05     // Catch:{ all -> 0x0069 }
            long r0 = (long) r0     // Catch:{ all -> 0x0069 }
            long r9 = r3.toMillis(r0)     // Catch:{ all -> 0x0069 }
            A01(r4, r5, r6, r7, r8, r9, r11)     // Catch:{ all -> 0x0069 }
        L_0x0065:
            r2.close()     // Catch:{ IOException -> 0x0070 }
            return r5
        L_0x0069:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006b }
        L_0x006b:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ IOException -> 0x0070 }
            throw r0     // Catch:{ IOException -> 0x0070 }
        L_0x0070:
            r3 = move-exception
            java.lang.Class<X.LSv> r2 = X.C64188LSv.class
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.String r0 = "Unable to save thumbnail to file"
            X.0KC.A07(r2, r0, r3, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64188LSv.A00(android.content.Context, com.instagram.pendingmedia.model.ClipInfo, java.lang.String, int, int):java.io.File");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007a, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x008b */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.pendingmedia.model.ClipInfo r7, java.io.File r8, int r9, int r10, int r11, long r12, boolean r14) {
        /*
            r4 = 0
            X.0qQ.A0B(r7, r4)
            r6 = 1
            java.lang.String r0 = r7.A0F
            if (r0 != 0) goto L_0x0011
            java.lang.Class<X.LSv> r1 = X.C64188LSv.class
            java.lang.String r0 = "Unable to get video file path to fetch frame."
            X.0KC.A02(r1, r0)
            return
        L_0x0011:
            java.io.File r0 = X.AnonymousClass7TE.A0t(r0)
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever
            r2.<init>()
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ RuntimeException -> 0x008b, all -> 0x0086 }
            r2.setDataSource(r0)     // Catch:{ RuntimeException -> 0x008b, all -> 0x0086 }
            r0 = 3
            android.graphics.Bitmap r5 = r2.getFrameAtTime(r12, r0)     // Catch:{ RuntimeException -> 0x008b, all -> 0x0086 }
            if (r5 != 0) goto L_0x002c
            r2.release()     // Catch:{ Exception -> 0x008e }
            return
        L_0x002c:
            if (r14 == 0) goto L_0x0057
            int r7 = r7.A03     // Catch:{ RuntimeException -> 0x008b, all -> 0x0086 }
            r1 = -1
            boolean r0 = X.AnonymousClass7TF.A1S(r7, r1)
            r3 = 0
            if (r0 != 0) goto L_0x004e
            if (r7 == r1) goto L_0x004e
            X.0vF r0 = X.C363878kU.A00     // Catch:{ RuntimeException -> 0x008b, all -> 0x0086 }
            android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo     // Catch:{ RuntimeException -> 0x008b, all -> 0x0086 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x008b, all -> 0x0086 }
            android.hardware.Camera.getCameraInfo(r7, r0)     // Catch:{ RuntimeException -> 0x008b, all -> 0x0086 }
            int r1 = r0.orientation     // Catch:{ RuntimeException -> 0x008b, all -> 0x0086 }
            int r0 = r0.facing     // Catch:{ RuntimeException -> 0x008b, all -> 0x0086 }
            if (r0 != r6) goto L_0x004b
            r3 = 1
        L_0x004b:
            r0 = r3
            r3 = r1
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            android.graphics.Bitmap r1 = X.1MF.A09(r5, r9, r10, r3, r0)     // Catch:{ RuntimeException -> 0x008b, all -> 0x0086 }
            X.0qQ.A07(r1)     // Catch:{ RuntimeException -> 0x008b, all -> 0x0086 }
            goto L_0x005e
        L_0x0057:
            android.graphics.Bitmap r1 = X.0fO.A00(r5, r9, r10, r6)     // Catch:{ RuntimeException -> 0x008b, all -> 0x0086 }
            X.0qQ.A07(r1)     // Catch:{ RuntimeException -> 0x008b, all -> 0x0086 }
        L_0x005e:
            r5.recycle()     // Catch:{ RuntimeException -> 0x008b, all -> 0x0086 }
            r2.release()     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            A03(r8)
            java.io.FileOutputStream r2 = X.JTO.A0t(r8)     // Catch:{ IOException -> 0x007b }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0074 }
            X.0fO.A02(r0, r1, r2, r11)     // Catch:{ all -> 0x0074 }
            r2.close()     // Catch:{ IOException -> 0x007b }
            return
        L_0x0074:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ IOException -> 0x007b }
            throw r0     // Catch:{ IOException -> 0x007b }
        L_0x007b:
            r3 = move-exception
            java.lang.Class<X.LSv> r2 = X.C64188LSv.class
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "Unable to save frame to file"
            X.0KC.A07(r2, r0, r3, r1)
            return
        L_0x0086:
            r0 = move-exception
            r2.release()     // Catch:{ Exception -> 0x008a }
        L_0x008a:
            throw r0
        L_0x008b:
            r2.release()     // Catch:{ Exception -> 0x008e }
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64188LSv.A01(com.instagram.pendingmedia.model.ClipInfo, java.io.File, int, int, int, long, boolean):void");
    }

    public static final void A02(AnonymousClass3Q2 r8, File file, int i, int i2, int i3) {
        File file2 = file;
        0qQ.A0B(file, 1);
        if (r8 != null) {
            A01(r8.A1N, file2, i, i2, i3, 0, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r5.A1N.A0H == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A04(X.AnonymousClass3Q2 r5) {
        /*
            X.3QG r0 = r5.A1i
            int r0 = r0.A01
            r4 = 1
            boolean r3 = X.AnonymousClass7TF.A1P(r0)
            boolean r2 = r5.A5L
            com.instagram.pendingmedia.model.ClipInfo r1 = r5.A1N
            com.instagram.pendingmedia.model.ClipInfo r0 = X.C376399Hv.A00()
            if (r1 == r0) goto L_0x001a
            com.instagram.pendingmedia.model.ClipInfo r0 = r5.A1N
            boolean r0 = r0.A0H
            r1 = 1
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            boolean r0 = r5.A5F
            if (r3 != 0) goto L_0x0026
            if (r2 != 0) goto L_0x0026
            if (r1 != 0) goto L_0x0026
            if (r0 != 0) goto L_0x0026
            r4 = 0
        L_0x0026:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64188LSv.A04(X.3Q2):boolean");
    }

    public static final void A03(File file) {
        String A0t = JTP.A0t(file);
        String str = File.separator;
        0qQ.A08(str);
        int A07 = 00l.A07(A0t, str, A0t.length() - 1);
        if (A07 > -1) {
            A0t = C51967G9n.A0q(A0t, 0, A07);
        }
        AnonymousClass7TE.A0t(A0t).mkdirs();
    }
}
